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
//Test #103 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-27.html
expectedResult = 0.008431572365432877;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-27.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #103 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-27.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #103 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-27.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #104 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-31.html
expectedResult = 0.011740034569139994;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-31.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #104 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-31.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #104 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-31.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #105 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-36.html
expectedResult = 0.007744845976170262;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-36.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #105 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-36.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #105 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-36.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #106 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-26.html
expectedResult = 0.011237840091016525;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-26.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #106 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-26.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #106 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-26.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #107 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-21.html
expectedResult = 0.008086550690132133;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-21.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #107 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-21.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #107 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-21.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #108 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-16.html
expectedResult = 0.010557630575351558;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-16.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #108 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-16.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #108 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-16.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #109 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-42.html
expectedResult = 0.009018900242373529;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-42.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #109 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-42.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #109 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-42.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #110 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-49.html
expectedResult = 0.009041621562205684;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-49.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #110 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-49.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #110 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-49.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #111 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-24.html
expectedResult = 0.008391964646698741;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-24.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #111 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-24.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #111 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-24.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #112 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-11.html
expectedResult = 0.007812236341651678;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-11.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #112 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-11.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #112 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-11.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #113 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-47.html
expectedResult = 0.011278067653388927;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-47.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #113 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-47.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #113 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-47.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #114 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-17.html
expectedResult = 0.008742397622691054;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-17.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #114 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-17.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #114 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-17.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #115 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-23.html
expectedResult = 0.011827248695228006;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-23.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #115 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-23.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #115 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-23.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #116 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-38.html
expectedResult = 0.010426636099274602;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-38.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #116 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-38.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #116 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-38.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #117 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-29.html
expectedResult = 0.01122386019720298;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-29.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #117 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-29.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #117 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-29.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #118 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-1.html
expectedResult = 0.007847620661351654;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-1.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #118 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-1.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #118 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-1.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #119 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-12.html
expectedResult = 0.009397461957041529;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-12.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #119 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-12.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #119 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-12.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #120 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-43.html
expectedResult = 0.00958288639850349;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-43.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #120 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-43.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #120 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-43.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #121 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-4.html
expectedResult = 0.01212983518782339;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-4.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #121 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-4.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #121 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-4.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #122 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-28.html
expectedResult = 0.012482612802729824;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-28.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #122 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-28.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #122 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-28.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #123 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-2.html
expectedResult = 0.007865333671521405;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-2.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #123 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-2.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #123 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-2.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #124 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-27.html
expectedResult = 0.015154573145841226;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-27.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #124 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-27.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #124 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-27.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #125 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-37.html
expectedResult = 0.00839947123563327;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-37.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #125 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-37.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #125 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-37.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #126 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-3.html
expectedResult = 0.009912056085244956;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-3.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #126 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-3.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #126 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-3.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #127 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-19.html
expectedResult = 0.010317607207099082;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-19.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #127 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-19.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #127 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-19.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #128 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-9.html
expectedResult = 0.00958893452631612;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-9.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #128 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-9.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #128 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-9.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #129 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-35.html
expectedResult = 0.013473434380557465;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-35.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #129 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-35.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #129 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-35.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #130 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-45.html
expectedResult = 0.010321982864569033;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-45.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #130 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-45.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #130 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-45.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #131 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-14.html
expectedResult = 0.011369275766404736;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-14.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #131 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-14.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #131 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-14.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #132 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-38.html
expectedResult = 0.008904143250981454;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-38.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #132 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-38.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #132 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-38.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #133 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-3.html
expectedResult = 0.010816197168360055;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-3.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #133 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-3.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #133 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-3.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #134 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-23.html
expectedResult = 0.009492562189729452;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-23.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #134 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-23.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #134 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-23.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #135 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-0.html
expectedResult = 0.012462547748561299;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-0.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #135 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-0.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #135 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-0.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #136 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-32.html
expectedResult = 0.009948489175166008;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-32.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #136 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-32.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #136 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-32.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #137 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-24.html
expectedResult = 0.009072017831413069;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-24.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #137 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-24.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #137 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-24.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #138 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-43.html
expectedResult = 0.009318449760749425;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-43.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #138 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-43.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #138 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-43.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #139 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-39.html
expectedResult = 0.00879779331269703;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-39.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #139 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-39.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #139 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-39.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #140 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-34.html
expectedResult = 0.011467400217829314;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-34.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #140 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-34.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #140 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-34.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #141 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-20.html
expectedResult = 0.010474571936339747;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-20.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #141 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-20.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #141 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-20.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #142 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-15.html
expectedResult = 0.010390445732145228;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-15.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #142 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-15.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #142 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-15.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #143 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-28.html
expectedResult = 0.010551554968554689;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-28.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #143 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-28.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #143 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-28.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #144 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-6.html
expectedResult = 0.008793309207624372;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-6.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #144 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-6.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #144 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-6.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #145 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-7.html
expectedResult = 0.00848276478768776;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-7.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #145 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-7.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #145 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-7.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #146 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-31.html
expectedResult = 0.010479786024198455;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-31.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #146 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-31.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #146 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-31.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #147 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-42.html
expectedResult = 0.011237098387341857;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-42.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #147 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-42.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #147 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-42.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #148 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-11.html
expectedResult = 0.009633362581965151;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-11.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #148 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-11.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #148 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-11.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #149 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-22.html
expectedResult = 0.008056495359103936;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-22.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #149 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-22.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #149 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsB/N-22.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #150 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-36.html
expectedResult = 0.008587721682535262;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-36.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #150 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-36.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #150 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-36.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #151 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-30.html
expectedResult = 0.009898164366969402;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-30.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #151 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-30.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #151 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-30.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #152 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-5.html
expectedResult = 0.010629794090563754;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-5.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #152 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-5.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #152 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruitsA/N-5.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #153 checking page rank for http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = -1.0;
yourResult = tester.getPageRank("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #153 checking page rank for http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #153 checking page rank for http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

failOut.close();
passOut.close();
}
}
