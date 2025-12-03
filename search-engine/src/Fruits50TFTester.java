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
//Test #168 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits50/N-22.html
expectedResult = 0.1111111111111111;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-22.html", "kiwi");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #168 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits50/N-22.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #168 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits50/N-22.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #169 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruits50/N-22.html
expectedResult = 0.05555555555555555;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-22.html", "lime");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #169 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruits50/N-22.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #169 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruits50/N-22.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #170 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-22.html
expectedResult = 0.05555555555555555;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-22.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #170 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-22.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #170 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-22.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #171 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-22.html
expectedResult = 0.1388888888888889;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-22.html", "blueberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #171 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-22.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #171 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-22.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #172 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits50/N-22.html
expectedResult = 0.05555555555555555;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-22.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #172 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits50/N-22.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #172 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits50/N-22.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #173 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits50/N-22.html
expectedResult = 0.1111111111111111;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-22.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #173 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits50/N-22.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #173 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits50/N-22.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #174 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/fruits50/N-22.html
expectedResult = 0.05555555555555555;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-22.html", "peach");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #174 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/fruits50/N-22.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #174 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/fruits50/N-22.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #175 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruits50/N-22.html
expectedResult = 0.1111111111111111;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-22.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #175 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruits50/N-22.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #175 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruits50/N-22.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #176 checking TF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits50/N-22.html
expectedResult = 0.05555555555555555;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-22.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #176 checking TF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits50/N-22.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #176 checking TF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits50/N-22.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #177 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits50/N-22.html
expectedResult = 0.05555555555555555;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-22.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #177 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits50/N-22.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #177 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits50/N-22.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #178 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits50/N-22.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-22.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #178 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits50/N-22.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #178 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits50/N-22.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #179 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits50/N-20.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-20.html", "kiwi");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #179 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits50/N-20.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #179 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits50/N-20.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #180 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruits50/N-20.html
expectedResult = 0.07692307692307693;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-20.html", "lime");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #180 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruits50/N-20.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #180 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruits50/N-20.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #181 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-20.html
expectedResult = 0.07692307692307693;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-20.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #181 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-20.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #181 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-20.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #182 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-20.html
expectedResult = 0.07692307692307693;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-20.html", "blueberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #182 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-20.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #182 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-20.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #183 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits50/N-20.html
expectedResult = 0.11538461538461539;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-20.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #183 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits50/N-20.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #183 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits50/N-20.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #184 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits50/N-20.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-20.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #184 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits50/N-20.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #184 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits50/N-20.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #185 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/fruits50/N-20.html
expectedResult = 0.038461538461538464;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-20.html", "peach");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #185 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/fruits50/N-20.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #185 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/fruits50/N-20.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #186 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruits50/N-20.html
expectedResult = 0.038461538461538464;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-20.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #186 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruits50/N-20.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #186 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruits50/N-20.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #187 checking TF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits50/N-20.html
expectedResult = 0.15384615384615385;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-20.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #187 checking TF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits50/N-20.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #187 checking TF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits50/N-20.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #188 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits50/N-20.html
expectedResult = 0.038461538461538464;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-20.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #188 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits50/N-20.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #188 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits50/N-20.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #189 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits50/N-20.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-20.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #189 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits50/N-20.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #189 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits50/N-20.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #190 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits50/N-45.html
expectedResult = 0.05128205128205128;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-45.html", "kiwi");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #190 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits50/N-45.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #190 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits50/N-45.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #191 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruits50/N-45.html
expectedResult = 0.20512820512820512;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-45.html", "lime");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #191 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruits50/N-45.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #191 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruits50/N-45.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #192 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-45.html
expectedResult = 0.02564102564102564;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-45.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #192 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-45.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #192 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-45.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #193 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-45.html
expectedResult = 0.07692307692307693;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-45.html", "blueberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #193 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-45.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #193 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-45.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #194 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits50/N-45.html
expectedResult = 0.05128205128205128;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-45.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #194 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits50/N-45.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #194 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits50/N-45.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #195 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits50/N-45.html
expectedResult = 0.02564102564102564;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-45.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #195 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits50/N-45.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #195 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits50/N-45.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #196 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/fruits50/N-45.html
expectedResult = 0.07692307692307693;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-45.html", "peach");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #196 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/fruits50/N-45.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #196 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/fruits50/N-45.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #197 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruits50/N-45.html
expectedResult = 0.05128205128205128;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-45.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #197 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruits50/N-45.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #197 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruits50/N-45.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #198 checking TF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits50/N-45.html
expectedResult = 0.1282051282051282;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-45.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #198 checking TF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits50/N-45.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #198 checking TF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits50/N-45.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #199 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits50/N-45.html
expectedResult = 0.10256410256410256;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-45.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #199 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits50/N-45.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #199 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits50/N-45.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #200 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits50/N-45.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-45.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #200 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits50/N-45.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #200 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits50/N-45.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #201 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits50/N-31.html
expectedResult = 0.05555555555555555;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-31.html", "kiwi");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #201 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits50/N-31.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #201 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits50/N-31.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #202 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruits50/N-31.html
expectedResult = 0.05555555555555555;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-31.html", "lime");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #202 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruits50/N-31.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #202 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruits50/N-31.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #203 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-31.html
expectedResult = 0.1111111111111111;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-31.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #203 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-31.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #203 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-31.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #204 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-31.html
expectedResult = 0.05555555555555555;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-31.html", "blueberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #204 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-31.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #204 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-31.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #205 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits50/N-31.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-31.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #205 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits50/N-31.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #205 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits50/N-31.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #206 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits50/N-31.html
expectedResult = 0.1111111111111111;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-31.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #206 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits50/N-31.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #206 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits50/N-31.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #207 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/fruits50/N-31.html
expectedResult = 0.05555555555555555;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-31.html", "peach");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #207 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/fruits50/N-31.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #207 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/fruits50/N-31.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #208 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruits50/N-31.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-31.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #208 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruits50/N-31.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #208 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruits50/N-31.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #209 checking TF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits50/N-31.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-31.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #209 checking TF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits50/N-31.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #209 checking TF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits50/N-31.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #210 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits50/N-31.html
expectedResult = 0.16666666666666666;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-31.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #210 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits50/N-31.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #210 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits50/N-31.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #211 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits50/N-31.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-31.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #211 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits50/N-31.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #211 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits50/N-31.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #212 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits50/N-11.html
expectedResult = 0.15714285714285714;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-11.html", "kiwi");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #212 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits50/N-11.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #212 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits50/N-11.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #213 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruits50/N-11.html
expectedResult = 0.07142857142857142;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-11.html", "lime");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #213 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruits50/N-11.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #213 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruits50/N-11.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #214 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-11.html
expectedResult = 0.1;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-11.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #214 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-11.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #214 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-11.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #215 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-11.html
expectedResult = 0.07142857142857142;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-11.html", "blueberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #215 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-11.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #215 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-11.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #216 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits50/N-11.html
expectedResult = 0.05714285714285714;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-11.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #216 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits50/N-11.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #216 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits50/N-11.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #217 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits50/N-11.html
expectedResult = 0.05714285714285714;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-11.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #217 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits50/N-11.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #217 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits50/N-11.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #218 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/fruits50/N-11.html
expectedResult = 0.05714285714285714;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-11.html", "peach");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #218 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/fruits50/N-11.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #218 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/fruits50/N-11.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #219 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruits50/N-11.html
expectedResult = 0.07142857142857142;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-11.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #219 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruits50/N-11.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #219 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruits50/N-11.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #220 checking TF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits50/N-11.html
expectedResult = 0.05714285714285714;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-11.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #220 checking TF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits50/N-11.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #220 checking TF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits50/N-11.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #221 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits50/N-11.html
expectedResult = 0.08571428571428572;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-11.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #221 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits50/N-11.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #221 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits50/N-11.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #222 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits50/N-11.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-11.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #222 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits50/N-11.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #222 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits50/N-11.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #223 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits50/N-10.html
expectedResult = 0.1111111111111111;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-10.html", "kiwi");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #223 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits50/N-10.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #223 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits50/N-10.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #224 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruits50/N-10.html
expectedResult = 0.08333333333333333;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-10.html", "lime");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #224 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruits50/N-10.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #224 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruits50/N-10.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #225 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-10.html
expectedResult = 0.1111111111111111;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-10.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #225 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-10.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #225 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-10.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #226 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-10.html
expectedResult = 0.027777777777777776;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-10.html", "blueberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #226 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-10.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #226 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-10.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #227 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits50/N-10.html
expectedResult = 0.027777777777777776;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-10.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #227 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits50/N-10.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #227 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits50/N-10.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #228 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits50/N-10.html
expectedResult = 0.027777777777777776;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-10.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #228 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits50/N-10.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #228 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits50/N-10.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #229 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/fruits50/N-10.html
expectedResult = 0.1111111111111111;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-10.html", "peach");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #229 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/fruits50/N-10.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #229 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/fruits50/N-10.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #230 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruits50/N-10.html
expectedResult = 0.027777777777777776;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-10.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #230 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruits50/N-10.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #230 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruits50/N-10.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #231 checking TF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits50/N-10.html
expectedResult = 0.027777777777777776;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-10.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #231 checking TF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits50/N-10.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #231 checking TF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits50/N-10.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #232 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits50/N-10.html
expectedResult = 0.1388888888888889;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-10.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #232 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits50/N-10.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #232 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits50/N-10.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #233 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits50/N-10.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-10.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #233 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits50/N-10.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #233 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits50/N-10.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #234 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits50/N-42.html
expectedResult = 0.08955223880597014;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-42.html", "kiwi");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #234 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits50/N-42.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #234 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits50/N-42.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #235 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruits50/N-42.html
expectedResult = 0.08955223880597014;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-42.html", "lime");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #235 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruits50/N-42.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #235 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruits50/N-42.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #236 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-42.html
expectedResult = 0.07462686567164178;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-42.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #236 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-42.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #236 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-42.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #237 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-42.html
expectedResult = 0.029850746268656716;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-42.html", "blueberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #237 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-42.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #237 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-42.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #238 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits50/N-42.html
expectedResult = 0.1044776119402985;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-42.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #238 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits50/N-42.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #238 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits50/N-42.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #239 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits50/N-42.html
expectedResult = 0.08955223880597014;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-42.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #239 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits50/N-42.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #239 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits50/N-42.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #240 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/fruits50/N-42.html
expectedResult = 0.05970149253731343;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-42.html", "peach");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #240 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/fruits50/N-42.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #240 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/fruits50/N-42.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #241 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruits50/N-42.html
expectedResult = 0.07462686567164178;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-42.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #241 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruits50/N-42.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #241 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruits50/N-42.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #242 checking TF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits50/N-42.html
expectedResult = 0.029850746268656716;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-42.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #242 checking TF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits50/N-42.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #242 checking TF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits50/N-42.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #243 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits50/N-42.html
expectedResult = 0.11940298507462686;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-42.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #243 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits50/N-42.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #243 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits50/N-42.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #244 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits50/N-42.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-42.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #244 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits50/N-42.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #244 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits50/N-42.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #245 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits50/N-24.html
expectedResult = 0.13333333333333333;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-24.html", "kiwi");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #245 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits50/N-24.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #245 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits50/N-24.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #246 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruits50/N-24.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-24.html", "lime");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #246 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruits50/N-24.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #246 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruits50/N-24.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #247 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-24.html
expectedResult = 0.06666666666666667;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-24.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #247 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-24.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #247 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-24.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #248 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-24.html
expectedResult = 0.13333333333333333;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-24.html", "blueberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #248 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-24.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #248 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-24.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #249 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits50/N-24.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-24.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #249 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits50/N-24.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #249 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits50/N-24.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #250 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits50/N-24.html
expectedResult = 0.06666666666666667;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-24.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #250 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits50/N-24.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #250 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits50/N-24.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #251 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/fruits50/N-24.html
expectedResult = 0.13333333333333333;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-24.html", "peach");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #251 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/fruits50/N-24.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #251 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/fruits50/N-24.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #252 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruits50/N-24.html
expectedResult = 0.06666666666666667;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-24.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #252 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruits50/N-24.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #252 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruits50/N-24.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #253 checking TF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits50/N-24.html
expectedResult = 0.13333333333333333;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-24.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #253 checking TF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits50/N-24.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #253 checking TF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits50/N-24.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #254 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits50/N-24.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-24.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #254 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits50/N-24.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #254 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits50/N-24.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #255 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits50/N-24.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-24.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #255 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits50/N-24.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #255 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits50/N-24.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #256 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits50/N-0.html
expectedResult = 0.09523809523809523;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-0.html", "kiwi");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #256 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits50/N-0.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #256 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits50/N-0.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #257 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruits50/N-0.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-0.html", "lime");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #257 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruits50/N-0.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #257 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruits50/N-0.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #258 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-0.html
expectedResult = 0.047619047619047616;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-0.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #258 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-0.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #258 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-0.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #259 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-0.html
expectedResult = 0.19047619047619047;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-0.html", "blueberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #259 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-0.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #259 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-0.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #260 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits50/N-0.html
expectedResult = 0.047619047619047616;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-0.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #260 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits50/N-0.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #260 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits50/N-0.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #261 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits50/N-0.html
expectedResult = 0.14285714285714285;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-0.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #261 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits50/N-0.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #261 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits50/N-0.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #262 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/fruits50/N-0.html
expectedResult = 0.047619047619047616;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-0.html", "peach");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #262 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/fruits50/N-0.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #262 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/fruits50/N-0.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #263 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruits50/N-0.html
expectedResult = 0.09523809523809523;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-0.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #263 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruits50/N-0.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #263 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruits50/N-0.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #264 checking TF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits50/N-0.html
expectedResult = 0.09523809523809523;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-0.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #264 checking TF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits50/N-0.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #264 checking TF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits50/N-0.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #265 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits50/N-0.html
expectedResult = 0.047619047619047616;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-0.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #265 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits50/N-0.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #265 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits50/N-0.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #266 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits50/N-0.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-0.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #266 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits50/N-0.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #266 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits50/N-0.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #267 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits50/N-44.html
expectedResult = 0.06382978723404255;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-44.html", "kiwi");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #267 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits50/N-44.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #267 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits50/N-44.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #268 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruits50/N-44.html
expectedResult = 0.0851063829787234;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-44.html", "lime");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #268 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruits50/N-44.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #268 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruits50/N-44.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #269 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-44.html
expectedResult = 0.0851063829787234;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-44.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #269 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-44.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #269 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-44.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #270 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-44.html
expectedResult = 0.06382978723404255;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-44.html", "blueberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #270 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-44.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #270 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-44.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #271 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits50/N-44.html
expectedResult = 0.19148936170212766;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-44.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #271 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits50/N-44.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #271 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits50/N-44.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #272 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits50/N-44.html
expectedResult = 0.0851063829787234;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-44.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #272 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits50/N-44.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #272 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits50/N-44.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #273 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/fruits50/N-44.html
expectedResult = 0.0851063829787234;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-44.html", "peach");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #273 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/fruits50/N-44.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #273 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/fruits50/N-44.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #274 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruits50/N-44.html
expectedResult = 0.02127659574468085;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-44.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #274 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruits50/N-44.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #274 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruits50/N-44.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #275 checking TF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits50/N-44.html
expectedResult = 0.02127659574468085;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-44.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #275 checking TF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits50/N-44.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #275 checking TF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits50/N-44.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #276 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits50/N-44.html
expectedResult = 0.0851063829787234;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-44.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #276 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits50/N-44.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #276 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits50/N-44.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #277 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits50/N-44.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-44.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #277 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits50/N-44.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #277 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits50/N-44.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #278 checking TF for kiwi in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "kiwi");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #278 checking TF for kiwi in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #278 checking TF for kiwi in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #279 checking TF for lime in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "lime");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #279 checking TF for lime in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #279 checking TF for lime in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
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

//Test #281 checking TF for blueberry in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "blueberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #281 checking TF for blueberry in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #281 checking TF for blueberry in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #282 checking TF for fig in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #282 checking TF for fig in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #282 checking TF for fig in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #283 checking TF for papaya in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #283 checking TF for papaya in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #283 checking TF for papaya in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #284 checking TF for peach in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "peach");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #284 checking TF for peach in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #284 checking TF for peach in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #285 checking TF for pear in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #285 checking TF for pear in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #285 checking TF for pear in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #286 checking TF for coconut in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #286 checking TF for coconut in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #286 checking TF for coconut in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #287 checking TF for banana in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #287 checking TF for banana in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #287 checking TF for banana in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
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
