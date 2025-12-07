import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.*;
public class TinyFruitsPageRanksTester {public static void main(String[] args) throws Exception{
ProjectTester tester = new ProjectTesterImp(); //Instantiate your own ProjectTester instance here
tester.initialize();
tester.crawl("https://people.scs.carleton.ca/~avamckenney/tinyfruits/N-0.html");
runTest(tester);}public static void runTest(ProjectTester tester) throws Exception{
PrintWriter failOut = new PrintWriter(new FileWriter("TinyFruits-PageRanks-failed.txt"));
PrintWriter passOut = new PrintWriter(new FileWriter("TinyFruits-PageRanks-passed.txt"));
double expectedResult;
double yourResult;
//Test #23 checking page rank for https://people.scs.carleton.ca/~avamckenney/tinyfruits/N-4.html
expectedResult = 0.11896589840368195;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/tinyfruits/N-4.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #23 checking page rank for https://people.scs.carleton.ca/~avamckenney/tinyfruits/N-4.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #23 checking page rank for https://people.scs.carleton.ca/~avamckenney/tinyfruits/N-4.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #24 checking page rank for https://people.scs.carleton.ca/~avamckenney/tinyfruits/N-7.html
expectedResult = 0.119393345388381;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/tinyfruits/N-7.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #24 checking page rank for https://people.scs.carleton.ca/~avamckenney/tinyfruits/N-7.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #24 checking page rank for https://people.scs.carleton.ca/~avamckenney/tinyfruits/N-7.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #25 checking page rank for https://people.scs.carleton.ca/~avamckenney/tinyfruits/N-9.html
expectedResult = 0.047437575882385265;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/tinyfruits/N-9.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #25 checking page rank for https://people.scs.carleton.ca/~avamckenney/tinyfruits/N-9.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #25 checking page rank for https://people.scs.carleton.ca/~avamckenney/tinyfruits/N-9.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #26 checking page rank for https://people.scs.carleton.ca/~avamckenney/tinyfruits/N-1.html
expectedResult = 0.04626387769044501;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/tinyfruits/N-1.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #26 checking page rank for https://people.scs.carleton.ca/~avamckenney/tinyfruits/N-1.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #26 checking page rank for https://people.scs.carleton.ca/~avamckenney/tinyfruits/N-1.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #27 checking page rank for https://people.scs.carleton.ca/~avamckenney/tinyfruits/N-0.html
expectedResult = 0.32242634121821057;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/tinyfruits/N-0.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #27 checking page rank for https://people.scs.carleton.ca/~avamckenney/tinyfruits/N-0.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #27 checking page rank for https://people.scs.carleton.ca/~avamckenney/tinyfruits/N-0.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #28 checking page rank for https://people.scs.carleton.ca/~avamckenney/tinyfruits/N-8.html
expectedResult = 0.1247655588395653;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/tinyfruits/N-8.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #28 checking page rank for https://people.scs.carleton.ca/~avamckenney/tinyfruits/N-8.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #28 checking page rank for https://people.scs.carleton.ca/~avamckenney/tinyfruits/N-8.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #29 checking page rank for https://people.scs.carleton.ca/~avamckenney/tinyfruits/N-5.html
expectedResult = 0.04626387769044501;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/tinyfruits/N-5.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #29 checking page rank for https://people.scs.carleton.ca/~avamckenney/tinyfruits/N-5.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #29 checking page rank for https://people.scs.carleton.ca/~avamckenney/tinyfruits/N-5.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #30 checking page rank for https://people.scs.carleton.ca/~avamckenney/tinyfruits/N-3.html
expectedResult = 0.08195576950599576;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/tinyfruits/N-3.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #30 checking page rank for https://people.scs.carleton.ca/~avamckenney/tinyfruits/N-3.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #30 checking page rank for https://people.scs.carleton.ca/~avamckenney/tinyfruits/N-3.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #31 checking page rank for https://people.scs.carleton.ca/~avamckenney/tinyfruits/N-6.html
expectedResult = 0.04626387769044501;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/tinyfruits/N-6.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #31 checking page rank for https://people.scs.carleton.ca/~avamckenney/tinyfruits/N-6.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #31 checking page rank for https://people.scs.carleton.ca/~avamckenney/tinyfruits/N-6.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #32 checking page rank for https://people.scs.carleton.ca/~avamckenney/tinyfruits/N-2.html
expectedResult = 0.04626387769044501;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/tinyfruits/N-2.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #32 checking page rank for https://people.scs.carleton.ca/~avamckenney/tinyfruits/N-2.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #32 checking page rank for https://people.scs.carleton.ca/~avamckenney/tinyfruits/N-2.html");
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
