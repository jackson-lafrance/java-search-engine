import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.*;
public class Fruits100TFIDFTester {public static void main(String[] args) throws Exception{
ProjectTester tester = new ProjectTesterImp(); //Instantiate your own ProjectTester instance here
tester.initialize();
tester.crawl("https://people.scs.carleton.ca/~avamckenney/fruits100/N-0.html");
runTest(tester);}public static void runTest(ProjectTester tester) throws Exception{
PrintWriter failOut = new PrintWriter(new FileWriter("Fruits100-TFIDF-failed.txt"));
PrintWriter passOut = new PrintWriter(new FileWriter("Fruits100-TFIDF-passed.txt"));
double expectedResult;
double yourResult;
//Test #339 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruits100/N-25.html
expectedResult = 0.018706861266137534;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-25.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #339 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruits100/N-25.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #339 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruits100/N-25.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #340 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruits100/N-25.html
expectedResult = 0.03035830410151783;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-25.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #340 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruits100/N-25.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #340 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruits100/N-25.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #341 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-25.html
expectedResult = 0.0083116286818328;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-25.html", "strawberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #341 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-25.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #341 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-25.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #342 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-25.html
expectedResult = 0.024568939552449414;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-25.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #342 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-25.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #342 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-25.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #343 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruits100/N-25.html
expectedResult = 0.01890544077865686;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-25.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #343 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruits100/N-25.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #343 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruits100/N-25.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #344 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruits100/N-25.html
expectedResult = 0.02172179992016925;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-25.html", "lime");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #344 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruits100/N-25.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #344 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruits100/N-25.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #345 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits100/N-25.html
expectedResult = 0.006890150062853371;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-25.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #345 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits100/N-25.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #345 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits100/N-25.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #346 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits100/N-25.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-25.html", "apricot");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #346 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits100/N-25.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #346 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits100/N-25.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #347 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits100/N-25.html
expectedResult = 0.024568939552449414;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-25.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #347 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits100/N-25.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #347 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits100/N-25.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #348 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits100/N-25.html
expectedResult = 0.02172179992016925;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-25.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #348 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits100/N-25.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #348 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits100/N-25.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #349 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits100/N-25.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-25.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #349 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits100/N-25.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #349 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits100/N-25.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #350 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruits100/N-14.html
expectedResult = 0.02975489652608049;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-14.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #350 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruits100/N-14.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #350 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruits100/N-14.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #351 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruits100/N-14.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-14.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #351 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruits100/N-14.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #351 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruits100/N-14.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #352 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-14.html
expectedResult = 0.0034344847609663917;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-14.html", "strawberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #352 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-14.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #352 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-14.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #353 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-14.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-14.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #353 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-14.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #353 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-14.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #354 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruits100/N-14.html
expectedResult = 0.01550553928626725;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-14.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #354 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruits100/N-14.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #354 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruits100/N-14.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #355 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruits100/N-14.html
expectedResult = 0.017815412291833893;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-14.html", "lime");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #355 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruits100/N-14.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #355 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruits100/N-14.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #356 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits100/N-14.html
expectedResult = 0.008323195362853909;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-14.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #356 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits100/N-14.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #356 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits100/N-14.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #357 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits100/N-14.html
expectedResult = 0.0201505303109624;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-14.html", "apricot");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #357 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits100/N-14.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #357 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits100/N-14.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #358 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits100/N-14.html
expectedResult = 0.0201505303109624;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-14.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #358 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits100/N-14.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #358 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits100/N-14.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #359 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits100/N-14.html
expectedResult = 0.013530061368747843;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-14.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #359 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits100/N-14.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #359 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits100/N-14.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #360 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits100/N-14.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-14.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #360 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits100/N-14.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #360 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits100/N-14.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #361 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruits100/N-23.html
expectedResult = 0.011149672570525673;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-23.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #361 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruits100/N-23.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #361 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruits100/N-23.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #362 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruits100/N-23.html
expectedResult = 0.018314347074569266;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-23.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #362 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruits100/N-23.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #362 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruits100/N-23.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #363 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-23.html
expectedResult = 0.002500768789110354;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-23.html", "strawberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #363 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-23.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #363 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-23.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #364 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-23.html
expectedResult = 0.0075507510131233805;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-23.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #364 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-23.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #364 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-23.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #365 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruits100/N-23.html
expectedResult = 0.005810192817164378;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-23.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #365 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruits100/N-23.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #365 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruits100/N-23.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #366 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruits100/N-23.html
expectedResult = 0.019302974780250347;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-23.html", "lime");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #366 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruits100/N-23.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #366 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruits100/N-23.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #367 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits100/N-23.html
expectedResult = 0.006102247801315863;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-23.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #367 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits100/N-23.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #367 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits100/N-23.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #368 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits100/N-23.html
expectedResult = 0.003811679432041064;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-23.html", "apricot");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #368 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits100/N-23.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #368 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits100/N-23.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #369 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits100/N-23.html
expectedResult = 0.018358727750158788;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-23.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #369 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits100/N-23.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #369 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits100/N-23.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #370 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits100/N-23.html
expectedResult = 0.019302974780250347;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-23.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #370 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits100/N-23.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #370 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits100/N-23.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #371 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits100/N-23.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-23.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #371 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits100/N-23.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #371 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits100/N-23.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #372 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruits100/N-67.html
expectedResult = 0.03414008980515379;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-67.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #372 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruits100/N-67.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #372 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruits100/N-67.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #373 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruits100/N-67.html
expectedResult = 0.009901369480085728;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-67.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #373 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruits100/N-67.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #373 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruits100/N-67.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #374 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-67.html
expectedResult = 0.005257282852529639;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-67.html", "strawberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #374 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-67.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #374 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-67.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #375 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-67.html
expectedResult = 0.037147319411851225;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-67.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #375 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-67.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #375 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-67.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #376 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruits100/N-67.html
expectedResult = 0.012090161959591091;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-67.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #376 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruits100/N-67.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #376 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruits100/N-67.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #377 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruits100/N-67.html
expectedResult = 0.01389124338138478;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-67.html", "lime");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #377 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruits100/N-67.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #377 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruits100/N-67.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #378 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits100/N-67.html
expectedResult = 0.0043581672333330695;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-67.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #378 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits100/N-67.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #378 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits100/N-67.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #379 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits100/N-67.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-67.html", "apricot");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #379 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits100/N-67.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #379 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits100/N-67.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #380 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits100/N-67.html
expectedResult = 0.015712009142884436;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-67.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #380 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits100/N-67.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #380 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits100/N-67.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #381 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits100/N-67.html
expectedResult = 0.007084571195508225;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-67.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #381 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits100/N-67.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #381 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits100/N-67.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #382 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits100/N-67.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-67.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #382 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits100/N-67.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #382 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits100/N-67.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #383 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruits100/N-58.html
expectedResult = 0.01567169481917065;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-58.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #383 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruits100/N-58.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #383 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruits100/N-58.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #384 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruits100/N-58.html
expectedResult = 0.04867265117608714;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-58.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #384 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruits100/N-58.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #384 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruits100/N-58.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #385 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-58.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-58.html", "strawberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #385 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-58.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #385 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-58.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #386 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-58.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-58.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #386 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-58.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #386 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-58.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #387 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruits100/N-58.html
expectedResult = 0.00816665853595058;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-58.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #387 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruits100/N-58.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #387 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruits100/N-58.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #388 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruits100/N-58.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-58.html", "lime");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #388 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruits100/N-58.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #388 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruits100/N-58.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #389 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits100/N-58.html
expectedResult = 0.011248317296186439;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-58.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #389 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits100/N-58.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #389 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits100/N-58.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #390 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits100/N-58.html
expectedResult = 0.020681776434483382;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-58.html", "apricot");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #390 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits100/N-58.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #390 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits100/N-58.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #391 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits100/N-58.html
expectedResult = 0.030259057461002152;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-58.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #391 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits100/N-58.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #391 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits100/N-58.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #392 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits100/N-58.html
expectedResult = 0.00938325240924977;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-58.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #392 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits100/N-58.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #392 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits100/N-58.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #393 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits100/N-58.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-58.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #393 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits100/N-58.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #393 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits100/N-58.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #394 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruits100/N-50.html
expectedResult = 0.010541370674277174;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-50.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #394 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruits100/N-50.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #394 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruits100/N-50.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #395 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruits100/N-50.html
expectedResult = 0.0044505812058006;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-50.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #395 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruits100/N-50.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #395 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruits100/N-50.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #396 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-50.html
expectedResult = 0.009202881692036311;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-50.html", "strawberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #396 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-50.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #396 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-50.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #397 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-50.html
expectedResult = 0.010613142653715992;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-50.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #397 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-50.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #397 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-50.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #398 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruits100/N-50.html
expectedResult = 0.00816665853595058;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-50.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #398 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruits100/N-50.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #398 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruits100/N-50.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #399 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruits100/N-50.html
expectedResult = 0.006311528071310452;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-50.html", "lime");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #399 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruits100/N-50.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #399 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruits100/N-50.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #400 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits100/N-50.html
expectedResult = 0.009453984775347445;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-50.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #400 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits100/N-50.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #400 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits100/N-50.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #401 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits100/N-50.html
expectedResult = 0.02392640109713432;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-50.html", "apricot");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #401 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits100/N-50.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #401 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits100/N-50.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #402 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits100/N-50.html
expectedResult = 0.02392640109713432;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-50.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #402 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits100/N-50.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #402 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits100/N-50.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #403 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits100/N-50.html
expectedResult = 0.01240155273739913;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-50.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #403 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits100/N-50.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #403 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits100/N-50.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #404 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits100/N-50.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-50.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #404 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits100/N-50.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #404 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits100/N-50.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #405 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruits100/N-99.html
expectedResult = 0.025220747690374665;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-99.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #405 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruits100/N-99.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #405 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruits100/N-99.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #406 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruits100/N-99.html
expectedResult = 0.015998096539308858;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-99.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #406 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruits100/N-99.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #406 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruits100/N-99.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #407 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-99.html
expectedResult = 0.011205807692605424;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-99.html", "strawberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #407 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-99.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #407 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-99.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #408 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-99.html
expectedResult = 0.01294724058083593;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-99.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #408 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-99.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #408 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-99.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #409 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruits100/N-99.html
expectedResult = 0.0067142782208547665;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-99.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #409 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruits100/N-99.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #409 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruits100/N-99.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #410 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruits100/N-99.html
expectedResult = 0.011446866431285427;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-99.html", "lime");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #410 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruits100/N-99.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #410 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruits100/N-99.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #411 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits100/N-99.html
expectedResult = 0.00704169057356613;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-99.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #411 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits100/N-99.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #411 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits100/N-99.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #412 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits100/N-99.html
expectedResult = 0.004411316494369516;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-99.html", "apricot");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #412 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits100/N-99.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #412 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits100/N-99.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #413 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits100/N-99.html
expectedResult = 0.02112739597394051;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-99.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #413 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits100/N-99.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #413 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits100/N-99.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #414 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits100/N-99.html
expectedResult = 0.011446866431285427;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-99.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #414 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits100/N-99.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #414 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits100/N-99.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #415 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits100/N-99.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-99.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #415 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits100/N-99.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #415 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits100/N-99.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #416 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruits100/N-44.html
expectedResult = 0.016334222529740882;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-44.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #416 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruits100/N-44.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #416 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruits100/N-44.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #417 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruits100/N-44.html
expectedResult = 0.023436826472903356;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-44.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #417 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruits100/N-44.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #417 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruits100/N-44.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #418 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-44.html
expectedResult = 0.007257443701653403;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-44.html", "strawberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #418 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-44.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #418 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-44.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #419 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-44.html
expectedResult = 0.016367419844692803;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-44.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #419 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-44.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #419 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-44.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #420 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruits100/N-44.html
expectedResult = 0.020442821877648374;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-44.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #420 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruits100/N-44.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #420 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruits100/N-44.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #421 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruits100/N-44.html
expectedResult = 0.00738613147022325;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-44.html", "lime");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #421 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruits100/N-44.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #421 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruits100/N-44.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #422 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits100/N-44.html
expectedResult = 0.01171148623034199;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-44.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #422 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits100/N-44.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #422 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits100/N-44.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #423 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits100/N-44.html
expectedResult = 0.011061817872666807;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-44.html", "apricot");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #423 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits100/N-44.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #423 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits100/N-44.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #424 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits100/N-44.html
expectedResult = 0.005608819368219336;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-44.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #424 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits100/N-44.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #424 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits100/N-44.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #425 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits100/N-44.html
expectedResult = 0.012141165750169458;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-44.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #425 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits100/N-44.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #425 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits100/N-44.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #426 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits100/N-44.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-44.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #426 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits100/N-44.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #426 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits100/N-44.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #427 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruits100/N-90.html
expectedResult = 0.012336148836996486;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-90.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #427 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruits100/N-90.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #427 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruits100/N-90.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #428 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruits100/N-90.html
expectedResult = 0.038891088994260165;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-90.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #428 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruits100/N-90.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #428 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruits100/N-90.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #429 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-90.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-90.html", "strawberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #429 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-90.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #429 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-90.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #430 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-90.html
expectedResult = 0.008354253251815486;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-90.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #430 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-90.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #430 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-90.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #431 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruits100/N-90.html
expectedResult = 0.012594490938962961;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-90.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #431 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruits100/N-90.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #431 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruits100/N-90.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #432 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruits100/N-90.html
expectedResult = 0.021277374851608032;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-90.html", "lime");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #432 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruits100/N-90.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #432 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruits100/N-90.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #433 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits100/N-90.html
expectedResult = 0.004543676006111188;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-90.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #433 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits100/N-90.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #433 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits100/N-90.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #434 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits100/N-90.html
expectedResult = 0.024066262394699924;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-90.html", "apricot");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #434 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits100/N-90.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #434 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits100/N-90.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #435 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits100/N-90.html
expectedResult = 0.024066262394699924;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-90.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #435 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits100/N-90.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #435 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits100/N-90.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #436 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits100/N-90.html
expectedResult = 0.027827129308207264;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-90.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #436 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits100/N-90.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #436 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits100/N-90.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #437 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits100/N-90.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-90.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #437 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits100/N-90.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #437 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits100/N-90.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #438 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruits100/N-34.html
expectedResult = 0.020349107852859583;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-34.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #438 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruits100/N-34.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #438 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruits100/N-34.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #439 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruits100/N-34.html
expectedResult = 0.03293864620734691;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-34.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #439 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruits100/N-34.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #439 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruits100/N-34.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #440 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-34.html
expectedResult = 0.006839777850279317;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-34.html", "strawberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #440 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-34.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #440 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-34.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #441 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-34.html
expectedResult = 0.010425210305393512;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-34.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #441 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-34.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #441 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits100/N-34.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #442 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruits100/N-34.html
expectedResult = 0.008022047333907455;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-34.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #442 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruits100/N-34.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #442 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruits100/N-34.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #443 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruits100/N-34.html
expectedResult = 0.012183801272907425;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-34.html", "lime");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #443 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruits100/N-34.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #443 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruits100/N-34.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #444 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits100/N-34.html
expectedResult = 0.012790008662567593;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-34.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #444 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits100/N-34.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #444 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits100/N-34.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #445 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits100/N-34.html
expectedResult = 0.010425210305393512;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-34.html", "apricot");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #445 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits100/N-34.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #445 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits100/N-34.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #446 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits100/N-34.html
expectedResult = 0.010425210305393512;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-34.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #446 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits100/N-34.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #446 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits100/N-34.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #447 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits100/N-34.html
expectedResult = 0.012183801272907425;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-34.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #447 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits100/N-34.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #447 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits100/N-34.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #448 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits100/N-34.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits100/N-34.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #448 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits100/N-34.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #448 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits100/N-34.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #449 checking TFIDF for fig in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #449 checking TFIDF for fig in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #449 checking TFIDF for fig in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #450 checking TFIDF for pear in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #450 checking TFIDF for pear in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #450 checking TFIDF for pear in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #451 checking TFIDF for strawberry in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "strawberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #451 checking TFIDF for strawberry in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #451 checking TFIDF for strawberry in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #452 checking TFIDF for cherry in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #452 checking TFIDF for cherry in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #452 checking TFIDF for cherry in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #453 checking TFIDF for banana in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #453 checking TFIDF for banana in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #453 checking TFIDF for banana in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #454 checking TFIDF for lime in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "lime");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #454 checking TFIDF for lime in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #454 checking TFIDF for lime in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #455 checking TFIDF for apple in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #455 checking TFIDF for apple in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #455 checking TFIDF for apple in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #456 checking TFIDF for apricot in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "apricot");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #456 checking TFIDF for apricot in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #456 checking TFIDF for apricot in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #457 checking TFIDF for coconut in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #457 checking TFIDF for coconut in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #457 checking TFIDF for coconut in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #458 checking TFIDF for papaya in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #458 checking TFIDF for papaya in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #458 checking TFIDF for papaya in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #459 checking TFIDF for tomato in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #459 checking TFIDF for tomato in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #459 checking TFIDF for tomato in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

failOut.close();
passOut.close();
}
}
