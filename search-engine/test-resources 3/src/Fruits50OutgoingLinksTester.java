import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.*;
public class Fruits50OutgoingLinksTester {public static void main(String[] args) throws Exception{
ProjectTester tester = new ProjectTesterImp(); //Instantiate your own ProjectTester instance here
tester.initialize();
tester.crawl("https://people.scs.carleton.ca/~avamckenney/fruits50/N-0.html");
runTest(tester);}public static void runTest(ProjectTester tester) throws Exception{
PrintWriter failOut = new PrintWriter(new FileWriter("Fruits50-OutgoingLinks-failed.txt"));
PrintWriter passOut = new PrintWriter(new FileWriter("Fruits50-OutgoingLinks-passed.txt"));
List<String> expectedResult;
List<String> yourResult;
//Test #1 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits50/N-17.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-15.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-3.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-19.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-41.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-1.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-39.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-12.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-45.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-5.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-49.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-31.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-25.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-34.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-28.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-27.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-13.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-40.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-46.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-47.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-24.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-33.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-21.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-36.html");
yourResult = tester.getOutgoingLinks("https://people.scs.carleton.ca/~avamckenney/fruits50/N-17.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #1 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits50/N-17.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #1 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits50/N-17.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #2 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits50/N-12.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-7.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-28.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-25.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-11.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-29.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-35.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-20.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-14.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-31.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-13.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-22.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-38.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-32.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-27.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-34.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-9.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-19.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-47.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-18.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-44.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-24.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-30.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-17.html");
yourResult = tester.getOutgoingLinks("https://people.scs.carleton.ca/~avamckenney/fruits50/N-12.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #2 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits50/N-12.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #2 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits50/N-12.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #3 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits50/N-37.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-42.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-7.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-44.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-22.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-0.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-16.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-40.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-10.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-11.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-5.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-21.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-6.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-48.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-13.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-35.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-23.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-33.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-47.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-1.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-30.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-24.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-26.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-27.html");
yourResult = tester.getOutgoingLinks("https://people.scs.carleton.ca/~avamckenney/fruits50/N-37.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #3 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits50/N-37.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #3 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits50/N-37.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #4 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits50/N-11.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-7.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-13.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-23.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-38.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-37.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-49.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-36.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-22.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-16.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-8.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-1.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-4.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-31.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-45.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-12.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-3.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-25.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-35.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-39.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-15.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-47.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-30.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-34.html");
yourResult = tester.getOutgoingLinks("https://people.scs.carleton.ca/~avamckenney/fruits50/N-11.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #4 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits50/N-11.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #4 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits50/N-11.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #5 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits50/N-23.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-30.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-38.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-49.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-37.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-34.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-48.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-43.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-11.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-27.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-41.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-42.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-36.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-19.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-17.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-6.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-14.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-26.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-40.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-16.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-1.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-8.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-3.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-2.html");
yourResult = tester.getOutgoingLinks("https://people.scs.carleton.ca/~avamckenney/fruits50/N-23.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #5 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits50/N-23.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #5 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits50/N-23.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #6 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits50/N-49.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-44.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-10.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-31.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-43.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-22.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-29.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-33.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-3.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-35.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-28.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-42.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-38.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-17.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-27.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-4.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-0.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-19.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-36.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-32.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-20.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-21.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-1.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-45.html");
yourResult = tester.getOutgoingLinks("https://people.scs.carleton.ca/~avamckenney/fruits50/N-49.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #6 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits50/N-49.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #6 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits50/N-49.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #7 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits50/N-47.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-42.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-4.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-10.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-31.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-18.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-49.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-35.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-12.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-34.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-22.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-26.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-24.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-41.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-25.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-6.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-33.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-43.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-32.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-13.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-0.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-19.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-14.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-9.html");
yourResult = tester.getOutgoingLinks("https://people.scs.carleton.ca/~avamckenney/fruits50/N-47.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #7 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits50/N-47.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #7 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits50/N-47.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #8 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits50/N-33.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-15.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-42.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-39.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-32.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-17.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-10.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-46.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-19.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-28.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-2.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-43.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-8.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-44.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-47.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-5.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-1.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-11.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-0.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-38.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-16.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-13.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-37.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-3.html");
yourResult = tester.getOutgoingLinks("https://people.scs.carleton.ca/~avamckenney/fruits50/N-33.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #8 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits50/N-33.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #8 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits50/N-33.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #9 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits50/N-44.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-13.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-25.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-30.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-16.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-11.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-18.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-17.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-4.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-27.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-10.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-9.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-22.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-45.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-40.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-42.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-28.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-1.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-23.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-32.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-6.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-41.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-49.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-19.html");
yourResult = tester.getOutgoingLinks("https://people.scs.carleton.ca/~avamckenney/fruits50/N-44.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #9 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits50/N-44.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #9 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits50/N-44.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #10 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits50/N-41.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-19.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-49.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-39.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-25.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-12.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-38.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-15.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-11.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-3.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-48.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-21.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-20.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-40.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-26.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-6.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-1.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-16.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-4.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-17.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-47.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-37.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-9.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-36.html");
yourResult = tester.getOutgoingLinks("https://people.scs.carleton.ca/~avamckenney/fruits50/N-41.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #10 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits50/N-41.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #10 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits50/N-41.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #11 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits50/N-10.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-23.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-14.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-37.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-17.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-21.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-39.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-26.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-25.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-19.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-43.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-24.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-15.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-42.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-20.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-1.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-4.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-12.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-5.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-7.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-38.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-6.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-18.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-9.html");
yourResult = tester.getOutgoingLinks("https://people.scs.carleton.ca/~avamckenney/fruits50/N-10.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #11 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits50/N-10.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #11 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits50/N-10.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #12 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits50/N-2.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-29.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-16.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-32.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-44.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-27.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-39.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-17.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-21.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-6.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-1.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-12.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-24.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-26.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-4.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-47.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-38.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-35.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-11.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-36.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-41.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-42.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-48.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-23.html");
yourResult = tester.getOutgoingLinks("https://people.scs.carleton.ca/~avamckenney/fruits50/N-2.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #12 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits50/N-2.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #12 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits50/N-2.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #13 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits50/N-34.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-43.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-26.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-47.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-24.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-29.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-19.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-27.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-42.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-3.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-36.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-6.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-39.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-40.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-10.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-16.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-14.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-30.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-12.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-17.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-46.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-21.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-20.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-38.html");
yourResult = tester.getOutgoingLinks("https://people.scs.carleton.ca/~avamckenney/fruits50/N-34.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #13 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits50/N-34.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #13 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits50/N-34.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #14 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits50/N-29.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-25.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-42.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-33.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-3.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-34.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-36.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-37.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-44.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-1.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-46.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-48.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-38.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-13.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-6.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-10.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-0.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-31.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-27.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-21.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-9.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-22.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-45.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-43.html");
yourResult = tester.getOutgoingLinks("https://people.scs.carleton.ca/~avamckenney/fruits50/N-29.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #14 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits50/N-29.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #14 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits50/N-29.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #15 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits50/N-9.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-16.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-2.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-33.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-29.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-19.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-45.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-49.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-21.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-10.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-24.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-27.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-8.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-44.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-13.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-15.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-46.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-39.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-0.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-5.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-6.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-14.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-1.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-17.html");
yourResult = tester.getOutgoingLinks("https://people.scs.carleton.ca/~avamckenney/fruits50/N-9.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #15 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits50/N-9.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #15 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits50/N-9.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #16 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits50/N-36.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-7.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-8.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-11.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-15.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-5.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-22.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-12.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-28.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-23.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-48.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-42.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-9.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-1.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-32.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-37.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-4.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-18.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-39.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-27.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-35.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-13.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-46.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-33.html");
yourResult = tester.getOutgoingLinks("https://people.scs.carleton.ca/~avamckenney/fruits50/N-36.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #16 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits50/N-36.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #16 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits50/N-36.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #17 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits50/N-14.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-39.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-12.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-28.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-20.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-46.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-27.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-48.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-11.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-37.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-23.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-4.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-16.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-0.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-30.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-26.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-25.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-31.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-38.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-21.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-41.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-42.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-9.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-44.html");
yourResult = tester.getOutgoingLinks("https://people.scs.carleton.ca/~avamckenney/fruits50/N-14.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #17 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits50/N-14.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #17 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits50/N-14.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #18 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits50/N-25.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-7.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-19.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-34.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-1.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-4.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-44.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-30.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-43.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-22.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-41.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-27.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-46.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-24.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-32.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-40.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-13.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-10.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-15.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-14.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-5.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-12.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-37.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-11.html");
yourResult = tester.getOutgoingLinks("https://people.scs.carleton.ca/~avamckenney/fruits50/N-25.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #18 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits50/N-25.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #18 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits50/N-25.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #19 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits50/N-0.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-19.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-24.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-26.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-49.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-5.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-36.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-47.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-18.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-6.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-8.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-1.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-23.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-44.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-41.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-3.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-46.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-48.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-22.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-31.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-32.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-14.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-12.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-10.html");
yourResult = tester.getOutgoingLinks("https://people.scs.carleton.ca/~avamckenney/fruits50/N-0.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #19 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits50/N-0.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #19 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits50/N-0.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #20 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits50/N-18.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-13.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-10.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-39.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-33.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-34.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-44.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-16.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-29.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-4.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-24.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-43.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-45.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-28.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-48.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-22.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-37.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-30.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-27.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-2.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-5.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-6.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-15.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-26.html");
yourResult = tester.getOutgoingLinks("https://people.scs.carleton.ca/~avamckenney/fruits50/N-18.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #20 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits50/N-18.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #20 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits50/N-18.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #21 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits50/N-43.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-27.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-23.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-9.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-5.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-42.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-47.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-24.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-49.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-18.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-12.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-4.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-28.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-20.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-38.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-41.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-14.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-2.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-15.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-25.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-8.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-11.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-16.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-19.html");
yourResult = tester.getOutgoingLinks("https://people.scs.carleton.ca/~avamckenney/fruits50/N-43.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #21 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits50/N-43.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #21 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits50/N-43.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #22 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits50/N-39.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-23.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-20.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-25.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-27.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-10.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-43.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-3.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-17.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-9.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-14.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-36.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-30.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-45.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-13.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-24.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-19.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-46.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-11.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-15.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-47.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-38.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-1.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-34.html");
yourResult = tester.getOutgoingLinks("https://people.scs.carleton.ca/~avamckenney/fruits50/N-39.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #22 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits50/N-39.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #22 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits50/N-39.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #23 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits50/N-32.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-27.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-37.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-9.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-14.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-41.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-39.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-33.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-15.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-42.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-5.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-44.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-20.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-46.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-36.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-23.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-43.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-40.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-48.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-13.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-24.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-18.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-25.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-21.html");
yourResult = tester.getOutgoingLinks("https://people.scs.carleton.ca/~avamckenney/fruits50/N-32.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #23 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits50/N-32.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #23 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits50/N-32.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #24 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits50/N-20.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-22.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-7.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-29.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-35.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-19.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-27.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-9.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-3.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-44.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-42.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-23.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-40.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-31.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-16.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-47.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-26.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-15.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-2.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-41.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-28.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-24.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-49.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-46.html");
yourResult = tester.getOutgoingLinks("https://people.scs.carleton.ca/~avamckenney/fruits50/N-20.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #24 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits50/N-20.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #24 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits50/N-20.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #25 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits50/N-22.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-6.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-38.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-10.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-37.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-43.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-17.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-44.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-21.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-25.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-15.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-30.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-36.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-4.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-46.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-23.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-45.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-24.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-26.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-14.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-32.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-18.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-3.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-19.html");
yourResult = tester.getOutgoingLinks("https://people.scs.carleton.ca/~avamckenney/fruits50/N-22.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #25 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits50/N-22.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #25 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits50/N-22.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #26 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits50/N-8.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-33.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-41.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-27.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-46.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-39.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-13.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-0.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-21.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-5.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-38.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-35.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-42.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-30.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-25.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-7.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-47.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-14.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-24.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-36.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-20.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-40.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-37.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-1.html");
yourResult = tester.getOutgoingLinks("https://people.scs.carleton.ca/~avamckenney/fruits50/N-8.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #26 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits50/N-8.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #26 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits50/N-8.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #27 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits50/N-21.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-32.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-23.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-41.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-28.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-0.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-27.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-24.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-33.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-40.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-43.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-20.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-4.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-14.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-13.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-6.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-10.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-17.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-9.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-34.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-22.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-39.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-7.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-35.html");
yourResult = tester.getOutgoingLinks("https://people.scs.carleton.ca/~avamckenney/fruits50/N-21.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #27 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits50/N-21.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #27 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits50/N-21.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #28 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits50/N-28.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-15.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-48.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-44.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-31.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-23.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-38.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-10.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-47.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-26.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-27.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-14.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-43.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-8.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-3.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-19.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-42.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-1.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-22.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-25.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-24.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-13.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-21.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-12.html");
yourResult = tester.getOutgoingLinks("https://people.scs.carleton.ca/~avamckenney/fruits50/N-28.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #28 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits50/N-28.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #28 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits50/N-28.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #29 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits50/N-42.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-30.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-34.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-41.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-26.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-8.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-2.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-33.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-20.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-24.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-11.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-17.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-13.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-16.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-21.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-39.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-44.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-31.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-18.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-37.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-28.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-14.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-47.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-43.html");
yourResult = tester.getOutgoingLinks("https://people.scs.carleton.ca/~avamckenney/fruits50/N-42.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #29 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits50/N-42.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #29 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits50/N-42.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #30 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits50/N-24.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-12.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-36.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-38.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-49.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-40.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-33.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-47.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-29.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-39.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-22.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-23.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-21.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-14.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-28.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-10.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-1.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-5.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-15.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-19.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-27.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-30.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-37.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-25.html");
yourResult = tester.getOutgoingLinks("https://people.scs.carleton.ca/~avamckenney/fruits50/N-24.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #30 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits50/N-24.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #30 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits50/N-24.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #31 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits50/N-4.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-15.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-5.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-29.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-43.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-14.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-27.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-47.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-8.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-44.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-31.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-24.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-10.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-33.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-23.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-19.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-3.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-49.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-9.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-36.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-12.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-13.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-45.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-39.html");
yourResult = tester.getOutgoingLinks("https://people.scs.carleton.ca/~avamckenney/fruits50/N-4.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #31 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits50/N-4.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #31 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits50/N-4.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #32 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits50/N-19.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-44.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-23.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-25.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-3.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-18.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-35.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-17.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-22.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-40.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-29.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-48.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-1.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-21.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-9.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-45.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-14.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-41.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-13.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-49.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-30.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-27.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-42.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-34.html");
yourResult = tester.getOutgoingLinks("https://people.scs.carleton.ca/~avamckenney/fruits50/N-19.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #32 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits50/N-19.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #32 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits50/N-19.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #33 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits50/N-26.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-33.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-12.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-46.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-20.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-45.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-21.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-37.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-17.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-27.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-7.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-2.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-11.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-40.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-16.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-4.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-47.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-5.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-8.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-23.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-36.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-43.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-1.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-3.html");
yourResult = tester.getOutgoingLinks("https://people.scs.carleton.ca/~avamckenney/fruits50/N-26.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #33 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits50/N-26.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #33 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits50/N-26.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #34 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits50/N-27.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-19.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-16.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-23.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-49.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-30.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-46.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-3.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-2.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-40.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-37.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-7.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-11.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-24.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-21.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-29.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-41.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-45.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-34.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-35.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-25.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-18.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-38.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-1.html");
yourResult = tester.getOutgoingLinks("https://people.scs.carleton.ca/~avamckenney/fruits50/N-27.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #34 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits50/N-27.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #34 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits50/N-27.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #35 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits50/N-35.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-21.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-1.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-41.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-14.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-3.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-46.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-39.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-27.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-13.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-31.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-6.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-43.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-23.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-38.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-30.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-36.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-45.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-8.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-2.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-16.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-5.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-17.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-34.html");
yourResult = tester.getOutgoingLinks("https://people.scs.carleton.ca/~avamckenney/fruits50/N-35.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #35 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits50/N-35.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #35 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits50/N-35.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #36 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits50/N-7.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-31.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-35.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-10.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-12.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-38.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-44.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-5.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-37.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-6.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-29.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-13.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-9.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-49.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-19.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-33.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-25.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-2.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-34.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-47.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-36.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-17.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-16.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-24.html");
yourResult = tester.getOutgoingLinks("https://people.scs.carleton.ca/~avamckenney/fruits50/N-7.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #36 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits50/N-7.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #36 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits50/N-7.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #37 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits50/N-48.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-32.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-6.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-16.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-36.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-33.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-25.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-0.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-45.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-23.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-3.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-34.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-40.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-17.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-14.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-18.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-27.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-19.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-8.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-26.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-29.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-15.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-7.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-24.html");
yourResult = tester.getOutgoingLinks("https://people.scs.carleton.ca/~avamckenney/fruits50/N-48.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #37 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits50/N-48.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #37 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits50/N-48.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #38 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits50/N-45.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-1.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-0.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-10.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-38.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-28.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-30.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-19.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-26.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-6.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-37.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-40.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-44.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-48.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-9.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-36.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-8.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-22.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-24.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-34.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-2.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-16.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-27.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-49.html");
yourResult = tester.getOutgoingLinks("https://people.scs.carleton.ca/~avamckenney/fruits50/N-45.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #38 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits50/N-45.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #38 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits50/N-45.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #39 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits50/N-3.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-31.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-34.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-38.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-39.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-45.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-44.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-25.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-48.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-24.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-14.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-35.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-5.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-23.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-28.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-8.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-29.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-32.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-4.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-20.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-0.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-27.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-19.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-37.html");
yourResult = tester.getOutgoingLinks("https://people.scs.carleton.ca/~avamckenney/fruits50/N-3.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #39 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits50/N-3.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #39 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits50/N-3.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #40 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits50/N-30.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-4.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-7.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-39.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-37.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-28.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-2.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-27.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-13.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-42.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-29.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-20.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-35.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-41.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-14.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-23.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-17.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-0.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-1.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-9.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-3.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-12.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-38.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-15.html");
yourResult = tester.getOutgoingLinks("https://people.scs.carleton.ca/~avamckenney/fruits50/N-30.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #40 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits50/N-30.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #40 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits50/N-30.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #41 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits50/N-31.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-4.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-45.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-20.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-21.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-48.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-39.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-5.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-23.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-34.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-38.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-43.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-33.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-41.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-49.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-13.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-19.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-29.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-46.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-2.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-36.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-9.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-18.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-15.html");
yourResult = tester.getOutgoingLinks("https://people.scs.carleton.ca/~avamckenney/fruits50/N-31.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #41 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits50/N-31.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #41 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits50/N-31.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #42 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits50/N-1.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-31.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-19.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-33.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-42.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-21.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-3.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-30.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-34.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-29.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-0.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-39.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-16.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-23.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-4.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-43.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-35.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-38.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-37.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-25.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-27.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-41.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-5.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-13.html");
yourResult = tester.getOutgoingLinks("https://people.scs.carleton.ca/~avamckenney/fruits50/N-1.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #42 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits50/N-1.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #42 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits50/N-1.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #43 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits50/N-38.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-27.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-49.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-26.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-35.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-32.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-5.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-7.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-14.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-43.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-34.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-33.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-13.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-2.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-17.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-42.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-20.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-16.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-45.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-1.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-8.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-3.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-40.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-24.html");
yourResult = tester.getOutgoingLinks("https://people.scs.carleton.ca/~avamckenney/fruits50/N-38.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #43 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits50/N-38.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #43 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits50/N-38.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #44 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits50/N-5.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-48.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-35.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-7.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-41.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-36.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-31.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-28.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-24.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-3.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-40.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-14.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-37.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-0.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-11.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-21.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-22.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-10.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-15.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-25.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-16.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-19.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-17.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-43.html");
yourResult = tester.getOutgoingLinks("https://people.scs.carleton.ca/~avamckenney/fruits50/N-5.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #44 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits50/N-5.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #44 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits50/N-5.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #45 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits50/N-46.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-36.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-42.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-47.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-29.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-26.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-39.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-37.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-25.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-21.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-48.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-18.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-44.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-14.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-16.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-40.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-28.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-33.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-7.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-30.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-2.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-31.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-10.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-11.html");
yourResult = tester.getOutgoingLinks("https://people.scs.carleton.ca/~avamckenney/fruits50/N-46.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #45 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits50/N-46.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #45 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits50/N-46.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #46 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits50/N-13.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-36.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-7.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-9.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-30.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-26.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-20.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-29.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-44.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-4.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-12.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-10.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-45.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-24.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-40.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-35.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-11.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-47.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-49.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-17.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-39.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-6.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-22.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-37.html");
yourResult = tester.getOutgoingLinks("https://people.scs.carleton.ca/~avamckenney/fruits50/N-13.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #46 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits50/N-13.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #46 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits50/N-13.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #47 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits50/N-15.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-6.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-20.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-24.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-3.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-18.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-0.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-14.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-33.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-22.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-17.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-23.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-43.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-19.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-39.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-2.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-49.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-8.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-4.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-11.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-31.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-25.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-26.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-16.html");
yourResult = tester.getOutgoingLinks("https://people.scs.carleton.ca/~avamckenney/fruits50/N-15.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #47 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits50/N-15.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #47 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits50/N-15.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #48 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits50/N-6.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-12.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-42.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-14.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-34.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-3.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-29.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-4.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-33.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-15.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-35.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-37.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-38.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-22.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-16.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-45.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-36.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-46.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-5.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-13.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-40.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-20.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-47.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-28.html");
yourResult = tester.getOutgoingLinks("https://people.scs.carleton.ca/~avamckenney/fruits50/N-6.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #48 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits50/N-6.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #48 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits50/N-6.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #49 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits50/N-16.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-46.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-35.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-11.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-9.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-30.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-42.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-44.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-21.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-33.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-18.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-17.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-45.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-28.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-36.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-47.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-22.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-5.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-2.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-32.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-27.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-37.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-34.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-1.html");
yourResult = tester.getOutgoingLinks("https://people.scs.carleton.ca/~avamckenney/fruits50/N-16.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #49 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits50/N-16.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #49 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits50/N-16.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #50 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits50/N-40.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-42.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-28.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-30.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-26.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-43.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-33.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-35.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-5.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-25.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-32.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-41.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-39.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-18.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-0.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-16.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-4.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-44.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-14.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-8.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-1.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-34.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-3.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits50/N-23.html");
yourResult = tester.getOutgoingLinks("https://people.scs.carleton.ca/~avamckenney/fruits50/N-40.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #50 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits50/N-40.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #50 checking outgoing links for https://people.scs.carleton.ca/~avamckenney/fruits50/N-40.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #51 checking outgoing links for http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = new ArrayList<String>();
yourResult = tester.getOutgoingLinks("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
if(yourResult == null){
passOut.println("Passed Test #51 checking outgoing links for http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + null);
passOut.println("result = null\n\n");
}else{failOut.println("Failed Test #51 checking outgoing links for http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + null);
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

failOut.close();
passOut.close();
}
}
