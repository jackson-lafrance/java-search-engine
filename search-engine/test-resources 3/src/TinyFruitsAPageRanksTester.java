import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.*;
public class TinyFruitsAPageRanksTester {public static void main(String[] args) throws Exception{
ProjectTester tester = new ProjectTesterImp(); //Instantiate your own ProjectTester instance here
tester.initialize();
tester.crawl("https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-0.html");
runTest(tester);}public static void runTest(ProjectTester tester) throws Exception{
PrintWriter failOut = new PrintWriter(new FileWriter("TinyFruitsA-PageRanks-failed.txt"));
PrintWriter passOut = new PrintWriter(new FileWriter("TinyFruitsA-PageRanks-passed.txt"));
double expectedResult;
double yourResult;
//Test #23 checking page rank for https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-3.html
expectedResult = 0.12463337770748777;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-3.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #23 checking page rank for https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-3.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #23 checking page rank for https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-3.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #24 checking page rank for https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-1.html
expectedResult = 0.2514682505888148;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-1.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #24 checking page rank for https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-1.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #24 checking page rank for https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-1.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #25 checking page rank for https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-3.html
expectedResult = 0.11611088718909345;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-3.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #25 checking page rank for https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-3.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #25 checking page rank for https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-3.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #26 checking page rank for https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-4.html
expectedResult = 0.08270869902265658;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-4.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #26 checking page rank for https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-4.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #26 checking page rank for https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-4.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #27 checking page rank for https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-2.html
expectedResult = 0.06098605173933076;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-2.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #27 checking page rank for https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-2.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #27 checking page rank for https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-2.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #28 checking page rank for https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-0.html
expectedResult = 0.055260539290425986;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-0.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #28 checking page rank for https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-0.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #28 checking page rank for https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-0.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #29 checking page rank for https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-2.html
expectedResult = 0.15416696441409242;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-2.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #29 checking page rank for https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-2.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #29 checking page rank for https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-2.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #30 checking page rank for https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-1.html
expectedResult = 0.04340218816643688;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-1.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #30 checking page rank for https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-1.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #30 checking page rank for https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-1.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #31 checking page rank for https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-0.html
expectedResult = 0.05563152094083124;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-0.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #31 checking page rank for https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-0.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #31 checking page rank for https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-0.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #32 checking page rank for https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-4.html
expectedResult = 0.05563152094083124;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-4.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #32 checking page rank for https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-4.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #32 checking page rank for https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-4.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #33 checking page rank for http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = -1.0;
yourResult = tester.getPageRank("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #33 checking page rank for http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #33 checking page rank for http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

failOut.close();
passOut.close();
}
}
