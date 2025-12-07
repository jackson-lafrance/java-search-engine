import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.*;
public class FruitsAIncomingLinksTester {public static void main(String[] args) throws Exception{
ProjectTester tester = new ProjectTesterImp(); //Instantiate your own ProjectTester instance here
tester.initialize();
tester.crawl("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-0.html");
runTest(tester);}public static void runTest(ProjectTester tester) throws Exception{
PrintWriter failOut = new PrintWriter(new FileWriter("FruitsA-IncomingLinks-failed.txt"));
PrintWriter passOut = new PrintWriter(new FileWriter("FruitsA-IncomingLinks-passed.txt"));
List<String> expectedResult;
List<String> yourResult;
//Test #52 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-35.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-2.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-24.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-15.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-0.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-8.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-39.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-26.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-32.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-20.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-40.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-37.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-27.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-47.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-38.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-23.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-7.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-5.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-1.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-34.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-6.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-18.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-30.html");
yourResult = tester.getIncomingLinks("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-35.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #52 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-35.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #52 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-35.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #53 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-0.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-9.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-28.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-4.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-14.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-27.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-47.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-42.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-36.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-21.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-24.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-15.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-7.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-39.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-22.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-10.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-41.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-35.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-23.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-17.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-18.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-9.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-45.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-34.html");
yourResult = tester.getIncomingLinks("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-0.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #53 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-0.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #53 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-0.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #54 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-30.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-1.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-21.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-36.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-8.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-17.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-15.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-28.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-4.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-6.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-49.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-42.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-5.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-44.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-3.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-0.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-37.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-20.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-38.html");
yourResult = tester.getIncomingLinks("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-30.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #54 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-30.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #54 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-30.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #55 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-29.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-35.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-21.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-40.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-11.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-10.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-47.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-17.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-8.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-16.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-38.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-23.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-27.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-2.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-6.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-48.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-32.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-13.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-12.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-30.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-31.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-19.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-7.html");
yourResult = tester.getIncomingLinks("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-29.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #55 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-29.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #55 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-29.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #56 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-22.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-24.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-35.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-2.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-11.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-17.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-31.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-4.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-10.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-34.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-7.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-0.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-23.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-39.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-44.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-16.html");
yourResult = tester.getIncomingLinks("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-22.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #56 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-22.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #56 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-22.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #57 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-42.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-0.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-25.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-29.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-9.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-20.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-26.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-13.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-30.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-23.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-45.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-17.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-5.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-18.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-40.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-49.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-3.html");
yourResult = tester.getIncomingLinks("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-42.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #57 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-42.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #57 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-42.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #58 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-11.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-39.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-26.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-12.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-10.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-30.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-42.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-28.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-10.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-9.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-2.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-24.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-29.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-31.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-22.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-21.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-44.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-45.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-15.html");
yourResult = tester.getIncomingLinks("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-11.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #58 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-11.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #58 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-11.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #59 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-16.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-17.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-39.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-23.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-35.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-8.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-43.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-35.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-44.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-15.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-38.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-24.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-47.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-41.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-36.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-4.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-37.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-34.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-26.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-6.html");
yourResult = tester.getIncomingLinks("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-16.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #59 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-16.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #59 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-16.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #60 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-25.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-1.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-19.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-44.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-40.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-48.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-2.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-21.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-6.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-23.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-22.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-10.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-7.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-5.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-31.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-37.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-34.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-27.html");
yourResult = tester.getIncomingLinks("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-25.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #60 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-25.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #60 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-25.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #61 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-26.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-38.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-39.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-36.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-8.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-15.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-14.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-35.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-47.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-17.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-13.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-20.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-48.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-3.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-12.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-5.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-42.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-16.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-34.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-22.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-27.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-6.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-18.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-46.html");
yourResult = tester.getIncomingLinks("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-26.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #61 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-26.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #61 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-26.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #62 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-49.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-46.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-12.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-39.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-21.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-27.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-29.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-26.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-47.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-22.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-42.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-20.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-10.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-21.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-19.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-15.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-40.html");
yourResult = tester.getIncomingLinks("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-49.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #62 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-49.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #62 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-49.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #63 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-18.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-13.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-28.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-6.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-21.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-8.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-37.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-7.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-46.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-4.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-43.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-39.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-17.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-20.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-31.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-32.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-44.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-1.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-33.html");
yourResult = tester.getIncomingLinks("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-18.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #63 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-18.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #63 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-18.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #64 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-42.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-18.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-11.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-36.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-24.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-47.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-44.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-33.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-45.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-20.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-32.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-21.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-39.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-16.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-5.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-48.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-8.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-38.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-29.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-49.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-7.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-43.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-2.html");
yourResult = tester.getIncomingLinks("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-42.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #64 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-42.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #64 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-42.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #65 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-30.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-8.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-32.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-47.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-37.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-14.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-15.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-31.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-39.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-38.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-18.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-44.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-46.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-13.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-6.html");
yourResult = tester.getIncomingLinks("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-30.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #65 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-30.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #65 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-30.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #66 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-5.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-13.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-33.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-45.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-14.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-34.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-46.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-10.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-27.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-7.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-49.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-15.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-30.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-41.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-19.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-26.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-4.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-1.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-39.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-29.html");
yourResult = tester.getIncomingLinks("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-5.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #66 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-5.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #66 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-5.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #67 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-27.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-24.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-43.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-1.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-39.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-44.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-22.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-25.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-10.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-11.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-48.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-31.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-4.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-21.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-42.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-18.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-15.html");
yourResult = tester.getIncomingLinks("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-27.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #67 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-27.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #67 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-27.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #68 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-40.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-25.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-4.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-11.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-2.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-5.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-3.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-10.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-41.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-9.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-30.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-17.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-29.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-44.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-32.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-45.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-18.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-28.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-13.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-21.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-46.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-23.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-13.html");
yourResult = tester.getIncomingLinks("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-40.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #68 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-40.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #68 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-40.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #69 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-46.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-1.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-12.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-11.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-5.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-19.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-15.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-37.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-7.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-32.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-49.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-48.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-29.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-31.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-40.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-0.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-21.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-20.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-23.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-33.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-15.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-44.html");
yourResult = tester.getIncomingLinks("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-46.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #69 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-46.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #69 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-46.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #70 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-20.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-48.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-38.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-39.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-15.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-30.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-34.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-9.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-47.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-8.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-49.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-26.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-1.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-11.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-28.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-35.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-0.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-17.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-23.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-43.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-5.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-42.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-25.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-19.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-40.html");
yourResult = tester.getIncomingLinks("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-20.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #70 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-20.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #70 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-20.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #71 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-2.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-29.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-9.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-24.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-21.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-48.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-46.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-25.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-10.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-22.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-18.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-44.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-7.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-1.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-47.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-39.html");
yourResult = tester.getIncomingLinks("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-2.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #71 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-2.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #71 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-2.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #72 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-2.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-46.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-8.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-11.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-1.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-6.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-14.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-12.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-47.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-32.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-38.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-35.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-25.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-36.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-49.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-27.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-17.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-22.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-23.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-19.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-45.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-20.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-16.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-34.html");
yourResult = tester.getIncomingLinks("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-2.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #72 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-2.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #72 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-2.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #73 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-39.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-14.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-10.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-17.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-27.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-2.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-19.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-41.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-4.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-7.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-5.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-25.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-45.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-11.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-38.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-35.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-36.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-22.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-34.html");
yourResult = tester.getIncomingLinks("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-39.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #73 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-39.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #73 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-39.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #74 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-44.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-19.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-38.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-45.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-9.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-48.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-22.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-0.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-18.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-20.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-41.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-37.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-28.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-33.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-4.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-39.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-46.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-5.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-36.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-27.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-35.html");
yourResult = tester.getIncomingLinks("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-44.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #74 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-44.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #74 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-44.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #75 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-41.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-6.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-24.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-39.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-28.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-12.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-17.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-13.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-29.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-5.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-33.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-27.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-2.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-9.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-29.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-4.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-26.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-35.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-11.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-7.html");
yourResult = tester.getIncomingLinks("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-41.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #75 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-41.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #75 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-41.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #76 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-14.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-41.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-18.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-21.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-37.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-11.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-15.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-25.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-6.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-23.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-8.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-27.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-49.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-46.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-44.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-19.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-48.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-0.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-1.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-29.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-34.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-12.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-45.html");
yourResult = tester.getIncomingLinks("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-14.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #76 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-14.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #76 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-14.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #77 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-48.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-21.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-47.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-39.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-13.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-3.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-29.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-42.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-33.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-15.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-1.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-16.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-0.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-14.html");
yourResult = tester.getIncomingLinks("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-48.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #77 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-48.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #77 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-48.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #78 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-48.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-16.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-33.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-10.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-24.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-5.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-14.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-8.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-44.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-46.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-21.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-23.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-7.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-17.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-11.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-41.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-42.html");
yourResult = tester.getIncomingLinks("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-48.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #78 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-48.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #78 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-48.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #79 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-21.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-10.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-12.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-23.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-49.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-29.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-32.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-28.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-43.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-26.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-44.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-14.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-1.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-6.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-30.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-36.html");
yourResult = tester.getIncomingLinks("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-21.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #79 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-21.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #79 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-21.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #80 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-23.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-3.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-16.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-35.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-45.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-33.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-29.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-37.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-20.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-25.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-22.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-28.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-9.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-2.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-6.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-43.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-36.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-48.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-38.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-1.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-0.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-14.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-7.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-5.html");
yourResult = tester.getIncomingLinks("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-23.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #80 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-23.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #80 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-23.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #81 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-44.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-45.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-46.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-43.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-9.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-19.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-23.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-18.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-30.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-39.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-42.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-24.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-0.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-16.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-25.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-20.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-6.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-47.html");
yourResult = tester.getIncomingLinks("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-44.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #81 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-44.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #81 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-44.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #82 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-33.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-32.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-43.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-22.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-42.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-37.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-13.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-47.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-3.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-18.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-46.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-10.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-26.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-12.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-45.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-28.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-5.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-21.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-14.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-25.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-31.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-49.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-8.html");
yourResult = tester.getIncomingLinks("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-33.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #82 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-33.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #82 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-33.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #83 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-24.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-33.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-41.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-42.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-38.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-29.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-39.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-2.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-32.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-3.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-30.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-47.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-35.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-14.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-20.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-37.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-9.html");
yourResult = tester.getIncomingLinks("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-24.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #83 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-24.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #83 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-24.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #84 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-45.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-31.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-42.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-16.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-3.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-13.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-22.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-6.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-25.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-48.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-11.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-28.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-18.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-5.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-19.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-49.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-2.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-21.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-4.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-14.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-41.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-7.html");
yourResult = tester.getIncomingLinks("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-45.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #84 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-45.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #84 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-45.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #85 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-23.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-40.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-0.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-31.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-17.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-14.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-26.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-44.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-8.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-35.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-11.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-16.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-7.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-33.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-28.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-10.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-36.html");
yourResult = tester.getIncomingLinks("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-23.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #85 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-23.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #85 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-23.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #86 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-3.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-19.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-33.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-12.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-4.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-48.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-5.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-11.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-24.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-14.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-32.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-29.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-34.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-7.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-41.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-15.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-1.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-23.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-31.html");
yourResult = tester.getIncomingLinks("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-3.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #86 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-3.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #86 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-3.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #87 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-15.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-49.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-1.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-14.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-28.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-3.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-13.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-30.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-12.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-20.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-39.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-16.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-11.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-4.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-17.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-9.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-47.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-22.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-43.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-41.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-0.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-29.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-48.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-33.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-36.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-34.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-38.html");
yourResult = tester.getIncomingLinks("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-15.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #87 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-15.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #87 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-15.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #88 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-17.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-20.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-43.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-25.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-1.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-48.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-39.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-31.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-29.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-8.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-16.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-21.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-35.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-23.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-34.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-40.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-32.html");
yourResult = tester.getIncomingLinks("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-17.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #88 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-17.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #88 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-17.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #89 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-33.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-4.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-1.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-36.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-43.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-19.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-41.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-23.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-6.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-39.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-24.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-22.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-26.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-49.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-46.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-47.html");
yourResult = tester.getIncomingLinks("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-33.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #89 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-33.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #89 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-33.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #90 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-47.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-49.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-30.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-28.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-29.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-8.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-10.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-24.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-15.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-7.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-33.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-19.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-4.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-3.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-2.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-14.html");
yourResult = tester.getIncomingLinks("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-47.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #90 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-47.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #90 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-47.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #91 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-43.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-37.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-22.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-4.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-41.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-33.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-16.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-23.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-31.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-8.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-19.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-2.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-32.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-14.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-39.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-44.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-7.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-6.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-20.html");
yourResult = tester.getIncomingLinks("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-43.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #91 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-43.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #91 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-43.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #92 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-38.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-20.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-32.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-23.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-45.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-37.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-1.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-46.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-10.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-25.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-48.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-36.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-22.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-7.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-18.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-40.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-13.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-27.html");
yourResult = tester.getIncomingLinks("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-38.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #92 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-38.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #92 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-38.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #93 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-32.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-13.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-23.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-8.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-31.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-26.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-37.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-1.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-15.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-17.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-3.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-43.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-22.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-3.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-21.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-9.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-19.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-45.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-49.html");
yourResult = tester.getIncomingLinks("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-32.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #93 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-32.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #93 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-32.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #94 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-22.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-40.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-7.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-28.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-36.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-39.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-21.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-44.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-0.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-6.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-2.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-9.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-25.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-33.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-1.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-15.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-17.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-46.html");
yourResult = tester.getIncomingLinks("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-22.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #94 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-22.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #94 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-22.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #95 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-34.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-40.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-20.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-13.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-45.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-44.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-14.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-28.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-1.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-47.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-49.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-26.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-15.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-17.html");
yourResult = tester.getIncomingLinks("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-34.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #95 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-34.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #95 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-34.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #96 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-47.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-48.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-28.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-42.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-42.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-23.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-0.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-21.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-34.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-12.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-25.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-4.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-31.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-46.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-40.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-41.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-6.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-27.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-20.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-49.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-24.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-45.html");
yourResult = tester.getIncomingLinks("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-47.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #96 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-47.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #96 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-47.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #97 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-10.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-26.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-21.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-3.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-18.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-12.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-43.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-24.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-14.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-42.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-36.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-48.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-6.html");
yourResult = tester.getIncomingLinks("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-10.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #97 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-10.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #97 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-10.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #98 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-49.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-46.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-16.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-13.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-42.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-37.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-26.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-43.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-30.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-29.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-18.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-20.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-15.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-10.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-31.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-32.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-11.html");
yourResult = tester.getIncomingLinks("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-49.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #98 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-49.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #98 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-49.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #99 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-28.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-13.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-30.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-16.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-32.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-40.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-31.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-48.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-38.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-7.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-42.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-8.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-36.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-34.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-2.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-15.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-21.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-47.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-43.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-35.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-41.html");
yourResult = tester.getIncomingLinks("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-28.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #99 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-28.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #99 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-28.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #100 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-27.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-46.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-21.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-6.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-31.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-1.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-36.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-28.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-29.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-11.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-14.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-15.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-19.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-46.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-3.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-18.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-16.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-34.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-38.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-23.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-20.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-48.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-4.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-42.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-26.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-0.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-45.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-49.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-10.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-9.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-27.html");
yourResult = tester.getIncomingLinks("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-27.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #100 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-27.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #100 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-27.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #101 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-8.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-2.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-3.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-31.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-19.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-4.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-1.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-38.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-9.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-40.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-41.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-48.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-28.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-0.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-35.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-11.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-30.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-12.html");
yourResult = tester.getIncomingLinks("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-8.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #101 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-8.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #101 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-8.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #102 checking incoming links for http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = new ArrayList<String>();
yourResult = tester.getIncomingLinks("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
if(yourResult == null){
passOut.println("Passed Test #102 checking incoming links for http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + null);
passOut.println("result = null\n\n");
}else{failOut.println("Failed Test #102 checking incoming links for http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + null);
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

failOut.close();
passOut.close();
}
}
