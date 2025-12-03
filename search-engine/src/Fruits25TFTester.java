import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.*;
public class Fruits25TFTester {public static void main(String[] args) throws Exception{
ProjectTester tester = new ProjectTesterImp(); //Instantiate your own ProjectTester instance here
tester.initialize();
tester.crawl("https://people.scs.carleton.ca/~avamckenney/fruits25/N-0.html");
runTest(tester);}public static void runTest(ProjectTester tester) throws Exception{
PrintWriter failOut = new PrintWriter(new FileWriter("Fruits25-TF-failed.txt"));
PrintWriter passOut = new PrintWriter(new FileWriter("Fruits25-TF-passed.txt"));
double expectedResult;
double yourResult;
//Test #93 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits25/N-9.html
expectedResult = 0.0784313725490196;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-9.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #93 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits25/N-9.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #93 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits25/N-9.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #94 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-9.html
expectedResult = 0.0392156862745098;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-9.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #94 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-9.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #94 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-9.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #95 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-9.html
expectedResult = 0.17647058823529413;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-9.html", "blueberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #95 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-9.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #95 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-9.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #96 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruits25/N-9.html
expectedResult = 0.09803921568627451;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-9.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #96 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruits25/N-9.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #96 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruits25/N-9.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #97 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-9.html
expectedResult = 0.0784313725490196;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-9.html", "strawberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #97 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-9.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #97 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-9.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #98 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits25/N-9.html
expectedResult = 0.0784313725490196;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-9.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #98 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits25/N-9.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #98 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits25/N-9.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #99 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruits25/N-9.html
expectedResult = 0.0392156862745098;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-9.html", "lime");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #99 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruits25/N-9.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #99 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruits25/N-9.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #100 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/fruits25/N-9.html
expectedResult = 0.09803921568627451;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-9.html", "peach");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #100 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/fruits25/N-9.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #100 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/fruits25/N-9.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #101 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits25/N-9.html
expectedResult = 0.058823529411764705;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-9.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #101 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits25/N-9.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #101 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits25/N-9.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #102 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruits25/N-9.html
expectedResult = 0.09803921568627451;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-9.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #102 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruits25/N-9.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #102 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruits25/N-9.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #103 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits25/N-9.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-9.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #103 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits25/N-9.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #103 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits25/N-9.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #104 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits25/N-14.html
expectedResult = 0.06896551724137931;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-14.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #104 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits25/N-14.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #104 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits25/N-14.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #105 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-14.html
expectedResult = 0.10344827586206896;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-14.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #105 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-14.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #105 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-14.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #106 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-14.html
expectedResult = 0.06896551724137931;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-14.html", "blueberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #106 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-14.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #106 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-14.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #107 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruits25/N-14.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-14.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #107 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruits25/N-14.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #107 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruits25/N-14.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #108 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-14.html
expectedResult = 0.034482758620689655;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-14.html", "strawberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #108 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-14.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #108 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-14.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #109 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits25/N-14.html
expectedResult = 0.1724137931034483;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-14.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #109 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits25/N-14.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #109 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits25/N-14.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #110 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruits25/N-14.html
expectedResult = 0.13793103448275862;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-14.html", "lime");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #110 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruits25/N-14.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #110 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruits25/N-14.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #111 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/fruits25/N-14.html
expectedResult = 0.034482758620689655;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-14.html", "peach");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #111 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/fruits25/N-14.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #111 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/fruits25/N-14.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #112 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits25/N-14.html
expectedResult = 0.13793103448275862;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-14.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #112 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits25/N-14.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #112 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits25/N-14.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #113 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruits25/N-14.html
expectedResult = 0.06896551724137931;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-14.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #113 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruits25/N-14.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #113 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruits25/N-14.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #114 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits25/N-14.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-14.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #114 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits25/N-14.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #114 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits25/N-14.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #115 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html
expectedResult = 0.07547169811320754;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #115 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #115 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #116 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html
expectedResult = 0.09433962264150944;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #116 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #116 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #117 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html
expectedResult = 0.09433962264150944;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html", "blueberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #117 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #117 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #118 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html
expectedResult = 0.05660377358490566;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #118 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #118 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #119 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html
expectedResult = 0.1320754716981132;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html", "strawberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #119 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #119 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #120 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html
expectedResult = 0.07547169811320754;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #120 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #120 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #121 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html
expectedResult = 0.07547169811320754;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html", "lime");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #121 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #121 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #122 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html
expectedResult = 0.05660377358490566;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html", "peach");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #122 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #122 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #123 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html
expectedResult = 0.05660377358490566;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #123 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #123 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #124 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html
expectedResult = 0.11320754716981132;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #124 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #124 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #125 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #125 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #125 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #126 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits25/N-22.html
expectedResult = 0.08333333333333333;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-22.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #126 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits25/N-22.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #126 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits25/N-22.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #127 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-22.html
expectedResult = 0.1;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-22.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #127 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-22.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #127 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-22.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #128 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-22.html
expectedResult = 0.06666666666666667;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-22.html", "blueberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #128 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-22.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #128 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-22.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #129 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruits25/N-22.html
expectedResult = 0.06666666666666667;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-22.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #129 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruits25/N-22.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #129 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruits25/N-22.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #130 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-22.html
expectedResult = 0.03333333333333333;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-22.html", "strawberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #130 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-22.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #130 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-22.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #131 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits25/N-22.html
expectedResult = 0.16666666666666666;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-22.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #131 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits25/N-22.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #131 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits25/N-22.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #132 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruits25/N-22.html
expectedResult = 0.06666666666666667;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-22.html", "lime");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #132 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruits25/N-22.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #132 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruits25/N-22.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #133 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/fruits25/N-22.html
expectedResult = 0.016666666666666666;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-22.html", "peach");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #133 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/fruits25/N-22.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #133 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/fruits25/N-22.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #134 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits25/N-22.html
expectedResult = 0.05;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-22.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #134 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits25/N-22.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #134 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits25/N-22.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #135 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruits25/N-22.html
expectedResult = 0.15;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-22.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #135 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruits25/N-22.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #135 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruits25/N-22.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #136 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits25/N-22.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-22.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #136 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits25/N-22.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #136 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits25/N-22.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #137 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html
expectedResult = 0.038461538461538464;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #137 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #137 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #138 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html
expectedResult = 0.019230769230769232;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #138 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #138 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #139 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html
expectedResult = 0.09615384615384616;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html", "blueberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #139 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #139 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #140 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html
expectedResult = 0.038461538461538464;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #140 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #140 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #141 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html
expectedResult = 0.07692307692307693;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html", "strawberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #141 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #141 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #142 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html
expectedResult = 0.019230769230769232;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #142 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #142 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #143 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html
expectedResult = 0.11538461538461539;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html", "lime");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #143 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #143 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #144 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html
expectedResult = 0.07692307692307693;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html", "peach");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #144 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #144 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #145 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html
expectedResult = 0.1346153846153846;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #145 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #145 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #146 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html
expectedResult = 0.09615384615384616;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #146 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #146 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #147 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #147 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #147 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #148 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits25/N-15.html
expectedResult = 0.058823529411764705;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-15.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #148 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits25/N-15.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #148 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits25/N-15.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #149 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-15.html
expectedResult = 0.058823529411764705;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-15.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #149 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-15.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #149 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-15.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #150 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-15.html
expectedResult = 0.0784313725490196;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-15.html", "blueberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #150 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-15.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #150 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-15.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #151 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruits25/N-15.html
expectedResult = 0.09803921568627451;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-15.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #151 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruits25/N-15.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #151 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruits25/N-15.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #152 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-15.html
expectedResult = 0.0784313725490196;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-15.html", "strawberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #152 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-15.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #152 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-15.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #153 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits25/N-15.html
expectedResult = 0.058823529411764705;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-15.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #153 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits25/N-15.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #153 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits25/N-15.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #154 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruits25/N-15.html
expectedResult = 0.13725490196078433;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-15.html", "lime");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #154 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruits25/N-15.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #154 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruits25/N-15.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #155 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/fruits25/N-15.html
expectedResult = 0.058823529411764705;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-15.html", "peach");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #155 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/fruits25/N-15.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #155 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/fruits25/N-15.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #156 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits25/N-15.html
expectedResult = 0.058823529411764705;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-15.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #156 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits25/N-15.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #156 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits25/N-15.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #157 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruits25/N-15.html
expectedResult = 0.13725490196078433;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-15.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #157 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruits25/N-15.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #157 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruits25/N-15.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #158 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits25/N-15.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-15.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #158 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits25/N-15.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #158 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits25/N-15.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #159 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #159 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #159 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #160 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html
expectedResult = 0.17391304347826086;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #160 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #160 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #161 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html
expectedResult = 0.043478260869565216;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html", "blueberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #161 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #161 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #162 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html
expectedResult = 0.043478260869565216;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #162 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #162 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #163 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html
expectedResult = 0.08695652173913043;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html", "strawberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #163 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #163 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #164 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html
expectedResult = 0.13043478260869565;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #164 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #164 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #165 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html
expectedResult = 0.08695652173913043;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html", "lime");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #165 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #165 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #166 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html
expectedResult = 0.08695652173913043;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html", "peach");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #166 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #166 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #167 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html
expectedResult = 0.08695652173913043;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #167 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #167 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #168 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html
expectedResult = 0.13043478260869565;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #168 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #168 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #169 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #169 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #169 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #170 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits25/N-3.html
expectedResult = 0.11428571428571428;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-3.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #170 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits25/N-3.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #170 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits25/N-3.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #171 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-3.html
expectedResult = 0.02857142857142857;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-3.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #171 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-3.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #171 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-3.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #172 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-3.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-3.html", "blueberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #172 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-3.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #172 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-3.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #173 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruits25/N-3.html
expectedResult = 0.11428571428571428;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-3.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #173 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruits25/N-3.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #173 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruits25/N-3.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #174 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-3.html
expectedResult = 0.11428571428571428;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-3.html", "strawberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #174 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-3.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #174 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-3.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #175 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits25/N-3.html
expectedResult = 0.08571428571428572;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-3.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #175 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits25/N-3.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #175 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits25/N-3.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #176 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruits25/N-3.html
expectedResult = 0.05714285714285714;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-3.html", "lime");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #176 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruits25/N-3.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #176 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruits25/N-3.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #177 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/fruits25/N-3.html
expectedResult = 0.05714285714285714;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-3.html", "peach");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #177 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/fruits25/N-3.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #177 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/fruits25/N-3.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #178 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits25/N-3.html
expectedResult = 0.05714285714285714;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-3.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #178 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits25/N-3.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #178 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits25/N-3.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #179 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruits25/N-3.html
expectedResult = 0.05714285714285714;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-3.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #179 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruits25/N-3.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #179 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruits25/N-3.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #180 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits25/N-3.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-3.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #180 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits25/N-3.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #180 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits25/N-3.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #181 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits25/N-1.html
expectedResult = 0.08;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-1.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #181 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits25/N-1.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #181 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits25/N-1.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #182 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-1.html
expectedResult = 0.12;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-1.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #182 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-1.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #182 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-1.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #183 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-1.html
expectedResult = 0.04;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-1.html", "blueberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #183 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-1.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #183 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-1.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #184 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruits25/N-1.html
expectedResult = 0.08;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-1.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #184 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruits25/N-1.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #184 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruits25/N-1.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #185 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-1.html
expectedResult = 0.08;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-1.html", "strawberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #185 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-1.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #185 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-1.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #186 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits25/N-1.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-1.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #186 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits25/N-1.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #186 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits25/N-1.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #187 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruits25/N-1.html
expectedResult = 0.08;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-1.html", "lime");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #187 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruits25/N-1.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #187 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruits25/N-1.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #188 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/fruits25/N-1.html
expectedResult = 0.04;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-1.html", "peach");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #188 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/fruits25/N-1.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #188 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/fruits25/N-1.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #189 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits25/N-1.html
expectedResult = 0.16;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-1.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #189 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits25/N-1.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #189 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits25/N-1.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #190 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruits25/N-1.html
expectedResult = 0.08;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-1.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #190 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruits25/N-1.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #190 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruits25/N-1.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #191 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits25/N-1.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-1.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #191 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits25/N-1.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #191 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits25/N-1.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #192 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html
expectedResult = 0.09259259259259259;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #192 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #192 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #193 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html
expectedResult = 0.07407407407407407;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #193 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #193 checking TF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #194 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html
expectedResult = 0.09259259259259259;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html", "blueberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #194 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #194 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #195 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #195 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #195 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #196 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html
expectedResult = 0.07407407407407407;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html", "strawberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #196 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #196 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #197 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html
expectedResult = 0.09259259259259259;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #197 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #197 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #198 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html
expectedResult = 0.1111111111111111;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html", "lime");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #198 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #198 checking TF for lime in https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #199 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html
expectedResult = 0.018518518518518517;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html", "peach");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #199 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #199 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #200 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html
expectedResult = 0.09259259259259259;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #200 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #200 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #201 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html
expectedResult = 0.18518518518518517;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #201 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #201 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #202 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #202 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #202 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #203 checking TF for banana in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #203 checking TF for banana in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #203 checking TF for banana in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #204 checking TF for cherry in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #204 checking TF for cherry in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #204 checking TF for cherry in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #205 checking TF for blueberry in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "blueberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #205 checking TF for blueberry in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #205 checking TF for blueberry in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #206 checking TF for apple in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #206 checking TF for apple in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #206 checking TF for apple in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #207 checking TF for strawberry in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "strawberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #207 checking TF for strawberry in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #207 checking TF for strawberry in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #208 checking TF for fig in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #208 checking TF for fig in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #208 checking TF for fig in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #209 checking TF for lime in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "lime");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #209 checking TF for lime in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #209 checking TF for lime in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #210 checking TF for peach in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "peach");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #210 checking TF for peach in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #210 checking TF for peach in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #211 checking TF for papaya in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #211 checking TF for papaya in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #211 checking TF for papaya in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #212 checking TF for pear in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #212 checking TF for pear in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #212 checking TF for pear in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #213 checking TF for tomato in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #213 checking TF for tomato in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #213 checking TF for tomato in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

failOut.close();
passOut.close();
}
}
