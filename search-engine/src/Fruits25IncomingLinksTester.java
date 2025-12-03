import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.*;
public class Fruits25IncomingLinksTester {public static void main(String[] args) throws Exception{
ProjectTester tester = new ProjectTesterImp(); //Instantiate your own ProjectTester instance here
tester.initialize();
tester.crawl("https://people.scs.carleton.ca/~avamckenney/fruits25/N-0.html");
runTest(tester);}public static void runTest(ProjectTester tester) throws Exception{
PrintWriter failOut = new PrintWriter(new FileWriter("Fruits25-IncomingLinks-failed.txt"));
PrintWriter passOut = new PrintWriter(new FileWriter("Fruits25-IncomingLinks-passed.txt"));
List<String> expectedResult;
List<String> yourResult;
//Test #27 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruits25/N-4.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-15.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-19.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-20.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-18.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-9.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-13.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-1.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-3.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-12.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html");
yourResult = tester.getIncomingLinks("https://people.scs.carleton.ca/~avamckenney/fruits25/N-4.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #27 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruits25/N-4.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #27 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruits25/N-4.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #28 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-15.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-12.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-10.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-20.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-0.html");
yourResult = tester.getIncomingLinks("https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #28 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #28 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #29 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruits25/N-21.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-5.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-9.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-7.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-12.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-13.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-8.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-17.html");
yourResult = tester.getIncomingLinks("https://people.scs.carleton.ca/~avamckenney/fruits25/N-21.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #29 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruits25/N-21.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #29 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruits25/N-21.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #30 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-12.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-7.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-21.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-13.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-19.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-14.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-17.html");
yourResult = tester.getIncomingLinks("https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #30 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #30 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #31 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruits25/N-3.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-1.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-20.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-9.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-10.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-5.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-4.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-16.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-0.html");
yourResult = tester.getIncomingLinks("https://people.scs.carleton.ca/~avamckenney/fruits25/N-3.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #31 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruits25/N-3.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #31 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruits25/N-3.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #32 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruits25/N-13.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-17.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-7.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-16.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-20.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-19.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-9.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-3.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-4.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html");
yourResult = tester.getIncomingLinks("https://people.scs.carleton.ca/~avamckenney/fruits25/N-13.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #32 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruits25/N-13.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #32 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruits25/N-13.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #33 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruits25/N-8.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-19.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-14.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-15.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-10.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-12.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-9.html");
yourResult = tester.getIncomingLinks("https://people.scs.carleton.ca/~avamckenney/fruits25/N-8.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #33 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruits25/N-8.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #33 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruits25/N-8.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #34 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruits25/N-20.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-14.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-1.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-18.html");
yourResult = tester.getIncomingLinks("https://people.scs.carleton.ca/~avamckenney/fruits25/N-20.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #34 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruits25/N-20.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #34 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruits25/N-20.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #35 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruits25/N-1.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-21.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-5.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-20.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-16.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-4.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-8.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-3.html");
yourResult = tester.getIncomingLinks("https://people.scs.carleton.ca/~avamckenney/fruits25/N-1.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #35 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruits25/N-1.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #35 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruits25/N-1.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #36 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruits25/N-22.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-15.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-8.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-7.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-17.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-13.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-12.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-19.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-10.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-5.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html");
yourResult = tester.getIncomingLinks("https://people.scs.carleton.ca/~avamckenney/fruits25/N-22.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #36 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruits25/N-22.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #36 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruits25/N-22.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #37 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruits25/N-9.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-15.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-22.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-4.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-21.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-10.html");
yourResult = tester.getIncomingLinks("https://people.scs.carleton.ca/~avamckenney/fruits25/N-9.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #37 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruits25/N-9.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #37 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruits25/N-9.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #38 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruits25/N-17.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-3.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-8.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-20.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-5.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-14.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-22.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-0.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-4.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-18.html");
yourResult = tester.getIncomingLinks("https://people.scs.carleton.ca/~avamckenney/fruits25/N-17.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #38 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruits25/N-17.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #38 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruits25/N-17.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #39 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruits25/N-19.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-14.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-16.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-7.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-4.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-13.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-18.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-15.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-17.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-10.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html");
yourResult = tester.getIncomingLinks("https://people.scs.carleton.ca/~avamckenney/fruits25/N-19.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #39 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruits25/N-19.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #39 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruits25/N-19.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #40 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruits25/N-5.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-12.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-8.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-22.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-9.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-19.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-16.html");
yourResult = tester.getIncomingLinks("https://people.scs.carleton.ca/~avamckenney/fruits25/N-5.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #40 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruits25/N-5.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #40 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruits25/N-5.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #41 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruits25/N-0.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-18.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-21.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-17.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-1.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-12.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-4.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-20.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-19.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-7.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-3.html");
yourResult = tester.getIncomingLinks("https://people.scs.carleton.ca/~avamckenney/fruits25/N-0.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #41 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruits25/N-0.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #41 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruits25/N-0.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #42 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruits25/N-16.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-18.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-0.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-5.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-10.html");
yourResult = tester.getIncomingLinks("https://people.scs.carleton.ca/~avamckenney/fruits25/N-16.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #42 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruits25/N-16.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #42 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruits25/N-16.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #43 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruits25/N-18.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-16.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-1.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-22.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-0.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-4.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-21.html");
yourResult = tester.getIncomingLinks("https://people.scs.carleton.ca/~avamckenney/fruits25/N-18.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #43 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruits25/N-18.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #43 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruits25/N-18.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #44 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruits25/N-15.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-17.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-0.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-5.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-22.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-16.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-9.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html");
yourResult = tester.getIncomingLinks("https://people.scs.carleton.ca/~avamckenney/fruits25/N-15.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #44 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruits25/N-15.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #44 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruits25/N-15.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #45 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruits25/N-10.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-7.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-21.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-8.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-1.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-16.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-15.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-14.html");
yourResult = tester.getIncomingLinks("https://people.scs.carleton.ca/~avamckenney/fruits25/N-10.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #45 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruits25/N-10.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #45 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruits25/N-10.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #46 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruits25/N-7.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-1.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-0.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-18.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-13.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-3.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-21.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-22.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-12.html");
yourResult = tester.getIncomingLinks("https://people.scs.carleton.ca/~avamckenney/fruits25/N-7.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #46 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruits25/N-7.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #46 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruits25/N-7.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #47 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-13.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-14.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-22.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-17.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-9.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-8.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-7.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-1.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-3.html");
yourResult = tester.getIncomingLinks("https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #47 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #47 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #48 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-18.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-3.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-0.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-21.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-9.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-13.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-19.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-22.html");
yourResult = tester.getIncomingLinks("https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #48 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #48 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #49 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-20.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-5.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-7.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-8.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-22.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-14.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-13.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html");
yourResult = tester.getIncomingLinks("https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #49 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #49 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #50 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruits25/N-14.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-10.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-21.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-15.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-4.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-20.html");
yourResult = tester.getIncomingLinks("https://people.scs.carleton.ca/~avamckenney/fruits25/N-14.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #50 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruits25/N-14.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #50 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruits25/N-14.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #51 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruits25/N-12.html
expectedResult = new ArrayList<String>();
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-15.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-10.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-1.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-17.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-0.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-5.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-8.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-14.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-3.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-16.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-19.html");
expectedResult.add("https://people.scs.carleton.ca/~avamckenney/fruits25/N-18.html");
yourResult = tester.getIncomingLinks("https://people.scs.carleton.ca/~avamckenney/fruits25/N-12.html");
if(TestingTools.checkListsEqual(yourResult, expectedResult)){
passOut.println("Passed Test #51 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruits25/N-12.html");
passOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
passOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}else{failOut.println("Failed Test #51 checking incoming links for https://people.scs.carleton.ca/~avamckenney/fruits25/N-12.html");
failOut.println("expected = " + Arrays.toString(expectedResult.toArray(new String[expectedResult.size()])));
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

//Test #52 checking incoming links for http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = new ArrayList<String>();
yourResult = tester.getIncomingLinks("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
if(yourResult == null){
passOut.println("Passed Test #52 checking incoming links for http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + null);
passOut.println("result = null\n\n");
}else{failOut.println("Failed Test #52 checking incoming links for http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + null);
failOut.println("result = " + Arrays.toString(yourResult.toArray(new String[yourResult.size()])) + "\n\n");
}

failOut.close();
passOut.close();
}
}
