import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.*;
public class FruitsAPageRanksTester {public static void main(String[] args) throws Exception{
ProjectTester tester = new ProjectTesterImp(); //Instantiate your own ProjectTester instance here
tester.initialize();
tester.crawl("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-0.html");
runTest(tester);}public static void runTest(ProjectTester tester) throws Exception{
PrintWriter failOut = new PrintWriter(new FileWriter("FruitsA-PageRanks-failed.txt"));
PrintWriter passOut = new PrintWriter(new FileWriter("FruitsA-PageRanks-passed.txt"));
double expectedResult;
double yourResult;
//Test #103 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-36.html
expectedResult = 0.00861848359277902;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-36.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #103 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-36.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #103 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-36.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #104 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-20.html
expectedResult = 0.012648060438763058;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-20.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #104 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-20.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #104 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-20.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #105 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-19.html
expectedResult = 0.01265649219858347;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-19.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #105 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-19.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #105 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-19.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #106 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-49.html
expectedResult = 0.009162007472585517;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-49.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #106 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-49.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #106 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-49.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #107 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-22.html
expectedResult = 0.009301111400785477;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-22.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #107 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-22.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #107 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-22.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #108 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-0.html
expectedResult = 0.010259195079570013;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-0.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #108 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-0.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #108 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-0.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #109 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-2.html
expectedResult = 0.007889522667584057;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-2.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #109 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-2.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #109 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-2.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #110 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-3.html
expectedResult = 0.009947729997444615;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-3.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #110 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-3.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #110 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-3.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #111 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-1.html
expectedResult = 0.00781924889047037;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-1.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #111 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-1.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #111 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-1.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #112 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-21.html
expectedResult = 0.00933425375789581;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-21.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #112 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-21.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #112 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-21.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #113 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-48.html
expectedResult = 0.008016065346805509;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-48.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #113 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-48.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #113 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-48.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #114 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-34.html
expectedResult = 0.0077608101961914935;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-34.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #114 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-34.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #114 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-34.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #115 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-18.html
expectedResult = 0.00955518709224548;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-18.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #115 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-18.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #115 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-18.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #116 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-18.html
expectedResult = 0.010750316805017602;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-18.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #116 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-18.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #116 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-18.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #117 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-19.html
expectedResult = 0.010283721713474268;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-19.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #117 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-19.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #117 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-19.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #118 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-2.html
expectedResult = 0.01221410093826785;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-2.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #118 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-2.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #118 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-2.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #119 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-35.html
expectedResult = 0.012184959988731772;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-35.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #119 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-35.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #119 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-35.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #120 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-48.html
expectedResult = 0.007617556204277338;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-48.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #120 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-48.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #120 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-48.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #121 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-32.html
expectedResult = 0.011599775279883016;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-32.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #121 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-32.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #121 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-32.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #122 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-37.html
expectedResult = 0.008428851338443247;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-37.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #122 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-37.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #122 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-37.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #123 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-20.html
expectedResult = 0.010504194378068323;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-20.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #123 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-20.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #123 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-20.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #124 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-16.html
expectedResult = 0.007320030869135282;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-16.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #124 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-16.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #124 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-16.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #125 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-34.html
expectedResult = 0.011509138606694627;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-34.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #125 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-34.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #125 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-34.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #126 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-23.html
expectedResult = 0.009527177956779894;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-23.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #126 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-23.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #126 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-23.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #127 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-21.html
expectedResult = 0.008057231945412576;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-21.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #127 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-21.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #127 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-21.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #128 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-15.html
expectedResult = 0.012951777190563346;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-15.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #128 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-15.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #128 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-15.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #129 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-33.html
expectedResult = 0.011869282630865372;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-33.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #129 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-33.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #129 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-33.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #130 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-11.html
expectedResult = 0.007840391095805938;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-11.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #130 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-11.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #130 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-11.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #131 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-5.html
expectedResult = 0.010668491360525638;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-5.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #131 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-5.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #131 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-5.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #132 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-24.html
expectedResult = 0.009103917481371637;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-24.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #132 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-24.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #132 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-24.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #133 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-0.html
expectedResult = 0.01250243163407956;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-0.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #133 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-0.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #133 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-0.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #134 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-17.html
expectedResult = 0.01098700363793608;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-17.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #134 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-17.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #134 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-17.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #135 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-31.html
expectedResult = 0.011695496007221636;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-31.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #135 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-31.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #135 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-31.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #136 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-37.html
expectedResult = 0.009832167801672181;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-37.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #136 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-37.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #136 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-37.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #137 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-39.html
expectedResult = 0.008825259723037646;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-39.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #137 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-39.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #137 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-39.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #138 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-4.html
expectedResult = 0.008725751508809365;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-4.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #138 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-4.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #138 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-4.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #139 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-6.html
expectedResult = 0.0103256237482826;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-6.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #139 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-6.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #139 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-6.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #140 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-40.html
expectedResult = 0.012040688360604138;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-40.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #140 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-40.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #140 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-40.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #141 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-47.html
expectedResult = 0.011239656960671255;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-47.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #141 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-47.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #141 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-47.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #142 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-44.html
expectedResult = 0.010712466672859565;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-44.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #142 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-44.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #142 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-44.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #143 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-22.html
expectedResult = 0.008026756069430069;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-22.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #143 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-22.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #143 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-22.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #144 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-25.html
expectedResult = 0.009143998325041154;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-25.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #144 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-25.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #144 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-25.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #145 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-46.html
expectedResult = 0.009103532083459431;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-46.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #145 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-46.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #145 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-46.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #146 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-43.html
expectedResult = 0.009347791082559979;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-43.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #146 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-43.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #146 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-43.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #147 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-41.html
expectedResult = 0.007220183010130011;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-41.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #147 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-41.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #147 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-41.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #148 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-28.html
expectedResult = 0.010511573535253145;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-28.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #148 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-28.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #148 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-28.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #149 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-49.html
expectedResult = 0.009073162603025785;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-49.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #149 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-49.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #149 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-49.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #150 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-26.html
expectedResult = 0.01120611445649156;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-26.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #150 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-26.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #150 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-26.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #151 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-30.html
expectedResult = 0.009934302135542871;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-30.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #151 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-30.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #151 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-30.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #152 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-12.html
expectedResult = 0.009362398779103573;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-12.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #152 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-12.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #152 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-12.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #153 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-8.html
expectedResult = 0.009674526965900354;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-8.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #153 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-8.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #153 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-8.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #154 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-6.html
expectedResult = 0.008761559848861563;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-6.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #154 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-6.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #154 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-6.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #155 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-43.html
expectedResult = 0.009546989058503132;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-43.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #155 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-43.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #155 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-43.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #156 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-14.html
expectedResult = 0.011407487293465668;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-14.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #156 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-14.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #156 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-14.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #157 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-27.html
expectedResult = 0.008461780639282894;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-27.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #157 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-27.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #157 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-27.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #158 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-9.html
expectedResult = 0.011265996086594203;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-9.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #158 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-9.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #158 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-9.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #159 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-7.html
expectedResult = 0.007845363485708757;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-7.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #159 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-7.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #159 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-7.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #160 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-13.html
expectedResult = 0.011550721826794624;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-13.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #160 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-13.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #160 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-13.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #161 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-11.html
expectedResult = 0.009601345384105014;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-11.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #161 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-11.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #161 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-11.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #162 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-44.html
expectedResult = 0.009473069176000512;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-44.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #162 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-44.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #162 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-44.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #163 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-28.html
expectedResult = 0.012528242575906415;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-28.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #163 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-28.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #163 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-28.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #164 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-42.html
expectedResult = 0.008985679088953907;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-42.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #164 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-42.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #164 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-42.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #165 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-15.html
expectedResult = 0.010423345401952257;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-15.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #165 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-15.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #165 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-15.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #166 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-12.html
expectedResult = 0.009479874717733995;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-12.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #166 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-12.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #166 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-12.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #167 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-5.html
expectedResult = 0.010805375359397622;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-5.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #167 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-5.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #167 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-5.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #168 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-29.html
expectedResult = 0.011698527025059895;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-29.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #168 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-29.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #168 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-29.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #169 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-8.html
expectedResult = 0.008654260017672;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-8.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #169 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-8.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #169 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-8.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #170 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-45.html
expectedResult = 0.010358894125626501;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-45.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #170 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-45.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #170 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-45.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #171 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-38.html
expectedResult = 0.010392691182595816;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-38.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #171 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-38.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #171 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-38.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #172 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-42.html
expectedResult = 0.011277540915711818;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-42.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #172 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-42.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #172 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-42.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #173 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-27.html
expectedResult = 0.01510358807508766;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-27.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #173 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-27.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #173 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-27.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #174 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-24.html
expectedResult = 0.0083620807966035;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-24.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #174 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-24.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #174 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-24.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #175 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-13.html
expectedResult = 0.010571470998067375;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-13.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #175 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-13.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #175 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-13.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #176 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-40.html
expectedResult = 0.011929285783472935;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-40.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #176 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-40.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #176 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-40.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #177 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-26.html
expectedResult = 0.012248474393062262;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-26.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #177 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-26.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #177 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-26.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #178 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-10.html
expectedResult = 0.006358511371256108;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-10.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #178 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-10.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #178 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-10.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #179 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-31.html
expectedResult = 0.010517469569016188;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-31.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #179 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-31.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #179 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-31.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #180 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-29.html
expectedResult = 0.011185227963534642;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-29.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #180 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-29.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #180 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-29.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #181 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-25.html
expectedResult = 0.009004884379859553;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-25.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #181 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-25.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #181 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-25.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #182 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-23.html
expectedResult = 0.011781966796400721;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-23.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #182 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-23.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #182 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-23.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #183 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-41.html
expectedResult = 0.010865794831147428;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-41.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #183 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-41.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #183 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-41.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #184 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-3.html
expectedResult = 0.010781069997705893;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-3.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #184 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-3.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #184 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-3.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #185 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-16.html
expectedResult = 0.01059158111628503;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-16.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #185 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-16.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #185 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-16.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #186 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-46.html
expectedResult = 0.011392317994182158;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-46.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #186 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-46.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #186 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-46.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #187 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-14.html
expectedResult = 0.009657475491033784;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-14.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #187 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-14.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #187 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-14.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #188 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-45.html
expectedResult = 0.010586805400012321;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-45.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #188 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-45.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #188 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-45.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #189 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-47.html
expectedResult = 0.008709561050932438;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-47.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #189 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-47.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #189 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-47.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #190 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-10.html
expectedResult = 0.010422740316199006;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-10.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #190 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-10.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #190 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-10.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #191 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-30.html
expectedResult = 0.008179766184186437;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-30.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #191 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-30.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #191 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-30.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #192 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-1.html
expectedResult = 0.007871478295688244;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-1.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #192 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-1.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #192 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-1.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #193 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-36.html
expectedResult = 0.007717109641070311;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-36.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #193 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-36.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #193 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-36.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #194 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-4.html
expectedResult = 0.012174585381810281;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-4.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #194 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-4.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #194 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-4.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #195 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-7.html
expectedResult = 0.008509836571402963;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-7.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #195 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-7.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #195 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-7.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #196 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-32.html
expectedResult = 0.009976915091136913;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-32.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #196 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-32.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #196 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-32.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #197 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-33.html
expectedResult = 0.007925035356889704;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-33.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #197 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-33.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #197 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-33.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #198 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-35.html
expectedResult = 0.01352338334032075;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-35.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #198 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-35.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #198 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-35.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #199 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-17.html
expectedResult = 0.008709611066124702;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-17.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #199 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-17.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #199 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-17.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #200 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-38.html
expectedResult = 0.008932375616662179;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-38.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #200 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-38.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #200 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-38.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #201 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-39.html
expectedResult = 0.009448520036645858;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-39.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #201 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-39.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #201 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-39.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #202 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-9.html
expectedResult = 0.009552364868143466;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-9.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #202 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-9.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #202 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-9.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #203 checking page rank for http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = -1.0;
yourResult = tester.getPageRank("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #203 checking page rank for http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #203 checking page rank for http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

failOut.close();
passOut.close();
}
}
