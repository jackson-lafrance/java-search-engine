import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.*;
public class Fruits50PageRanksTester {public static void main(String[] args) throws Exception{
ProjectTester tester = new ProjectTesterImp(); //Instantiate your own ProjectTester instance here
tester.initialize();
tester.crawl("https://people.scs.carleton.ca/~avamckenney/fruits50/N-0.html");
runTest(tester);}public static void runTest(ProjectTester tester) throws Exception{
PrintWriter failOut = new PrintWriter(new FileWriter("Fruits50-PageRanks-failed.txt"));
PrintWriter passOut = new PrintWriter(new FileWriter("Fruits50-PageRanks-passed.txt"));
double expectedResult;
double yourResult;
//Test #103 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits50/N-42.html
expectedResult = 0.02173396904254926;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits50/N-42.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #103 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits50/N-42.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #103 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits50/N-42.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #104 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits50/N-45.html
expectedResult = 0.01854088642999454;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits50/N-45.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #104 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits50/N-45.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #104 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits50/N-45.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #105 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits50/N-1.html
expectedResult = 0.02451774770624701;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits50/N-1.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #105 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits50/N-1.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #105 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits50/N-1.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #106 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits50/N-13.html
expectedResult = 0.02292814845014612;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits50/N-13.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #106 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits50/N-13.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #106 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits50/N-13.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #107 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits50/N-0.html
expectedResult = 0.01533994949506521;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits50/N-0.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #107 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits50/N-0.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #107 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits50/N-0.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #108 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits50/N-11.html
expectedResult = 0.01862727566969425;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits50/N-11.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #108 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits50/N-11.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #108 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits50/N-11.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #109 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits50/N-21.html
expectedResult = 0.021851842335875452;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits50/N-21.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #109 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits50/N-21.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #109 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits50/N-21.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #110 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits50/N-6.html
expectedResult = 0.01697410232257202;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits50/N-6.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #110 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits50/N-6.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #110 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits50/N-6.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #111 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits50/N-38.html
expectedResult = 0.02245431660610798;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits50/N-38.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #111 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits50/N-38.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #111 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits50/N-38.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #112 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits50/N-14.html
expectedResult = 0.02456329843657156;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits50/N-14.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #112 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits50/N-14.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #112 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits50/N-14.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #113 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits50/N-29.html
expectedResult = 0.017458616899207812;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits50/N-29.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #113 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits50/N-29.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #113 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits50/N-29.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #114 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits50/N-24.html
expectedResult = 0.02497610175596922;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits50/N-24.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #114 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits50/N-24.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #114 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits50/N-24.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #115 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits50/N-34.html
expectedResult = 0.021205241934155836;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits50/N-34.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #115 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits50/N-34.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #115 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits50/N-34.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #116 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits50/N-44.html
expectedResult = 0.021020788274071868;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits50/N-44.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #116 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits50/N-44.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #116 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits50/N-44.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #117 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits50/N-47.html
expectedResult = 0.0196219444694377;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits50/N-47.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #117 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits50/N-47.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #117 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits50/N-47.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #118 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits50/N-35.html
expectedResult = 0.019701921964898516;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits50/N-35.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #118 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits50/N-35.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #118 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits50/N-35.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #119 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits50/N-36.html
expectedResult = 0.021297226324066915;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits50/N-36.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #119 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits50/N-36.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #119 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits50/N-36.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #120 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits50/N-31.html
expectedResult = 0.016465501212222067;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits50/N-31.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #120 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits50/N-31.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #120 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits50/N-31.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #121 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits50/N-16.html
expectedResult = 0.023096903747993433;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits50/N-16.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #121 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits50/N-16.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #121 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits50/N-16.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #122 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits50/N-3.html
expectedResult = 0.022531336586430507;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits50/N-3.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #122 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits50/N-3.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #122 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits50/N-3.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #123 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits50/N-5.html
expectedResult = 0.02052032621952209;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits50/N-5.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #123 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits50/N-5.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #123 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits50/N-5.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #124 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits50/N-17.html
expectedResult = 0.021687255138686447;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits50/N-17.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #124 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits50/N-17.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #124 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits50/N-17.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #125 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits50/N-2.html
expectedResult = 0.016032310437973523;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits50/N-2.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #125 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits50/N-2.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #125 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits50/N-2.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #126 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits50/N-9.html
expectedResult = 0.01841537507960402;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits50/N-9.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #126 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits50/N-9.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #126 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits50/N-9.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #127 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits50/N-10.html
expectedResult = 0.019047225809576688;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits50/N-10.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #127 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits50/N-10.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #127 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits50/N-10.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #128 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits50/N-32.html
expectedResult = 0.014367812406079969;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits50/N-32.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #128 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits50/N-32.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #128 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits50/N-32.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #129 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits50/N-20.html
expectedResult = 0.01750705703459803;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits50/N-20.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #129 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits50/N-20.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #129 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits50/N-20.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #130 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits50/N-39.html
expectedResult = 0.022319788329754217;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits50/N-39.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #130 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits50/N-39.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #130 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits50/N-39.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #131 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits50/N-40.html
expectedResult = 0.019736705534524113;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits50/N-40.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #131 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits50/N-40.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #131 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits50/N-40.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #132 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits50/N-25.html
expectedResult = 0.022436434562339524;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits50/N-25.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #132 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits50/N-25.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #132 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits50/N-25.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #133 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits50/N-30.html
expectedResult = 0.021254633216330598;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits50/N-30.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #133 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits50/N-30.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #133 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits50/N-30.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #134 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits50/N-28.html
expectedResult = 0.0187374708541197;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits50/N-28.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #134 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits50/N-28.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #134 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits50/N-28.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #135 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits50/N-27.html
expectedResult = 0.02819756529175559;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits50/N-27.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #135 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits50/N-27.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #135 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits50/N-27.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #136 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits50/N-37.html
expectedResult = 0.023511222745518603;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits50/N-37.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #136 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits50/N-37.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #136 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits50/N-37.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #137 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits50/N-8.html
expectedResult = 0.015873604805389158;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits50/N-8.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #137 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits50/N-8.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #137 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits50/N-8.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #138 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits50/N-12.html
expectedResult = 0.01759676787567569;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits50/N-12.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #138 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits50/N-12.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #138 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits50/N-12.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #139 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits50/N-15.html
expectedResult = 0.018662429305334256;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits50/N-15.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #139 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits50/N-15.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #139 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits50/N-15.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #140 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits50/N-49.html
expectedResult = 0.01801314035523417;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits50/N-49.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #140 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits50/N-49.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #140 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits50/N-49.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #141 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits50/N-43.html
expectedResult = 0.020665257026537456;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits50/N-43.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #141 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits50/N-43.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #141 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits50/N-43.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #142 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits50/N-33.html
expectedResult = 0.020878834094642144;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits50/N-33.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #142 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits50/N-33.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #142 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits50/N-33.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #143 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits50/N-48.html
expectedResult = 0.014966141061801249;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits50/N-48.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #143 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits50/N-48.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #143 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits50/N-48.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #144 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits50/N-19.html
expectedResult = 0.02478835590343363;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits50/N-19.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #144 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits50/N-19.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #144 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits50/N-19.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #145 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits50/N-7.html
expectedResult = 0.015445901809169469;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits50/N-7.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #145 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits50/N-7.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #145 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits50/N-7.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #146 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits50/N-22.html
expectedResult = 0.01919166589859257;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits50/N-22.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #146 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits50/N-22.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #146 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits50/N-22.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #147 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits50/N-4.html
expectedResult = 0.01996242443519097;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits50/N-4.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #147 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits50/N-4.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #147 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits50/N-4.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #148 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits50/N-23.html
expectedResult = 0.024223130693424952;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits50/N-23.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #148 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits50/N-23.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #148 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits50/N-23.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #149 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits50/N-18.html
expectedResult = 0.015822818805265138;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits50/N-18.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #149 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits50/N-18.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #149 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits50/N-18.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #150 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits50/N-41.html
expectedResult = 0.0196911459983677;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits50/N-41.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #150 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits50/N-41.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #150 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits50/N-41.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #151 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits50/N-46.html
expectedResult = 0.017458761118346978;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits50/N-46.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #151 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits50/N-46.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #151 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits50/N-46.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #152 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits50/N-26.html
expectedResult = 0.018081318489936053;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits50/N-26.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #152 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits50/N-26.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #152 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits50/N-26.html");
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
