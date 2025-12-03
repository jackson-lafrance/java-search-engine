import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.*;
public class TinyFruitsATFTester {public static void main(String[] args) throws Exception{
ProjectTester tester = new ProjectTesterImp(); //Instantiate your own ProjectTester instance here
tester.initialize();
tester.crawl("https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-0.html");
runTest(tester);}public static void runTest(ProjectTester tester) throws Exception{
PrintWriter failOut = new PrintWriter(new FileWriter("TinyFruitsA-TF-failed.txt"));
PrintWriter passOut = new PrintWriter(new FileWriter("TinyFruitsA-TF-passed.txt"));
double expectedResult;
double yourResult;
//Test #48 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-3.html
expectedResult = 0.10344827586206896;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-3.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #48 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-3.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #48 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-3.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #49 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-3.html
expectedResult = 0.06896551724137931;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-3.html", "peach");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #49 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-3.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #49 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-3.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #50 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-3.html
expectedResult = 0.20689655172413793;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-3.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #50 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-3.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #50 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-3.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #51 checking TF for coconut in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-3.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-3.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #51 checking TF for coconut in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-3.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #51 checking TF for coconut in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-3.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #52 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-3.html
expectedResult = 0.034482758620689655;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-3.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #52 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-3.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #52 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-3.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #53 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-3.html
expectedResult = 0.034482758620689655;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-3.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #53 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-3.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #53 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-3.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #54 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-3.html
expectedResult = 0.10344827586206896;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-3.html", "blueberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #54 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-3.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #54 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-3.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #55 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-3.html
expectedResult = 0.034482758620689655;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-3.html", "strawberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #55 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-3.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #55 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-3.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #56 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-3.html
expectedResult = 0.06896551724137931;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-3.html", "apricot");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #56 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-3.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #56 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-3.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #57 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-3.html
expectedResult = 0.06896551724137931;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-3.html", "kiwi");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #57 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-3.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #57 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-3.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #58 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-3.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-3.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #58 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-3.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #58 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-3.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #59 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-1.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-1.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #59 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-1.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #59 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-1.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #60 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-1.html
expectedResult = 0.26666666666666666;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-1.html", "peach");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #60 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-1.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #60 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-1.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #61 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-1.html
expectedResult = 0.06666666666666667;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-1.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #61 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-1.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #61 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-1.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #62 checking TF for coconut in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-1.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-1.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #62 checking TF for coconut in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-1.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #62 checking TF for coconut in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-1.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #63 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-1.html
expectedResult = 0.06666666666666667;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-1.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #63 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-1.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #63 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-1.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #64 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-1.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-1.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #64 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-1.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #64 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-1.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #65 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-1.html
expectedResult = 0.13333333333333333;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-1.html", "blueberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #65 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-1.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #65 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-1.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #66 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-1.html
expectedResult = 0.2;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-1.html", "strawberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #66 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-1.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #66 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-1.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #67 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-1.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-1.html", "apricot");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #67 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-1.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #67 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-1.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #68 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-1.html
expectedResult = 0.06666666666666667;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-1.html", "kiwi");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #68 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-1.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #68 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-1.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #69 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-1.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-1.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #69 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-1.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #69 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-1.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #70 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-1.html
expectedResult = 0.10344827586206896;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-1.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #70 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-1.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #70 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-1.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #71 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-1.html
expectedResult = 0.1724137931034483;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-1.html", "peach");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #71 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-1.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #71 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-1.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #72 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-1.html
expectedResult = 0.06896551724137931;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-1.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #72 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-1.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #72 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-1.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #73 checking TF for coconut in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-1.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-1.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #73 checking TF for coconut in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-1.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #73 checking TF for coconut in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-1.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #74 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-1.html
expectedResult = 0.034482758620689655;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-1.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #74 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-1.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #74 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-1.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #75 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-1.html
expectedResult = 0.13793103448275862;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-1.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #75 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-1.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #75 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-1.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #76 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-1.html
expectedResult = 0.10344827586206896;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-1.html", "blueberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #76 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-1.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #76 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-1.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #77 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-1.html
expectedResult = 0.034482758620689655;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-1.html", "strawberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #77 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-1.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #77 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-1.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #78 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-1.html
expectedResult = 0.06896551724137931;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-1.html", "apricot");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #78 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-1.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #78 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-1.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #79 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-1.html
expectedResult = 0.10344827586206896;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-1.html", "kiwi");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #79 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-1.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #79 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-1.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #80 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-1.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-1.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #80 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-1.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #80 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-1.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #81 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-3.html
expectedResult = 0.2;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-3.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #81 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-3.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #81 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-3.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #82 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-3.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-3.html", "peach");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #82 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-3.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #82 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-3.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #83 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-3.html
expectedResult = 0.15;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-3.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #83 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-3.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #83 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-3.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #84 checking TF for coconut in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-3.html
expectedResult = 0.05;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-3.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #84 checking TF for coconut in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-3.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #84 checking TF for coconut in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-3.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #85 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-3.html
expectedResult = 0.2;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-3.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #85 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-3.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #85 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-3.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #86 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-3.html
expectedResult = 0.05;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-3.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #86 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-3.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #86 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-3.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #87 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-3.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-3.html", "blueberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #87 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-3.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #87 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-3.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #88 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-3.html
expectedResult = 0.05;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-3.html", "strawberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #88 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-3.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #88 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-3.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #89 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-3.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-3.html", "apricot");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #89 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-3.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #89 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-3.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #90 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-3.html
expectedResult = 0.1;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-3.html", "kiwi");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #90 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-3.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #90 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-3.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #91 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-3.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-3.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #91 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-3.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #91 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-3.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #92 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-4.html
expectedResult = 0.08333333333333333;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-4.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #92 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-4.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #92 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-4.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #93 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-4.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-4.html", "peach");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #93 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-4.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #93 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-4.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #94 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-4.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-4.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #94 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-4.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #94 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-4.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #95 checking TF for coconut in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-4.html
expectedResult = 0.1111111111111111;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-4.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #95 checking TF for coconut in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-4.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #95 checking TF for coconut in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-4.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #96 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-4.html
expectedResult = 0.16666666666666666;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-4.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #96 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-4.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #96 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-4.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #97 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-4.html
expectedResult = 0.08333333333333333;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-4.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #97 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-4.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #97 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-4.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #98 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-4.html
expectedResult = 0.05555555555555555;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-4.html", "blueberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #98 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-4.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #98 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-4.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #99 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-4.html
expectedResult = 0.16666666666666666;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-4.html", "strawberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #99 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-4.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #99 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-4.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #100 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-4.html
expectedResult = 0.08333333333333333;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-4.html", "apricot");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #100 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-4.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #100 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-4.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #101 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-4.html
expectedResult = 0.1111111111111111;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-4.html", "kiwi");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #101 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-4.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #101 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-4.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #102 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-4.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-4.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #102 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-4.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #102 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-4.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #103 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-2.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-2.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #103 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-2.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #103 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-2.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #104 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-2.html
expectedResult = 0.06666666666666667;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-2.html", "peach");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #104 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-2.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #104 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-2.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #105 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-2.html
expectedResult = 0.06666666666666667;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-2.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #105 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-2.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #105 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-2.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #106 checking TF for coconut in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-2.html
expectedResult = 0.06666666666666667;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-2.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #106 checking TF for coconut in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-2.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #106 checking TF for coconut in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-2.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #107 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-2.html
expectedResult = 0.2;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-2.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #107 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-2.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #107 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-2.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #108 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-2.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-2.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #108 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-2.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #108 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-2.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #109 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-2.html
expectedResult = 0.06666666666666667;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-2.html", "blueberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #109 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-2.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #109 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-2.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #110 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-2.html
expectedResult = 0.13333333333333333;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-2.html", "strawberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #110 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-2.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #110 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-2.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #111 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-2.html
expectedResult = 0.06666666666666667;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-2.html", "apricot");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #111 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-2.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #111 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-2.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #112 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-2.html
expectedResult = 0.06666666666666667;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-2.html", "kiwi");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #112 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-2.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #112 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-2.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #113 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-2.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-2.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #113 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-2.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #113 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-2.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #114 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-2.html
expectedResult = 0.047619047619047616;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-2.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #114 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-2.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #114 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-2.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #115 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-2.html
expectedResult = 0.14285714285714285;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-2.html", "peach");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #115 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-2.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #115 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-2.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #116 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-2.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-2.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #116 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-2.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #116 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-2.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #117 checking TF for coconut in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-2.html
expectedResult = 0.07142857142857142;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-2.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #117 checking TF for coconut in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-2.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #117 checking TF for coconut in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-2.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #118 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-2.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-2.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #118 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-2.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #118 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-2.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #119 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-2.html
expectedResult = 0.07142857142857142;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-2.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #119 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-2.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #119 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-2.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #120 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-2.html
expectedResult = 0.07142857142857142;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-2.html", "blueberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #120 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-2.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #120 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-2.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #121 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-2.html
expectedResult = 0.07142857142857142;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-2.html", "strawberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #121 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-2.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #121 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-2.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #122 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-2.html
expectedResult = 0.11904761904761904;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-2.html", "apricot");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #122 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-2.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #122 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-2.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #123 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-2.html
expectedResult = 0.07142857142857142;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-2.html", "kiwi");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #123 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-2.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #123 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-2.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #124 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-2.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-2.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #124 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-2.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #124 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-2.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #125 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-4.html
expectedResult = 0.03333333333333333;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-4.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #125 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-4.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #125 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-4.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #126 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-4.html
expectedResult = 0.06666666666666667;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-4.html", "peach");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #126 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-4.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #126 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-4.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #127 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-4.html
expectedResult = 0.03333333333333333;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-4.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #127 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-4.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #127 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-4.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #128 checking TF for coconut in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-4.html
expectedResult = 0.06666666666666667;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-4.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #128 checking TF for coconut in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-4.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #128 checking TF for coconut in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-4.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #129 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-4.html
expectedResult = 0.13333333333333333;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-4.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #129 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-4.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #129 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-4.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #130 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-4.html
expectedResult = 0.13333333333333333;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-4.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #130 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-4.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #130 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-4.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #131 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-4.html
expectedResult = 0.03333333333333333;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-4.html", "blueberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #131 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-4.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #131 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-4.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #132 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-4.html
expectedResult = 0.16666666666666666;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-4.html", "strawberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #132 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-4.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #132 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-4.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #133 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-4.html
expectedResult = 0.06666666666666667;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-4.html", "apricot");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #133 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-4.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #133 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-4.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #134 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-4.html
expectedResult = 0.13333333333333333;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-4.html", "kiwi");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #134 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-4.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #134 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-4.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #135 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-4.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-4.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #135 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-4.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #135 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-4.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #136 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-0.html
expectedResult = 0.09090909090909091;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-0.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #136 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-0.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #136 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-0.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #137 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-0.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-0.html", "peach");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #137 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-0.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #137 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-0.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #138 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-0.html
expectedResult = 0.045454545454545456;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-0.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #138 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-0.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #138 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-0.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #139 checking TF for coconut in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-0.html
expectedResult = 0.09090909090909091;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-0.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #139 checking TF for coconut in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-0.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #139 checking TF for coconut in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-0.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #140 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-0.html
expectedResult = 0.045454545454545456;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-0.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #140 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-0.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #140 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-0.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #141 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-0.html
expectedResult = 0.09090909090909091;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-0.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #141 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-0.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #141 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-0.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #142 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-0.html
expectedResult = 0.045454545454545456;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-0.html", "blueberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #142 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-0.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #142 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-0.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #143 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-0.html
expectedResult = 0.09090909090909091;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-0.html", "strawberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #143 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-0.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #143 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-0.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #144 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-0.html
expectedResult = 0.09090909090909091;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-0.html", "apricot");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #144 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-0.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #144 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-0.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #145 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-0.html
expectedResult = 0.22727272727272727;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-0.html", "kiwi");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #145 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-0.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #145 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-0.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #146 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-0.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-0.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #146 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-0.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #146 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/tinyfruitsB/N-0.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #147 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-0.html
expectedResult = 0.0425531914893617;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-0.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #147 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-0.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #147 checking TF for banana in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-0.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #148 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-0.html
expectedResult = 0.0851063829787234;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-0.html", "peach");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #148 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-0.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #148 checking TF for peach in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-0.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #149 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-0.html
expectedResult = 0.06382978723404255;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-0.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #149 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-0.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #149 checking TF for papaya in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-0.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #150 checking TF for coconut in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-0.html
expectedResult = 0.0425531914893617;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-0.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #150 checking TF for coconut in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-0.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #150 checking TF for coconut in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-0.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #151 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-0.html
expectedResult = 0.10638297872340426;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-0.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #151 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-0.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #151 checking TF for apple in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-0.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #152 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-0.html
expectedResult = 0.19148936170212766;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-0.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #152 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-0.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #152 checking TF for pear in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-0.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #153 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-0.html
expectedResult = 0.02127659574468085;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-0.html", "blueberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #153 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-0.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #153 checking TF for blueberry in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-0.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #154 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-0.html
expectedResult = 0.06382978723404255;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-0.html", "strawberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #154 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-0.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #154 checking TF for strawberry in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-0.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #155 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-0.html
expectedResult = 0.0851063829787234;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-0.html", "apricot");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #155 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-0.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #155 checking TF for apricot in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-0.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #156 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-0.html
expectedResult = 0.0851063829787234;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-0.html", "kiwi");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #156 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-0.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #156 checking TF for kiwi in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-0.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #157 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-0.html
expectedResult = 0.0;
yourResult = tester.getTF("https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-0.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #157 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-0.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #157 checking TF for tomato in https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-0.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #158 checking TF for banana in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #158 checking TF for banana in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #158 checking TF for banana in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #159 checking TF for peach in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "peach");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #159 checking TF for peach in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #159 checking TF for peach in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #160 checking TF for papaya in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #160 checking TF for papaya in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #160 checking TF for papaya in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #161 checking TF for coconut in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #161 checking TF for coconut in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #161 checking TF for coconut in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #162 checking TF for apple in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #162 checking TF for apple in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #162 checking TF for apple in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #163 checking TF for pear in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #163 checking TF for pear in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #163 checking TF for pear in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #164 checking TF for blueberry in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "blueberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #164 checking TF for blueberry in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #164 checking TF for blueberry in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #165 checking TF for strawberry in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "strawberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #165 checking TF for strawberry in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #165 checking TF for strawberry in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #166 checking TF for apricot in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "apricot");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #166 checking TF for apricot in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #166 checking TF for apricot in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #167 checking TF for kiwi in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "kiwi");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #167 checking TF for kiwi in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #167 checking TF for kiwi in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #168 checking TF for tomato in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #168 checking TF for tomato in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #168 checking TF for tomato in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

failOut.close();
passOut.close();
}
}
