import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.*;
public class FruitsATFIDFTester {public static void main(String[] args) throws Exception{
ProjectTester tester = new ProjectTesterImp(); //Instantiate your own ProjectTester instance here
tester.initialize();
tester.crawl("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-0.html");
runTest(tester);}public static void runTest(ProjectTester tester) throws Exception{
PrintWriter failOut = new PrintWriter(new FileWriter("FruitsA-TFIDF-failed.txt"));
PrintWriter passOut = new PrintWriter(new FileWriter("FruitsA-TFIDF-passed.txt"));
double expectedResult;
double yourResult;
//Test #289 checking TFIDF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-38.html
expectedResult = 0.018708942513580403;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-38.html", "blueberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #289 checking TFIDF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-38.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #289 checking TFIDF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-38.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #290 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-38.html
expectedResult = 0.018708942513580403;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-38.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #290 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-38.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #290 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-38.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #291 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-38.html
expectedResult = 0.005208851191400107;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-38.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #291 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-38.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #291 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-38.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #292 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-38.html
expectedResult = 0.02111053671490634;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-38.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #292 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-38.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #292 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-38.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #293 checking TFIDF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-38.html
expectedResult = 0.01069939558501044;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-38.html", "kiwi");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #293 checking TFIDF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-38.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #293 checking TFIDF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-38.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #294 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-38.html
expectedResult = 0.01654088102298361;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-38.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #294 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-38.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #294 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-38.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #295 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-38.html
expectedResult = 0.01654088102298361;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-38.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #295 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-38.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #295 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-38.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #296 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-38.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-38.html", "lime");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #296 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-38.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #296 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-38.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #297 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-38.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-38.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #297 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-38.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #297 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-38.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #298 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-38.html
expectedResult = 0.017999318056852346;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-38.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #298 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-38.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #298 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-38.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #299 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-38.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-38.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #299 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-38.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #299 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-38.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #300 checking TFIDF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-44.html
expectedResult = 0.022458216819415032;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-44.html", "blueberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #300 checking TFIDF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-44.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #300 checking TFIDF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-44.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #301 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-44.html
expectedResult = 0.005859997038869025;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-44.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #301 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-44.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #301 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-44.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #302 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-44.html
expectedResult = 0.006281827779523177;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-44.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #302 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-44.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #302 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-44.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #303 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-44.html
expectedResult = 0.0045091822846052825;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-44.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #303 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-44.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #303 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-44.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #304 checking TFIDF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-44.html
expectedResult = 0.006546578958291211;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-44.html", "kiwi");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #304 checking TFIDF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-44.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #304 checking TFIDF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-44.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #305 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-44.html
expectedResult = 0.019855675548132414;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-44.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #305 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-44.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #305 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-44.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #306 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-44.html
expectedResult = 0.010211644886310885;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-44.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #306 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-44.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #306 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-44.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #307 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-44.html
expectedResult = 0.015061589505525136;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-44.html", "lime");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #307 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-44.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #307 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-44.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #308 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-44.html
expectedResult = 0.015100641268186226;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-44.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #308 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-44.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #308 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-44.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #309 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-44.html
expectedResult = 0.00757780592154427;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-44.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #309 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-44.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #309 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-44.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #310 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-44.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-44.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #310 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-44.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #310 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-44.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #311 checking TFIDF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-39.html
expectedResult = 0.01354297798143113;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-39.html", "blueberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #311 checking TFIDF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-39.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #311 checking TFIDF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-39.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #312 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-39.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-39.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #312 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-39.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #312 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-39.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #313 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-39.html
expectedResult = 0.007365697717165617;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-39.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #313 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-39.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #313 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-39.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #314 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-39.html
expectedResult = 0.020169434673609647;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-39.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #314 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-39.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #314 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-39.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #315 checking TFIDF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-39.html
expectedResult = 0.029282647784206944;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-39.html", "kiwi");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #315 checking TFIDF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-39.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #315 checking TFIDF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-39.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #316 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-39.html
expectedResult = 0.04361508986855338;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-39.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #316 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-39.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #316 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-39.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #317 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-39.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-39.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #317 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-39.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #317 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-39.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #318 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-39.html
expectedResult = 0.007365697717165617;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-39.html", "lime");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #318 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-39.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #318 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-39.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #319 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-39.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-39.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #319 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-39.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #319 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-39.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #320 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-39.html
expectedResult = 0.017196913305423583;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-39.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #320 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-39.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #320 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-39.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #321 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-39.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-39.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #321 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-39.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #321 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-39.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #322 checking TFIDF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-15.html
expectedResult = 0.033492990948419434;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-15.html", "blueberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #322 checking TFIDF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-15.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #322 checking TFIDF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-15.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #323 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-15.html
expectedResult = 0.013238407985760573;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-15.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #323 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-15.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #323 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-15.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #324 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-15.html
expectedResult = 0.004853575416373758;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-15.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #324 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-15.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #324 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-15.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #325 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-15.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-15.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #325 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-15.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #325 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-15.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #326 checking TFIDF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-15.html
expectedResult = 0.009969630821322436;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-15.html", "kiwi");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #326 checking TFIDF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-15.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #326 checking TFIDF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-15.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #327 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-15.html
expectedResult = 0.015436648913189839;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-15.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #327 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-15.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #327 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-15.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #328 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-15.html
expectedResult = 0.011704292279867379;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-15.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #328 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-15.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #328 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-15.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #329 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-15.html
expectedResult = 0.004853575416373758;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-15.html", "lime");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #329 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-15.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #329 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-15.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #330 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-15.html
expectedResult = 0.015436648913189839;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-15.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #330 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-15.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #330 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-15.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #331 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-15.html
expectedResult = 0.014166525349128961;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-15.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #331 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-15.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #331 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-15.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #332 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-15.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-15.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #332 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-15.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #332 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-15.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #333 checking TFIDF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-18.html
expectedResult = 0.020681776434483382;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-18.html", "blueberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #333 checking TFIDF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-18.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #333 checking TFIDF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-18.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #334 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-18.html
expectedResult = 0.014991658525930639;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-18.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #334 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-18.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #334 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-18.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #335 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-18.html
expectedResult = 0.004966489516663257;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-18.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #335 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-18.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #335 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-18.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #336 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-18.html
expectedResult = 0.009298097451798092;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-18.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #336 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-18.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #336 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-18.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #337 checking TFIDF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-18.html
expectedResult = 0.02310494041686462;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-18.html", "kiwi");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #337 checking TFIDF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-18.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #337 checking TFIDF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-18.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #338 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-18.html
expectedResult = 0.020746809184835673;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-18.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #338 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-18.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #338 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-18.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #339 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-18.html
expectedResult = 0.008073450762383137;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-18.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #339 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-18.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #339 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-18.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #340 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-18.html
expectedResult = 0.006571937392476934;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-18.html", "lime");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #340 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-18.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #340 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-18.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #341 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-18.html
expectedResult = 0.005423813120784304;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-18.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #341 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-18.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #341 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-18.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #342 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-18.html
expectedResult = 0.004024875878628114;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-18.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #342 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-18.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #342 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-18.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #343 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-18.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-18.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #343 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-18.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #343 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-18.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #344 checking TFIDF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-23.html
expectedResult = 0.014027060403901311;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-23.html", "blueberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #344 checking TFIDF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-23.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #344 checking TFIDF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-23.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #345 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-23.html
expectedResult = 0.0071387984530522225;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-23.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #345 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-23.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #345 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-23.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #346 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-23.html
expectedResult = 0.0038826195790208065;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-23.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #346 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-23.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #346 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-23.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #347 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-23.html
expectedResult = 0.01591432543292516;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-23.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #347 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-23.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #347 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-23.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #348 checking TFIDF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-23.html
expectedResult = 0.015670529844599223;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-23.html", "kiwi");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #348 checking TFIDF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-23.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #348 checking TFIDF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-23.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #349 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-23.html
expectedResult = 0.029485620101879818;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-23.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #349 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-23.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #349 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-23.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #350 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-23.html
expectedResult = 0.006311528071310452;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-23.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #350 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-23.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #350 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-23.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #351 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-23.html
expectedResult = 0.007628978422413564;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-23.html", "lime");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #351 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-23.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #351 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-23.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #352 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-23.html
expectedResult = 0.01828509564869403;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-23.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #352 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-23.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #352 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-23.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #353 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-23.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-23.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #353 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-23.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #353 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-23.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #354 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-23.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-23.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #354 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-23.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #354 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-23.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #355 checking TFIDF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-21.html
expectedResult = 0.008535924086466432;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-21.html", "blueberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #355 checking TFIDF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-21.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #355 checking TFIDF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-21.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #356 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-21.html
expectedResult = 0.032119690565572796;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-21.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #356 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-21.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #356 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-21.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #357 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-21.html
expectedResult = 0.004642482373063772;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-21.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #357 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-21.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #357 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-21.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #358 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-21.html
expectedResult = 0.009748310569005204;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-21.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #358 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-21.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #358 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-21.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #359 checking TFIDF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-21.html
expectedResult = 0.014152917496331312;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-21.html", "kiwi");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #359 checking TFIDF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-21.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #359 checking TFIDF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-21.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #360 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-21.html
expectedResult = 0.014778958331910917;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-21.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #360 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-21.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #360 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-21.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #361 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-21.html
expectedResult = 0.011200524453185806;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-21.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #361 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-21.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #361 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-21.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #362 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-21.html
expectedResult = 0.004642482373063772;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-21.html", "lime");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #362 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-21.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #362 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-21.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #363 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-21.html
expectedResult = 0.011200524453185806;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-21.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #363 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-21.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #363 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-21.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #364 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-21.html
expectedResult = 0.018619972491769072;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-21.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #364 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-21.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #364 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-21.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #365 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-21.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-21.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #365 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-21.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #365 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-21.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #366 checking TFIDF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-45.html
expectedResult = 0.009735647572284185;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-45.html", "blueberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #366 checking TFIDF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-45.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #366 checking TFIDF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-45.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #367 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-45.html
expectedResult = 0.012876439742258104;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-45.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #367 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-45.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #367 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-45.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #368 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-45.html
expectedResult = 0.005294982920050852;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-45.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #368 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-45.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #368 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-45.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #369 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-45.html
expectedResult = 0.009908232647466254;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-45.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #369 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-45.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #369 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-45.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #370 checking TFIDF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-45.html
expectedResult = 0.014385097622957296;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-45.html", "kiwi");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #370 checking TFIDF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-45.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #370 checking TFIDF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-45.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #371 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-45.html
expectedResult = 0.016808083376663608;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-45.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #371 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-45.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #371 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-45.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #372 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-45.html
expectedResult = 0.011384270255879295;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-45.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #372 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-45.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #372 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-45.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #373 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-45.html
expectedResult = 0.005294982920050852;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-45.html", "lime");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #373 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-45.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #373 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-45.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #374 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-45.html
expectedResult = 0.014117364448464627;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-45.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #374 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-45.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #374 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-45.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #375 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-45.html
expectedResult = 0.0104761425906597;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-45.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #375 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-45.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #375 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-45.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #376 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-45.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-45.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #376 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-45.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #376 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-45.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #377 checking TFIDF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-41.html
expectedResult = 0.015712009142884436;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-41.html", "blueberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #377 checking TFIDF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-41.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #377 checking TFIDF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-41.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #378 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-41.html
expectedResult = 0.020681776434483382;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-41.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #378 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-41.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #378 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-41.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #379 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-41.html
expectedResult = 0.013884507329560425;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-41.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #379 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-41.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #379 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-41.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #380 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-41.html
expectedResult = 0.01591432543292516;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-41.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #380 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-41.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #380 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-41.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #381 checking TFIDF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-41.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-41.html", "kiwi");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #381 checking TFIDF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-41.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #381 checking TFIDF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-41.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #382 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-41.html
expectedResult = 0.01389124338138478;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-41.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #382 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-41.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #382 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-41.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #383 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-41.html
expectedResult = 0.00938325240924977;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-41.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #383 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-41.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #383 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-41.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #384 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-41.html
expectedResult = 0.0057722312421693905;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-41.html", "lime");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #384 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-41.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #384 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-41.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #385 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-41.html
expectedResult = 0.01389124338138478;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-41.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #385 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-41.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #385 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-41.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #386 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-41.html
expectedResult = 0.003528591850273347;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-41.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #386 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-41.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #386 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-41.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #387 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-41.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-41.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #387 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-41.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #387 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-41.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #388 checking TFIDF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-7.html
expectedResult = 0.019645914807286134;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-7.html", "blueberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #388 checking TFIDF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-7.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #388 checking TFIDF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-7.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #389 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-7.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-7.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #389 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-7.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #389 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-7.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #390 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-7.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-7.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #390 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-7.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #390 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-7.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #391 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-7.html
expectedResult = 0.007747666896974569;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-7.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #391 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-7.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #391 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-7.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #392 checking TFIDF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-7.html
expectedResult = 0.01666326177586332;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-7.html", "kiwi");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #392 checking TFIDF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-7.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #392 checking TFIDF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-7.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #393 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-7.html
expectedResult = 0.013187194162530317;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-7.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #393 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-7.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #393 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-7.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #394 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-7.html
expectedResult = 0.02934284107742827;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-7.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #394 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-7.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #394 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-7.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #395 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-7.html
expectedResult = 0.0027731499904153113;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-7.html", "lime");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #395 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-7.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #395 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-7.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #396 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-7.html
expectedResult = 0.017369273500044708;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-7.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #396 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-7.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #396 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-7.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #397 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-7.html
expectedResult = 0.012889302854430816;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-7.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #397 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-7.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #397 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-7.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #398 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-7.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-7.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #398 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-7.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #398 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-7.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #399 checking TFIDF for blueberry in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "blueberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #399 checking TFIDF for blueberry in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #399 checking TFIDF for blueberry in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
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

//Test #401 checking TFIDF for papaya in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #401 checking TFIDF for papaya in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #401 checking TFIDF for papaya in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #402 checking TFIDF for banana in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #402 checking TFIDF for banana in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #402 checking TFIDF for banana in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #403 checking TFIDF for kiwi in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "kiwi");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #403 checking TFIDF for kiwi in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #403 checking TFIDF for kiwi in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #404 checking TFIDF for pear in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #404 checking TFIDF for pear in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #404 checking TFIDF for pear in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #405 checking TFIDF for cherry in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #405 checking TFIDF for cherry in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #405 checking TFIDF for cherry in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #406 checking TFIDF for lime in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "lime");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #406 checking TFIDF for lime in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #406 checking TFIDF for lime in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #407 checking TFIDF for coconut in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #407 checking TFIDF for coconut in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #407 checking TFIDF for coconut in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #408 checking TFIDF for fig in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #408 checking TFIDF for fig in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #408 checking TFIDF for fig in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
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
