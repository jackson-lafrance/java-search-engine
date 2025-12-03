import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.*;
public class FruitsATFTester {public static void main(String[] args) throws Exception{
ProjectTester tester = new ProjectTesterImp(); //Instantiate your own ProjectTester instance here
tester.initialize();
tester.crawl("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-0.html");
runTest(tester);}public static void runTest(ProjectTester tester) throws Exception{
PrintWriter failOut = new PrintWriter(new FileWriter("FruitsA-TF-failed.txt"));
PrintWriter passOut = new PrintWriter(new FileWriter("FruitsA-TF-passed.txt"));
double expectedResult;
double yourResult;
//Test #168 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-48.html
expectedResult = 0.10204081632653061;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-48.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #168 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-48.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #168 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-48.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #169 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-48.html
expectedResult = 0.061224489795918366;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-48.html", "kiwi");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #169 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-48.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #169 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-48.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #170 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-48.html
expectedResult = 0.12244897959183673;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-48.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #170 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-48.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #170 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-48.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #171 checking TF for coconut in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-48.html
expectedResult = 0.04081632653061224;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-48.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #171 checking TF for coconut in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-48.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #171 checking TF for coconut in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-48.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #172 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-48.html
expectedResult = 0.061224489795918366;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-48.html", "peach");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #172 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-48.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #172 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-48.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #173 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-48.html
expectedResult = 0.10204081632653061;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-48.html", "blueberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #173 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-48.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #173 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-48.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #174 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-48.html
expectedResult = 0.08163265306122448;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-48.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #174 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-48.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #174 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-48.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #175 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-48.html
expectedResult = 0.04081632653061224;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-48.html", "lime");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #175 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-48.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #175 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-48.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #176 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-48.html
expectedResult = 0.02040816326530612;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-48.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #176 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-48.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #176 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-48.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #177 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-48.html
expectedResult = 0.08163265306122448;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-48.html", "apricot");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #177 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-48.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #177 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-48.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #178 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-48.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-48.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #178 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-48.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #178 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-48.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #179 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-1.html
expectedResult = 0.056338028169014086;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-1.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #179 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-1.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #179 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-1.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #180 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-1.html
expectedResult = 0.09859154929577464;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-1.html", "kiwi");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #180 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-1.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #180 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-1.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #181 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-1.html
expectedResult = 0.07042253521126761;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-1.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #181 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-1.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #181 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-1.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #182 checking TF for coconut in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-1.html
expectedResult = 0.09859154929577464;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-1.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #182 checking TF for coconut in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-1.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #182 checking TF for coconut in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-1.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #183 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-1.html
expectedResult = 0.09859154929577464;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-1.html", "peach");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #183 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-1.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #183 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-1.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #184 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-1.html
expectedResult = 0.07042253521126761;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-1.html", "blueberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #184 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-1.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #184 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-1.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #185 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-1.html
expectedResult = 0.04225352112676056;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-1.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #185 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-1.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #185 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-1.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #186 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-1.html
expectedResult = 0.09859154929577464;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-1.html", "lime");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #186 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-1.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #186 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-1.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #187 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-1.html
expectedResult = 0.07042253521126761;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-1.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #187 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-1.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #187 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-1.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #188 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-1.html
expectedResult = 0.056338028169014086;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-1.html", "apricot");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #188 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-1.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #188 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-1.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #189 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-1.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-1.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #189 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-1.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #189 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-1.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #190 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-21.html
expectedResult = 0.06666666666666667;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-21.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #190 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-21.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #190 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-21.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #191 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-21.html
expectedResult = 0.04;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-21.html", "kiwi");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #191 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-21.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #191 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-21.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #192 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-21.html
expectedResult = 0.06666666666666667;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-21.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #192 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-21.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #192 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-21.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #193 checking TF for coconut in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-21.html
expectedResult = 0.10666666666666667;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-21.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #193 checking TF for coconut in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-21.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #193 checking TF for coconut in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-21.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #194 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-21.html
expectedResult = 0.06666666666666667;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-21.html", "peach");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #194 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-21.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #194 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-21.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #195 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-21.html
expectedResult = 0.13333333333333333;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-21.html", "blueberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #195 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-21.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #195 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-21.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #196 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-21.html
expectedResult = 0.06666666666666667;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-21.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #196 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-21.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #196 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-21.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #197 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-21.html
expectedResult = 0.04;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-21.html", "lime");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #197 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-21.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #197 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-21.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #198 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-21.html
expectedResult = 0.05333333333333334;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-21.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #198 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-21.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #198 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-21.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #199 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-21.html
expectedResult = 0.10666666666666667;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-21.html", "apricot");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #199 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-21.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #199 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-21.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #200 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-21.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-21.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #200 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-21.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #200 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-21.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #201 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-45.html
expectedResult = 0.06779661016949153;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-45.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #201 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-45.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #201 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-45.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #202 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-45.html
expectedResult = 0.06779661016949153;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-45.html", "kiwi");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #202 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-45.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #202 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-45.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #203 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-45.html
expectedResult = 0.06779661016949153;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-45.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #203 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-45.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #203 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-45.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #204 checking TF for coconut in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-45.html
expectedResult = 0.0847457627118644;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-45.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #204 checking TF for coconut in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-45.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #204 checking TF for coconut in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-45.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #205 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-45.html
expectedResult = 0.0847457627118644;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-45.html", "peach");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #205 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-45.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #205 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-45.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #206 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-45.html
expectedResult = 0.05084745762711865;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-45.html", "blueberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #206 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-45.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #206 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-45.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #207 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-45.html
expectedResult = 0.06779661016949153;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-45.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #207 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-45.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #207 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-45.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #208 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-45.html
expectedResult = 0.05084745762711865;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-45.html", "lime");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #208 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-45.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #208 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-45.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #209 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-45.html
expectedResult = 0.1016949152542373;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-45.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #209 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-45.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #209 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-45.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #210 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-45.html
expectedResult = 0.11864406779661017;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-45.html", "apricot");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #210 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-45.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #210 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-45.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #211 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-45.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-45.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #211 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-45.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #211 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-45.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #212 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-30.html
expectedResult = 0.15151515151515152;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-30.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #212 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-30.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #212 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-30.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #213 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-30.html
expectedResult = 0.06060606060606061;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-30.html", "kiwi");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #213 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-30.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #213 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-30.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #214 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-30.html
expectedResult = 0.06060606060606061;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-30.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #214 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-30.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #214 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-30.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #215 checking TF for coconut in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-30.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-30.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #215 checking TF for coconut in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-30.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #215 checking TF for coconut in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-30.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #216 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-30.html
expectedResult = 0.15151515151515152;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-30.html", "peach");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #216 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-30.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #216 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-30.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #217 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-30.html
expectedResult = 0.030303030303030304;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-30.html", "blueberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #217 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-30.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #217 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-30.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #218 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-30.html
expectedResult = 0.06060606060606061;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-30.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #218 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-30.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #218 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-30.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #219 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-30.html
expectedResult = 0.09090909090909091;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-30.html", "lime");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #219 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-30.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #219 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-30.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #220 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-30.html
expectedResult = 0.09090909090909091;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-30.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #220 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-30.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #220 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-30.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #221 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-30.html
expectedResult = 0.09090909090909091;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-30.html", "apricot");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #221 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-30.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #221 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-30.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #222 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-30.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-30.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #222 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-30.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #222 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-30.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #223 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-17.html
expectedResult = 0.047619047619047616;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-17.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #223 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-17.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #223 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-17.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #224 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-17.html
expectedResult = 0.09523809523809523;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-17.html", "kiwi");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #224 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-17.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #224 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-17.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #225 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-17.html
expectedResult = 0.11904761904761904;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-17.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #225 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-17.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #225 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-17.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #226 checking TF for coconut in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-17.html
expectedResult = 0.07142857142857142;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-17.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #226 checking TF for coconut in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-17.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #226 checking TF for coconut in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-17.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #227 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-17.html
expectedResult = 0.16666666666666666;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-17.html", "peach");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #227 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-17.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #227 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-17.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #228 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-17.html
expectedResult = 0.21428571428571427;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-17.html", "blueberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #228 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-17.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #228 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-17.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #229 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-17.html
expectedResult = 0.09523809523809523;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-17.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #229 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-17.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #229 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-17.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #230 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-17.html
expectedResult = 0.023809523809523808;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-17.html", "lime");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #230 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-17.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #230 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-17.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #231 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-17.html
expectedResult = 0.047619047619047616;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-17.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #231 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-17.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #231 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-17.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #232 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-17.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-17.html", "apricot");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #232 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-17.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #232 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-17.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #233 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-17.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-17.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #233 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-17.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #233 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-17.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #234 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-29.html
expectedResult = 0.23809523809523808;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-29.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #234 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-29.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #234 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-29.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #235 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-29.html
expectedResult = 0.047619047619047616;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-29.html", "kiwi");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #235 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-29.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #235 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-29.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #236 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-29.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-29.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #236 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-29.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #236 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-29.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #237 checking TF for coconut in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-29.html
expectedResult = 0.047619047619047616;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-29.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #237 checking TF for coconut in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-29.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #237 checking TF for coconut in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-29.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #238 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-29.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-29.html", "peach");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #238 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-29.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #238 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-29.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #239 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-29.html
expectedResult = 0.047619047619047616;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-29.html", "blueberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #239 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-29.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #239 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-29.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #240 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-29.html
expectedResult = 0.09523809523809523;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-29.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #240 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-29.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #240 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-29.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #241 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-29.html
expectedResult = 0.14285714285714285;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-29.html", "lime");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #241 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-29.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #241 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-29.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #242 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-29.html
expectedResult = 0.14285714285714285;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-29.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #242 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-29.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #242 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-29.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #243 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-29.html
expectedResult = 0.047619047619047616;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-29.html", "apricot");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #243 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-29.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #243 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-29.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #244 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-29.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-29.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #244 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-29.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #244 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-29.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #245 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-19.html
expectedResult = 0.0784313725490196;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-19.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #245 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-19.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #245 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-19.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #246 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-19.html
expectedResult = 0.058823529411764705;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-19.html", "kiwi");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #246 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-19.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #246 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-19.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #247 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-19.html
expectedResult = 0.11764705882352941;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-19.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #247 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-19.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #247 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-19.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #248 checking TF for coconut in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-19.html
expectedResult = 0.0196078431372549;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-19.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #248 checking TF for coconut in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-19.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #248 checking TF for coconut in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-19.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #249 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-19.html
expectedResult = 0.0196078431372549;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-19.html", "peach");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #249 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-19.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #249 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-19.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #250 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-19.html
expectedResult = 0.11764705882352941;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-19.html", "blueberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #250 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-19.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #250 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-19.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #251 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-19.html
expectedResult = 0.058823529411764705;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-19.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #251 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-19.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #251 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-19.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #252 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-19.html
expectedResult = 0.058823529411764705;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-19.html", "lime");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #252 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-19.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #252 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-19.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #253 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-19.html
expectedResult = 0.0784313725490196;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-19.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #253 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-19.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #253 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-19.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #254 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-19.html
expectedResult = 0.13725490196078433;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-19.html", "apricot");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #254 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-19.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #254 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-19.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #255 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-19.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-19.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #255 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-19.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #255 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-19.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #256 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-9.html
expectedResult = 0.07142857142857142;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-9.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #256 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-9.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #256 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-9.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #257 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-9.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-9.html", "kiwi");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #257 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-9.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #257 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-9.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #258 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-9.html
expectedResult = 0.14285714285714285;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-9.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #258 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-9.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #258 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-9.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #259 checking TF for coconut in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-9.html
expectedResult = 0.03571428571428571;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-9.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #259 checking TF for coconut in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-9.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #259 checking TF for coconut in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-9.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #260 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-9.html
expectedResult = 0.07142857142857142;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-9.html", "peach");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #260 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-9.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #260 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-9.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #261 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-9.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-9.html", "blueberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #261 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-9.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #261 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-9.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #262 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-9.html
expectedResult = 0.10714285714285714;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-9.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #262 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-9.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #262 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-9.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #263 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-9.html
expectedResult = 0.10714285714285714;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-9.html", "lime");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #263 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-9.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #263 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-9.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #264 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-9.html
expectedResult = 0.21428571428571427;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-9.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #264 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-9.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #264 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-9.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #265 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-9.html
expectedResult = 0.03571428571428571;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-9.html", "apricot");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #265 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-9.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #265 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-9.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #266 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-9.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-9.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #266 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-9.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #266 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-9.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #267 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-40.html
expectedResult = 0.09803921568627451;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-40.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #267 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-40.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #267 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-40.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #268 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-40.html
expectedResult = 0.0784313725490196;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-40.html", "kiwi");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #268 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-40.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #268 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-40.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #269 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-40.html
expectedResult = 0.0392156862745098;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-40.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #269 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-40.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #269 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-40.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #270 checking TF for coconut in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-40.html
expectedResult = 0.13725490196078433;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-40.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #270 checking TF for coconut in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-40.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #270 checking TF for coconut in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-40.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #271 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-40.html
expectedResult = 0.0392156862745098;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-40.html", "peach");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #271 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-40.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #271 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-40.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #272 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-40.html
expectedResult = 0.09803921568627451;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-40.html", "blueberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #272 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-40.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #272 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-40.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #273 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-40.html
expectedResult = 0.0784313725490196;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-40.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #273 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-40.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #273 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-40.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #274 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-40.html
expectedResult = 0.0784313725490196;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-40.html", "lime");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #274 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-40.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #274 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-40.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #275 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-40.html
expectedResult = 0.0392156862745098;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-40.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #275 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-40.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #275 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-40.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #276 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-40.html
expectedResult = 0.0784313725490196;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-40.html", "apricot");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #276 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-40.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #276 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-40.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #277 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-40.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-40.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #277 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-40.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #277 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-40.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #278 checking TF for banana in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #278 checking TF for banana in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #278 checking TF for banana in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #279 checking TF for kiwi in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "kiwi");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #279 checking TF for kiwi in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #279 checking TF for kiwi in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #280 checking TF for cherry in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #280 checking TF for cherry in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #280 checking TF for cherry in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #281 checking TF for coconut in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #281 checking TF for coconut in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #281 checking TF for coconut in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #282 checking TF for peach in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "peach");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #282 checking TF for peach in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #282 checking TF for peach in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #283 checking TF for blueberry in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "blueberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #283 checking TF for blueberry in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #283 checking TF for blueberry in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #284 checking TF for apple in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #284 checking TF for apple in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #284 checking TF for apple in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #285 checking TF for lime in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "lime");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #285 checking TF for lime in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #285 checking TF for lime in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #286 checking TF for pear in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #286 checking TF for pear in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #286 checking TF for pear in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #287 checking TF for apricot in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "apricot");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #287 checking TF for apricot in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #287 checking TF for apricot in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #288 checking TF for tomato in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #288 checking TF for tomato in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #288 checking TF for tomato in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

failOut.close();
passOut.close();
}
}
