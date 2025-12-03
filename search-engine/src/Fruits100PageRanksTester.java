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
//Test #103 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-19.html
expectedResult = 0.010830870410187585;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits100/N-19.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #103 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-19.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #103 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-19.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #104 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-50.html
expectedResult = 0.01154346247526087;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits100/N-50.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #104 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-50.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #104 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-50.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #105 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-56.html
expectedResult = 0.010434753763732365;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits100/N-56.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #105 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-56.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #105 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-56.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #106 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-75.html
expectedResult = 0.00993328361281675;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits100/N-75.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #106 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-75.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #106 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-75.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #107 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-68.html
expectedResult = 0.008718774963111136;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits100/N-68.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #107 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-68.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #107 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-68.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #108 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-66.html
expectedResult = 0.008869861241304672;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits100/N-66.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #108 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-66.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #108 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-66.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #109 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-7.html
expectedResult = 0.009891726072556525;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits100/N-7.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #109 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-7.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #109 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-7.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #110 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-88.html
expectedResult = 0.009297955695872202;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits100/N-88.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #110 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-88.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #110 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-88.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #111 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-80.html
expectedResult = 0.008812345563354668;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits100/N-80.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #111 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-80.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #111 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-80.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #112 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-46.html
expectedResult = 0.009616950611746682;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits100/N-46.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #112 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-46.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #112 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-46.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #113 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-86.html
expectedResult = 0.01073821283633589;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits100/N-86.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #113 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-86.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #113 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-86.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #114 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-53.html
expectedResult = 0.011714763940497969;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits100/N-53.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #114 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-53.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #114 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-53.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #115 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-22.html
expectedResult = 0.010132769001016622;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits100/N-22.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #115 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-22.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #115 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-22.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #116 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-69.html
expectedResult = 0.010744970998870888;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits100/N-69.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #116 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-69.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #116 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-69.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #117 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-29.html
expectedResult = 0.009412166306559605;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits100/N-29.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #117 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-29.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #117 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-29.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #118 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-4.html
expectedResult = 0.010075103823212013;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits100/N-4.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #118 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-4.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #118 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-4.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #119 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-84.html
expectedResult = 0.008928750731396437;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits100/N-84.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #119 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-84.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #119 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-84.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #120 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-78.html
expectedResult = 0.010240382742591609;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits100/N-78.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #120 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-78.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #120 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-78.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #121 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-58.html
expectedResult = 0.008947956623077093;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits100/N-58.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #121 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-58.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #121 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-58.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #122 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-73.html
expectedResult = 0.0095535254706949;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits100/N-73.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #122 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-73.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #122 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-73.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #123 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-25.html
expectedResult = 0.009016350732135197;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits100/N-25.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #123 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-25.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #123 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-25.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #124 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-14.html
expectedResult = 0.012212050254221906;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits100/N-14.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #124 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-14.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #124 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-14.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #125 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-76.html
expectedResult = 0.008532428256153059;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits100/N-76.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #125 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-76.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #125 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-76.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #126 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-2.html
expectedResult = 0.007676735596520503;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits100/N-2.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #126 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-2.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #126 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-2.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #127 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-65.html
expectedResult = 0.010950492873128178;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits100/N-65.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #127 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-65.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #127 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-65.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #128 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-70.html
expectedResult = 0.008681248816374524;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits100/N-70.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #128 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-70.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #128 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-70.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #129 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-16.html
expectedResult = 0.008841581969102634;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits100/N-16.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #129 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-16.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #129 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-16.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #130 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-32.html
expectedResult = 0.00902178749989038;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits100/N-32.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #130 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-32.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #130 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-32.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #131 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-92.html
expectedResult = 0.00917042902851528;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits100/N-92.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #131 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-92.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #131 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-92.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #132 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-27.html
expectedResult = 0.010946474655628206;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits100/N-27.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #132 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-27.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #132 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-27.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #133 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-90.html
expectedResult = 0.011331263398623125;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits100/N-90.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #133 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-90.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #133 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-90.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #134 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-61.html
expectedResult = 0.009152910100701095;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits100/N-61.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #134 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-61.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #134 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-61.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #135 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-63.html
expectedResult = 0.010893224911381802;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits100/N-63.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #135 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-63.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #135 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-63.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #136 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-74.html
expectedResult = 0.010216792554214576;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits100/N-74.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #136 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-74.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #136 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-74.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #137 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-24.html
expectedResult = 0.010693201310500038;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits100/N-24.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #137 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-24.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #137 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-24.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #138 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-33.html
expectedResult = 0.011346921912232594;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits100/N-33.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #138 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-33.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #138 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-33.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #139 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-12.html
expectedResult = 0.010287024826957765;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits100/N-12.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #139 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-12.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #139 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-12.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #140 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-59.html
expectedResult = 0.010676809353151103;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits100/N-59.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #140 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-59.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #140 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-59.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #141 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-1.html
expectedResult = 0.008884106499558331;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits100/N-1.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #141 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-1.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #141 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-1.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #142 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-41.html
expectedResult = 0.011250230988708008;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits100/N-41.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #142 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-41.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #142 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-41.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #143 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-13.html
expectedResult = 0.010010518834470954;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits100/N-13.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #143 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-13.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #143 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-13.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #144 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-52.html
expectedResult = 0.00770213679414396;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits100/N-52.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #144 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-52.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #144 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-52.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #145 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-18.html
expectedResult = 0.009505557474567047;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits100/N-18.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #145 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-18.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #145 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-18.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #146 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-40.html
expectedResult = 0.009874677887696429;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits100/N-40.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #146 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-40.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #146 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-40.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #147 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-97.html
expectedResult = 0.010760121782622948;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits100/N-97.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #147 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-97.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #147 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-97.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #148 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-54.html
expectedResult = 0.008149751772112388;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits100/N-54.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #148 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-54.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #148 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-54.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #149 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-77.html
expectedResult = 0.007404357868423432;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits100/N-77.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #149 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-77.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #149 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-77.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #150 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-44.html
expectedResult = 0.007107486756468043;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits100/N-44.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #150 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-44.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #150 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-44.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #151 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-9.html
expectedResult = 0.010668459684297103;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits100/N-9.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #151 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-9.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #151 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-9.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #152 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-81.html
expectedResult = 0.008959963416837786;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits100/N-81.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #152 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-81.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #152 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits100/N-81.html");
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
