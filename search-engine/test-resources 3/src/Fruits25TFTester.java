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
//Test #93 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits25/N-19.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-19.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #93 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits25/N-19.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #93 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits25/N-19.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #94 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruits25/N-19.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-19.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #94 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruits25/N-19.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #94 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruits25/N-19.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #95 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits25/N-19.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-19.html", "kiwi");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #95 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits25/N-19.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #95 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits25/N-19.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #96 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits25/N-19.html
expectedResult = 0.06666666666666667;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-19.html", "apricot");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #96 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits25/N-19.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #96 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits25/N-19.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #97 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-19.html
expectedResult = 0.26666666666666666;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-19.html", "strawberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #97 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-19.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #97 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-19.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #98 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits25/N-19.html
expectedResult = 0.06666666666666667;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-19.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #98 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits25/N-19.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #98 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits25/N-19.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #99 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/fruits25/N-19.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-19.html", "peach");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #99 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/fruits25/N-19.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #99 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/fruits25/N-19.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #100 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-19.html
expectedResult = 0.13333333333333333;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-19.html", "blueberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #100 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-19.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #100 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-19.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #101 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits25/N-19.html
expectedResult = 0.06666666666666667;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-19.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #101 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits25/N-19.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #101 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits25/N-19.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #102 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruits25/N-19.html
expectedResult = 0.13333333333333333;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-19.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #102 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruits25/N-19.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #102 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruits25/N-19.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #103 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits25/N-19.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-19.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #103 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits25/N-19.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #103 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits25/N-19.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #104 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits25/N-4.html
expectedResult = 0.07352941176470588;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-4.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #104 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits25/N-4.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #104 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits25/N-4.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #105 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruits25/N-4.html
expectedResult = 0.10294117647058823;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-4.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #105 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruits25/N-4.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #105 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruits25/N-4.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #106 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits25/N-4.html
expectedResult = 0.029411764705882353;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-4.html", "kiwi");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #106 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits25/N-4.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #106 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits25/N-4.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #107 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits25/N-4.html
expectedResult = 0.04411764705882353;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-4.html", "apricot");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #107 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits25/N-4.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #107 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits25/N-4.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #108 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-4.html
expectedResult = 0.029411764705882353;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-4.html", "strawberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #108 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-4.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #108 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-4.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #109 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits25/N-4.html
expectedResult = 0.04411764705882353;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-4.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #109 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits25/N-4.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #109 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits25/N-4.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #110 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/fruits25/N-4.html
expectedResult = 0.14705882352941177;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-4.html", "peach");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #110 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/fruits25/N-4.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #110 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/fruits25/N-4.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #111 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-4.html
expectedResult = 0.10294117647058823;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-4.html", "blueberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #111 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-4.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #111 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-4.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #112 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits25/N-4.html
expectedResult = 0.058823529411764705;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-4.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #112 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits25/N-4.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #112 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits25/N-4.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #113 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruits25/N-4.html
expectedResult = 0.10294117647058823;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-4.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #113 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruits25/N-4.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #113 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruits25/N-4.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #114 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits25/N-4.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-4.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #114 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits25/N-4.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #114 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits25/N-4.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #115 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html
expectedResult = 0.038461538461538464;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #115 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #115 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #116 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html
expectedResult = 0.09615384615384616;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #116 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #116 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #117 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html
expectedResult = 0.11538461538461539;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html", "kiwi");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #117 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #117 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #118 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html
expectedResult = 0.09615384615384616;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html", "apricot");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #118 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #118 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #119 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html
expectedResult = 0.07692307692307693;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html", "strawberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #119 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #119 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #120 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html
expectedResult = 0.1346153846153846;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #120 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #120 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #121 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html
expectedResult = 0.07692307692307693;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html", "peach");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #121 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #121 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #122 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html
expectedResult = 0.09615384615384616;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html", "blueberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #122 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #122 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #123 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html
expectedResult = 0.019230769230769232;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #123 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #123 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #124 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html
expectedResult = 0.038461538461538464;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #124 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #124 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #125 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #125 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #125 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits25/N-6.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #126 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #126 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #126 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #127 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html
expectedResult = 0.13043478260869565;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #127 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #127 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #128 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html
expectedResult = 0.043478260869565216;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html", "kiwi");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #128 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #128 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #129 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html
expectedResult = 0.08695652173913043;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html", "apricot");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #129 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #129 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #130 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html
expectedResult = 0.08695652173913043;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html", "strawberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #130 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #130 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #131 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html
expectedResult = 0.08695652173913043;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #131 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #131 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #132 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html
expectedResult = 0.08695652173913043;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html", "peach");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #132 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #132 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #133 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html
expectedResult = 0.043478260869565216;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html", "blueberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #133 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #133 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #134 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html
expectedResult = 0.13043478260869565;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #134 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #134 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #135 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html
expectedResult = 0.043478260869565216;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #135 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #135 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #136 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #136 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #136 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits25/N-11.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #137 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html
expectedResult = 0.07547169811320754;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #137 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #137 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #138 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html
expectedResult = 0.11320754716981132;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #138 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #138 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #139 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html
expectedResult = 0.05660377358490566;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html", "kiwi");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #139 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #139 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #140 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html
expectedResult = 0.07547169811320754;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html", "apricot");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #140 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #140 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #141 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html
expectedResult = 0.1320754716981132;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html", "strawberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #141 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #141 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #142 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html
expectedResult = 0.05660377358490566;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #142 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #142 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #143 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html
expectedResult = 0.05660377358490566;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html", "peach");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #143 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #143 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #144 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html
expectedResult = 0.09433962264150944;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html", "blueberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #144 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #144 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #145 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html
expectedResult = 0.07547169811320754;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #145 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #145 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #146 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html
expectedResult = 0.05660377358490566;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #146 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #146 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #147 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #147 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #147 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits25/N-24.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #148 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html
expectedResult = 0.09259259259259259;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #148 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #148 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #149 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html
expectedResult = 0.18518518518518517;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #149 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #149 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #150 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html
expectedResult = 0.07407407407407407;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html", "kiwi");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #150 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #150 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #151 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html
expectedResult = 0.018518518518518517;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html", "apricot");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #151 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #151 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #152 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html
expectedResult = 0.07407407407407407;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html", "strawberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #152 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #152 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #153 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html
expectedResult = 0.09259259259259259;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #153 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #153 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #154 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html
expectedResult = 0.018518518518518517;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html", "peach");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #154 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #154 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #155 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html
expectedResult = 0.09259259259259259;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html", "blueberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #155 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #155 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #156 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html
expectedResult = 0.09259259259259259;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #156 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #156 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #157 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #157 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #157 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #158 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #158 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #158 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits25/N-23.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #159 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html
expectedResult = 0.1016949152542373;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #159 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #159 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #160 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html
expectedResult = 0.05084745762711865;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #160 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #160 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #161 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html
expectedResult = 0.0847457627118644;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html", "kiwi");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #161 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #161 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #162 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html
expectedResult = 0.11864406779661017;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html", "apricot");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #162 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #162 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #163 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html
expectedResult = 0.1016949152542373;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html", "strawberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #163 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #163 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #164 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html
expectedResult = 0.05084745762711865;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #164 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #164 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #165 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html
expectedResult = 0.1016949152542373;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html", "peach");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #165 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #165 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #166 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html
expectedResult = 0.0847457627118644;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html", "blueberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #166 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #166 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #167 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html
expectedResult = 0.0847457627118644;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #167 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #167 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #168 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html
expectedResult = 0.06779661016949153;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #168 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #168 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #169 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #169 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #169 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits25/N-2.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #170 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits25/N-12.html
expectedResult = 0.14;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-12.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #170 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits25/N-12.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #170 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits25/N-12.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #171 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruits25/N-12.html
expectedResult = 0.04;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-12.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #171 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruits25/N-12.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #171 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruits25/N-12.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #172 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits25/N-12.html
expectedResult = 0.08;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-12.html", "kiwi");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #172 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits25/N-12.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #172 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits25/N-12.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #173 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits25/N-12.html
expectedResult = 0.1;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-12.html", "apricot");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #173 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits25/N-12.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #173 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits25/N-12.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #174 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-12.html
expectedResult = 0.06;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-12.html", "strawberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #174 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-12.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #174 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-12.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #175 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits25/N-12.html
expectedResult = 0.06;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-12.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #175 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits25/N-12.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #175 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits25/N-12.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #176 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/fruits25/N-12.html
expectedResult = 0.14;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-12.html", "peach");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #176 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/fruits25/N-12.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #176 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/fruits25/N-12.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #177 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-12.html
expectedResult = 0.02;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-12.html", "blueberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #177 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-12.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #177 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-12.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #178 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits25/N-12.html
expectedResult = 0.04;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-12.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #178 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits25/N-12.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #178 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits25/N-12.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #179 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruits25/N-12.html
expectedResult = 0.08;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-12.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #179 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruits25/N-12.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #179 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruits25/N-12.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #180 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits25/N-12.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-12.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #180 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits25/N-12.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #180 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits25/N-12.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #181 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits25/N-9.html
expectedResult = 0.0784313725490196;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-9.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #181 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits25/N-9.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #181 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits25/N-9.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #182 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruits25/N-9.html
expectedResult = 0.09803921568627451;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-9.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #182 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruits25/N-9.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #182 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruits25/N-9.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #183 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits25/N-9.html
expectedResult = 0.058823529411764705;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-9.html", "kiwi");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #183 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits25/N-9.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #183 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits25/N-9.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #184 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits25/N-9.html
expectedResult = 0.058823529411764705;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-9.html", "apricot");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #184 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits25/N-9.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #184 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits25/N-9.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #185 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-9.html
expectedResult = 0.0784313725490196;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-9.html", "strawberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #185 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-9.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #185 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-9.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #186 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits25/N-9.html
expectedResult = 0.058823529411764705;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-9.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #186 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits25/N-9.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #186 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits25/N-9.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #187 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/fruits25/N-9.html
expectedResult = 0.09803921568627451;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-9.html", "peach");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #187 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/fruits25/N-9.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #187 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/fruits25/N-9.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #188 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-9.html
expectedResult = 0.17647058823529413;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-9.html", "blueberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #188 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-9.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #188 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-9.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #189 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits25/N-9.html
expectedResult = 0.0784313725490196;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-9.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #189 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits25/N-9.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #189 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits25/N-9.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #190 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruits25/N-9.html
expectedResult = 0.09803921568627451;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-9.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #190 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruits25/N-9.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #190 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruits25/N-9.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #191 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits25/N-9.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-9.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #191 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits25/N-9.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #191 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits25/N-9.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #192 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits25/N-7.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-7.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #192 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits25/N-7.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #192 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/fruits25/N-7.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #193 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruits25/N-7.html
expectedResult = 0.2;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-7.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #193 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruits25/N-7.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #193 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/fruits25/N-7.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #194 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits25/N-7.html
expectedResult = 0.1;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-7.html", "kiwi");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #194 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits25/N-7.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #194 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits25/N-7.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #195 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits25/N-7.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-7.html", "apricot");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #195 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits25/N-7.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #195 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits25/N-7.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #196 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-7.html
expectedResult = 0.1;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-7.html", "strawberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #196 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-7.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #196 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-7.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #197 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits25/N-7.html
expectedResult = 0.1;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-7.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #197 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits25/N-7.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #197 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits25/N-7.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #198 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/fruits25/N-7.html
expectedResult = 0.2;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-7.html", "peach");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #198 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/fruits25/N-7.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #198 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/fruits25/N-7.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #199 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-7.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-7.html", "blueberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #199 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-7.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #199 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/fruits25/N-7.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #200 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits25/N-7.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-7.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #200 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits25/N-7.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #200 checking TF for fig in https://people.scs.carleton.ca/~avamckenney/fruits25/N-7.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #201 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruits25/N-7.html
expectedResult = 0.1;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-7.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #201 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruits25/N-7.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #201 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/fruits25/N-7.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #202 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits25/N-7.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/fruits25/N-7.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #202 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits25/N-7.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #202 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits25/N-7.html");
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

//Test #204 checking TF for pear in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #204 checking TF for pear in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #204 checking TF for pear in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #205 checking TF for kiwi in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "kiwi");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #205 checking TF for kiwi in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #205 checking TF for kiwi in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #206 checking TF for apricot in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "apricot");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #206 checking TF for apricot in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #206 checking TF for apricot in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
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

//Test #208 checking TF for papaya in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #208 checking TF for papaya in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #208 checking TF for papaya in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #209 checking TF for peach in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "peach");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #209 checking TF for peach in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #209 checking TF for peach in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #210 checking TF for blueberry in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "blueberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #210 checking TF for blueberry in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #210 checking TF for blueberry in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #211 checking TF for fig in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #211 checking TF for fig in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #211 checking TF for fig in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #212 checking TF for apple in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #212 checking TF for apple in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #212 checking TF for apple in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
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
