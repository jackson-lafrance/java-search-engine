import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.*;
public class Fruits100PageRanksTester {public static void main(String[] args) throws Exception{
ProjectTester tester = new ProjectTesterImp(); //Instantiate your own ProjectTester instance here
tester.initialize();
tester.crawl("https://people.scs.carleton.ca/~avamckenney/fruits100/N-0.html");
runTest(tester);}public static void runTest(ProjectTester tester) throws Exception{
PrintWriter failOut = new PrintWriter(new FileWriter("Fruits100-PageRanks-failed.txt"));
PrintWriter passOut = new PrintWriter(new FileWriter("Fruits100-PageRanks-passed.txt"));
double expectedResult;
double yourResult;
//Test #103 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-32.html
expectedResult = 0.00902178749989038;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits100/N-32.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #103 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-32.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #103 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-32.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #104 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-77.html
expectedResult = 0.007404357868423432;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits100/N-77.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #104 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-77.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #104 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-77.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #105 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-1.html
expectedResult = 0.008884106499558331;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits100/N-1.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #105 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-1.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #105 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-1.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #106 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-63.html
expectedResult = 0.010893224911381802;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits100/N-63.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #106 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-63.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #106 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-63.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #107 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-29.html
expectedResult = 0.009412166306559605;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits100/N-29.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #107 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-29.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #107 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-29.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #108 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-47.html
expectedResult = 0.010356708025986523;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits100/N-47.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #108 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-47.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #108 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-47.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #109 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-33.html
expectedResult = 0.011346921912232594;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits100/N-33.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #109 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-33.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #109 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-33.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #110 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-78.html
expectedResult = 0.010240382742591609;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits100/N-78.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #110 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-78.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #110 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-78.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #111 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-64.html
expectedResult = 0.008984117893247283;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits100/N-64.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #111 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-64.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #111 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-64.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #112 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-94.html
expectedResult = 0.01174730921703423;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits100/N-94.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #112 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-94.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #112 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-94.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #113 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-0.html
expectedResult = 0.010539689279471956;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits100/N-0.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #113 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-0.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #113 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-0.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #114 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-80.html
expectedResult = 0.008812345563354668;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits100/N-80.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #114 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-80.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #114 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-80.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #115 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-81.html
expectedResult = 0.008959963416837786;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits100/N-81.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #115 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-81.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #115 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-81.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #116 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-76.html
expectedResult = 0.008532428256153059;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits100/N-76.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #116 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-76.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #116 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-76.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #117 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-92.html
expectedResult = 0.00917042902851528;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits100/N-92.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #117 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-92.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #117 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-92.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #118 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-95.html
expectedResult = 0.009853568888067975;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits100/N-95.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #118 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-95.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #118 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-95.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #119 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-79.html
expectedResult = 0.008413204431238719;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits100/N-79.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #119 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-79.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #119 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-79.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #120 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-51.html
expectedResult = 0.009544494316146965;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits100/N-51.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #120 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-51.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #120 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-51.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #121 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-65.html
expectedResult = 0.010950492873128178;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits100/N-65.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #121 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-65.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #121 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-65.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #122 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-16.html
expectedResult = 0.008841581969102634;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits100/N-16.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #122 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-16.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #122 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-16.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #123 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-46.html
expectedResult = 0.009616950611746682;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits100/N-46.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #123 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-46.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #123 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-46.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #124 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-62.html
expectedResult = 0.011424443569421261;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits100/N-62.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #124 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-62.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #124 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-62.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #125 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-27.html
expectedResult = 0.010946474655628206;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits100/N-27.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #125 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-27.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #125 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-27.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #126 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-60.html
expectedResult = 0.011520243296654529;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits100/N-60.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #126 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-60.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #126 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-60.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #127 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-21.html
expectedResult = 0.01069570634049598;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits100/N-21.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #127 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-21.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #127 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-21.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #128 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-4.html
expectedResult = 0.010075103823212013;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits100/N-4.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #128 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-4.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #128 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-4.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #129 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-66.html
expectedResult = 0.008869861241304672;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits100/N-66.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #129 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-66.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #129 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-66.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #130 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-97.html
expectedResult = 0.010760121782622948;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits100/N-97.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #130 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-97.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #130 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-97.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #131 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-82.html
expectedResult = 0.011517641994163677;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits100/N-82.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #131 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-82.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #131 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-82.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #132 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-18.html
expectedResult = 0.009505557474567047;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits100/N-18.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #132 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-18.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #132 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-18.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #133 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-9.html
expectedResult = 0.010668459684297103;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits100/N-9.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #133 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-9.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #133 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-9.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #134 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-44.html
expectedResult = 0.007107486756468043;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits100/N-44.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #134 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-44.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #134 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-44.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #135 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-91.html
expectedResult = 0.00805848684467728;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits100/N-91.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #135 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-91.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #135 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-91.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #136 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-3.html
expectedResult = 0.010112584889767426;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits100/N-3.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #136 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-3.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #136 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-3.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #137 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-75.html
expectedResult = 0.00993328361281675;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits100/N-75.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #137 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-75.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #137 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-75.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #138 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-22.html
expectedResult = 0.010132769001016622;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits100/N-22.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #138 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-22.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #138 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-22.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #139 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-59.html
expectedResult = 0.010676809353151103;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits100/N-59.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #139 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-59.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #139 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-59.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #140 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-56.html
expectedResult = 0.010434753763732365;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits100/N-56.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #140 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-56.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #140 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-56.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #141 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-53.html
expectedResult = 0.011714763940497969;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits100/N-53.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #141 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-53.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #141 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-53.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #142 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-28.html
expectedResult = 0.008898029166311749;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits100/N-28.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #142 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-28.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #142 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-28.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #143 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-34.html
expectedResult = 0.010535816829970814;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits100/N-34.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #143 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-34.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #143 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-34.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #144 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-37.html
expectedResult = 0.01141585094129027;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits100/N-37.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #144 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-37.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #144 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-37.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #145 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-31.html
expectedResult = 0.010183341623976607;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits100/N-31.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #145 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-31.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #145 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-31.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #146 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-50.html
expectedResult = 0.01154346247526087;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits100/N-50.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #146 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-50.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #146 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-50.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #147 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-15.html
expectedResult = 0.008793285200093185;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits100/N-15.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #147 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-15.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #147 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-15.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #148 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-12.html
expectedResult = 0.010287024826957765;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits100/N-12.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #148 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-12.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #148 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-12.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #149 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-85.html
expectedResult = 0.01025353352239547;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits100/N-85.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #149 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-85.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #149 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-85.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #150 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-88.html
expectedResult = 0.009297955695872202;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits100/N-88.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #150 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-88.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #150 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-88.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #151 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-7.html
expectedResult = 0.009891726072556525;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits100/N-7.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #151 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-7.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #151 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-7.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #152 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-38.html
expectedResult = 0.01155073410034599;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits100/N-38.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #152 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-38.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #152 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-38.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #153 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-69.html
expectedResult = 0.010744970998870888;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits100/N-69.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #153 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-69.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #153 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-69.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #154 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-24.html
expectedResult = 0.010693201310500038;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits100/N-24.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #154 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-24.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #154 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-24.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #155 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-55.html
expectedResult = 0.010483482273422546;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits100/N-55.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #155 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-55.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #155 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-55.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #156 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-10.html
expectedResult = 0.010928955152468995;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits100/N-10.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #156 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-10.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #156 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-10.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #157 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-71.html
expectedResult = 0.008637108117524451;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits100/N-71.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #157 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-71.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #157 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-71.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #158 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-86.html
expectedResult = 0.01073821283633589;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits100/N-86.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #158 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-86.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #158 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-86.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #159 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-72.html
expectedResult = 0.010621184195793216;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits100/N-72.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #159 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-72.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #159 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-72.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #160 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-41.html
expectedResult = 0.011250230988708008;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits100/N-41.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #160 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-41.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #160 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-41.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #161 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-25.html
expectedResult = 0.009016350732135197;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits100/N-25.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #161 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-25.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #161 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-25.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #162 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-6.html
expectedResult = 0.007916791381048104;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits100/N-6.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #162 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-6.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #162 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-6.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #163 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-98.html
expectedResult = 0.010950448603404994;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits100/N-98.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #163 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-98.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #163 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-98.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #164 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-84.html
expectedResult = 0.008928750731396437;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits100/N-84.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #164 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-84.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #164 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-84.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #165 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-11.html
expectedResult = 0.011294217523858728;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits100/N-11.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #165 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-11.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #165 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-11.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #166 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-73.html
expectedResult = 0.0095535254706949;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits100/N-73.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #166 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-73.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #166 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-73.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #167 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-87.html
expectedResult = 0.00918183959601843;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits100/N-87.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #167 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-87.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #167 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-87.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #168 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-54.html
expectedResult = 0.008149751772112388;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits100/N-54.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #168 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-54.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #168 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-54.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #169 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-68.html
expectedResult = 0.008718774963111136;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits100/N-68.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #169 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-68.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #169 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-68.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #170 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-57.html
expectedResult = 0.010266595834464683;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits100/N-57.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #170 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-57.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #170 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-57.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #171 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-40.html
expectedResult = 0.009874677887696429;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits100/N-40.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #171 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-40.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #171 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-40.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #172 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-43.html
expectedResult = 0.010377266025255679;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits100/N-43.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #172 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-43.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #172 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-43.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #173 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-19.html
expectedResult = 0.010830870410187585;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits100/N-19.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #173 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-19.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #173 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-19.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #174 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-70.html
expectedResult = 0.008681248816374524;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits100/N-70.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #174 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-70.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #174 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-70.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #175 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-35.html
expectedResult = 0.0108627482414217;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits100/N-35.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #175 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-35.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #175 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-35.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #176 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-74.html
expectedResult = 0.010216792554214576;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits100/N-74.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #176 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-74.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #176 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-74.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #177 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-49.html
expectedResult = 0.01066276120283208;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits100/N-49.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #177 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-49.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #177 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-49.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #178 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-13.html
expectedResult = 0.010010518834470954;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits100/N-13.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #178 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-13.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #178 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-13.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #179 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-52.html
expectedResult = 0.00770213679414396;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits100/N-52.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #179 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-52.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #179 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-52.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #180 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-58.html
expectedResult = 0.008947956623077093;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits100/N-58.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #180 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-58.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #180 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-58.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #181 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-30.html
expectedResult = 0.009000900063082448;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits100/N-30.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #181 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-30.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #181 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-30.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #182 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-89.html
expectedResult = 0.00935861313524604;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits100/N-89.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #182 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-89.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #182 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-89.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #183 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-36.html
expectedResult = 0.009688086426798295;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits100/N-36.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #183 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-36.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #183 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-36.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #184 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-61.html
expectedResult = 0.009152910100701095;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits100/N-61.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #184 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-61.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #184 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-61.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #185 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-83.html
expectedResult = 0.008220626744941508;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits100/N-83.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #185 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-83.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #185 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-83.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #186 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-14.html
expectedResult = 0.012212050254221906;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits100/N-14.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #186 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-14.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #186 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-14.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #187 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-67.html
expectedResult = 0.010507250816859461;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits100/N-67.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #187 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-67.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #187 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-67.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #188 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-42.html
expectedResult = 0.011330001661555657;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits100/N-42.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #188 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-42.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #188 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-42.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #189 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-17.html
expectedResult = 0.01059055926486093;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits100/N-17.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #189 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-17.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #189 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-17.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #190 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-48.html
expectedResult = 0.009453402192206015;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits100/N-48.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #190 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-48.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #190 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-48.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #191 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-45.html
expectedResult = 0.01100148566152561;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits100/N-45.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #191 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-45.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #191 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-45.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #192 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-39.html
expectedResult = 0.011798502087905878;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits100/N-39.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #192 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-39.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #192 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-39.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #193 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-26.html
expectedResult = 0.008590694520658025;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits100/N-26.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #193 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-26.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #193 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-26.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #194 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-90.html
expectedResult = 0.011331263398623125;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits100/N-90.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #194 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-90.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #194 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-90.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #195 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-93.html
expectedResult = 0.008945648360028823;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits100/N-93.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #195 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-93.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #195 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-93.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #196 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-2.html
expectedResult = 0.007676735596520503;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits100/N-2.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #196 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-2.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #196 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-2.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #197 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-23.html
expectedResult = 0.0103990785445012;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits100/N-23.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #197 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-23.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #197 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-23.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #198 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-5.html
expectedResult = 0.012911622939300791;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits100/N-5.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #198 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-5.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #198 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-5.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #199 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-20.html
expectedResult = 0.01081986395296287;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits100/N-20.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #199 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-20.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #199 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-20.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #200 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-8.html
expectedResult = 0.011848400652769313;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits100/N-8.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #200 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-8.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #200 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-8.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #201 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-99.html
expectedResult = 0.010136581574478042;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits100/N-99.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #201 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-99.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #201 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-99.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #202 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-96.html
expectedResult = 0.010452808188512014;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits100/N-96.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #202 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-96.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #202 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-96.html");
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
