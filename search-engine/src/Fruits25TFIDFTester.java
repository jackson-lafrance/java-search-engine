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
//Test #214 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruits25/N-0.html
expectedResult = 0.005151009376339124;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-0.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #214 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruits25/N-0.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #214 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruits25/N-0.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #215 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits25/N-0.html
expectedResult = 0.01680838953287179;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-0.html", "apricot");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #215 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits25/N-0.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #215 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits25/N-0.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #216 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruits25/N-0.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-0.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #216 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruits25/N-0.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #216 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruits25/N-0.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #217 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-0.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-0.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #217 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-0.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #217 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-0.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #218 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-0.html
expectedResult = -0.0025119759120189513;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-0.html", "strawberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #218 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-0.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #218 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-0.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #219 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruits25/N-0.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-0.html", "peach");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #219 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruits25/N-0.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #219 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruits25/N-0.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #220 checking TFIDF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits25/N-0.html
expectedResult = 0.005340356569797789;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-0.html", "kiwi");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #220 checking TFIDF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits25/N-0.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #220 checking TFIDF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits25/N-0.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #221 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits25/N-0.html
expectedResult = 0.015552001456108683;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-0.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #221 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits25/N-0.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #221 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits25/N-0.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #222 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits25/N-0.html
expectedResult = 0.02044099783798403;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-0.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #222 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits25/N-0.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #222 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits25/N-0.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #223 checking TFIDF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-0.html
expectedResult = 0.005151009376339124;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-0.html", "blueberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #223 checking TFIDF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-0.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #223 checking TFIDF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-0.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #224 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits25/N-0.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-0.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #224 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits25/N-0.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #224 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits25/N-0.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #225 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruits25/N-19.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-19.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #225 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruits25/N-19.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #225 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruits25/N-19.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #226 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits25/N-19.html
expectedResult = 0.005483556310194886;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-19.html", "apricot");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #226 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits25/N-19.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #226 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits25/N-19.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #227 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruits25/N-19.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-19.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #227 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruits25/N-19.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #227 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruits25/N-19.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #228 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-19.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-19.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #228 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-19.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #228 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-19.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #229 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-19.html
expectedResult = -0.019297072114299024;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-19.html", "strawberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #229 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-19.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #229 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-19.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #230 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruits25/N-19.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-19.html", "peach");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #230 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruits25/N-19.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #230 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruits25/N-19.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #231 checking TFIDF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits25/N-19.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-19.html", "kiwi");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #231 checking TFIDF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits25/N-19.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #231 checking TFIDF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits25/N-19.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #232 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits25/N-19.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-19.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #232 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits25/N-19.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #232 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits25/N-19.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #233 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits25/N-19.html
expectedResult = 0.02172179992016925;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-19.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #233 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits25/N-19.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #233 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits25/N-19.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #234 checking TFIDF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-19.html
expectedResult = 0.010634565686534009;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-19.html", "blueberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #234 checking TFIDF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-19.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #234 checking TFIDF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-19.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #235 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits25/N-19.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-19.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #235 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits25/N-19.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #235 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits25/N-19.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #236 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruits25/N-21.html
expectedResult = 0.006391405612200936;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-21.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #236 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruits25/N-21.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #236 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruits25/N-21.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #237 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits25/N-21.html
expectedResult = 0.007613953799864098;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-21.html", "apricot");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #237 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits25/N-21.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #237 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits25/N-21.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #238 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruits25/N-21.html
expectedResult = 0.020014576399236126;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-21.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #238 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruits25/N-21.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #238 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruits25/N-21.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #239 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-21.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-21.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #239 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-21.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #239 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-21.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #240 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-21.html
expectedResult = -0.004948956158891671;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-21.html", "strawberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #240 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-21.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #240 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-21.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #241 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruits25/N-21.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-21.html", "peach");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #241 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruits25/N-21.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #241 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruits25/N-21.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #242 checking TFIDF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits25/N-21.html
expectedResult = 0.005340356569797789;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-21.html", "kiwi");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #242 checking TFIDF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits25/N-21.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #242 checking TFIDF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits25/N-21.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #243 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits25/N-21.html
expectedResult = 0.02044099783798403;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-21.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #243 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits25/N-21.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #243 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits25/N-21.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #244 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits25/N-21.html
expectedResult = 0.010521275466983447;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-21.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #244 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits25/N-21.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #244 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits25/N-21.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #245 checking TFIDF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-21.html
expectedResult = 0.008819160292776325;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-21.html", "blueberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #245 checking TFIDF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-21.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #245 checking TFIDF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-21.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #246 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits25/N-21.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-21.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #246 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits25/N-21.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #246 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits25/N-21.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #247 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html
expectedResult = 0.0042140355055771865;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #247 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #247 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #248 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html
expectedResult = 0.009526117220462484;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html", "apricot");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #248 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #248 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #249 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html
expectedResult = 0.025768679616493564;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #249 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #249 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #250 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #250 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #250 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #251 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html
expectedResult = -0.007906120128413793;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html", "strawberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #251 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #251 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #252 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html", "peach");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #252 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #252 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #253 checking TFIDF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html
expectedResult = 0.014117364448464627;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html", "kiwi");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #253 checking TFIDF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #253 checking TFIDF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #254 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html
expectedResult = 0.008607444705009883;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #254 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #254 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #255 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html
expectedResult = 0.011384270255879295;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #255 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #255 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #256 checking TFIDF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html
expectedResult = 0.006911583759158722;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html", "blueberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #256 checking TFIDF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #256 checking TFIDF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #257 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #257 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #257 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #258 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruits25/N-18.html
expectedResult = 0.008564935084106788;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-18.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #258 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruits25/N-18.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #258 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruits25/N-18.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #259 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits25/N-18.html
expectedResult = 0.010861443346405389;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-18.html", "apricot");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #259 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits25/N-18.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #259 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits25/N-18.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #260 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruits25/N-18.html
expectedResult = 0.019429681870009544;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-18.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #260 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruits25/N-18.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #260 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruits25/N-18.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #261 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-18.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-18.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #261 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-18.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #261 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-18.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #262 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-18.html
expectedResult = -0.005961244472256034;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-18.html", "strawberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #262 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-18.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #262 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-18.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #263 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruits25/N-18.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-18.html", "peach");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #263 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruits25/N-18.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #263 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruits25/N-18.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #264 checking TFIDF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits25/N-18.html
expectedResult = 0.010211644886310885;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-18.html", "kiwi");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #264 checking TFIDF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits25/N-18.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #264 checking TFIDF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits25/N-18.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #265 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits25/N-18.html
expectedResult = 0.012673358422452536;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-18.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #265 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits25/N-18.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #265 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits25/N-18.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #266 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits25/N-18.html
expectedResult = 0.007714509797962978;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-18.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #266 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits25/N-18.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #266 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits25/N-18.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #267 checking TFIDF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-18.html
expectedResult = 0.0062046268314725535;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-18.html", "blueberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #267 checking TFIDF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-18.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #267 checking TFIDF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-18.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #268 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits25/N-18.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-18.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #268 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits25/N-18.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #268 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits25/N-18.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #269 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html
expectedResult = 0.01041698392067085;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #269 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #269 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #270 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html
expectedResult = 0.007084571195508225;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html", "apricot");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #270 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #270 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #271 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #271 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #271 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #272 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #272 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #272 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #273 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html
expectedResult = -0.006806672185876574;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html", "strawberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #273 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #273 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #274 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html", "peach");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #274 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #274 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #275 checking TFIDF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html
expectedResult = 0.00738613147022325;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html", "kiwi");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #275 checking TFIDF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #275 checking TFIDF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #276 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #276 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #276 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #277 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html
expectedResult = 0.00738613147022325;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #277 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #277 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #278 checking TFIDF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html
expectedResult = 0.003616104585169806;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html", "blueberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #278 checking TFIDF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #278 checking TFIDF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #279 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #279 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #279 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #280 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruits25/N-15.html
expectedResult = 0.010928056939105799;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-15.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #280 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruits25/N-15.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #280 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruits25/N-15.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #281 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits25/N-15.html
expectedResult = 0.007946500733719867;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-15.html", "apricot");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #281 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits25/N-15.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #281 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits25/N-15.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #282 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruits25/N-15.html
expectedResult = 0.015208048528470469;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-15.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #282 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruits25/N-15.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #282 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruits25/N-15.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #283 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-15.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-15.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #283 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-15.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #283 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-15.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #284 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-15.html
expectedResult = -0.006163891102850861;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-15.html", "strawberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #284 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-15.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #284 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-15.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #285 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruits25/N-15.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-15.html", "peach");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #285 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruits25/N-15.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #285 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruits25/N-15.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #286 checking TFIDF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits25/N-15.html
expectedResult = 0.006675742044297133;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-15.html", "kiwi");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #286 checking TFIDF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits25/N-15.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #286 checking TFIDF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits25/N-15.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #287 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits25/N-15.html
expectedResult = 0.006675742044297133;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-15.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #287 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits25/N-15.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #287 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits25/N-15.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #288 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits25/N-15.html
expectedResult = 0.016231250442311055;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-15.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #288 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits25/N-15.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #288 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits25/N-15.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #289 checking TFIDF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-15.html
expectedResult = 0.006415547005497948;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-15.html", "blueberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #289 checking TFIDF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-15.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #289 checking TFIDF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-15.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #290 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits25/N-15.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-15.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #290 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits25/N-15.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #290 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits25/N-15.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #291 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruits25/N-12.html
expectedResult = 0.003332412725162628;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-12.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #291 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruits25/N-12.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #291 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruits25/N-12.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #292 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits25/N-12.html
expectedResult = 0.008098089771498661;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-12.html", "apricot");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #292 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits25/N-12.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #292 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits25/N-12.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #293 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruits25/N-12.html
expectedResult = 0.034862481993596706;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-12.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #293 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruits25/N-12.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #293 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruits25/N-12.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #294 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-12.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-12.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #294 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-12.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #294 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-12.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #295 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-12.html
expectedResult = -0.004756652711256472;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-12.html", "strawberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #295 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-12.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #295 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-12.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #296 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruits25/N-12.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-12.html", "peach");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #296 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruits25/N-12.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #296 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruits25/N-12.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #297 checking TFIDF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits25/N-12.html
expectedResult = 0.013356426642475827;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-12.html", "kiwi");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #297 checking TFIDF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits25/N-12.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #297 checking TFIDF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits25/N-12.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #298 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits25/N-12.html
expectedResult = 0.013356426642475827;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-12.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #298 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits25/N-12.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #298 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits25/N-12.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #299 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits25/N-12.html
expectedResult = 0.013356426642475827;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-12.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #299 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits25/N-12.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #299 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits25/N-12.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #300 checking TFIDF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-12.html
expectedResult = 0.0016825427660007034;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-12.html", "blueberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #300 checking TFIDF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-12.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #300 checking TFIDF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-12.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #301 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits25/N-12.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-12.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #301 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits25/N-12.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #301 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits25/N-12.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #302 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html
expectedResult = 0.009112184387632517;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #302 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #302 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #303 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html
expectedResult = 0.006182044603263281;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html", "apricot");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #303 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #303 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #304 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html
expectedResult = 0.019358966011999115;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #304 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #304 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #305 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #305 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #305 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #306 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html
expectedResult = -0.010126762052570605;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html", "strawberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #306 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #306 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #307 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html", "peach");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #307 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #307 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #308 checking TFIDF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html
expectedResult = 0.009555508398013921;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html", "kiwi");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #308 checking TFIDF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #308 checking TFIDF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #309 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html
expectedResult = 0.00642843470721124;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #309 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #309 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #310 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html
expectedResult = 0.009555508398013921;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #310 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #310 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #311 checking TFIDF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html
expectedResult = 0.007659745034137227;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html", "blueberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #311 checking TFIDF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #311 checking TFIDF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #312 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #312 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #312 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #313 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruits25/N-1.html
expectedResult = 0.006539043587032328;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-1.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #313 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruits25/N-1.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #313 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruits25/N-1.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #314 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits25/N-1.html
expectedResult = 0.00962904349972057;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-1.html", "apricot");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #314 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits25/N-1.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #314 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits25/N-1.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #315 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruits25/N-1.html
expectedResult = 0.02047690217011985;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-1.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #315 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruits25/N-1.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #315 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruits25/N-1.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #316 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-1.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-1.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #316 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-1.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #316 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-1.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #317 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-1.html
expectedResult = -0.006282543414103496;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-1.html", "strawberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #317 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-1.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #317 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-1.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #318 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruits25/N-1.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-1.html", "peach");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #318 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruits25/N-1.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #318 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruits25/N-1.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #319 checking TFIDF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits25/N-1.html
expectedResult = 0.0068066721858765855;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-1.html", "kiwi");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #319 checking TFIDF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits25/N-1.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #319 checking TFIDF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits25/N-1.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #320 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits25/N-1.html
expectedResult = 0.013356426642475827;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-1.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #320 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits25/N-1.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #320 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits25/N-1.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #321 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits25/N-1.html
expectedResult = 0.013356426642475827;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-1.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #321 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits25/N-1.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #321 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits25/N-1.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #322 checking TFIDF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-1.html
expectedResult = 0.003332412725162628;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-1.html", "blueberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #322 checking TFIDF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-1.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #322 checking TFIDF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-1.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #323 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits25/N-1.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-1.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #323 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits25/N-1.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #323 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits25/N-1.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #324 checking TFIDF for pear in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #324 checking TFIDF for pear in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #324 checking TFIDF for pear in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
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

//Test #326 checking TFIDF for banana in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #326 checking TFIDF for banana in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #326 checking TFIDF for banana in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #327 checking TFIDF for cherry in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #327 checking TFIDF for cherry in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #327 checking TFIDF for cherry in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #328 checking TFIDF for strawberry in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "strawberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #328 checking TFIDF for strawberry in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #328 checking TFIDF for strawberry in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #329 checking TFIDF for peach in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "peach");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #329 checking TFIDF for peach in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #329 checking TFIDF for peach in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #330 checking TFIDF for kiwi in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "kiwi");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #330 checking TFIDF for kiwi in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #330 checking TFIDF for kiwi in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #331 checking TFIDF for coconut in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #331 checking TFIDF for coconut in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #331 checking TFIDF for coconut in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #332 checking TFIDF for apple in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #332 checking TFIDF for apple in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #332 checking TFIDF for apple in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #333 checking TFIDF for blueberry in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "blueberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #333 checking TFIDF for blueberry in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #333 checking TFIDF for blueberry in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
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
