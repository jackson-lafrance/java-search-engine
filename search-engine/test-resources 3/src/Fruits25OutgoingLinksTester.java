import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.*;
public class Fruits25OutgoingLinksTester {public static void main(String[] args) throws Exception{
ProjectTester tester = new ProjectTesterImp(); //Instantiate your own ProjectTester instance here
tester.initialize();
tester.crawl("https://people.scs.carleton.ca/~avamckenney/fruits25/N-0.html");
runTest(tester);}public static void runTest(ProjectTester tester) throws Exception{
PrintWriter failOut = new PrintWriter(new FileWriter("Fruits25-OutgoingLinks-failed.txt"));
PrintWriter passOut = new PrintWriter(new FileWriter("Fruits25-OutgoingLinks-passed.txt"));
List<String> expectedResult;
List<String> yourResult;
//Test #1 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-7.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-9.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-12.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-15.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-10.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-20.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-4.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-13.html");
yourResult = tester.getOutgoingLinks("https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #1 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #1 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #2 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits25/N-4.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-9.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-0.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-13.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-14.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-18.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-3.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-17.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-1.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-19.html");
yourResult = tester.getOutgoingLinks("https://people.scs.carleton.ca/~avamckenney/fruits25/N-4.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #2 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits25/N-4.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #2 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits25/N-4.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #3 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits25/N-13.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-7.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-4.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-22.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-19.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-21.html");
yourResult = tester.getOutgoingLinks("https://people.scs.carleton.ca/~avamckenney/fruits25/N-13.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #3 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits25/N-13.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #3 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits25/N-13.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #4 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-19.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-14.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-21.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-13.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-17.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-1.html");
yourResult = tester.getOutgoingLinks("https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #4 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #4 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #5 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits25/N-8.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-12.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-17.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-5.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-22.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-1.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-21.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-10.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html");
yourResult = tester.getOutgoingLinks("https://people.scs.carleton.ca/~avamckenney/fruits25/N-8.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #5 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits25/N-8.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #5 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits25/N-8.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #6 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-19.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-13.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-14.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-1.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-4.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-8.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-7.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-9.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html");
yourResult = tester.getOutgoingLinks("https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #6 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #6 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #7 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits25/N-17.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-21.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-15.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-13.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-0.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-22.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-19.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-12.html");
yourResult = tester.getOutgoingLinks("https://people.scs.carleton.ca/~avamckenney/fruits25/N-17.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #7 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits25/N-17.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #7 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits25/N-17.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #8 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits25/N-1.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-12.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-0.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-4.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-7.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-18.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-3.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-20.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-10.html");
yourResult = tester.getOutgoingLinks("https://people.scs.carleton.ca/~avamckenney/fruits25/N-1.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #8 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits25/N-1.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #8 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits25/N-1.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #9 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits25/N-21.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-10.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-14.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-1.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-7.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-9.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-0.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-18.html");
yourResult = tester.getOutgoingLinks("https://people.scs.carleton.ca/~avamckenney/fruits25/N-21.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #9 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits25/N-21.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #9 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits25/N-21.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #10 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits25/N-9.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-4.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-13.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-15.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-3.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-8.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-21.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-5.html");
yourResult = tester.getOutgoingLinks("https://people.scs.carleton.ca/~avamckenney/fruits25/N-9.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #10 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits25/N-9.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #10 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits25/N-9.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #11 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits25/N-15.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-14.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-8.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-19.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-9.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-12.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-22.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-4.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-10.html");
yourResult = tester.getOutgoingLinks("https://people.scs.carleton.ca/~avamckenney/fruits25/N-15.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #11 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits25/N-15.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #11 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits25/N-15.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #12 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits25/N-10.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-14.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-22.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-8.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-3.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-9.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-12.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-19.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-16.html");
yourResult = tester.getOutgoingLinks("https://people.scs.carleton.ca/~avamckenney/fruits25/N-10.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #12 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits25/N-10.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #12 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits25/N-10.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #13 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits25/N-20.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-17.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-3.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-14.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-0.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-4.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-1.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-13.html");
yourResult = tester.getOutgoingLinks("https://people.scs.carleton.ca/~avamckenney/fruits25/N-20.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #13 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits25/N-20.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #13 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits25/N-20.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #14 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits25/N-16.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-10.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-5.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-13.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-1.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-3.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-15.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-19.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-12.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-18.html");
yourResult = tester.getOutgoingLinks("https://people.scs.carleton.ca/~avamckenney/fruits25/N-16.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #14 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits25/N-16.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #14 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits25/N-16.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #15 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits25/N-12.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-22.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-21.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-0.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-7.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-5.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-4.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-8.html");
yourResult = tester.getOutgoingLinks("https://people.scs.carleton.ca/~avamckenney/fruits25/N-12.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #15 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits25/N-12.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #15 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits25/N-12.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #16 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-3.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-13.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-9.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-20.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-21.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-12.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-4.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-1.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-22.html");
yourResult = tester.getOutgoingLinks("https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #16 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #16 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #17 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits25/N-22.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-18.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-9.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-5.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-17.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-7.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-15.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html");
yourResult = tester.getOutgoingLinks("https://people.scs.carleton.ca/~avamckenney/fruits25/N-22.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #17 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits25/N-22.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #17 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits25/N-22.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #18 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits25/N-0.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-17.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-16.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-18.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-15.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-7.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-3.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-12.html");
yourResult = tester.getOutgoingLinks("https://people.scs.carleton.ca/~avamckenney/fruits25/N-0.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #18 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits25/N-0.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #18 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits25/N-0.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #19 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits25/N-7.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-22.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-0.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-10.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-21.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-13.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-19.html");
yourResult = tester.getOutgoingLinks("https://people.scs.carleton.ca/~avamckenney/fruits25/N-7.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #19 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits25/N-7.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #19 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits25/N-7.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #20 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-18.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-21.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-17.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-15.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-7.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-10.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-9.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-0.html");
yourResult = tester.getOutgoingLinks("https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #20 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #20 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #21 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits25/N-14.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-8.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-20.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-12.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-17.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-10.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-19.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html");
yourResult = tester.getOutgoingLinks("https://people.scs.carleton.ca/~avamckenney/fruits25/N-14.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #21 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits25/N-14.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #21 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits25/N-14.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #22 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits25/N-5.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-1.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-21.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-15.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-16.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-3.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-17.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-12.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-22.html");
yourResult = tester.getOutgoingLinks("https://people.scs.carleton.ca/~avamckenney/fruits25/N-5.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #22 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits25/N-5.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #22 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits25/N-5.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #23 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits25/N-18.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-4.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-12.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-19.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-0.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-7.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-17.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-16.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-20.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html");
yourResult = tester.getOutgoingLinks("https://people.scs.carleton.ca/~avamckenney/fruits25/N-18.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #23 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits25/N-18.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #23 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits25/N-18.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #24 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits25/N-19.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-12.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-8.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-4.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-0.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-22.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-5.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-13.html");
yourResult = tester.getOutgoingLinks("https://people.scs.carleton.ca/~avamckenney/fruits25/N-19.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #24 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits25/N-19.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #24 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits25/N-19.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #25 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits25/N-3.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-0.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-13.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-7.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-17.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-4.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-12.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-1.html");
yourResult = tester.getOutgoingLinks("https://people.scs.carleton.ca/~avamckenney/fruits25/N-3.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #25 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits25/N-3.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #25 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits25/N-3.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #26 checking outgoing links for http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = new ArrayList<String>();
yourResult = tester.getOutgoingLinks("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
if(yourResult == null){
passOut.println("Passed Test #26 checking outgoing links for http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + null);
passOut.println("result = null\n\n");
}else{failOut.println("Failed Test #26 checking outgoing links for http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + null);
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

failOut.close();
passOut.close();
}
}
