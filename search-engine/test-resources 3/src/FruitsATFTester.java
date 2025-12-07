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
//Test #218 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-47.html
expectedResult = 0.14634146341463414;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-47.html", "kiwi");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #218 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-47.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #218 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-47.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #219 checking TF for coconut in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-47.html
expectedResult = 0.0975609756097561;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-47.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #219 checking TF for coconut in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-47.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #219 checking TF for coconut in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-47.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #220 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-47.html
expectedResult = 0.04878048780487805;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-47.html", "strawberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #220 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-47.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #220 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-47.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #221 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-47.html
expectedResult = 0.07317073170731707;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-47.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #221 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-47.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #221 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-47.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #222 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-47.html
expectedResult = 0.07317073170731707;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-47.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #222 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-47.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #222 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-47.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #223 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-47.html
expectedResult = 0.12195121951219512;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-47.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #223 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-47.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #223 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-47.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #224 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-47.html
expectedResult = 0.024390243902439025;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-47.html", "peach");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #224 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-47.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #224 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-47.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #225 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-47.html
expectedResult = 0.024390243902439025;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-47.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #225 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-47.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #225 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-47.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #226 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-47.html
expectedResult = 0.0975609756097561;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-47.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #226 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-47.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #226 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-47.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #227 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-47.html
expectedResult = 0.0975609756097561;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-47.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #227 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-47.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #227 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-47.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #228 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-47.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-47.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #228 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-47.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #228 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-47.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #229 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-49.html
expectedResult = 0.06451612903225806;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-49.html", "kiwi");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #229 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-49.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #229 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-49.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #230 checking TF for coconut in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-49.html
expectedResult = 0.06451612903225806;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-49.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #230 checking TF for coconut in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-49.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #230 checking TF for coconut in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-49.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #231 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-49.html
expectedResult = 0.12903225806451613;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-49.html", "strawberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #231 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-49.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #231 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-49.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #232 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-49.html
expectedResult = 0.12903225806451613;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-49.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #232 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-49.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #232 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-49.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #233 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-49.html
expectedResult = 0.03225806451612903;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-49.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #233 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-49.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #233 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-49.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #234 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-49.html
expectedResult = 0.03225806451612903;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-49.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #234 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-49.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #234 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-49.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #235 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-49.html
expectedResult = 0.03225806451612903;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-49.html", "peach");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #235 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-49.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #235 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-49.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #236 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-49.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-49.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #236 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-49.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #236 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-49.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #237 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-49.html
expectedResult = 0.12903225806451613;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-49.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #237 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-49.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #237 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-49.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #238 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-49.html
expectedResult = 0.06451612903225806;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-49.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #238 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-49.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #238 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-49.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #239 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-49.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-49.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #239 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-49.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #239 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-49.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #240 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-8.html
expectedResult = 0.10256410256410256;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-8.html", "kiwi");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #240 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-8.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #240 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-8.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #241 checking TF for coconut in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-8.html
expectedResult = 0.05128205128205128;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-8.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #241 checking TF for coconut in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-8.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #241 checking TF for coconut in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-8.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #242 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-8.html
expectedResult = 0.07692307692307693;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-8.html", "strawberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #242 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-8.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #242 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-8.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #243 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-8.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-8.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #243 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-8.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #243 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-8.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #244 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-8.html
expectedResult = 0.07692307692307693;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-8.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #244 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-8.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #244 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-8.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #245 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-8.html
expectedResult = 0.07692307692307693;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-8.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #245 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-8.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #245 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-8.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #246 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-8.html
expectedResult = 0.07692307692307693;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-8.html", "peach");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #246 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-8.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #246 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-8.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #247 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-8.html
expectedResult = 0.1282051282051282;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-8.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #247 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-8.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #247 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-8.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #248 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-8.html
expectedResult = 0.10256410256410256;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-8.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #248 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-8.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #248 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-8.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #249 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-8.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-8.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #249 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-8.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #249 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-8.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #250 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-8.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-8.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #250 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-8.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #250 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-8.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #251 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-22.html
expectedResult = 0.08695652173913043;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-22.html", "kiwi");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #251 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-22.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #251 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-22.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #252 checking TF for coconut in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-22.html
expectedResult = 0.043478260869565216;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-22.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #252 checking TF for coconut in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-22.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #252 checking TF for coconut in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-22.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #253 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-22.html
expectedResult = 0.08695652173913043;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-22.html", "strawberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #253 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-22.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #253 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-22.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #254 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-22.html
expectedResult = 0.17391304347826086;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-22.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #254 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-22.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #254 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-22.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #255 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-22.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-22.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #255 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-22.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #255 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-22.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #256 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-22.html
expectedResult = 0.06521739130434782;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-22.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #256 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-22.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #256 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-22.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #257 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-22.html
expectedResult = 0.15217391304347827;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-22.html", "peach");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #257 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-22.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #257 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-22.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #258 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-22.html
expectedResult = 0.06521739130434782;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-22.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #258 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-22.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #258 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-22.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #259 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-22.html
expectedResult = 0.13043478260869565;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-22.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #259 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-22.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #259 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-22.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #260 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-22.html
expectedResult = 0.043478260869565216;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-22.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #260 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-22.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #260 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-22.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #261 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-22.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-22.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #261 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-22.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #261 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-22.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #262 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-39.html
expectedResult = 0.14285714285714285;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-39.html", "kiwi");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #262 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-39.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #262 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-39.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #263 checking TF for coconut in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-39.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-39.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #263 checking TF for coconut in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-39.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #263 checking TF for coconut in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-39.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #264 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-39.html
expectedResult = 0.07142857142857142;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-39.html", "strawberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #264 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-39.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #264 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-39.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #265 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-39.html
expectedResult = 0.2857142857142857;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-39.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #265 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-39.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #265 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-39.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #266 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-39.html
expectedResult = 0.14285714285714285;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-39.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #266 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-39.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #266 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-39.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #267 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-39.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-39.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #267 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-39.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #267 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-39.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #268 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-39.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-39.html", "peach");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #268 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-39.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #268 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-39.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #269 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-39.html
expectedResult = 0.07142857142857142;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-39.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #269 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-39.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #269 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-39.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #270 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-39.html
expectedResult = 0.14285714285714285;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-39.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #270 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-39.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #270 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-39.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #271 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-39.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-39.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #271 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-39.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #271 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-39.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #272 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-39.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-39.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #272 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-39.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #272 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-39.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #273 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-18.html
expectedResult = 0.03571428571428571;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-18.html", "kiwi");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #273 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-18.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #273 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-18.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #274 checking TF for coconut in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-18.html
expectedResult = 0.17857142857142858;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-18.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #274 checking TF for coconut in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-18.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #274 checking TF for coconut in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-18.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #275 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-18.html
expectedResult = 0.14285714285714285;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-18.html", "strawberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #275 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-18.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #275 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-18.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #276 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-18.html
expectedResult = 0.03571428571428571;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-18.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #276 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-18.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #276 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-18.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #277 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-18.html
expectedResult = 0.17857142857142858;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-18.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #277 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-18.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #277 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-18.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #278 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-18.html
expectedResult = 0.10714285714285714;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-18.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #278 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-18.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #278 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-18.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #279 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-18.html
expectedResult = 0.03571428571428571;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-18.html", "peach");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #279 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-18.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #279 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-18.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #280 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-18.html
expectedResult = 0.03571428571428571;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-18.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #280 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-18.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #280 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-18.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #281 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-18.html
expectedResult = 0.07142857142857142;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-18.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #281 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-18.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #281 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-18.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #282 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-18.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-18.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #282 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-18.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #282 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-18.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #283 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-18.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-18.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #283 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-18.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #283 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-18.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #284 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-8.html
expectedResult = 0.11538461538461539;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-8.html", "kiwi");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #284 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-8.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #284 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-8.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #285 checking TF for coconut in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-8.html
expectedResult = 0.038461538461538464;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-8.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #285 checking TF for coconut in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-8.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #285 checking TF for coconut in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-8.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #286 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-8.html
expectedResult = 0.19230769230769232;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-8.html", "strawberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #286 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-8.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #286 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-8.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #287 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-8.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-8.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #287 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-8.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #287 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-8.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #288 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-8.html
expectedResult = 0.11538461538461539;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-8.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #288 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-8.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #288 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-8.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #289 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-8.html
expectedResult = 0.07692307692307693;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-8.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #289 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-8.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #289 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-8.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #290 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-8.html
expectedResult = 0.07692307692307693;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-8.html", "peach");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #290 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-8.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #290 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-8.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #291 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-8.html
expectedResult = 0.038461538461538464;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-8.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #291 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-8.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #291 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-8.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #292 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-8.html
expectedResult = 0.15384615384615385;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-8.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #292 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-8.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #292 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-8.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #293 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-8.html
expectedResult = 0.038461538461538464;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-8.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #293 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-8.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #293 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-8.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #294 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-8.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-8.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #294 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-8.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #294 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-8.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #295 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-29.html
expectedResult = 0.015384615384615385;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-29.html", "kiwi");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #295 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-29.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #295 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-29.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #296 checking TF for coconut in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-29.html
expectedResult = 0.046153846153846156;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-29.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #296 checking TF for coconut in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-29.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #296 checking TF for coconut in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-29.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #297 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-29.html
expectedResult = 0.07692307692307693;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-29.html", "strawberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #297 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-29.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #297 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-29.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #298 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-29.html
expectedResult = 0.06153846153846154;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-29.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #298 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-29.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #298 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-29.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #299 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-29.html
expectedResult = 0.015384615384615385;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-29.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #299 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-29.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #299 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-29.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #300 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-29.html
expectedResult = 0.03076923076923077;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-29.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #300 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-29.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #300 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-29.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #301 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-29.html
expectedResult = 0.12307692307692308;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-29.html", "peach");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #301 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-29.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #301 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-29.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #302 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-29.html
expectedResult = 0.1076923076923077;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-29.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #302 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-29.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #302 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-29.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #303 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-29.html
expectedResult = 0.09230769230769231;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-29.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #303 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-29.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #303 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-29.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #304 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-29.html
expectedResult = 0.046153846153846156;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-29.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #304 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-29.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #304 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-29.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #305 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-29.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-29.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #305 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-29.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #305 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-29.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #306 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-31.html
expectedResult = 0.05714285714285714;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-31.html", "kiwi");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #306 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-31.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #306 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-31.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #307 checking TF for coconut in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-31.html
expectedResult = 0.05714285714285714;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-31.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #307 checking TF for coconut in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-31.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #307 checking TF for coconut in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-31.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #308 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-31.html
expectedResult = 0.14285714285714285;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-31.html", "strawberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #308 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-31.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #308 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-31.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #309 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-31.html
expectedResult = 0.11428571428571428;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-31.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #309 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-31.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #309 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-31.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #310 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-31.html
expectedResult = 0.11428571428571428;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-31.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #310 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-31.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #310 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-31.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #311 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-31.html
expectedResult = 0.02857142857142857;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-31.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #311 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-31.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #311 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-31.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #312 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-31.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-31.html", "peach");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #312 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-31.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #312 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-31.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #313 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-31.html
expectedResult = 0.05714285714285714;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-31.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #313 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-31.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #313 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-31.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #314 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-31.html
expectedResult = 0.11428571428571428;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-31.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #314 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-31.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #314 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-31.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #315 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-31.html
expectedResult = 0.02857142857142857;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-31.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #315 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-31.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #315 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-31.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #316 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-31.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-31.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #316 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-31.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #316 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-31.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #317 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-32.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-32.html", "kiwi");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #317 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-32.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #317 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-32.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #318 checking TF for coconut in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-32.html
expectedResult = 0.03125;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-32.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #318 checking TF for coconut in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-32.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #318 checking TF for coconut in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-32.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #319 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-32.html
expectedResult = 0.0625;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-32.html", "strawberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #319 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-32.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #319 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-32.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #320 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-32.html
expectedResult = 0.125;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-32.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #320 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-32.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #320 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-32.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #321 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-32.html
expectedResult = 0.0625;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-32.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #321 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-32.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #321 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-32.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #322 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-32.html
expectedResult = 0.125;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-32.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #322 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-32.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #322 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-32.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #323 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-32.html
expectedResult = 0.0625;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-32.html", "peach");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #323 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-32.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #323 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-32.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #324 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-32.html
expectedResult = 0.125;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-32.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #324 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-32.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #324 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-32.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #325 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-32.html
expectedResult = 0.0625;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-32.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #325 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-32.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #325 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-32.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #326 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-32.html
expectedResult = 0.125;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-32.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #326 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-32.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #326 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-32.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #327 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-32.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-32.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #327 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-32.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #327 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-32.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #328 checking TF for kiwi in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "kiwi");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #328 checking TF for kiwi in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #328 checking TF for kiwi in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #329 checking TF for coconut in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #329 checking TF for coconut in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #329 checking TF for coconut in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #330 checking TF for strawberry in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "strawberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #330 checking TF for strawberry in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #330 checking TF for strawberry in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #331 checking TF for pear in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #331 checking TF for pear in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #331 checking TF for pear in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
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

//Test #333 checking TF for cherry in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #333 checking TF for cherry in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #333 checking TF for cherry in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #334 checking TF for peach in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "peach");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #334 checking TF for peach in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #334 checking TF for peach in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
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

//Test #336 checking TF for banana in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #336 checking TF for banana in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #336 checking TF for banana in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #337 checking TF for apple in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #337 checking TF for apple in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #337 checking TF for apple in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
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
