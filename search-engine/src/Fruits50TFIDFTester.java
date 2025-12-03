import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.*;
public class Fruits50TFIDFTester {public static void main(String[] args) throws Exception{
ProjectTester tester = new ProjectTesterImp(); //Instantiate your own ProjectTester instance here
tester.initialize();
tester.crawl("https://people.scs.carleton.ca/~avamckenney/fruits50/N-0.html");
runTest(tester);}public static void runTest(ProjectTester tester) throws Exception{
PrintWriter failOut = new PrintWriter(new FileWriter("Fruits50-TFIDF-failed.txt"));
PrintWriter passOut = new PrintWriter(new FileWriter("Fruits50-TFIDF-passed.txt"));
double expectedResult;
double yourResult;
//Test #289 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruits50/N-1.html
expectedResult = 0.0066936671658974385;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-1.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #289 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruits50/N-1.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #289 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruits50/N-1.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #290 checking TFIDF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits50/N-1.html
expectedResult = 0.003945011890130387;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-1.html", "kiwi");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #290 checking TFIDF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits50/N-1.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #290 checking TFIDF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits50/N-1.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #291 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits50/N-1.html
expectedResult = 0.005786881000473648;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-1.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #291 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits50/N-1.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #291 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits50/N-1.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #292 checking TFIDF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-1.html
expectedResult = 0.006182893505278266;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-1.html", "blueberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #292 checking TFIDF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-1.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #292 checking TFIDF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-1.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #293 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruits50/N-1.html
expectedResult = 0.04320183930421647;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-1.html", "lime");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #293 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruits50/N-1.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #293 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruits50/N-1.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #294 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits50/N-1.html
expectedResult = 0.019550420251167645;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-1.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #294 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits50/N-1.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #294 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits50/N-1.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #295 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-1.html
expectedResult = 0.00415473275475362;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-1.html", "strawberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #295 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-1.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #295 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-1.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #296 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruits50/N-1.html
expectedResult = 0.008331898903121141;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-1.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #296 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruits50/N-1.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #296 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruits50/N-1.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #297 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruits50/N-1.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-1.html", "peach");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #297 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruits50/N-1.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #297 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruits50/N-1.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #298 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits50/N-1.html
expectedResult = 0.008331898903121141;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-1.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #298 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits50/N-1.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #298 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits50/N-1.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #299 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits50/N-1.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-1.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #299 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits50/N-1.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #299 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits50/N-1.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #300 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruits50/N-10.html
expectedResult = 0.002327971189204034;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-10.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #300 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruits50/N-10.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #300 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruits50/N-10.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #301 checking TFIDF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits50/N-10.html
expectedResult = 0.004430334702865218;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-10.html", "kiwi");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #301 checking TFIDF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits50/N-10.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #301 checking TFIDF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits50/N-10.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #302 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits50/N-10.html
expectedResult = 0.0011521073659389834;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-10.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #302 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits50/N-10.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #302 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits50/N-10.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #303 checking TFIDF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-10.html
expectedResult = 0.003528591850273347;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-10.html", "blueberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #303 checking TFIDF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-10.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #303 checking TFIDF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-10.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #304 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruits50/N-10.html
expectedResult = 0.025126853456597594;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-10.html", "lime");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #304 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruits50/N-10.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #304 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruits50/N-10.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #305 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits50/N-10.html
expectedResult = 0.010308343809936275;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-10.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #305 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits50/N-10.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #305 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits50/N-10.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #306 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-10.html
expectedResult = 0.006963076611239761;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-10.html", "strawberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #306 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-10.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #306 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-10.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #307 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruits50/N-10.html
expectedResult = 0.004755034279946171;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-10.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #307 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruits50/N-10.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #307 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruits50/N-10.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #308 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruits50/N-10.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-10.html", "peach");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #308 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruits50/N-10.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #308 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruits50/N-10.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #309 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits50/N-10.html
expectedResult = 0.004755034279946171;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-10.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #309 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits50/N-10.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #309 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits50/N-10.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #310 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits50/N-10.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-10.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #310 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits50/N-10.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #310 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits50/N-10.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #311 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruits50/N-46.html
expectedResult = 0.003540747034210253;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-46.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #311 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruits50/N-46.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #311 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruits50/N-46.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #312 checking TFIDF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits50/N-46.html
expectedResult = 0.00425101976868384;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-46.html", "kiwi");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #312 checking TFIDF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits50/N-46.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #312 checking TFIDF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits50/N-46.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #313 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits50/N-46.html
expectedResult = 0.0017523072269786204;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-46.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #313 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits50/N-46.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #313 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits50/N-46.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #314 checking TFIDF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-46.html
expectedResult = 0.0027113747984100554;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-46.html", "blueberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #314 checking TFIDF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-46.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #314 checking TFIDF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-46.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #315 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruits50/N-46.html
expectedResult = 0.025640211026962248;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-46.html", "lime");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #315 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruits50/N-46.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #315 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruits50/N-46.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #316 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits50/N-46.html
expectedResult = 0.007968657650939693;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-46.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #316 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits50/N-46.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #316 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits50/N-46.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #317 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-46.html
expectedResult = 0.015472850797695514;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-46.html", "strawberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #317 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-46.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #317 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-46.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #318 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruits50/N-46.html
expectedResult = 0.010738346032409012;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-46.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #318 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruits50/N-46.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #318 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruits50/N-46.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #319 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruits50/N-46.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-46.html", "peach");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #319 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruits50/N-46.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #319 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruits50/N-46.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #320 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits50/N-46.html
expectedResult = 0.014175050303884235;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-46.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #320 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits50/N-46.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #320 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits50/N-46.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #321 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits50/N-46.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-46.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #321 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits50/N-46.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #321 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits50/N-46.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #322 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruits50/N-48.html
expectedResult = 0.00414548718952568;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-48.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #322 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruits50/N-48.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #322 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruits50/N-48.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #323 checking TFIDF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits50/N-48.html
expectedResult = 0.002713798884545823;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-48.html", "kiwi");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #323 checking TFIDF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits50/N-48.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #323 checking TFIDF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits50/N-48.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #324 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits50/N-48.html
expectedResult = 0.003365738894720593;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-48.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #324 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits50/N-48.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #324 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits50/N-48.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #325 checking TFIDF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-48.html
expectedResult = 0.012274573544126323;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-48.html", "blueberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #325 checking TFIDF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-48.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #325 checking TFIDF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-48.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #326 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruits50/N-48.html
expectedResult = 0.015316114869686972;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-48.html", "lime");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #326 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruits50/N-48.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #326 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruits50/N-48.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #327 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits50/N-48.html
expectedResult = 0.012274573544126323;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-48.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #327 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits50/N-48.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #327 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits50/N-48.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #328 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-48.html
expectedResult = 0.014211234790989572;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-48.html", "strawberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #328 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-48.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #328 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-48.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #329 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruits50/N-48.html
expectedResult = 0.01389124338138478;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-48.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #329 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruits50/N-48.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #329 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruits50/N-48.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #330 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruits50/N-48.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-48.html", "peach");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #330 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruits50/N-48.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #330 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruits50/N-48.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #331 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits50/N-48.html
expectedResult = 0.01389124338138478;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-48.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #331 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits50/N-48.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #331 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits50/N-48.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #332 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits50/N-48.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-48.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #332 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits50/N-48.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #332 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits50/N-48.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #333 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruits50/N-14.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-14.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #333 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruits50/N-14.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #333 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruits50/N-14.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #334 checking TFIDF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits50/N-14.html
expectedResult = 0.0038252985328498714;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-14.html", "kiwi");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #334 checking TFIDF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits50/N-14.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #334 checking TFIDF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits50/N-14.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #335 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits50/N-14.html
expectedResult = 0.0019561335511534125;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-14.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #335 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits50/N-14.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #335 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits50/N-14.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #336 checking TFIDF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-14.html
expectedResult = 0.01171585012554421;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-14.html", "blueberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #336 checking TFIDF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-14.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #336 checking TFIDF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-14.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #337 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruits50/N-14.html
expectedResult = 0.04191791896916396;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-14.html", "lime");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #337 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruits50/N-14.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #337 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruits50/N-14.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #338 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits50/N-14.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-14.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #338 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits50/N-14.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #338 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits50/N-14.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #339 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-14.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-14.html", "strawberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #339 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-14.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #339 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-14.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #340 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruits50/N-14.html
expectedResult = 0.015787960560346127;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-14.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #340 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruits50/N-14.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #340 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruits50/N-14.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #341 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruits50/N-14.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-14.html", "peach");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #341 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruits50/N-14.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #341 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruits50/N-14.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #342 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits50/N-14.html
expectedResult = 0.023174092030569356;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-14.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #342 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits50/N-14.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #342 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits50/N-14.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #343 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits50/N-14.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-14.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #343 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits50/N-14.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #343 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits50/N-14.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #344 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruits50/N-3.html
expectedResult = 0.005151009376339124;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-3.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #344 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruits50/N-3.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #344 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruits50/N-3.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #345 checking TFIDF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits50/N-3.html
expectedResult = 0.0025492222034458117;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-3.html", "kiwi");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #345 checking TFIDF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits50/N-3.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #345 checking TFIDF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits50/N-3.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #346 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits50/N-3.html
expectedResult = 0.005724261050936529;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-3.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #346 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits50/N-3.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #346 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits50/N-3.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #347 checking TFIDF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-3.html
expectedResult = 0.012761475999285461;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-3.html", "blueberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #347 checking TFIDF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-3.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #347 checking TFIDF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-3.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #348 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruits50/N-3.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-3.html", "lime");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #348 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruits50/N-3.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #348 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruits50/N-3.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #349 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits50/N-3.html
expectedResult = 0.012761475999285461;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-3.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #349 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits50/N-3.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #349 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits50/N-3.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #350 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-3.html
expectedResult = 0.015168752554898945;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-3.html", "strawberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #350 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-3.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #350 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-3.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #351 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruits50/N-3.html
expectedResult = 0.01389124338138478;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-3.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #351 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruits50/N-3.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #351 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruits50/N-3.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #352 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruits50/N-3.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-3.html", "peach");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #352 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruits50/N-3.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #352 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruits50/N-3.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #353 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits50/N-3.html
expectedResult = 0.010521275466983447;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-3.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #353 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits50/N-3.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #353 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits50/N-3.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #354 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits50/N-3.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-3.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #354 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits50/N-3.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #354 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits50/N-3.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #355 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruits50/N-21.html
expectedResult = 0.003034809502733903;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-21.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #355 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruits50/N-21.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #355 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruits50/N-21.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #356 checking TFIDF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits50/N-21.html
expectedResult = 0.0036587664801601577;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-21.html", "kiwi");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #356 checking TFIDF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits50/N-21.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #356 checking TFIDF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits50/N-21.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #357 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits50/N-21.html
expectedResult = 0.0036587664801601577;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-21.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #357 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits50/N-21.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #357 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits50/N-21.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #358 checking TFIDF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-21.html
expectedResult = 0.009041293783778537;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-21.html", "blueberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #358 checking TFIDF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-21.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #358 checking TFIDF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-21.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #359 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruits50/N-21.html
expectedResult = 0.02203838639375518;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-21.html", "lime");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #359 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruits50/N-21.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #359 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruits50/N-21.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #360 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits50/N-21.html
expectedResult = 0.01333454286915998;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-21.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #360 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits50/N-21.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #360 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits50/N-21.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #361 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-21.html
expectedResult = 0.006839777850279317;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-21.html", "strawberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #361 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-21.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #361 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-21.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #362 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruits50/N-21.html
expectedResult = 0.012183801272907425;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-21.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #362 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruits50/N-21.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #362 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruits50/N-21.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #363 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruits50/N-21.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-21.html", "peach");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #363 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruits50/N-21.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #363 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruits50/N-21.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #364 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits50/N-21.html
expectedResult = 0.015100641268186226;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-21.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #364 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits50/N-21.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #364 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits50/N-21.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #365 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits50/N-21.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-21.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #365 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits50/N-21.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #365 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits50/N-21.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #366 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruits50/N-45.html
expectedResult = 0.004249167047585765;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-45.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #366 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruits50/N-45.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #366 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruits50/N-45.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #367 checking TFIDF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits50/N-45.html
expectedResult = 0.0021029025948996398;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-45.html", "kiwi");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #367 checking TFIDF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits50/N-45.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #367 checking TFIDF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits50/N-45.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #368 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits50/N-45.html
expectedResult = 0.00507232104076176;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-45.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #368 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits50/N-45.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #368 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits50/N-45.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #369 checking TFIDF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-45.html
expectedResult = 0.0095440356557343;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-45.html", "blueberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #369 checking TFIDF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-45.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #369 checking TFIDF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-45.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #370 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruits50/N-45.html
expectedResult = 0.05857270573666875;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-45.html", "lime");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #370 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruits50/N-45.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #370 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruits50/N-45.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #371 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits50/N-45.html
expectedResult = 0.0095440356557343;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-45.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #371 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits50/N-45.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #371 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits50/N-45.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #372 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-45.html
expectedResult = 0.0064406193186985735;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-45.html", "strawberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #372 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-45.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #372 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-45.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #373 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruits50/N-45.html
expectedResult = 0.008679203190395295;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-45.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #373 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruits50/N-45.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #373 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruits50/N-45.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #374 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruits50/N-45.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-45.html", "peach");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #374 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruits50/N-45.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #374 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruits50/N-45.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #375 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits50/N-45.html
expectedResult = 0.004393852267309213;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-45.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #375 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits50/N-45.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #375 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits50/N-45.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #376 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits50/N-45.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-45.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #376 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits50/N-45.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #376 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits50/N-45.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #377 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruits50/N-22.html
expectedResult = 0.008952022920533313;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-22.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #377 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruits50/N-22.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #377 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruits50/N-22.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #378 checking TFIDF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits50/N-22.html
expectedResult = 0.004430334702865218;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-22.html", "kiwi");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #378 checking TFIDF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits50/N-22.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #378 checking TFIDF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits50/N-22.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #379 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits50/N-22.html
expectedResult = 0.0022734881770996927;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-22.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #379 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits50/N-22.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #379 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits50/N-22.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #380 checking TFIDF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-22.html
expectedResult = 0.016748963128634848;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-22.html", "blueberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #380 checking TFIDF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-22.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #380 checking TFIDF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-22.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #381 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruits50/N-22.html
expectedResult = 0.016972678525626828;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-22.html", "lime");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #381 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruits50/N-22.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #381 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruits50/N-22.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #382 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits50/N-22.html
expectedResult = 0.006963076611239761;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-22.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #382 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits50/N-22.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #382 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits50/N-22.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #383 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-22.html
expectedResult = 0.006963076611239761;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-22.html", "strawberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #383 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-22.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #383 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-22.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #384 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruits50/N-22.html
expectedResult = 0.00938325240924977;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-22.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #384 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruits50/N-22.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #384 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruits50/N-22.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #385 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruits50/N-22.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-22.html", "peach");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #385 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruits50/N-22.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #385 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruits50/N-22.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #386 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits50/N-22.html
expectedResult = 0.01828509564869403;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-22.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #386 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits50/N-22.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #386 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits50/N-22.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #387 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits50/N-22.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-22.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #387 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits50/N-22.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #387 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits50/N-22.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #388 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruits50/N-39.html
expectedResult = 0.012768822531346282;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-39.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #388 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruits50/N-39.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #388 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruits50/N-39.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #389 checking TFIDF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits50/N-39.html
expectedResult = 0.0032782273369262307;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-39.html", "kiwi");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #389 checking TFIDF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits50/N-39.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #389 checking TFIDF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits50/N-39.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #390 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits50/N-39.html
expectedResult = 0.0032782273369262307;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-39.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #390 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits50/N-39.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #390 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits50/N-39.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #391 checking TFIDF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-39.html
expectedResult = 0.0034344847609663917;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-39.html", "blueberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #391 checking TFIDF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-39.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #391 checking TFIDF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-39.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #392 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruits50/N-39.html
expectedResult = 0.008371645036182939;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-39.html", "lime");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #392 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruits50/N-39.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #392 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruits50/N-39.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #393 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits50/N-39.html
expectedResult = 0.006779751959662912;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-39.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #393 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits50/N-39.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #393 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits50/N-39.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #394 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-39.html
expectedResult = 0.006779751959662912;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-39.html", "strawberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #394 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-39.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #394 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-39.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #395 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruits50/N-39.html
expectedResult = 0.004628218129303568;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-39.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #395 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruits50/N-39.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #395 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruits50/N-39.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #396 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruits50/N-39.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-39.html", "peach");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #396 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruits50/N-39.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #396 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruits50/N-39.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #397 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits50/N-39.html
expectedResult = 0.009136209101438586;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-39.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #397 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits50/N-39.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #397 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits50/N-39.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #398 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits50/N-39.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-39.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #398 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits50/N-39.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #398 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits50/N-39.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #399 checking TFIDF for pear in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #399 checking TFIDF for pear in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #399 checking TFIDF for pear in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #400 checking TFIDF for kiwi in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "kiwi");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #400 checking TFIDF for kiwi in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #400 checking TFIDF for kiwi in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #401 checking TFIDF for coconut in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #401 checking TFIDF for coconut in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #401 checking TFIDF for coconut in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #402 checking TFIDF for blueberry in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "blueberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #402 checking TFIDF for blueberry in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #402 checking TFIDF for blueberry in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #403 checking TFIDF for lime in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "lime");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #403 checking TFIDF for lime in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #403 checking TFIDF for lime in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #404 checking TFIDF for apple in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #404 checking TFIDF for apple in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #404 checking TFIDF for apple in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #405 checking TFIDF for strawberry in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "strawberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #405 checking TFIDF for strawberry in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #405 checking TFIDF for strawberry in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #406 checking TFIDF for fig in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #406 checking TFIDF for fig in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #406 checking TFIDF for fig in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #407 checking TFIDF for peach in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "peach");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #407 checking TFIDF for peach in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #407 checking TFIDF for peach in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #408 checking TFIDF for papaya in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #408 checking TFIDF for papaya in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #408 checking TFIDF for papaya in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
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
