import java.io.*;
import java.util.*;
import java.util.function.Function;

public class TestingTools {
    public static boolean checkListsEqual(List a, List b){
        if(a == null || b == null){
            return a == b;
        }

        if(a.size() != b.size()){
            return false;
        }

        Set aSet = new HashSet(a);
        Set bSet = new HashSet(b);

        if(a.size() != b.size()){
            return false;
        }

        for(Object first: aSet){
            if(!bSet.contains(first)){
                return false;
            }
        }
        return true;
    }

    public static boolean compareDoubles(double a, double b){
        return Math.abs(a-b) < 0.001;
    }

    private static double roundScore(double score){
        return Math.round(score * 1000.0) / 1000.0;
    }

    public static void checkSearch(List<SearchResult> result, String phrase, PrintWriter passOut, PrintWriter failOut, String className, String curTestName) throws IOException {

        final double SCORE_TOLERANCE = 0.00101;

        List<TestingToolsResult> expectedResults = new ArrayList<>();
        List<TestingToolsResult> studentResults = new ArrayList<>();
        List<String> scoreErrors = new ArrayList<>();
        List<String> orderingErrors = new ArrayList<>();

        // Collect student results
        for (SearchResult r : result) {
            studentResults.add(new TestingToolsResult(r.getTitle(), r.getScore()));
        }

        // --- Load expected results ---
        BufferedReader in = new BufferedReader(new FileReader(className + "-expected-search-results.txt"));
        String line;
        while ((line = in.readLine()) != null) {
            boolean correctPhrase = line.strip().equals(phrase);
            int size = Integer.parseInt(in.readLine());
            for (int i = 0; i < size; i++) {
                String title = in.readLine().strip();
                double score = Double.parseDouble(in.readLine());
                if (correctPhrase) {
                    expectedResults.add(new TestingToolsResult(title, score));
                }
            }
            if (correctPhrase) break;
        }
        in.close();

        boolean passedTest = true;

        if (expectedResults.size() != studentResults.size()) {
            passedTest = false;
            scoreErrors.add("Expected " + expectedResults.size() + " results but got " + studentResults.size() + " results.");
        }

        boolean[] matched = new boolean[expectedResults.size()];
        for (TestingToolsResult stu : studentResults) {
            boolean foundMatch = false;

            for (int i = 0; i < expectedResults.size(); i++) {
                TestingToolsResult exp = expectedResults.get(i);

                if (!matched[i] &&
                    exp.getTitle().equals(stu.getTitle()) &&
                    Math.abs(exp.getScore() - stu.getScore()) <= SCORE_TOLERANCE) {

                    matched[i] = true;
                    foundMatch = true;
                    break;
                }
            }

            if (!foundMatch) {
                passedTest = false; 
                scoreErrors.add("No match found for your result: " + stu.getTitle() + " with score " + stu.getScore());
            }
        }

        for (int i = 0; i < studentResults.size() - 1; i++) {

            TestingToolsResult a = studentResults.get(i);
            TestingToolsResult b = studentResults.get(i + 1);

            double ra = roundScore(a.getScore());
            double rb = roundScore(b.getScore());

            if (ra < rb) {
                passedTest = false;
                orderingErrors.add("Ordering error: " + a.getTitle() + " (score " + a.getScore() + ") should not come before " + b.getTitle() + " (score " + b.getScore() + ")");
            }

            if (Double.compare(ra, rb) == 0) {
                if (!a.getTitle().equals(b.getTitle())) {
                    if (a.getTitle().compareTo(b.getTitle()) > 0) {
                        passedTest = false;
                        orderingErrors.add("Ordering error for equal scores: " + a.getTitle() + " should not come before " + b.getTitle());
                    }
                }
            }
        }

        if (passedTest){
            passOut.println("Passed " + curTestName);
            passOut.println("Expected Result:");
            for(int i = 0; i < expectedResults.size(); i++){
                passOut.println((i+1) + ". " + expectedResults.get(i).getTitle() + " = " + expectedResults.get(i).getScore());
            }
            passOut.println("Your Result:");
            for(int i = 0; i < expectedResults.size(); i++){
                passOut.println((i+1) + ". " + studentResults.get(i).getTitle() + " = " + studentResults.get(i).getScore());
            }
            passOut.println();
            passOut.println();
        }else{
            failOut.println("Failed " + curTestName);

            if(!scoreErrors.isEmpty()){
                failOut.println("Score Errors:");
                for(String err: scoreErrors){
                    failOut.println(" - " + err);
                }
            }

            if(!orderingErrors.isEmpty()){
                failOut.println("Ordering Errors:");
                for(String err: orderingErrors){
                    failOut.println(" - " + err);
                }
            }

            failOut.println("Expected Result:");
            for(int i = 0; i < expectedResults.size(); i++){
                failOut.println((i+1) + ". " + expectedResults.get(i).getTitle() + " = " + expectedResults.get(i).getScore());
            }
            failOut.println("Your Result:");
            for(int i = 0; i < expectedResults.size(); i++){
                failOut.println((i+1) + ". " + studentResults.get(i).getTitle() + " = " + studentResults.get(i).getScore());
            }
            failOut.println();
            failOut.println();
        }
    }

    private static class TestingToolsResult{//} implements Comparable<TestingToolsResult>{
        private String title;
        private double score;
        public TestingToolsResult(String iTitle, double iScore){
            title = iTitle;
            score = iScore;
        }

        public String getTitle() {
            return title;
        }

        public double getScore() {
            return score;
        }
    }



}
