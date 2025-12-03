import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.*;
public class Fruits100TFIDFTester {public static void main(String[] args) throws Exception{
ProjectTester tester = new ProjectTesterImp(); //Instantiate your own ProjectTester instance here
tester.initialize();
tester.crawl("https://people.scs.carleton.ca/~avamckenney/fruits100/N-0.html");
runTest(tester);}public static void runTest(ProjectTester tester) throws Exception{
PrintWriter failOut = new PrintWriter(new FileWriter("Fruits100-TFIDF-failed.txt"));
PrintWriter passOut = new PrintWriter(new FileWriter("Fruits100-TFIDF-passed.txt"));
double expectedResult;
double yourResult;
//Test #289 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruits100/N-45.html
expectedResult = 0.0336953674975528;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-45.html", "lime");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #289 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruits100/N-45.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #289 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruits100/N-45.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #290 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits100/N-45.html
expectedResult = 0.003746358843392772;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-45.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #290 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits100/N-45.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #290 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits100/N-45.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #291 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-45.html
expectedResult = 0.01310813985863474;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-45.html", "strawberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #291 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-45.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #291 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-45.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #292 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-45.html
expectedResult = 0.026211587823037175;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-45.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #292 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-45.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #292 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-45.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #293 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits100/N-45.html
expectedResult = 0.006888261950849115;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-45.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #293 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits100/N-45.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #293 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits100/N-45.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #294 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruits100/N-45.html
expectedResult = 0.01999798031485275;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-45.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #294 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruits100/N-45.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #294 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruits100/N-45.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #295 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits100/N-45.html
expectedResult = 0.0060900246660887;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-45.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #295 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits100/N-45.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #295 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits100/N-45.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #296 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruits100/N-45.html
expectedResult = 0.026211587823037175;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-45.html", "peach");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #296 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruits100/N-45.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #296 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruits100/N-45.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #297 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruits100/N-45.html
expectedResult = 0.008511395072154995;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-45.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #297 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruits100/N-45.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #297 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruits100/N-45.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #298 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits100/N-45.html
expectedResult = 0.006888261950849115;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-45.html", "apricot");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #298 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits100/N-45.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #298 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits100/N-45.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #299 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits100/N-45.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-45.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #299 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits100/N-45.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #299 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits100/N-45.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #300 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruits100/N-13.html
expectedResult = 0.0060900246660887;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-13.html", "lime");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #300 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruits100/N-13.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #300 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruits100/N-13.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #301 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits100/N-13.html
expectedResult = 0.007365697717165617;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-13.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #301 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits100/N-13.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #301 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits100/N-13.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #302 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-13.html
expectedResult = 0.008885284623590783;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-13.html", "strawberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #302 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-13.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #302 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-13.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #303 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-13.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-13.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #303 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-13.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #303 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-13.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #304 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits100/N-13.html
expectedResult = 0.019979466837975992;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-13.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #304 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits100/N-13.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #304 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits100/N-13.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #305 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruits100/N-13.html
expectedResult = 0.03870484158099028;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-13.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #305 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruits100/N-13.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #305 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruits100/N-13.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #306 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits100/N-13.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-13.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #306 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits100/N-13.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #306 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits100/N-13.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #307 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruits100/N-13.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-13.html", "peach");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #307 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruits100/N-13.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #307 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruits100/N-13.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #308 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruits100/N-13.html
expectedResult = 0.03238802197452078;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-13.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #308 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruits100/N-13.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #308 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruits100/N-13.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #309 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits100/N-13.html
expectedResult = 0.019979466837975992;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-13.html", "apricot");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #309 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits100/N-13.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #309 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits100/N-13.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #310 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits100/N-13.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-13.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #310 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits100/N-13.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #310 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits100/N-13.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #311 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruits100/N-9.html
expectedResult = 0.009734208837107019;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-9.html", "lime");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #311 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruits100/N-9.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #311 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruits100/N-9.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #312 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits100/N-9.html
expectedResult = 0.01704215774233039;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-9.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #312 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits100/N-9.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #312 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits100/N-9.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #313 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-9.html
expectedResult = 0.0095440356557343;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-9.html", "strawberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #313 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-9.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #313 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-9.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #314 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-9.html
expectedResult = 0.011010099963573267;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-9.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #314 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-9.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #314 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-9.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #315 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits100/N-9.html
expectedResult = 0.011010099963573267;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-9.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #315 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits100/N-9.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #315 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits100/N-9.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #316 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruits100/N-9.html
expectedResult = 0.016257854264991725;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-9.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #316 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruits100/N-9.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #316 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruits100/N-9.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #317 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits100/N-9.html
expectedResult = 0.018951307193998384;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-9.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #317 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits100/N-9.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #317 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits100/N-9.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #318 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruits100/N-9.html
expectedResult = 0.011010099963573267;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-9.html", "peach");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #318 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruits100/N-9.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #318 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruits100/N-9.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #319 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruits100/N-9.html
expectedResult = 0.0046201372213690904;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-9.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #319 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruits100/N-9.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #319 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruits100/N-9.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #320 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits100/N-9.html
expectedResult = 0.007408249865065477;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-9.html", "apricot");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #320 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits100/N-9.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #320 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits100/N-9.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #321 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits100/N-9.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-9.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #321 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits100/N-9.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #321 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits100/N-9.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #322 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruits100/N-24.html
expectedResult = 0.01654088102298361;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-24.html", "lime");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #322 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruits100/N-24.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #322 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruits100/N-24.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #323 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits100/N-24.html
expectedResult = 0.005208851191400107;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-24.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #323 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits100/N-24.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #323 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits100/N-24.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #324 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-24.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-24.html", "strawberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #324 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-24.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #324 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-24.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #325 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-24.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-24.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #325 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-24.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #325 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-24.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #326 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits100/N-24.html
expectedResult = 0.03578886884955595;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-24.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #326 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits100/N-24.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #326 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits100/N-24.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #327 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruits100/N-24.html
expectedResult = 0.014142109490301046;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-24.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #327 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruits100/N-24.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #327 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruits100/N-24.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #328 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits100/N-24.html
expectedResult = 0.03872609348667805;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-24.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #328 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits100/N-24.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #328 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits100/N-24.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #329 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruits100/N-24.html
expectedResult = 0.00957728102651878;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-24.html", "peach");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #329 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruits100/N-24.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #329 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruits100/N-24.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #330 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruits100/N-24.html
expectedResult = 0.03389924100901684;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-24.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #330 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruits100/N-24.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #330 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruits100/N-24.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #331 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits100/N-24.html
expectedResult = 0.018708942513580403;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-24.html", "apricot");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #331 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits100/N-24.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #331 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits100/N-24.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #332 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits100/N-24.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-24.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #332 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits100/N-24.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #332 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits100/N-24.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #333 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruits100/N-52.html
expectedResult = 0.02044099783798403;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-52.html", "lime");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #333 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruits100/N-52.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #333 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruits100/N-52.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #334 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits100/N-52.html
expectedResult = 0.00647230110724986;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-52.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #334 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits100/N-52.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #334 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits100/N-52.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #335 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-52.html
expectedResult = 0.012761475999285461;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-52.html", "strawberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #335 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-52.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #335 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-52.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #336 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-52.html
expectedResult = 0.01190032971084337;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-52.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #336 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-52.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #336 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-52.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #337 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits100/N-52.html
expectedResult = 0.008013166592877338;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-52.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #337 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits100/N-52.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #337 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits100/N-52.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #338 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruits100/N-52.html
expectedResult = 0.028722067624553118;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-52.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #338 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruits100/N-52.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #338 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruits100/N-52.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #339 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits100/N-52.html
expectedResult = 0.01389124338138478;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-52.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #339 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits100/N-52.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #339 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits100/N-52.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #340 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruits100/N-52.html
expectedResult = 0.01190032971084337;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-52.html", "peach");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #340 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruits100/N-52.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #340 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruits100/N-52.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #341 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruits100/N-52.html
expectedResult = 0.005001205438626674;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-52.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #341 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruits100/N-52.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #341 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruits100/N-52.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #342 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits100/N-52.html
expectedResult = 0.015712009142884436;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-52.html", "apricot");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #342 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits100/N-52.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #342 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits100/N-52.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #343 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits100/N-52.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-52.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #343 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits100/N-52.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #343 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits100/N-52.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #344 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruits100/N-27.html
expectedResult = 0.018612235980118654;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-27.html", "lime");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #344 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruits100/N-27.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #344 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruits100/N-27.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #345 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits100/N-27.html
expectedResult = 0.007767808444411324;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-27.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #345 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits100/N-27.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #345 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits100/N-27.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #346 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-27.html
expectedResult = 0.013811674181149019;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-27.html", "strawberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #346 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-27.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #346 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-27.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #347 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-27.html
expectedResult = 0.007271028382490975;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-27.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #347 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-27.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #347 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-27.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #348 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits100/N-27.html
expectedResult = 0.007271028382490975;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-27.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #348 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits100/N-27.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #348 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits100/N-27.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #349 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruits100/N-27.html
expectedResult = 0.021089716999771333;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-27.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #349 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruits100/N-27.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #349 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruits100/N-27.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #350 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits100/N-27.html
expectedResult = 0.012627232735953222;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-27.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #350 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits100/N-27.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #350 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits100/N-27.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #351 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruits100/N-27.html
expectedResult = 0.010807976737035404;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-27.html", "peach");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #351 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruits100/N-27.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #351 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruits100/N-27.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #352 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruits100/N-27.html
expectedResult = 0.017647771951106436;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-27.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #352 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruits100/N-27.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #352 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruits100/N-27.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #353 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits100/N-27.html
expectedResult = 0.007271028382490975;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-27.html", "apricot");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #353 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits100/N-27.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #353 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits100/N-27.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #354 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits100/N-27.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-27.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #354 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits100/N-27.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #354 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits100/N-27.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #355 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruits100/N-81.html
expectedResult = 0.016231250442311055;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-81.html", "lime");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #355 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruits100/N-81.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #355 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruits100/N-81.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #356 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits100/N-81.html
expectedResult = 0.009984867380336684;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-81.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #356 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits100/N-81.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #356 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits100/N-81.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #357 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-81.html
expectedResult = 0.0049539009784595415;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-81.html", "strawberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #357 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-81.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #357 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-81.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #358 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-81.html
expectedResult = 0.003811679432041064;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-81.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #358 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-81.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #358 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-81.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #359 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits100/N-81.html
expectedResult = 0.0075507510131233805;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-81.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #359 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits100/N-81.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #359 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits100/N-81.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #360 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruits100/N-81.html
expectedResult = 0.02188629804988159;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-81.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #360 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruits100/N-81.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #360 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruits100/N-81.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #361 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits100/N-81.html
expectedResult = 0.009919722371000582;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-81.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #361 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits100/N-81.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #361 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits100/N-81.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #362 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruits100/N-81.html
expectedResult = 0.018358727750158788;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-81.html", "peach");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #362 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruits100/N-81.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #362 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruits100/N-81.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #363 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruits100/N-81.html
expectedResult = 0.02268473324892569;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-81.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #363 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruits100/N-81.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #363 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruits100/N-81.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #364 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits100/N-81.html
expectedResult = 0.011219929297106539;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-81.html", "apricot");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #364 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits100/N-81.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #364 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits100/N-81.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #365 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits100/N-81.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-81.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #365 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits100/N-81.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #365 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits100/N-81.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #366 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruits100/N-44.html
expectedResult = 0.00738613147022325;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-44.html", "lime");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #366 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruits100/N-44.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #366 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruits100/N-44.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #367 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits100/N-44.html
expectedResult = 0.01171148623034199;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-44.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #367 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits100/N-44.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #367 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits100/N-44.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #368 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-44.html
expectedResult = 0.007257443701653403;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-44.html", "strawberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #368 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-44.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #368 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-44.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #369 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-44.html
expectedResult = 0.016367419844692803;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-44.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #369 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-44.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #369 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-44.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #370 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits100/N-44.html
expectedResult = 0.005608819368219336;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-44.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #370 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits100/N-44.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #370 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits100/N-44.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #371 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruits100/N-44.html
expectedResult = 0.016334222529740882;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-44.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #371 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruits100/N-44.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #371 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruits100/N-44.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #372 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits100/N-44.html
expectedResult = 0.012141165750169458;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-44.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #372 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits100/N-44.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #372 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits100/N-44.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #373 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruits100/N-44.html
expectedResult = 0.011061817872666807;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-44.html", "peach");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #373 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruits100/N-44.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #373 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruits100/N-44.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #374 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruits100/N-44.html
expectedResult = 0.023436826472903356;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-44.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #374 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruits100/N-44.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #374 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruits100/N-44.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #375 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits100/N-44.html
expectedResult = 0.011061817872666807;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-44.html", "apricot");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #375 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits100/N-44.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #375 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits100/N-44.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #376 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits100/N-44.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-44.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #376 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits100/N-44.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #376 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits100/N-44.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #377 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruits100/N-98.html
expectedResult = 0.014272248791125097;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-98.html", "lime");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #377 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruits100/N-98.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #377 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruits100/N-98.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #378 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits100/N-98.html
expectedResult = 0.0059326524171650925;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-98.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #378 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits100/N-98.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #378 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits100/N-98.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #379 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-98.html
expectedResult = 0.008885284623590783;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-98.html", "strawberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #379 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-98.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #379 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-98.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #380 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-98.html
expectedResult = 0.008237376009405138;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-98.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #380 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-98.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #380 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-98.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #381 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits100/N-98.html
expectedResult = 0.01354297798143113;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-98.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #381 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits100/N-98.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #381 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits100/N-98.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #382 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruits100/N-98.html
expectedResult = 0.02383718541103097;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-98.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #382 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruits100/N-98.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #382 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruits100/N-98.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #383 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits100/N-98.html
expectedResult = 0.011973567577383552;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-98.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #383 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits100/N-98.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #383 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits100/N-98.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #384 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruits100/N-98.html
expectedResult = 0.01354297798143113;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-98.html", "peach");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #384 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruits100/N-98.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #384 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruits100/N-98.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #385 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruits100/N-98.html
expectedResult = 0.026247190929287706;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-98.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #385 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruits100/N-98.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #385 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruits100/N-98.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #386 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits100/N-98.html
expectedResult = 0.01354297798143113;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-98.html", "apricot");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #386 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits100/N-98.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #386 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits100/N-98.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #387 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits100/N-98.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-98.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #387 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits100/N-98.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #387 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits100/N-98.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #388 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruits100/N-26.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-26.html", "lime");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #388 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruits100/N-26.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #388 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruits100/N-26.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #389 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits100/N-26.html
expectedResult = 0.010175340708063361;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-26.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #389 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits100/N-26.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #389 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits100/N-26.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #390 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-26.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-26.html", "strawberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #390 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-26.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #390 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-26.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #391 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-26.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-26.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #391 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-26.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #391 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-26.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #392 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits100/N-26.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-26.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #392 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits100/N-26.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #392 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits100/N-26.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #393 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruits100/N-26.html
expectedResult = 0.052846951071291316;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-26.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #393 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruits100/N-26.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #393 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruits100/N-26.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #394 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits100/N-26.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-26.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #394 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits100/N-26.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #394 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits100/N-26.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #395 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruits100/N-26.html
expectedResult = 0.03578886884955595;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-26.html", "peach");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #395 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruits100/N-26.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #395 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruits100/N-26.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #396 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruits100/N-26.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-26.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #396 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruits100/N-26.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #396 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruits100/N-26.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #397 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits100/N-26.html
expectedResult = 0.018708942513580403;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-26.html", "apricot");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #397 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits100/N-26.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #397 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits100/N-26.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #398 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits100/N-26.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-26.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #398 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits100/N-26.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #398 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits100/N-26.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #399 checking TFIDF for lime in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "lime");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #399 checking TFIDF for lime in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #399 checking TFIDF for lime in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #400 checking TFIDF for apple in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #400 checking TFIDF for apple in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #400 checking TFIDF for apple in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #401 checking TFIDF for strawberry in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "strawberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #401 checking TFIDF for strawberry in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #401 checking TFIDF for strawberry in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #402 checking TFIDF for cherry in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #402 checking TFIDF for cherry in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #402 checking TFIDF for cherry in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #403 checking TFIDF for coconut in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #403 checking TFIDF for coconut in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #403 checking TFIDF for coconut in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #404 checking TFIDF for fig in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #404 checking TFIDF for fig in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #404 checking TFIDF for fig in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #405 checking TFIDF for papaya in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #405 checking TFIDF for papaya in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #405 checking TFIDF for papaya in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #406 checking TFIDF for peach in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "peach");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #406 checking TFIDF for peach in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #406 checking TFIDF for peach in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #407 checking TFIDF for pear in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #407 checking TFIDF for pear in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #407 checking TFIDF for pear in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #408 checking TFIDF for apricot in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "apricot");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #408 checking TFIDF for apricot in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #408 checking TFIDF for apricot in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #409 checking TFIDF for tomato in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #409 checking TFIDF for tomato in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #409 checking TFIDF for tomato in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

failOut.close();
passOut.close();
}
}
