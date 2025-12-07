import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.*;
public class TinyFruitsAIncomingLinksTester {public static void main(String[] args) throws Exception{
ProjectTester tester = new ProjectTesterImp(); //Instantiate your own ProjectTester instance here
tester.initialize();
tester.crawl("https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-0.html");
runTest(tester);}public static void runTest(ProjectTester tester) throws Exception{
PrintWriter failOut = new PrintWriter(new FileWriter("TinyFruitsA-IncomingLinks-failed.txt"));
PrintWriter passOut = new PrintWriter(new FileWriter("TinyFruitsA-IncomingLinks-passed.txt"));
List<String> expectedResult;
List<String> yourResult;
//Test #12 checking incoming links for https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-2.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-1.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-0.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-3.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-3.html");
yourResult = tester.getIncomingLinks("https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-2.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #12 checking incoming links for https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-2.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #12 checking incoming links for https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-2.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #13 checking incoming links for https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-3.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-4.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-0.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-1.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-2.html");
yourResult = tester.getIncomingLinks("https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-3.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #13 checking incoming links for https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-3.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #13 checking incoming links for https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-3.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #14 checking incoming links for https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-4.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-3.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-1.html");
yourResult = tester.getIncomingLinks("https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-4.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #14 checking incoming links for https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-4.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #14 checking incoming links for https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-4.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #15 checking incoming links for https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-2.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-0.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-3.html");
yourResult = tester.getIncomingLinks("https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-2.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #15 checking incoming links for https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-2.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #15 checking incoming links for https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-2.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #16 checking incoming links for https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-3.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-2.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-1.html");
yourResult = tester.getIncomingLinks("https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-3.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #16 checking incoming links for https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-3.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #16 checking incoming links for https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-3.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #17 checking incoming links for https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-1.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-4.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-2.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-3.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-0.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-4.html");
yourResult = tester.getIncomingLinks("https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-1.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #17 checking incoming links for https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-1.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #17 checking incoming links for https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-1.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #18 checking incoming links for https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-0.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-3.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-1.html");
yourResult = tester.getIncomingLinks("https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-0.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #18 checking incoming links for https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-0.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #18 checking incoming links for https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-0.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #19 checking incoming links for https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-4.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-2.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-1.html");
yourResult = tester.getIncomingLinks("https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-4.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #19 checking incoming links for https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-4.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #19 checking incoming links for https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-4.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #20 checking incoming links for https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-0.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-1.html");
yourResult = tester.getIncomingLinks("https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-0.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #20 checking incoming links for https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-0.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #20 checking incoming links for https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-0.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #21 checking incoming links for https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-1.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-0.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-4.html");
yourResult = tester.getIncomingLinks("https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-1.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #21 checking incoming links for https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-1.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #21 checking incoming links for https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-1.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #22 checking incoming links for http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = new ArrayList<String>();
yourResult = tester.getIncomingLinks("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
if(yourResult == null){
passOut.println("Passed Test #22 checking incoming links for http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + null);
passOut.println("result = null\n\n");
}else{failOut.println("Failed Test #22 checking incoming links for http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + null);
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

failOut.close();
passOut.close();
}
}
