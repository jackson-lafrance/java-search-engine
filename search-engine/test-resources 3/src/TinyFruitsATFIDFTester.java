import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.*;
public class TinyFruitsATFIDFTester {public static void main(String[] args) throws Exception{
ProjectTester tester = new ProjectTesterImp(); //Instantiate your own ProjectTester instance here
tester.initialize();
tester.crawl("https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-0.html");
runTest(tester);}public static void runTest(ProjectTester tester) throws Exception{
PrintWriter failOut = new PrintWriter(new FileWriter("TinyFruitsA-TFIDF-failed.txt"));
PrintWriter passOut = new PrintWriter(new FileWriter("TinyFruitsA-TFIDF-passed.txt"));
double expectedResult;
double yourResult;
//Test #169 checking TFIDF for kiwi in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-3.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-3.html", "kiwi");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #169 checking TFIDF for kiwi in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-3.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #169 checking TFIDF for kiwi in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-3.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #170 checking TFIDF for blueberry in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-3.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-3.html", "blueberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #170 checking TFIDF for blueberry in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-3.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #170 checking TFIDF for blueberry in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-3.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #171 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-3.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-3.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #171 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-3.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #171 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-3.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #172 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-3.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-3.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #172 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-3.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #172 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-3.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #173 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-3.html
expectedResult = 0.0412387465741404;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-3.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #173 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-3.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #173 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-3.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #174 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-3.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-3.html", "strawberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #174 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-3.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #174 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-3.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #175 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-3.html
expectedResult = 0.021587328068596676;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-3.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #175 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-3.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #175 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-3.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #176 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-3.html
expectedResult = 0.014625025556204782;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-3.html", "apricot");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #176 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-3.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #176 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-3.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #177 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-3.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-3.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #177 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-3.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #177 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-3.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #178 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-3.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-3.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #178 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-3.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #178 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-3.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #179 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-3.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-3.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #179 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-3.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #179 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-3.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #180 checking TFIDF for kiwi in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-0.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-0.html", "kiwi");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #180 checking TFIDF for kiwi in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-0.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #180 checking TFIDF for kiwi in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-0.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #181 checking TFIDF for blueberry in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-0.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-0.html", "blueberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #181 checking TFIDF for blueberry in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-0.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #181 checking TFIDF for blueberry in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-0.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #182 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-0.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-0.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #182 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-0.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #182 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-0.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #183 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-0.html
expectedResult = 0.0404119177187868;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-0.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #183 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-0.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #183 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-0.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #184 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-0.html
expectedResult = 0.009748009671471615;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-0.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #184 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-0.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #184 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-0.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #185 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-0.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-0.html", "strawberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #185 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-0.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #185 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-0.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #186 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-0.html
expectedResult = 0.01908108239963235;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-0.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #186 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-0.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #186 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-0.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #187 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-0.html
expectedResult = 0.01908108239963235;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-0.html", "apricot");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #187 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-0.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #187 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-0.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #188 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-0.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-0.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #188 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-0.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #188 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-0.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #189 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-0.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-0.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #189 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-0.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #189 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-0.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #190 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-0.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-0.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #190 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-0.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #190 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-0.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #191 checking TFIDF for kiwi in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-3.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-3.html", "kiwi");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #191 checking TFIDF for kiwi in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-3.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #191 checking TFIDF for kiwi in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-3.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #192 checking TFIDF for blueberry in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-3.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-3.html", "blueberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #192 checking TFIDF for blueberry in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-3.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #192 checking TFIDF for blueberry in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-3.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #193 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-3.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-3.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #193 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-3.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #193 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-3.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #194 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-3.html
expectedResult = 0.02266030222847964;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-3.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #194 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-3.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #194 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-3.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #195 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-3.html
expectedResult = 0.030648970641056626;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-3.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #195 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-3.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #195 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-3.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #196 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-3.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-3.html", "strawberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #196 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-3.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #196 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-3.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #197 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-3.html
expectedResult = 0.039982043369217374;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-3.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #197 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-3.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #197 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-3.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #198 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-3.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-3.html", "apricot");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #198 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-3.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #198 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-3.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #199 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-3.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-3.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #199 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-3.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #199 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-3.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #200 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-3.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-3.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #200 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-3.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #200 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-3.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #201 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-3.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-3.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #201 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-3.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #201 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-3.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #202 checking TFIDF for kiwi in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-4.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-4.html", "kiwi");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #202 checking TFIDF for kiwi in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-4.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #202 checking TFIDF for kiwi in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-4.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #203 checking TFIDF for blueberry in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-4.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-4.html", "blueberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #203 checking TFIDF for blueberry in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-4.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #203 checking TFIDF for blueberry in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-4.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #204 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-4.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-4.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #204 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-4.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #204 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-4.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #205 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-4.html
expectedResult = 0.02997453317184664;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-4.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #205 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-4.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #205 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-4.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #206 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-4.html
expectedResult = 0.007190614983939457;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-4.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #206 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-4.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #206 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-4.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #207 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-4.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-4.html", "strawberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #207 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-4.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #207 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-4.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #208 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-4.html
expectedResult = 0.007190614983939457;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-4.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #208 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-4.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #208 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-4.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #209 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-4.html
expectedResult = 0.014152917496331312;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-4.html", "apricot");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #209 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-4.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #209 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-4.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #210 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-4.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-4.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #210 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-4.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #210 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-4.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #211 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-4.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-4.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #211 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-4.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #211 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-4.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #212 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-4.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-4.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #212 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-4.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #212 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-4.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #213 checking TFIDF for kiwi in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-0.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-0.html", "kiwi");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #213 checking TFIDF for kiwi in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-0.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #213 checking TFIDF for kiwi in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-0.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #214 checking TFIDF for blueberry in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-0.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-0.html", "blueberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #214 checking TFIDF for blueberry in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-0.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #214 checking TFIDF for blueberry in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-0.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #215 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-0.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-0.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #215 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-0.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #215 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-0.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #216 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-0.html
expectedResult = 0.019354636558164728;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-0.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #216 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-0.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #216 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-0.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #217 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-0.html
expectedResult = 0.013568911534362437;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-0.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #217 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-0.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #217 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-0.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #218 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-0.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-0.html", "strawberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #218 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-0.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #218 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-0.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #219 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-0.html
expectedResult = 0.009138576831497242;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-0.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #219 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-0.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #219 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-0.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #220 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-0.html
expectedResult = 0.017911511045374046;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-0.html", "apricot");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #220 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-0.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #220 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-0.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #221 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-0.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-0.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #221 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-0.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #221 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-0.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #222 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-0.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-0.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #222 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-0.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #222 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-0.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #223 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-0.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-0.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #223 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-0.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #223 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-0.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #224 checking TFIDF for kiwi in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-4.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-4.html", "kiwi");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #224 checking TFIDF for kiwi in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-4.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #224 checking TFIDF for kiwi in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-4.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #225 checking TFIDF for blueberry in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-4.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-4.html", "blueberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #225 checking TFIDF for blueberry in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-4.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #225 checking TFIDF for blueberry in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-4.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #226 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-4.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-4.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #226 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-4.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #226 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-4.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #227 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-4.html
expectedResult = 0.04893406628975068;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-4.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #227 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-4.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #227 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-4.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #228 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-4.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-4.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #228 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-4.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #228 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-4.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #229 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-4.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-4.html", "strawberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #229 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-4.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #229 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-4.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #230 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-4.html
expectedResult = 0.017552894270256875;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-4.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #230 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-4.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #230 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-4.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #231 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-4.html
expectedResult = 0.017552894270256875;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-4.html", "apricot");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #231 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-4.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #231 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-4.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #232 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-4.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-4.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #232 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-4.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #232 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-4.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #233 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-4.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-4.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #233 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-4.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #233 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-4.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #234 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-4.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-4.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #234 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-4.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #234 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-4.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #235 checking TFIDF for kiwi in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-1.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-1.html", "kiwi");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #235 checking TFIDF for kiwi in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-1.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #235 checking TFIDF for kiwi in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-1.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #236 checking TFIDF for blueberry in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-1.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-1.html", "blueberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #236 checking TFIDF for blueberry in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-1.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #236 checking TFIDF for blueberry in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-1.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #237 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-1.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-1.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #237 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-1.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #237 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-1.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #238 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-1.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-1.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #238 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-1.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #238 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-1.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #239 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-1.html
expectedResult = 0.014625025556204782;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-1.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #239 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-1.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #239 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-1.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #240 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-1.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-1.html", "strawberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #240 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-1.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #240 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-1.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #241 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-1.html
expectedResult = 0.021587328068596676;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-1.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #241 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-1.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #241 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-1.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #242 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-1.html
expectedResult = 0.014625025556204782;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-1.html", "apricot");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #242 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-1.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #242 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-1.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #243 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-1.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-1.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #243 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-1.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #243 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-1.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #244 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-1.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-1.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #244 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-1.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #244 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-1.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #245 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-1.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-1.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #245 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-1.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #245 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-1.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #246 checking TFIDF for kiwi in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-1.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-1.html", "kiwi");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #246 checking TFIDF for kiwi in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-1.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #246 checking TFIDF for kiwi in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-1.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #247 checking TFIDF for blueberry in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-1.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-1.html", "blueberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #247 checking TFIDF for blueberry in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-1.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #247 checking TFIDF for blueberry in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-1.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #248 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-1.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-1.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #248 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-1.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #248 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-1.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #249 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-1.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-1.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #249 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-1.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #249 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-1.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #250 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-1.html
expectedResult = 0.014152917496331312;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-1.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #250 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-1.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #250 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-1.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #251 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-1.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-1.html", "strawberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #251 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-1.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #251 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-1.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #252 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-1.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-1.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #252 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-1.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #252 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-1.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #253 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-1.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-1.html", "apricot");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #253 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-1.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #253 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-1.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #254 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-1.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-1.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #254 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-1.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #254 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-1.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #255 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-1.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-1.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #255 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-1.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #255 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-1.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #256 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-1.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-1.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #256 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-1.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #256 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-1.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #257 checking TFIDF for kiwi in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-2.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-2.html", "kiwi");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #257 checking TFIDF for kiwi in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-2.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #257 checking TFIDF for kiwi in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-2.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #258 checking TFIDF for blueberry in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-2.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-2.html", "blueberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #258 checking TFIDF for blueberry in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-2.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #258 checking TFIDF for blueberry in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-2.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #259 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-2.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-2.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #259 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-2.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #259 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-2.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #260 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-2.html
expectedResult = 0.02997453317184664;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-2.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #260 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-2.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #260 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-2.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #261 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-2.html
expectedResult = 0.014152917496331312;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-2.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #261 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-2.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #261 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-2.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #262 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-2.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-2.html", "strawberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #262 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-2.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #262 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-2.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #263 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-2.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-2.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #263 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-2.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #263 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-2.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #264 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-2.html
expectedResult = 0.014152917496331312;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-2.html", "apricot");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #264 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-2.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #264 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-2.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #265 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-2.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-2.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #265 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-2.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #265 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-2.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #266 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-2.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-2.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #266 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-2.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #266 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-2.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #267 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-2.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-2.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #267 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-2.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #267 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-2.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #268 checking TFIDF for kiwi in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-2.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-2.html", "kiwi");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #268 checking TFIDF for kiwi in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-2.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #268 checking TFIDF for kiwi in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-2.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #269 checking TFIDF for blueberry in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-2.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-2.html", "blueberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #269 checking TFIDF for blueberry in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-2.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #269 checking TFIDF for blueberry in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-2.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #270 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-2.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-2.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #270 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-2.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #270 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-2.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #271 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-2.html
expectedResult = 0.032043329759576286;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-2.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #271 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-2.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #271 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-2.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #272 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-2.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-2.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #272 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-2.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #272 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-2.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #273 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-2.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-2.html", "strawberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #273 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-2.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #273 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-2.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #274 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-2.html
expectedResult = 0.010201565384574599;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-2.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #274 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-2.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #274 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-2.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #275 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-2.html
expectedResult = 0.024665759170377815;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-2.html", "apricot");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #275 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-2.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #275 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-2.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #276 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-2.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-2.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #276 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-2.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #276 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-2.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #277 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-2.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-2.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #277 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-2.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #277 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-2.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #278 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-2.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-2.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #278 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-2.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #278 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-2.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #279 checking TFIDF for kiwi in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "kiwi");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #279 checking TFIDF for kiwi in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #279 checking TFIDF for kiwi in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #280 checking TFIDF for blueberry in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "blueberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #280 checking TFIDF for blueberry in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #280 checking TFIDF for blueberry in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #281 checking TFIDF for cherry in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #281 checking TFIDF for cherry in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #281 checking TFIDF for cherry in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #282 checking TFIDF for coconut in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #282 checking TFIDF for coconut in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #282 checking TFIDF for coconut in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #283 checking TFIDF for papaya in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #283 checking TFIDF for papaya in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #283 checking TFIDF for papaya in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #284 checking TFIDF for strawberry in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "strawberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #284 checking TFIDF for strawberry in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #284 checking TFIDF for strawberry in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #285 checking TFIDF for banana in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #285 checking TFIDF for banana in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #285 checking TFIDF for banana in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #286 checking TFIDF for apricot in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "apricot");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #286 checking TFIDF for apricot in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #286 checking TFIDF for apricot in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #287 checking TFIDF for apple in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #287 checking TFIDF for apple in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #287 checking TFIDF for apple in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #288 checking TFIDF for fig in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #288 checking TFIDF for fig in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #288 checking TFIDF for fig in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #289 checking TFIDF for tomato in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #289 checking TFIDF for tomato in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #289 checking TFIDF for tomato in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

failOut.close();
passOut.close();
}
}
