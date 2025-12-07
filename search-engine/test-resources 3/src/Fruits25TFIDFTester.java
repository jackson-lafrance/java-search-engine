import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.*;
public class Fruits25TFIDFTester {public static void main(String[] args) throws Exception{
ProjectTester tester = new ProjectTesterImp(); //Instantiate your own ProjectTester instance here
tester.initialize();
tester.crawl("https://people.scs.carleton.ca/~avamckenney/fruits25/N-0.html");
runTest(tester);}public static void runTest(ProjectTester tester) throws Exception{
PrintWriter failOut = new PrintWriter(new FileWriter("Fruits25-TFIDF-failed.txt"));
PrintWriter passOut = new PrintWriter(new FileWriter("Fruits25-TFIDF-passed.txt"));
double expectedResult;
double yourResult;
//Test #214 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html
expectedResult = 0.011384270255879295;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #214 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #214 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #215 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html
expectedResult = 0.009526117220462484;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html", "apricot");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #215 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #215 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #216 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html", "strawberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #216 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #216 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #217 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html", "lime");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #217 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #217 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #218 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html
expectedResult = 0.008607444705009883;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #218 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #218 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #219 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html
expectedResult = 0.0042140355055771865;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #219 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #219 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #220 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #220 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #220 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #221 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html
expectedResult = 0.014117364448464627;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #221 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #221 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #222 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html", "peach");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #222 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #222 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #223 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html
expectedResult = 0.025768679616493564;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #223 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #223 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #224 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #224 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #224 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #225 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html
expectedResult = 0.006549754456599251;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #225 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #225 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #226 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html
expectedResult = 0.007800486549069939;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html", "apricot");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #226 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #226 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #227 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html", "strawberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #227 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #227 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #228 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html", "lime");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #228 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #228 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #229 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html
expectedResult = 0.012861282527909692;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #229 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #229 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #230 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html
expectedResult = 0.007800486549069939;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #230 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #230 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #231 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #231 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #231 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #232 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html
expectedResult = 0.0033057741298957635;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #232 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #232 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #233 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html", "peach");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #233 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #233 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #234 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html
expectedResult = 0.01004150921771007;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #234 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #234 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #235 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #235 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #235 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #236 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits25/N-20.html
expectedResult = 0.019302974780250347;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-20.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #236 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits25/N-20.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #236 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits25/N-20.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #237 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits25/N-20.html
expectedResult = 0.004856500821031621;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-20.html", "apricot");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #237 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits25/N-20.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #237 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits25/N-20.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #238 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-20.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-20.html", "strawberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #238 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-20.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #238 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-20.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #239 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruits25/N-20.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-20.html", "lime");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #239 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruits25/N-20.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #239 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruits25/N-20.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #240 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits25/N-20.html
expectedResult = 0.009919722371000582;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-20.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #240 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits25/N-20.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #240 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits25/N-20.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #241 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruits25/N-20.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-20.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #241 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruits25/N-20.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #241 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruits25/N-20.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #242 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-20.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-20.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #242 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-20.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #242 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-20.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #243 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruits25/N-20.html
expectedResult = 0.019302974780250347;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-20.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #243 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruits25/N-20.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #243 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruits25/N-20.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #244 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruits25/N-20.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-20.html", "peach");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #244 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruits25/N-20.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #244 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruits25/N-20.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #245 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruits25/N-20.html
expectedResult = 0.015208048528470469;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-20.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #245 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruits25/N-20.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #245 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruits25/N-20.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #246 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits25/N-20.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-20.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #246 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits25/N-20.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #246 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits25/N-20.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #247 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits25/N-10.html
expectedResult = 0.021997491629348293;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-10.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #247 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits25/N-10.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #247 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits25/N-10.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #248 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits25/N-10.html
expectedResult = 0.0044729081462969965;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-10.html", "apricot");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #248 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits25/N-10.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #248 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits25/N-10.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #249 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-10.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-10.html", "strawberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #249 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-10.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #249 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-10.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #250 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruits25/N-10.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-10.html", "lime");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #250 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruits25/N-10.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #250 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruits25/N-10.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #251 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits25/N-10.html
expectedResult = 0.017815412291833893;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-10.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #251 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits25/N-10.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #251 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits25/N-10.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #252 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruits25/N-10.html
expectedResult = 0.008722075193882767;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-10.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #252 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruits25/N-10.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #252 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruits25/N-10.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #253 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-10.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-10.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #253 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-10.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #253 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-10.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #254 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruits25/N-10.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-10.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #254 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruits25/N-10.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #254 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruits25/N-10.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #255 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruits25/N-10.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-10.html", "peach");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #255 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruits25/N-10.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #255 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruits25/N-10.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #256 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruits25/N-10.html
expectedResult = 0.020743103707281035;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-10.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #256 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruits25/N-10.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #256 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruits25/N-10.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #257 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits25/N-10.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-10.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #257 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits25/N-10.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #257 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits25/N-10.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #258 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #258 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #258 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #259 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html
expectedResult = 0.00155904618446634;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html", "apricot");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #259 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #259 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #260 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html", "strawberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #260 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #260 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #261 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html", "lime");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #261 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #261 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #262 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html
expectedResult = 0.01240155273739913;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #262 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #262 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #263 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html
expectedResult = 0.01443557923072819;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #263 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #263 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #264 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #264 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #264 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #265 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html
expectedResult = 0.015368255653415196;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #265 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #265 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #266 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html", "peach");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #266 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #266 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #267 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html
expectedResult = 0.023561262002487267;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #267 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #267 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #268 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #268 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #268 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #269 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits25/N-18.html
expectedResult = 0.007714509797962978;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-18.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #269 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits25/N-18.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #269 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits25/N-18.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #270 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits25/N-18.html
expectedResult = 0.010861443346405389;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-18.html", "apricot");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #270 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits25/N-18.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #270 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits25/N-18.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #271 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-18.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-18.html", "strawberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #271 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-18.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #271 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-18.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #272 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruits25/N-18.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-18.html", "lime");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #272 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruits25/N-18.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #272 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruits25/N-18.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #273 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits25/N-18.html
expectedResult = 0.012673358422452536;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-18.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #273 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits25/N-18.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #273 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits25/N-18.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #274 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruits25/N-18.html
expectedResult = 0.008564935084106788;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-18.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #274 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruits25/N-18.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #274 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruits25/N-18.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #275 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-18.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-18.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #275 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-18.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #275 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-18.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #276 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruits25/N-18.html
expectedResult = 0.007714509797962978;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-18.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #276 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruits25/N-18.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #276 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruits25/N-18.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #277 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruits25/N-18.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-18.html", "peach");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #277 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruits25/N-18.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #277 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruits25/N-18.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #278 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruits25/N-18.html
expectedResult = 0.019429681870009544;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-18.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #278 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruits25/N-18.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #278 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruits25/N-18.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #279 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits25/N-18.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-18.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #279 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits25/N-18.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #279 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits25/N-18.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #280 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits25/N-22.html
expectedResult = 0.011200524453185806;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-22.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #280 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits25/N-22.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #280 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits25/N-22.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #281 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits25/N-22.html
expectedResult = 0.006800879335501042;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-22.html", "apricot");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #281 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits25/N-22.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #281 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits25/N-22.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #282 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-22.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-22.html", "strawberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #282 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-22.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #282 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-22.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #283 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruits25/N-22.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-22.html", "lime");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #283 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruits25/N-22.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #283 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruits25/N-22.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #284 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits25/N-22.html
expectedResult = 0.005690604709731066;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-22.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #284 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits25/N-22.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #284 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits25/N-22.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #285 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruits25/N-22.html
expectedResult = 0.011874961922395816;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-22.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #285 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruits25/N-22.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #285 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruits25/N-22.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #286 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-22.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-22.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #286 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-22.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #286 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-22.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #287 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruits25/N-22.html
expectedResult = 0.0267525259092945;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-22.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #287 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruits25/N-22.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #287 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruits25/N-22.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #288 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruits25/N-22.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-22.html", "peach");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #288 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruits25/N-22.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #288 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruits25/N-22.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #289 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruits25/N-22.html
expectedResult = 0.021296836298815156;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-22.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #289 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruits25/N-22.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #289 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruits25/N-22.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #290 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits25/N-22.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-22.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #290 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits25/N-22.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #290 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits25/N-22.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #291 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits25/N-5.html
expectedResult = 0.01654088102298361;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-5.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #291 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits25/N-5.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #291 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits25/N-5.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #292 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits25/N-5.html
expectedResult = 0.004950854670969278;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-5.html", "apricot");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #292 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits25/N-5.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #292 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits25/N-5.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #293 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-5.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-5.html", "strawberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #293 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-5.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #293 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-5.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #294 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruits25/N-5.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-5.html", "lime");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #294 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruits25/N-5.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #294 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruits25/N-5.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #295 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits25/N-5.html
expectedResult = 0.010112446315772362;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-5.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #295 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits25/N-5.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #295 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits25/N-5.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #296 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruits25/N-5.html
expectedResult = 0.011132899274232564;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-5.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #296 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruits25/N-5.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #296 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruits25/N-5.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #297 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-5.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-5.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #297 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-5.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #297 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-5.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #298 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruits25/N-5.html
expectedResult = 0.01654088102298361;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-5.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #298 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruits25/N-5.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #298 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruits25/N-5.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #299 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruits25/N-5.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-5.html", "peach");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #299 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruits25/N-5.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #299 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruits25/N-5.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #300 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruits25/N-5.html
expectedResult = 0.015503515981597573;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-5.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #300 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruits25/N-5.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #300 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruits25/N-5.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #301 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits25/N-5.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-5.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #301 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits25/N-5.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #301 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits25/N-5.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #302 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits25/N-8.html
expectedResult = 0.00938325240924977;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-8.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #302 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits25/N-8.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #302 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits25/N-8.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #303 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits25/N-8.html
expectedResult = 0.006071556118074172;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-8.html", "apricot");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #303 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits25/N-8.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #303 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits25/N-8.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #304 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-8.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-8.html", "strawberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #304 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-8.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #304 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-8.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #305 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruits25/N-8.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-8.html", "lime");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #305 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruits25/N-8.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #305 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruits25/N-8.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #306 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits25/N-8.html
expectedResult = 0.015368255653415196;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-8.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #306 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits25/N-8.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #306 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits25/N-8.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #307 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruits25/N-8.html
expectedResult = 0.0075239954715694704;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-8.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #307 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruits25/N-8.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #307 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruits25/N-8.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #308 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-8.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-8.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #308 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-8.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #308 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-8.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #309 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruits25/N-8.html
expectedResult = 0.015368255653415196;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-8.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #309 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruits25/N-8.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #309 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruits25/N-8.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #310 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruits25/N-8.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-8.html", "peach");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #310 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruits25/N-8.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #310 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruits25/N-8.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #311 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruits25/N-8.html
expectedResult = 0.04101462692918852;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-8.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #311 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruits25/N-8.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #311 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruits25/N-8.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #312 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits25/N-8.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-8.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #312 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits25/N-8.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #312 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits25/N-8.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #313 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits25/N-3.html
expectedResult = 0.018780239763260147;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-3.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #313 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits25/N-3.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #313 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits25/N-3.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #314 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits25/N-3.html
expectedResult = 0.009194435733007697;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-3.html", "apricot");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #314 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits25/N-3.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #314 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits25/N-3.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #315 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-3.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-3.html", "strawberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #315 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-3.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #315 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-3.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #316 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruits25/N-3.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-3.html", "lime");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #316 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruits25/N-3.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #316 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruits25/N-3.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #317 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits25/N-3.html
expectedResult = 0.018780239763260147;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-3.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #317 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits25/N-3.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #317 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits25/N-3.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #318 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruits25/N-3.html
expectedResult = 0.00472152758671069;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-3.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #318 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruits25/N-3.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #318 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruits25/N-3.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #319 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-3.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-3.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #319 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-3.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #319 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-3.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #320 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruits25/N-3.html
expectedResult = 0.014272248791125097;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-3.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #320 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruits25/N-3.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #320 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruits25/N-3.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #321 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruits25/N-3.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-3.html", "peach");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #321 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruits25/N-3.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #321 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruits25/N-3.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #322 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruits25/N-3.html
expectedResult = 0.028792216859912186;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-3.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #322 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruits25/N-3.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #322 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruits25/N-3.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #323 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits25/N-3.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-3.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #323 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits25/N-3.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #323 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits25/N-3.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #324 checking TFIDF for apple in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #324 checking TFIDF for apple in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #324 checking TFIDF for apple in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #325 checking TFIDF for apricot in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "apricot");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #325 checking TFIDF for apricot in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #325 checking TFIDF for apricot in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #326 checking TFIDF for strawberry in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "strawberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #326 checking TFIDF for strawberry in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #326 checking TFIDF for strawberry in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #327 checking TFIDF for lime in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "lime");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #327 checking TFIDF for lime in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #327 checking TFIDF for lime in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #328 checking TFIDF for coconut in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #328 checking TFIDF for coconut in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #328 checking TFIDF for coconut in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #329 checking TFIDF for pear in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #329 checking TFIDF for pear in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #329 checking TFIDF for pear in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #330 checking TFIDF for cherry in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #330 checking TFIDF for cherry in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #330 checking TFIDF for cherry in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #331 checking TFIDF for fig in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #331 checking TFIDF for fig in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #331 checking TFIDF for fig in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #332 checking TFIDF for peach in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "peach");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #332 checking TFIDF for peach in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #332 checking TFIDF for peach in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #333 checking TFIDF for banana in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #333 checking TFIDF for banana in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #333 checking TFIDF for banana in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #334 checking TFIDF for tomato in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #334 checking TFIDF for tomato in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #334 checking TFIDF for tomato in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

failOut.close();
passOut.close();
}
}
