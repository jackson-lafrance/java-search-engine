import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.*;
public class Fruits100TFTester {public static void main(String[] args) throws Exception{
ProjectTester tester = new ProjectTesterImp(); //Instantiate your own ProjectTester instance here
tester.initialize();
tester.crawl("https://people.scs.carleton.ca/~avamckenney/fruits100/N-0.html");
runTest(tester);}public static void runTest(ProjectTester tester) throws Exception{
PrintWriter failOut = new PrintWriter(new FileWriter("Fruits100-TF-failed.txt"));
PrintWriter passOut = new PrintWriter(new FileWriter("Fruits100-TF-passed.txt"));
double expectedResult;
double yourResult;
//Test #218 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits100/N-54.html
expectedResult = 0.023809523809523808;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-54.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #218 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits100/N-54.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #218 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits100/N-54.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #219 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits100/N-54.html
expectedResult = 0.11904761904761904;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-54.html", "kiwi");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #219 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits100/N-54.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #219 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits100/N-54.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #220 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits100/N-54.html
expectedResult = 0.047619047619047616;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-54.html", "apricot");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #220 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits100/N-54.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #220 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits100/N-54.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #221 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-54.html
expectedResult = 0.14285714285714285;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-54.html", "blueberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #221 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-54.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #221 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-54.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #222 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits100/N-54.html
expectedResult = 0.07142857142857142;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-54.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #222 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits100/N-54.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #222 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits100/N-54.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #223 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruits100/N-54.html
expectedResult = 0.023809523809523808;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-54.html", "lime");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #223 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruits100/N-54.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #223 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruits100/N-54.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #224 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruits100/N-54.html
expectedResult = 0.09523809523809523;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-54.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #224 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruits100/N-54.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #224 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruits100/N-54.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #225 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits100/N-54.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-54.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #225 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits100/N-54.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #225 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits100/N-54.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #226 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-54.html
expectedResult = 0.07142857142857142;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-54.html", "strawberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #226 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-54.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #226 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-54.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #227 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-54.html
expectedResult = 0.11904761904761904;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-54.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #227 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-54.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #227 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-54.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #228 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits100/N-54.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-54.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #228 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits100/N-54.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #228 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits100/N-54.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #229 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits100/N-29.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-29.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #229 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits100/N-29.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #229 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits100/N-29.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #230 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits100/N-29.html
expectedResult = 0.1724137931034483;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-29.html", "kiwi");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #230 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits100/N-29.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #230 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits100/N-29.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #231 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits100/N-29.html
expectedResult = 0.034482758620689655;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-29.html", "apricot");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #231 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits100/N-29.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #231 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits100/N-29.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #232 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-29.html
expectedResult = 0.034482758620689655;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-29.html", "blueberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #232 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-29.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #232 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-29.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #233 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits100/N-29.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-29.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #233 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits100/N-29.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #233 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits100/N-29.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #234 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruits100/N-29.html
expectedResult = 0.10344827586206896;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-29.html", "lime");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #234 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruits100/N-29.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #234 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruits100/N-29.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #235 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruits100/N-29.html
expectedResult = 0.034482758620689655;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-29.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #235 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruits100/N-29.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #235 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruits100/N-29.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #236 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits100/N-29.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-29.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #236 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits100/N-29.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #236 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits100/N-29.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #237 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-29.html
expectedResult = 0.13793103448275862;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-29.html", "strawberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #237 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-29.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #237 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-29.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #238 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-29.html
expectedResult = 0.2413793103448276;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-29.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #238 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-29.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #238 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-29.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #239 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits100/N-29.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-29.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #239 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits100/N-29.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #239 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits100/N-29.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #240 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits100/N-79.html
expectedResult = 0.08695652173913043;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-79.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #240 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits100/N-79.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #240 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits100/N-79.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #241 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits100/N-79.html
expectedResult = 0.08695652173913043;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-79.html", "kiwi");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #241 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits100/N-79.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #241 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits100/N-79.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #242 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits100/N-79.html
expectedResult = 0.08695652173913043;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-79.html", "apricot");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #242 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits100/N-79.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #242 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits100/N-79.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #243 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-79.html
expectedResult = 0.08695652173913043;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-79.html", "blueberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #243 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-79.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #243 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-79.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #244 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits100/N-79.html
expectedResult = 0.08695652173913043;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-79.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #244 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits100/N-79.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #244 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits100/N-79.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #245 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruits100/N-79.html
expectedResult = 0.13043478260869565;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-79.html", "lime");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #245 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruits100/N-79.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #245 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruits100/N-79.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #246 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruits100/N-79.html
expectedResult = 0.043478260869565216;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-79.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #246 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruits100/N-79.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #246 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruits100/N-79.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #247 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits100/N-79.html
expectedResult = 0.08695652173913043;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-79.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #247 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits100/N-79.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #247 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits100/N-79.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #248 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-79.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-79.html", "strawberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #248 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-79.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #248 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-79.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #249 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-79.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-79.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #249 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-79.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #249 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-79.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #250 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits100/N-79.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-79.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #250 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits100/N-79.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #250 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits100/N-79.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #251 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits100/N-97.html
expectedResult = 0.12;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-97.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #251 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits100/N-97.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #251 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits100/N-97.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #252 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits100/N-97.html
expectedResult = 0.08;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-97.html", "kiwi");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #252 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits100/N-97.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #252 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits100/N-97.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #253 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits100/N-97.html
expectedResult = 0.13333333333333333;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-97.html", "apricot");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #253 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits100/N-97.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #253 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits100/N-97.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #254 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-97.html
expectedResult = 0.08;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-97.html", "blueberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #254 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-97.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #254 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-97.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #255 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits100/N-97.html
expectedResult = 0.04;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-97.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #255 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits100/N-97.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #255 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits100/N-97.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #256 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruits100/N-97.html
expectedResult = 0.04;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-97.html", "lime");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #256 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruits100/N-97.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #256 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruits100/N-97.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #257 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruits100/N-97.html
expectedResult = 0.10666666666666667;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-97.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #257 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruits100/N-97.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #257 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruits100/N-97.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #258 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits100/N-97.html
expectedResult = 0.04;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-97.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #258 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits100/N-97.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #258 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits100/N-97.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #259 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-97.html
expectedResult = 0.13333333333333333;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-97.html", "strawberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #259 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-97.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #259 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-97.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #260 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-97.html
expectedResult = 0.05333333333333334;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-97.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #260 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-97.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #260 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-97.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #261 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits100/N-97.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-97.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #261 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits100/N-97.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #261 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits100/N-97.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #262 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits100/N-66.html
expectedResult = 0.043478260869565216;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-66.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #262 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits100/N-66.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #262 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits100/N-66.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #263 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits100/N-66.html
expectedResult = 0.13043478260869565;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-66.html", "kiwi");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #263 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits100/N-66.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #263 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits100/N-66.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #264 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits100/N-66.html
expectedResult = 0.043478260869565216;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-66.html", "apricot");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #264 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits100/N-66.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #264 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits100/N-66.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #265 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-66.html
expectedResult = 0.13043478260869565;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-66.html", "blueberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #265 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-66.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #265 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-66.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #266 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits100/N-66.html
expectedResult = 0.08695652173913043;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-66.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #266 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits100/N-66.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #266 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits100/N-66.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #267 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruits100/N-66.html
expectedResult = 0.06521739130434782;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-66.html", "lime");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #267 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruits100/N-66.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #267 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruits100/N-66.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #268 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruits100/N-66.html
expectedResult = 0.06521739130434782;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-66.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #268 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruits100/N-66.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #268 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruits100/N-66.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #269 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits100/N-66.html
expectedResult = 0.043478260869565216;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-66.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #269 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits100/N-66.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #269 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits100/N-66.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #270 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-66.html
expectedResult = 0.021739130434782608;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-66.html", "strawberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #270 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-66.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #270 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-66.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #271 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-66.html
expectedResult = 0.15217391304347827;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-66.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #271 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-66.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #271 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-66.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #272 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits100/N-66.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-66.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #272 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits100/N-66.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #272 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits100/N-66.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #273 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits100/N-11.html
expectedResult = 0.045454545454545456;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-11.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #273 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits100/N-11.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #273 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits100/N-11.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #274 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits100/N-11.html
expectedResult = 0.045454545454545456;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-11.html", "kiwi");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #274 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits100/N-11.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #274 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits100/N-11.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #275 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits100/N-11.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-11.html", "apricot");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #275 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits100/N-11.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #275 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits100/N-11.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #276 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-11.html
expectedResult = 0.13636363636363635;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-11.html", "blueberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #276 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-11.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #276 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-11.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #277 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits100/N-11.html
expectedResult = 0.09090909090909091;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-11.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #277 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits100/N-11.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #277 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits100/N-11.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #278 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruits100/N-11.html
expectedResult = 0.045454545454545456;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-11.html", "lime");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #278 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruits100/N-11.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #278 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruits100/N-11.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #279 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruits100/N-11.html
expectedResult = 0.045454545454545456;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-11.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #279 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruits100/N-11.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #279 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruits100/N-11.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #280 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits100/N-11.html
expectedResult = 0.09090909090909091;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-11.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #280 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits100/N-11.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #280 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits100/N-11.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #281 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-11.html
expectedResult = 0.09090909090909091;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-11.html", "strawberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #281 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-11.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #281 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-11.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #282 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-11.html
expectedResult = 0.045454545454545456;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-11.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #282 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-11.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #282 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-11.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #283 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits100/N-11.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-11.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #283 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits100/N-11.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #283 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits100/N-11.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #284 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits100/N-71.html
expectedResult = 0.03076923076923077;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-71.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #284 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits100/N-71.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #284 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits100/N-71.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #285 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits100/N-71.html
expectedResult = 0.07692307692307693;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-71.html", "kiwi");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #285 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits100/N-71.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #285 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits100/N-71.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #286 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits100/N-71.html
expectedResult = 0.07692307692307693;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-71.html", "apricot");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #286 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits100/N-71.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #286 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits100/N-71.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #287 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-71.html
expectedResult = 0.06153846153846154;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-71.html", "blueberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #287 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-71.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #287 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-71.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #288 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits100/N-71.html
expectedResult = 0.12307692307692308;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-71.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #288 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits100/N-71.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #288 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits100/N-71.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #289 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruits100/N-71.html
expectedResult = 0.06153846153846154;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-71.html", "lime");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #289 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruits100/N-71.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #289 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruits100/N-71.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #290 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruits100/N-71.html
expectedResult = 0.1076923076923077;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-71.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #290 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruits100/N-71.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #290 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruits100/N-71.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #291 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits100/N-71.html
expectedResult = 0.09230769230769231;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-71.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #291 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits100/N-71.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #291 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits100/N-71.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #292 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-71.html
expectedResult = 0.16923076923076924;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-71.html", "strawberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #292 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-71.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #292 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-71.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #293 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-71.html
expectedResult = 0.07692307692307693;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-71.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #293 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-71.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #293 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-71.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #294 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits100/N-71.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-71.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #294 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits100/N-71.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #294 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits100/N-71.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #295 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits100/N-37.html
expectedResult = 0.125;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-37.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #295 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits100/N-37.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #295 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits100/N-37.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #296 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits100/N-37.html
expectedResult = 0.125;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-37.html", "kiwi");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #296 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits100/N-37.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #296 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits100/N-37.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #297 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits100/N-37.html
expectedResult = 0.1875;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-37.html", "apricot");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #297 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits100/N-37.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #297 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits100/N-37.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #298 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-37.html
expectedResult = 0.0625;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-37.html", "blueberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #298 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-37.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #298 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-37.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #299 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits100/N-37.html
expectedResult = 0.125;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-37.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #299 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits100/N-37.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #299 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits100/N-37.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #300 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruits100/N-37.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-37.html", "lime");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #300 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruits100/N-37.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #300 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruits100/N-37.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #301 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruits100/N-37.html
expectedResult = 0.0625;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-37.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #301 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruits100/N-37.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #301 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruits100/N-37.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #302 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits100/N-37.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-37.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #302 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits100/N-37.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #302 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits100/N-37.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #303 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-37.html
expectedResult = 0.1875;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-37.html", "strawberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #303 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-37.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #303 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-37.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #304 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-37.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-37.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #304 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-37.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #304 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-37.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #305 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits100/N-37.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-37.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #305 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits100/N-37.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #305 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits100/N-37.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #306 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits100/N-34.html
expectedResult = 0.05454545454545454;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-34.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #306 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits100/N-34.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #306 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits100/N-34.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #307 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits100/N-34.html
expectedResult = 0.12727272727272726;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-34.html", "kiwi");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #307 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits100/N-34.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #307 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits100/N-34.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #308 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits100/N-34.html
expectedResult = 0.05454545454545454;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-34.html", "apricot");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #308 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits100/N-34.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #308 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits100/N-34.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #309 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-34.html
expectedResult = 0.05454545454545454;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-34.html", "blueberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #309 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-34.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #309 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-34.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #310 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits100/N-34.html
expectedResult = 0.07272727272727272;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-34.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #310 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits100/N-34.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #310 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits100/N-34.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #311 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruits100/N-34.html
expectedResult = 0.07272727272727272;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-34.html", "lime");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #311 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruits100/N-34.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #311 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruits100/N-34.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #312 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruits100/N-34.html
expectedResult = 0.12727272727272726;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-34.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #312 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruits100/N-34.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #312 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruits100/N-34.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #313 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits100/N-34.html
expectedResult = 0.07272727272727272;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-34.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #313 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits100/N-34.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #313 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits100/N-34.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #314 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-34.html
expectedResult = 0.05454545454545454;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-34.html", "strawberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #314 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-34.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #314 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-34.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #315 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-34.html
expectedResult = 0.05454545454545454;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-34.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #315 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-34.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #315 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-34.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #316 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits100/N-34.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-34.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #316 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits100/N-34.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #316 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits100/N-34.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #317 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits100/N-8.html
expectedResult = 0.06;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-8.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #317 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits100/N-8.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #317 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits100/N-8.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #318 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits100/N-8.html
expectedResult = 0.12;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-8.html", "kiwi");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #318 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits100/N-8.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #318 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits100/N-8.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #319 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits100/N-8.html
expectedResult = 0.04;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-8.html", "apricot");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #319 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits100/N-8.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #319 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits100/N-8.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #320 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-8.html
expectedResult = 0.04;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-8.html", "blueberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #320 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-8.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #320 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-8.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #321 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits100/N-8.html
expectedResult = 0.1;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-8.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #321 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits100/N-8.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #321 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits100/N-8.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #322 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruits100/N-8.html
expectedResult = 0.06;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-8.html", "lime");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #322 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruits100/N-8.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #322 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruits100/N-8.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #323 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruits100/N-8.html
expectedResult = 0.04;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-8.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #323 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruits100/N-8.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #323 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruits100/N-8.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #324 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits100/N-8.html
expectedResult = 0.1;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-8.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #324 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits100/N-8.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #324 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits100/N-8.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #325 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-8.html
expectedResult = 0.06;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-8.html", "strawberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #325 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-8.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #325 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-8.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #326 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-8.html
expectedResult = 0.12;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-8.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #326 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-8.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #326 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-8.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #327 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits100/N-8.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-8.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #327 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits100/N-8.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #327 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits100/N-8.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #328 checking TF for banana in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #328 checking TF for banana in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #328 checking TF for banana in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #329 checking TF for kiwi in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "kiwi");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #329 checking TF for kiwi in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #329 checking TF for kiwi in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #330 checking TF for apricot in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "apricot");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #330 checking TF for apricot in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #330 checking TF for apricot in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #331 checking TF for blueberry in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "blueberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #331 checking TF for blueberry in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #331 checking TF for blueberry in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #332 checking TF for fig in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #332 checking TF for fig in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #332 checking TF for fig in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #333 checking TF for lime in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "lime");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #333 checking TF for lime in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #333 checking TF for lime in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #334 checking TF for apple in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #334 checking TF for apple in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #334 checking TF for apple in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #335 checking TF for papaya in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #335 checking TF for papaya in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #335 checking TF for papaya in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #336 checking TF for strawberry in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "strawberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #336 checking TF for strawberry in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #336 checking TF for strawberry in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #337 checking TF for cherry in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #337 checking TF for cherry in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #337 checking TF for cherry in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #338 checking TF for tomato in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #338 checking TF for tomato in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #338 checking TF for tomato in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

failOut.close();
passOut.close();
}
}
