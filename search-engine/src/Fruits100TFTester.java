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
//Test #168 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-44.html
expectedResult = 0.10144927536231885;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-44.html", "blueberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #168 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-44.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #168 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-44.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #169 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruits100/N-44.html
expectedResult = 0.11594202898550725;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-44.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #169 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruits100/N-44.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #169 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruits100/N-44.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #170 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits100/N-44.html
expectedResult = 0.07246376811594203;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-44.html", "kiwi");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #170 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits100/N-44.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #170 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits100/N-44.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #171 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-44.html
expectedResult = 0.08695652173913043;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-44.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #171 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-44.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #171 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-44.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #172 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-44.html
expectedResult = 0.057971014492753624;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-44.html", "strawberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #172 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-44.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #172 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-44.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #173 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits100/N-44.html
expectedResult = 0.057971014492753624;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-44.html", "apricot");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #173 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits100/N-44.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #173 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits100/N-44.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #174 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruits100/N-44.html
expectedResult = 0.10144927536231885;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-44.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #174 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruits100/N-44.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #174 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruits100/N-44.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #175 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits100/N-44.html
expectedResult = 0.14492753623188406;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-44.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #175 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits100/N-44.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #175 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits100/N-44.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #176 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits100/N-44.html
expectedResult = 0.057971014492753624;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-44.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #176 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits100/N-44.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #176 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits100/N-44.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #177 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruits100/N-44.html
expectedResult = 0.043478260869565216;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-44.html", "lime");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #177 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruits100/N-44.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #177 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruits100/N-44.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #178 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits100/N-44.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-44.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #178 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits100/N-44.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #178 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits100/N-44.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #179 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-88.html
expectedResult = 0.05405405405405406;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-88.html", "blueberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #179 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-88.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #179 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-88.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #180 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruits100/N-88.html
expectedResult = 0.08108108108108109;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-88.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #180 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruits100/N-88.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #180 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruits100/N-88.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #181 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits100/N-88.html
expectedResult = 0.13513513513513514;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-88.html", "kiwi");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #181 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits100/N-88.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #181 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits100/N-88.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #182 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-88.html
expectedResult = 0.05405405405405406;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-88.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #182 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-88.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #182 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-88.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #183 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-88.html
expectedResult = 0.05405405405405406;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-88.html", "strawberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #183 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-88.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #183 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-88.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #184 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits100/N-88.html
expectedResult = 0.05405405405405406;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-88.html", "apricot");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #184 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits100/N-88.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #184 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits100/N-88.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #185 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruits100/N-88.html
expectedResult = 0.02702702702702703;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-88.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #185 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruits100/N-88.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #185 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruits100/N-88.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #186 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits100/N-88.html
expectedResult = 0.05405405405405406;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-88.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #186 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits100/N-88.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #186 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits100/N-88.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #187 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits100/N-88.html
expectedResult = 0.08108108108108109;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-88.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #187 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits100/N-88.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #187 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits100/N-88.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #188 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruits100/N-88.html
expectedResult = 0.08108108108108109;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-88.html", "lime");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #188 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruits100/N-88.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #188 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruits100/N-88.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #189 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits100/N-88.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-88.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #189 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits100/N-88.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #189 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits100/N-88.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #190 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-22.html
expectedResult = 0.08888888888888889;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-22.html", "blueberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #190 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-22.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #190 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-22.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #191 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruits100/N-22.html
expectedResult = 0.044444444444444446;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-22.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #191 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruits100/N-22.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #191 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruits100/N-22.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #192 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits100/N-22.html
expectedResult = 0.1111111111111111;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-22.html", "kiwi");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #192 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits100/N-22.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #192 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits100/N-22.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #193 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-22.html
expectedResult = 0.044444444444444446;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-22.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #193 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-22.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #193 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-22.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #194 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-22.html
expectedResult = 0.06666666666666667;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-22.html", "strawberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #194 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-22.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #194 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-22.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #195 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits100/N-22.html
expectedResult = 0.13333333333333333;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-22.html", "apricot");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #195 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits100/N-22.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #195 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits100/N-22.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #196 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruits100/N-22.html
expectedResult = 0.1111111111111111;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-22.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #196 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruits100/N-22.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #196 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruits100/N-22.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #197 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits100/N-22.html
expectedResult = 0.06666666666666667;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-22.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #197 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits100/N-22.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #197 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits100/N-22.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #198 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits100/N-22.html
expectedResult = 0.022222222222222223;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-22.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #198 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits100/N-22.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #198 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits100/N-22.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #199 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruits100/N-22.html
expectedResult = 0.06666666666666667;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-22.html", "lime");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #199 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruits100/N-22.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #199 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruits100/N-22.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #200 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits100/N-22.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-22.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #200 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits100/N-22.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #200 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits100/N-22.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #201 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-17.html
expectedResult = 0.09433962264150944;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-17.html", "blueberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #201 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-17.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #201 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-17.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #202 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruits100/N-17.html
expectedResult = 0.07547169811320754;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-17.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #202 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruits100/N-17.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #202 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruits100/N-17.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #203 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits100/N-17.html
expectedResult = 0.11320754716981132;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-17.html", "kiwi");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #203 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits100/N-17.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #203 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits100/N-17.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #204 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-17.html
expectedResult = 0.05660377358490566;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-17.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #204 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-17.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #204 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-17.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #205 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-17.html
expectedResult = 0.07547169811320754;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-17.html", "strawberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #205 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-17.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #205 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-17.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #206 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits100/N-17.html
expectedResult = 0.07547169811320754;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-17.html", "apricot");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #206 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits100/N-17.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #206 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits100/N-17.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #207 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruits100/N-17.html
expectedResult = 0.03773584905660377;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-17.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #207 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruits100/N-17.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #207 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruits100/N-17.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #208 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits100/N-17.html
expectedResult = 0.09433962264150944;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-17.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #208 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits100/N-17.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #208 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits100/N-17.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #209 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits100/N-17.html
expectedResult = 0.07547169811320754;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-17.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #209 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits100/N-17.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #209 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits100/N-17.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #210 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruits100/N-17.html
expectedResult = 0.05660377358490566;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-17.html", "lime");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #210 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruits100/N-17.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #210 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruits100/N-17.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #211 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits100/N-17.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-17.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #211 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits100/N-17.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #211 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits100/N-17.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #212 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-68.html
expectedResult = 0.037037037037037035;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-68.html", "blueberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #212 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-68.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #212 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-68.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #213 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruits100/N-68.html
expectedResult = 0.07407407407407407;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-68.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #213 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruits100/N-68.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #213 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruits100/N-68.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #214 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits100/N-68.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-68.html", "kiwi");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #214 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits100/N-68.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #214 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits100/N-68.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #215 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-68.html
expectedResult = 0.037037037037037035;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-68.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #215 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-68.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #215 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-68.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #216 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-68.html
expectedResult = 0.07407407407407407;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-68.html", "strawberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #216 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-68.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #216 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-68.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #217 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits100/N-68.html
expectedResult = 0.18518518518518517;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-68.html", "apricot");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #217 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits100/N-68.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #217 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits100/N-68.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #218 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruits100/N-68.html
expectedResult = 0.07407407407407407;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-68.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #218 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruits100/N-68.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #218 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruits100/N-68.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #219 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits100/N-68.html
expectedResult = 0.1111111111111111;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-68.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #219 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits100/N-68.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #219 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits100/N-68.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #220 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits100/N-68.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-68.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #220 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits100/N-68.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #220 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits100/N-68.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #221 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruits100/N-68.html
expectedResult = 0.07407407407407407;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-68.html", "lime");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #221 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruits100/N-68.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #221 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruits100/N-68.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #222 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits100/N-68.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-68.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #222 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits100/N-68.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #222 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits100/N-68.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #223 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-64.html
expectedResult = 0.04081632653061224;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-64.html", "blueberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #223 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-64.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #223 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-64.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #224 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruits100/N-64.html
expectedResult = 0.08163265306122448;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-64.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #224 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruits100/N-64.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #224 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruits100/N-64.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #225 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits100/N-64.html
expectedResult = 0.04081632653061224;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-64.html", "kiwi");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #225 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits100/N-64.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #225 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits100/N-64.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #226 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-64.html
expectedResult = 0.08163265306122448;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-64.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #226 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-64.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #226 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-64.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #227 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-64.html
expectedResult = 0.08163265306122448;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-64.html", "strawberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #227 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-64.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #227 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-64.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #228 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits100/N-64.html
expectedResult = 0.08163265306122448;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-64.html", "apricot");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #228 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits100/N-64.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #228 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits100/N-64.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #229 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruits100/N-64.html
expectedResult = 0.061224489795918366;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-64.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #229 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruits100/N-64.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #229 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruits100/N-64.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #230 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits100/N-64.html
expectedResult = 0.02040816326530612;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-64.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #230 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits100/N-64.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #230 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits100/N-64.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #231 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits100/N-64.html
expectedResult = 0.12244897959183673;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-64.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #231 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits100/N-64.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #231 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits100/N-64.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #232 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruits100/N-64.html
expectedResult = 0.08163265306122448;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-64.html", "lime");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #232 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruits100/N-64.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #232 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruits100/N-64.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #233 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits100/N-64.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-64.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #233 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits100/N-64.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #233 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits100/N-64.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #234 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-16.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-16.html", "blueberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #234 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-16.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #234 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-16.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #235 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruits100/N-16.html
expectedResult = 0.043478260869565216;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-16.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #235 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruits100/N-16.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #235 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruits100/N-16.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #236 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits100/N-16.html
expectedResult = 0.043478260869565216;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-16.html", "kiwi");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #236 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits100/N-16.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #236 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits100/N-16.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #237 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-16.html
expectedResult = 0.13043478260869565;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-16.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #237 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-16.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #237 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-16.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #238 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-16.html
expectedResult = 0.08695652173913043;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-16.html", "strawberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #238 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-16.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #238 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-16.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #239 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits100/N-16.html
expectedResult = 0.08695652173913043;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-16.html", "apricot");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #239 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits100/N-16.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #239 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits100/N-16.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #240 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruits100/N-16.html
expectedResult = 0.043478260869565216;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-16.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #240 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruits100/N-16.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #240 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruits100/N-16.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #241 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits100/N-16.html
expectedResult = 0.08695652173913043;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-16.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #241 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits100/N-16.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #241 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits100/N-16.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #242 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits100/N-16.html
expectedResult = 0.08695652173913043;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-16.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #242 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits100/N-16.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #242 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits100/N-16.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #243 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruits100/N-16.html
expectedResult = 0.13043478260869565;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-16.html", "lime");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #243 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruits100/N-16.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #243 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruits100/N-16.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #244 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits100/N-16.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-16.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #244 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits100/N-16.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #244 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits100/N-16.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #245 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-93.html
expectedResult = 0.04;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-93.html", "blueberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #245 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-93.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #245 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-93.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #246 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruits100/N-93.html
expectedResult = 0.12;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-93.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #246 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruits100/N-93.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #246 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruits100/N-93.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #247 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits100/N-93.html
expectedResult = 0.16;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-93.html", "kiwi");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #247 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits100/N-93.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #247 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits100/N-93.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #248 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-93.html
expectedResult = 0.16;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-93.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #248 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-93.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #248 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-93.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #249 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-93.html
expectedResult = 0.08;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-93.html", "strawberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #249 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-93.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #249 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-93.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #250 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits100/N-93.html
expectedResult = 0.08;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-93.html", "apricot");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #250 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits100/N-93.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #250 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits100/N-93.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #251 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruits100/N-93.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-93.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #251 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruits100/N-93.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #251 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruits100/N-93.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #252 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits100/N-93.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-93.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #252 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits100/N-93.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #252 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits100/N-93.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #253 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits100/N-93.html
expectedResult = 0.16;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-93.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #253 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits100/N-93.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #253 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits100/N-93.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #254 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruits100/N-93.html
expectedResult = 0.04;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-93.html", "lime");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #254 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruits100/N-93.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #254 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruits100/N-93.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #255 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits100/N-93.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-93.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #255 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits100/N-93.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #255 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits100/N-93.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #256 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-18.html
expectedResult = 0.016129032258064516;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-18.html", "blueberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #256 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-18.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #256 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-18.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #257 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruits100/N-18.html
expectedResult = 0.016129032258064516;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-18.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #257 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruits100/N-18.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #257 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruits100/N-18.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #258 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits100/N-18.html
expectedResult = 0.04838709677419355;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-18.html", "kiwi");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #258 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits100/N-18.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #258 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits100/N-18.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #259 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-18.html
expectedResult = 0.0967741935483871;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-18.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #259 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-18.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #259 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-18.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #260 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-18.html
expectedResult = 0.12903225806451613;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-18.html", "strawberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #260 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-18.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #260 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-18.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #261 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits100/N-18.html
expectedResult = 0.0967741935483871;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-18.html", "apricot");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #261 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits100/N-18.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #261 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits100/N-18.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #262 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruits100/N-18.html
expectedResult = 0.14516129032258066;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-18.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #262 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruits100/N-18.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #262 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruits100/N-18.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #263 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits100/N-18.html
expectedResult = 0.08064516129032258;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-18.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #263 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits100/N-18.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #263 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits100/N-18.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #264 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits100/N-18.html
expectedResult = 0.11290322580645161;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-18.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #264 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits100/N-18.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #264 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits100/N-18.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #265 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruits100/N-18.html
expectedResult = 0.0967741935483871;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-18.html", "lime");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #265 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruits100/N-18.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #265 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruits100/N-18.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #266 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits100/N-18.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-18.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #266 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits100/N-18.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #266 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits100/N-18.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #267 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-35.html
expectedResult = 0.125;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-35.html", "blueberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #267 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-35.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #267 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-35.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #268 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruits100/N-35.html
expectedResult = 0.08333333333333333;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-35.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #268 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruits100/N-35.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #268 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruits100/N-35.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #269 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits100/N-35.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-35.html", "kiwi");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #269 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits100/N-35.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #269 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits100/N-35.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #270 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-35.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-35.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #270 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-35.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #270 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-35.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #271 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-35.html
expectedResult = 0.16666666666666666;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-35.html", "strawberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #271 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-35.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #271 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-35.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #272 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits100/N-35.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-35.html", "apricot");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #272 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits100/N-35.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #272 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits100/N-35.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #273 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruits100/N-35.html
expectedResult = 0.20833333333333334;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-35.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #273 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruits100/N-35.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #273 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruits100/N-35.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #274 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits100/N-35.html
expectedResult = 0.08333333333333333;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-35.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #274 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits100/N-35.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #274 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits100/N-35.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #275 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits100/N-35.html
expectedResult = 0.08333333333333333;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-35.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #275 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits100/N-35.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #275 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits100/N-35.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #276 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruits100/N-35.html
expectedResult = 0.08333333333333333;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-35.html", "lime");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #276 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruits100/N-35.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #276 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruits100/N-35.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #277 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits100/N-35.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-35.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #277 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits100/N-35.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #277 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits100/N-35.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #278 checking TF for blueberry in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "blueberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #278 checking TF for blueberry in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #278 checking TF for blueberry in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #279 checking TF for apple in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #279 checking TF for apple in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #279 checking TF for apple in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #280 checking TF for kiwi in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "kiwi");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #280 checking TF for kiwi in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #280 checking TF for kiwi in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #281 checking TF for cherry in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #281 checking TF for cherry in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #281 checking TF for cherry in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #282 checking TF for strawberry in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "strawberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #282 checking TF for strawberry in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #282 checking TF for strawberry in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #283 checking TF for apricot in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "apricot");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #283 checking TF for apricot in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #283 checking TF for apricot in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #284 checking TF for pear in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #284 checking TF for pear in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #284 checking TF for pear in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
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

//Test #286 checking TF for fig in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #286 checking TF for fig in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #286 checking TF for fig in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #287 checking TF for lime in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "lime");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #287 checking TF for lime in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #287 checking TF for lime in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
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
