import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.*;
public class Fruits25IDFTester {public static void main(String[] args) throws Exception{
ProjectTester tester = new ProjectTesterImp(); //Instantiate your own ProjectTester instance here
tester.initialize();
tester.crawl("https://people.scs.carleton.ca/~avamckenney/fruits25/N-0.html");
runTest(tester);}public static void runTest(ProjectTester tester) throws Exception{
PrintWriter failOut = new PrintWriter(new FileWriter("Fruits25-IDF-failed.txt"));
PrintWriter passOut = new PrintWriter(new FileWriter("Fruits25-IDF-passed.txt"));
double expectedResult;
double yourResult;
//Test #79 checking IDF for apple
expectedResult = 0.12029423371771174;
yourResult = tester.getIDF("apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #79 checking IDF for apple");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #79 checking IDF for apple");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #80 checking IDF for pear
expectedResult = 0.05889368905356862;
yourResult = tester.getIDF("pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #80 checking IDF for pear");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #80 checking IDF for pear");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #81 checking IDF for fig
expectedResult = 0.12029423371771174;
yourResult = tester.getIDF("fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #81 checking IDF for fig");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #81 checking IDF for fig");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #82 checking IDF for apricot
expectedResult = 0.05889368905356862;
yourResult = tester.getIDF("apricot");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #82 checking IDF for apricot");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #82 checking IDF for apricot");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #83 checking IDF for lime
expectedResult = 0.0;
yourResult = tester.getIDF("lime");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #83 checking IDF for lime");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #83 checking IDF for lime");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #84 checking IDF for strawberry
expectedResult = 0.0;
yourResult = tester.getIDF("strawberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #84 checking IDF for strawberry");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #84 checking IDF for strawberry");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #85 checking IDF for blueberry
expectedResult = 0.05889368905356862;
yourResult = tester.getIDF("blueberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #85 checking IDF for blueberry");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #85 checking IDF for blueberry");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #86 checking IDF for papaya
expectedResult = 0.0;
yourResult = tester.getIDF("papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #86 checking IDF for papaya");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #86 checking IDF for papaya");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #87 checking IDF for coconut
expectedResult = 0.12029423371771174;
yourResult = tester.getIDF("coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #87 checking IDF for coconut");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #87 checking IDF for coconut");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #88 checking IDF for peach
expectedResult = 0.0;
yourResult = tester.getIDF("peach");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #88 checking IDF for peach");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #88 checking IDF for peach");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #89 checking IDF for kiwi
expectedResult = 0.12029423371771174;
yourResult = tester.getIDF("kiwi");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #89 checking IDF for kiwi");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #89 checking IDF for kiwi");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #90 checking IDF for banana
expectedResult = 0.18442457113742758;
yourResult = tester.getIDF("banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #90 checking IDF for banana");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #90 checking IDF for banana");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #91 checking IDF for cherry
expectedResult = 0.0;
yourResult = tester.getIDF("cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #91 checking IDF for cherry");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #91 checking IDF for cherry");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #92 checking IDF for tomato
expectedResult = 0.0;
yourResult = tester.getIDF("tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #92 checking IDF for tomato");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #92 checking IDF for tomato");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

failOut.close();
passOut.close();
}
}
