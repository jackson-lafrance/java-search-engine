import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.*;
public class Fruits25PageRanksTester {public static void main(String[] args) throws Exception{
ProjectTester tester = new ProjectTesterImp(); //Instantiate your own ProjectTester instance here
tester.initialize();
tester.crawl("https://people.scs.carleton.ca/~avamckenney/fruits25/N-0.html");
runTest(tester);}public static void runTest(ProjectTester tester) throws Exception{
PrintWriter failOut = new PrintWriter(new FileWriter("Fruits25-PageRanks-failed.txt"));
PrintWriter passOut = new PrintWriter(new FileWriter("Fruits25-PageRanks-passed.txt"));
double expectedResult;
double yourResult;
//Test #53 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits25/N-19.html
expectedResult = 0.048099134399999986;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits25/N-19.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #53 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits25/N-19.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #53 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits25/N-19.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #54 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits25/N-7.html
expectedResult = 0.05203959239999999;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits25/N-7.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #54 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits25/N-7.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #54 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits25/N-7.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #55 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits25/N-10.html
expectedResult = 0.036870629200000005;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits25/N-10.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #55 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits25/N-10.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #55 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits25/N-10.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #56 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits25/N-4.html
expectedResult = 0.051698749199999984;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits25/N-4.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #56 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits25/N-4.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #56 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits25/N-4.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #57 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits25/N-1.html
expectedResult = 0.04015080999999999;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits25/N-1.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #57 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits25/N-1.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #57 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits25/N-1.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #58 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits25/N-17.html
expectedResult = 0.045499881199999995;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits25/N-17.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #58 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits25/N-17.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #58 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits25/N-17.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #59 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html
expectedResult = 0.03891379799999999;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #59 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #59 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #60 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits25/N-22.html
expectedResult = 0.046309946799999974;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits25/N-22.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #60 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits25/N-22.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #60 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits25/N-22.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #61 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits25/N-14.html
expectedResult = 0.0315956116;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits25/N-14.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #61 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits25/N-14.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #61 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits25/N-14.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #62 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits25/N-18.html
expectedResult = 0.03384169799999999;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits25/N-18.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #62 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits25/N-18.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #62 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits25/N-18.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #63 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html
expectedResult = 0.04323169319999999;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #63 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #63 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #64 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits25/N-0.html
expectedResult = 0.051396215200000005;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits25/N-0.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #64 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits25/N-0.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #64 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits25/N-0.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #65 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits25/N-3.html
expectedResult = 0.03690978319999999;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits25/N-3.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #65 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits25/N-3.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #65 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits25/N-3.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #66 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits25/N-9.html
expectedResult = 0.04144291759999999;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits25/N-9.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #66 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits25/N-9.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #66 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits25/N-9.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #67 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html
expectedResult = 0.02817233039999999;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #67 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #67 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #68 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits25/N-15.html
expectedResult = 0.0343423316;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits25/N-15.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #68 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits25/N-15.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #68 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits25/N-15.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #69 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits25/N-12.html
expectedResult = 0.054672171599999986;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits25/N-12.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #69 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits25/N-12.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #69 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits25/N-12.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #70 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits25/N-20.html
expectedResult = 0.021270234399999997;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits25/N-20.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #70 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits25/N-20.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #70 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits25/N-20.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #71 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits25/N-5.html
expectedResult = 0.02831489199999999;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits25/N-5.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #71 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits25/N-5.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #71 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits25/N-5.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #72 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits25/N-8.html
expectedResult = 0.03353462079999999;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits25/N-8.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #72 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits25/N-8.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #72 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits25/N-8.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #73 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html
expectedResult = 0.03693263479999999;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #73 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #73 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #74 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits25/N-21.html
expectedResult = 0.04653630919999998;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits25/N-21.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #74 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits25/N-21.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #74 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits25/N-21.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #75 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits25/N-13.html
expectedResult = 0.05084091439999999;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits25/N-13.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #75 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits25/N-13.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #75 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits25/N-13.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #76 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html
expectedResult = 0.04834735359999999;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #76 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #76 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #77 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits25/N-16.html
expectedResult = 0.019035747199999994;
yourResult = tester.getPageRank("https://people.scs.carleton.ca/~avamckenney/fruits25/N-16.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #77 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits25/N-16.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #77 checking page rank for https://people.scs.carleton.ca/~avamckenney/fruits25/N-16.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #78 checking page rank for http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = -1.0;
yourResult = tester.getPageRank("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #78 checking page rank for http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #78 checking page rank for http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

failOut.close();
passOut.close();
}
}
