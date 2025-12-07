import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.*;
public class Fruits50TFTester {public static void main(String[] args) throws Exception{
ProjectTester tester = new ProjectTesterImp(); //Instantiate your own ProjectTester instance here
tester.initialize();
tester.crawl("https://people.scs.carleton.ca/~avamckenney/fruits50/N-0.html");
runTest(tester);}public static void runTest(ProjectTester tester) throws Exception{
PrintWriter failOut = new PrintWriter(new FileWriter("Fruits50-TF-failed.txt"));
PrintWriter passOut = new PrintWriter(new FileWriter("Fruits50-TF-passed.txt"));
double expectedResult;
double yourResult;
//Test #168 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-8.html
expectedResult = 0.08333333333333333;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-8.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #168 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-8.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #168 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-8.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #169 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits50/N-8.html
expectedResult = 0.16666666666666666;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-8.html", "apricot");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #169 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits50/N-8.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #169 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits50/N-8.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #170 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruits50/N-8.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-8.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #170 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruits50/N-8.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #170 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruits50/N-8.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #171 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits50/N-8.html
expectedResult = 0.08333333333333333;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-8.html", "kiwi");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #171 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits50/N-8.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #171 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits50/N-8.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #172 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruits50/N-8.html
expectedResult = 0.08333333333333333;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-8.html", "lime");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #172 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruits50/N-8.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #172 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruits50/N-8.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #173 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-8.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-8.html", "blueberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #173 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-8.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #173 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-8.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #174 checking TF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits50/N-8.html
expectedResult = 0.08333333333333333;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-8.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #174 checking TF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits50/N-8.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #174 checking TF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits50/N-8.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #175 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits50/N-8.html
expectedResult = 0.08333333333333333;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-8.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #175 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits50/N-8.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #175 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits50/N-8.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #176 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits50/N-8.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-8.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #176 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits50/N-8.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #176 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits50/N-8.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #177 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits50/N-8.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-8.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #177 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits50/N-8.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #177 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits50/N-8.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #178 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits50/N-8.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-8.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #178 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits50/N-8.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #178 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits50/N-8.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #179 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-1.html
expectedResult = 0.01639344262295082;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-1.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #179 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-1.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #179 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-1.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #180 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits50/N-1.html
expectedResult = 0.06557377049180328;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-1.html", "apricot");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #180 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits50/N-1.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #180 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits50/N-1.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #181 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruits50/N-1.html
expectedResult = 0.08196721311475409;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-1.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #181 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruits50/N-1.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #181 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruits50/N-1.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #182 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits50/N-1.html
expectedResult = 0.09836065573770492;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-1.html", "kiwi");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #182 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits50/N-1.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #182 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits50/N-1.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #183 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruits50/N-1.html
expectedResult = 0.14754098360655737;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-1.html", "lime");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #183 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruits50/N-1.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #183 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruits50/N-1.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #184 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-1.html
expectedResult = 0.04918032786885246;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-1.html", "blueberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #184 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-1.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #184 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-1.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #185 checking TF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits50/N-1.html
expectedResult = 0.14754098360655737;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-1.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #185 checking TF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits50/N-1.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #185 checking TF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits50/N-1.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #186 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits50/N-1.html
expectedResult = 0.03278688524590164;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-1.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #186 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits50/N-1.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #186 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits50/N-1.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #187 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits50/N-1.html
expectedResult = 0.04918032786885246;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-1.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #187 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits50/N-1.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #187 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits50/N-1.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #188 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits50/N-1.html
expectedResult = 0.04918032786885246;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-1.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #188 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits50/N-1.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #188 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits50/N-1.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #189 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits50/N-1.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-1.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #189 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits50/N-1.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #189 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits50/N-1.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #190 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-12.html
expectedResult = 0.07692307692307693;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-12.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #190 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-12.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #190 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-12.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #191 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits50/N-12.html
expectedResult = 0.038461538461538464;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-12.html", "apricot");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #191 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits50/N-12.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #191 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits50/N-12.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #192 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruits50/N-12.html
expectedResult = 0.09615384615384616;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-12.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #192 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruits50/N-12.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #192 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruits50/N-12.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #193 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits50/N-12.html
expectedResult = 0.057692307692307696;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-12.html", "kiwi");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #193 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits50/N-12.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #193 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits50/N-12.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #194 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruits50/N-12.html
expectedResult = 0.038461538461538464;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-12.html", "lime");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #194 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruits50/N-12.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #194 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruits50/N-12.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #195 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-12.html
expectedResult = 0.1346153846153846;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-12.html", "blueberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #195 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-12.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #195 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-12.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #196 checking TF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits50/N-12.html
expectedResult = 0.057692307692307696;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-12.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #196 checking TF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits50/N-12.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #196 checking TF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits50/N-12.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #197 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits50/N-12.html
expectedResult = 0.11538461538461539;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-12.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #197 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits50/N-12.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #197 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits50/N-12.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #198 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits50/N-12.html
expectedResult = 0.11538461538461539;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-12.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #198 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits50/N-12.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #198 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits50/N-12.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #199 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits50/N-12.html
expectedResult = 0.07692307692307693;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-12.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #199 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits50/N-12.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #199 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits50/N-12.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #200 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits50/N-12.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-12.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #200 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits50/N-12.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #200 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits50/N-12.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #201 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-9.html
expectedResult = 0.05263157894736842;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-9.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #201 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-9.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #201 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-9.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #202 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits50/N-9.html
expectedResult = 0.05263157894736842;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-9.html", "apricot");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #202 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits50/N-9.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #202 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits50/N-9.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #203 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruits50/N-9.html
expectedResult = 0.05263157894736842;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-9.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #203 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruits50/N-9.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #203 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruits50/N-9.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #204 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits50/N-9.html
expectedResult = 0.10526315789473684;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-9.html", "kiwi");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #204 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits50/N-9.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #204 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits50/N-9.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #205 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruits50/N-9.html
expectedResult = 0.05263157894736842;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-9.html", "lime");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #205 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruits50/N-9.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #205 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruits50/N-9.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #206 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-9.html
expectedResult = 0.13157894736842105;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-9.html", "blueberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #206 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-9.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #206 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-9.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #207 checking TF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits50/N-9.html
expectedResult = 0.10526315789473684;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-9.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #207 checking TF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits50/N-9.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #207 checking TF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits50/N-9.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #208 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits50/N-9.html
expectedResult = 0.07894736842105263;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-9.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #208 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits50/N-9.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #208 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits50/N-9.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #209 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits50/N-9.html
expectedResult = 0.07894736842105263;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-9.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #209 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits50/N-9.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #209 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits50/N-9.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #210 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits50/N-9.html
expectedResult = 0.05263157894736842;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-9.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #210 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits50/N-9.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #210 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits50/N-9.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #211 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits50/N-9.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-9.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #211 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits50/N-9.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #211 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits50/N-9.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #212 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-19.html
expectedResult = 0.08;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-19.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #212 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-19.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #212 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-19.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #213 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits50/N-19.html
expectedResult = 0.08;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-19.html", "apricot");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #213 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits50/N-19.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #213 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits50/N-19.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #214 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruits50/N-19.html
expectedResult = 0.08;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-19.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #214 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruits50/N-19.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #214 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruits50/N-19.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #215 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits50/N-19.html
expectedResult = 0.12;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-19.html", "kiwi");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #215 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits50/N-19.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #215 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits50/N-19.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #216 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruits50/N-19.html
expectedResult = 0.04;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-19.html", "lime");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #216 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruits50/N-19.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #216 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruits50/N-19.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #217 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-19.html
expectedResult = 0.08;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-19.html", "blueberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #217 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-19.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #217 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-19.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #218 checking TF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits50/N-19.html
expectedResult = 0.12;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-19.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #218 checking TF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits50/N-19.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #218 checking TF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits50/N-19.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #219 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits50/N-19.html
expectedResult = 0.08;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-19.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #219 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits50/N-19.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #219 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits50/N-19.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #220 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits50/N-19.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-19.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #220 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits50/N-19.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #220 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits50/N-19.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #221 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits50/N-19.html
expectedResult = 0.12;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-19.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #221 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits50/N-19.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #221 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits50/N-19.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #222 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits50/N-19.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-19.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #222 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits50/N-19.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #222 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits50/N-19.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #223 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-31.html
expectedResult = 0.1111111111111111;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-31.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #223 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-31.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #223 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-31.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #224 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits50/N-31.html
expectedResult = 0.1111111111111111;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-31.html", "apricot");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #224 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits50/N-31.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #224 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits50/N-31.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #225 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruits50/N-31.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-31.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #225 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruits50/N-31.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #225 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruits50/N-31.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #226 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits50/N-31.html
expectedResult = 0.05555555555555555;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-31.html", "kiwi");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #226 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits50/N-31.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #226 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits50/N-31.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #227 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruits50/N-31.html
expectedResult = 0.05555555555555555;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-31.html", "lime");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #227 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruits50/N-31.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #227 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruits50/N-31.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #228 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-31.html
expectedResult = 0.05555555555555555;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-31.html", "blueberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #228 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-31.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #228 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-31.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #229 checking TF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits50/N-31.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-31.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #229 checking TF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits50/N-31.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #229 checking TF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits50/N-31.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #230 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits50/N-31.html
expectedResult = 0.16666666666666666;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-31.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #230 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits50/N-31.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #230 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits50/N-31.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #231 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits50/N-31.html
expectedResult = 0.1111111111111111;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-31.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #231 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits50/N-31.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #231 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits50/N-31.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #232 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits50/N-31.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-31.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #232 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits50/N-31.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #232 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits50/N-31.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #233 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits50/N-31.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-31.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #233 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits50/N-31.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #233 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits50/N-31.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #234 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-46.html
expectedResult = 0.06382978723404255;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-46.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #234 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-46.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #234 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-46.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #235 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits50/N-46.html
expectedResult = 0.14893617021276595;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-46.html", "apricot");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #235 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits50/N-46.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #235 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits50/N-46.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #236 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruits50/N-46.html
expectedResult = 0.0425531914893617;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-46.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #236 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruits50/N-46.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #236 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruits50/N-46.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #237 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits50/N-46.html
expectedResult = 0.10638297872340426;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-46.html", "kiwi");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #237 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits50/N-46.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #237 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits50/N-46.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #238 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruits50/N-46.html
expectedResult = 0.0851063829787234;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-46.html", "lime");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #238 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruits50/N-46.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #238 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruits50/N-46.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #239 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-46.html
expectedResult = 0.02127659574468085;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-46.html", "blueberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #239 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-46.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #239 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-46.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #240 checking TF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits50/N-46.html
expectedResult = 0.0425531914893617;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-46.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #240 checking TF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits50/N-46.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #240 checking TF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits50/N-46.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #241 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits50/N-46.html
expectedResult = 0.06382978723404255;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-46.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #241 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits50/N-46.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #241 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits50/N-46.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #242 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits50/N-46.html
expectedResult = 0.0851063829787234;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-46.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #242 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits50/N-46.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #242 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits50/N-46.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #243 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits50/N-46.html
expectedResult = 0.06382978723404255;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-46.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #243 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits50/N-46.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #243 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits50/N-46.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #244 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits50/N-46.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-46.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #244 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits50/N-46.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #244 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits50/N-46.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #245 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-48.html
expectedResult = 0.08333333333333333;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-48.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #245 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-48.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #245 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-48.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #246 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits50/N-48.html
expectedResult = 0.05;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-48.html", "apricot");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #246 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits50/N-48.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #246 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits50/N-48.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #247 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruits50/N-48.html
expectedResult = 0.05;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-48.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #247 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruits50/N-48.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #247 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruits50/N-48.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #248 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits50/N-48.html
expectedResult = 0.06666666666666667;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-48.html", "kiwi");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #248 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits50/N-48.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #248 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits50/N-48.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #249 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruits50/N-48.html
expectedResult = 0.05;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-48.html", "lime");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #249 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruits50/N-48.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #249 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruits50/N-48.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #250 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-48.html
expectedResult = 0.1;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-48.html", "blueberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #250 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-48.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #250 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-48.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #251 checking TF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits50/N-48.html
expectedResult = 0.08333333333333333;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-48.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #251 checking TF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits50/N-48.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #251 checking TF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits50/N-48.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #252 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits50/N-48.html
expectedResult = 0.06666666666666667;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-48.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #252 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits50/N-48.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #252 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits50/N-48.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #253 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits50/N-48.html
expectedResult = 0.08333333333333333;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-48.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #253 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits50/N-48.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #253 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits50/N-48.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #254 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits50/N-48.html
expectedResult = 0.08333333333333333;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-48.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #254 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits50/N-48.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #254 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits50/N-48.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #255 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits50/N-48.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-48.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #255 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits50/N-48.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #255 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits50/N-48.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #256 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-44.html
expectedResult = 0.0851063829787234;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-44.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #256 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-44.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #256 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-44.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #257 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits50/N-44.html
expectedResult = 0.0851063829787234;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-44.html", "apricot");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #257 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits50/N-44.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #257 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits50/N-44.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #258 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruits50/N-44.html
expectedResult = 0.02127659574468085;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-44.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #258 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruits50/N-44.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #258 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruits50/N-44.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #259 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits50/N-44.html
expectedResult = 0.06382978723404255;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-44.html", "kiwi");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #259 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits50/N-44.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #259 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits50/N-44.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #260 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruits50/N-44.html
expectedResult = 0.0851063829787234;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-44.html", "lime");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #260 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruits50/N-44.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #260 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruits50/N-44.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #261 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-44.html
expectedResult = 0.06382978723404255;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-44.html", "blueberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #261 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-44.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #261 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-44.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #262 checking TF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits50/N-44.html
expectedResult = 0.02127659574468085;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-44.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #262 checking TF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits50/N-44.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #262 checking TF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits50/N-44.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #263 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits50/N-44.html
expectedResult = 0.0851063829787234;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-44.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #263 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits50/N-44.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #263 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits50/N-44.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #264 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits50/N-44.html
expectedResult = 0.0851063829787234;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-44.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #264 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits50/N-44.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #264 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits50/N-44.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #265 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits50/N-44.html
expectedResult = 0.19148936170212766;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-44.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #265 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits50/N-44.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #265 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits50/N-44.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #266 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits50/N-44.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-44.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #266 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits50/N-44.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #266 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits50/N-44.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #267 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-27.html
expectedResult = 0.0975609756097561;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-27.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #267 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-27.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #267 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-27.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #268 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits50/N-27.html
expectedResult = 0.12195121951219512;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-27.html", "apricot");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #268 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits50/N-27.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #268 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits50/N-27.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #269 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruits50/N-27.html
expectedResult = 0.04878048780487805;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-27.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #269 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruits50/N-27.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #269 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruits50/N-27.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #270 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits50/N-27.html
expectedResult = 0.024390243902439025;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-27.html", "kiwi");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #270 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits50/N-27.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #270 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits50/N-27.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #271 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruits50/N-27.html
expectedResult = 0.17073170731707318;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-27.html", "lime");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #271 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruits50/N-27.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #271 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruits50/N-27.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #272 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-27.html
expectedResult = 0.04878048780487805;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-27.html", "blueberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #272 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-27.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #272 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-27.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #273 checking TF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits50/N-27.html
expectedResult = 0.0975609756097561;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-27.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #273 checking TF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits50/N-27.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #273 checking TF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits50/N-27.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #274 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits50/N-27.html
expectedResult = 0.0975609756097561;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-27.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #274 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits50/N-27.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #274 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits50/N-27.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #275 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits50/N-27.html
expectedResult = 0.0975609756097561;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-27.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #275 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits50/N-27.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #275 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits50/N-27.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #276 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits50/N-27.html
expectedResult = 0.024390243902439025;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-27.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #276 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits50/N-27.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #276 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits50/N-27.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #277 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits50/N-27.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-27.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #277 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits50/N-27.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #277 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits50/N-27.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #278 checking TF for cherry in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #278 checking TF for cherry in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #278 checking TF for cherry in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #279 checking TF for apricot in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "apricot");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #279 checking TF for apricot in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #279 checking TF for apricot in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #280 checking TF for pear in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #280 checking TF for pear in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #280 checking TF for pear in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #281 checking TF for kiwi in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "kiwi");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #281 checking TF for kiwi in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #281 checking TF for kiwi in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #282 checking TF for lime in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "lime");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #282 checking TF for lime in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #282 checking TF for lime in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
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

//Test #284 checking TF for coconut in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #284 checking TF for coconut in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #284 checking TF for coconut in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #285 checking TF for banana in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #285 checking TF for banana in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #285 checking TF for banana in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #286 checking TF for papaya in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #286 checking TF for papaya in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #286 checking TF for papaya in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #287 checking TF for fig in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #287 checking TF for fig in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #287 checking TF for fig in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
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
