import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.*;
public class FruitsATFIDFTester {public static void main(String[] args) throws Exception{
ProjectTester tester = new ProjectTesterImp(); //Instantiate your own ProjectTester instance here
tester.initialize();
tester.crawl("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-0.html");
runTest(tester);}public static void runTest(ProjectTester tester) throws Exception{
PrintWriter failOut = new PrintWriter(new FileWriter("FruitsA-TFIDF-failed.txt"));
PrintWriter passOut = new PrintWriter(new FileWriter("FruitsA-TFIDF-passed.txt"));
double expectedResult;
double yourResult;
//Test #339 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-8.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-8.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #339 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-8.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #339 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-8.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #340 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-8.html
expectedResult = 0.008679203190395295;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-8.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #340 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-8.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #340 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-8.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #341 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-8.html
expectedResult = 0.0095440356557343;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-8.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #341 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-8.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #341 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-8.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #342 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-8.html
expectedResult = 0.0062966307745579335;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-8.html", "strawberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #342 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-8.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #342 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-8.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #343 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-8.html
expectedResult = 0.017974879040998832;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-8.html", "peach");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #343 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-8.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #343 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-8.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #344 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-8.html
expectedResult = 0.023682198138132375;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-8.html", "apricot");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #344 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-8.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #344 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-8.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #345 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-8.html
expectedResult = 0.012861282527909692;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-8.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #345 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-8.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #345 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-8.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #346 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-8.html
expectedResult = 0.014747938254775389;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-8.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #346 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-8.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #346 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-8.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #347 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-8.html
expectedResult = 0.012878276771665092;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-8.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #347 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-8.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #347 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-8.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #348 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-8.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-8.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #348 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-8.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #348 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-8.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #349 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-8.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-8.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #349 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-8.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #349 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-8.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #350 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-30.html
expectedResult = 0.01707992633597555;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-30.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #350 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-30.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #350 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-30.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #351 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-30.html
expectedResult = 0.007714509797962978;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-30.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #351 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-30.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #351 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-30.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #352 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-30.html
expectedResult = 0.005724744512726038;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-30.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #352 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-30.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #352 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-30.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #353 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-30.html
expectedResult = 0.010861443346405389;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-30.html", "strawberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #353 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-30.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #353 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-30.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #354 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-30.html
expectedResult = 0.02110459821158114;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-30.html", "peach");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #354 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-30.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #354 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-30.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #355 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-30.html
expectedResult = 0.010781769250311471;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-30.html", "apricot");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #355 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-30.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #355 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-30.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #356 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-30.html
expectedResult = 0.015100641268186226;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-30.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #356 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-30.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #356 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-30.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #357 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-30.html
expectedResult = 0.013142754295897783;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-30.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #357 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-30.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #357 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-30.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #358 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-30.html
expectedResult = 0.009289358263355734;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-30.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #358 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-30.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #358 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-30.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #359 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-30.html
expectedResult = 0.015100641268186226;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-30.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #359 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-30.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #359 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-30.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #360 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-30.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-30.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #360 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-30.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #360 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-30.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #361 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-13.html
expectedResult = 0.016367419844692803;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-13.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #361 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-13.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #361 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-13.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #362 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-13.html
expectedResult = 0.00738613147022325;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-13.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #362 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-13.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #362 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-13.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #363 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-13.html
expectedResult = 0.010738346032409012;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-13.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #363 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-13.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #363 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-13.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #364 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-13.html
expectedResult = 0.007084571195508225;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-13.html", "strawberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #364 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-13.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #364 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-13.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #365 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-13.html
expectedResult = 0.005216327288997415;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-13.html", "peach");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #365 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-13.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #365 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-13.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #366 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-13.html
expectedResult = 0.015324034399896384;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-13.html", "apricot");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #366 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-13.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #366 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-13.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #367 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-13.html
expectedResult = 0.01790740693720671;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-13.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #367 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-13.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #367 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-13.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #368 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-13.html
expectedResult = 0.01558560628469469;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-13.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #368 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-13.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #368 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-13.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #369 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-13.html
expectedResult = 0.013089057238695873;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-13.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #369 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-13.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #369 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-13.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #370 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-13.html
expectedResult = 0.01790740693720671;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-13.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #370 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-13.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #370 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-13.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #371 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-13.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-13.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #371 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-13.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #371 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-13.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #372 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-10.html
expectedResult = 0.026211587823037175;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-10.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #372 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-10.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #372 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-10.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #373 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-10.html
expectedResult = 0.015787960560346127;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-10.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #373 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-10.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #373 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-10.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #374 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-10.html
expectedResult = 0.005991105612818163;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-10.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #374 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-10.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #374 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-10.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #375 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-10.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-10.html", "strawberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #375 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-10.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #375 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-10.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #376 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-10.html
expectedResult = 0.011283423762939646;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-10.html", "peach");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #376 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-10.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #376 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-10.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #377 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-10.html
expectedResult = 0.011283423762939646;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-10.html", "apricot");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #377 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-10.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #377 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-10.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #378 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-10.html
expectedResult = 0.008073450762383137;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-10.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #378 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-10.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #378 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-10.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #379 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-10.html
expectedResult = 0.013740958598566645;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-10.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #379 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-10.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #379 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-10.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #380 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-10.html
expectedResult = 0.004966489516663257;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-10.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #380 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-10.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #380 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-10.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #381 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-10.html
expectedResult = 0.023174092030569356;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-10.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #381 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-10.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #381 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-10.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #382 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-10.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-10.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #382 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-10.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #382 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-10.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #383 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-20.html
expectedResult = 0.009899340693233007;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-20.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #383 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-20.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #383 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-20.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #384 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-20.html
expectedResult = 0.008752168461359549;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-20.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #384 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-20.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #384 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-20.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #385 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-20.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-20.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #385 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-20.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #385 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-20.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #386 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-20.html
expectedResult = 0.007025953991984808;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-20.html", "strawberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #386 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-20.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #386 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-20.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #387 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-20.html
expectedResult = 0.03134028872377518;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-20.html", "peach");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #387 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-20.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #387 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-20.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #388 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-20.html
expectedResult = 0.01223199701102837;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-20.html", "apricot");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #388 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-20.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #388 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-20.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #389 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-20.html
expectedResult = 0.02242442393427848;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-20.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #389 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-20.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #389 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-20.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #390 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-20.html
expectedResult = 0.012490285078330056;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-20.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #390 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-20.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #390 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-20.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #391 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-20.html
expectedResult = 0.007119989272984708;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-20.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #391 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-20.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #391 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-20.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #392 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-20.html
expectedResult = 0.014350973171895353;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-20.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #392 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-20.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #392 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-20.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #393 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-20.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-20.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #393 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-20.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #393 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-20.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #394 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-25.html
expectedResult = 0.00872567308416007;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-25.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #394 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-25.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #394 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-25.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #395 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-25.html
expectedResult = 0.011446866431285427;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-25.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #395 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-25.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #395 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-25.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #396 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-25.html
expectedResult = 0.005724744512726038;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-25.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #396 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-25.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #396 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-25.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #397 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-25.html
expectedResult = 0.010861443346405389;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-25.html", "strawberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #397 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-25.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #397 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-25.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #398 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-25.html
expectedResult = 0.010781769250311471;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-25.html", "peach");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #398 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-25.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #398 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-25.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #399 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-25.html
expectedResult = 0.02110459821158114;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-25.html", "apricot");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #399 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-25.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #399 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-25.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #400 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-25.html
expectedResult = 0.018679075146911348;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-25.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #400 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-25.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #400 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-25.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #401 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-25.html
expectedResult = 0.013142754295897783;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-25.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #401 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-25.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #401 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-25.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #402 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-25.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-25.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #402 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-25.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #402 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-25.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #403 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-25.html
expectedResult = 0.022185212463694433;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-25.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #403 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-25.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #403 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-25.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #404 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-25.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-25.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #404 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-25.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #404 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-25.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #405 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-21.html
expectedResult = 0.032119690565572796;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-21.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #405 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-21.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #405 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-21.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #406 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-21.html
expectedResult = 0.011200524453185806;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-21.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #406 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-21.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #406 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-21.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #407 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-21.html
expectedResult = 0.018619972491769072;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-21.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #407 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-21.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #407 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-21.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #408 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-21.html
expectedResult = 0.0036947400680036727;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-21.html", "strawberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #408 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-21.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #408 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-21.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #409 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-21.html
expectedResult = 0.010547308265023755;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-21.html", "peach");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #409 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-21.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #409 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-21.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #410 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-21.html
expectedResult = 0.020655015375922698;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-21.html", "apricot");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #410 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-21.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #410 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-21.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #411 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-21.html
expectedResult = 0.011200524453185806;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-21.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #411 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-21.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #411 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-21.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #412 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-21.html
expectedResult = 0.009748310569005204;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-21.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #412 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-21.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #412 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-21.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #413 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-21.html
expectedResult = 0.004642482373063772;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-21.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #413 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-21.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #413 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-21.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #414 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-21.html
expectedResult = 0.014778958331910917;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-21.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #414 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-21.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #414 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-21.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #415 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-21.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsB/N-21.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #415 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-21.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #415 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruitsB/N-21.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #416 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-47.html
expectedResult = 0.018273214648031416;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-47.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #416 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-47.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #416 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-47.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #417 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-47.html
expectedResult = 0.016155646914897983;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-47.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #417 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-47.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #417 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-47.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #418 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-47.html
expectedResult = 0.0090945219498539;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-47.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #418 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-47.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #418 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-47.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #419 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-47.html
expectedResult = 0.00404674733746351;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-47.html", "strawberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #419 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-47.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #419 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-47.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #420 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-47.html
expectedResult = 0.00584485801229807;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-47.html", "peach");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #420 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-47.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #420 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-47.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #421 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-47.html
expectedResult = 0.011552177109431593;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-47.html", "apricot");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #421 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-47.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #421 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-47.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #422 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-47.html
expectedResult = 0.01997003989786054;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-47.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #422 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-47.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #422 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-47.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #423 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-47.html
expectedResult = 0.01406097225427875;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-47.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #423 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-47.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #423 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-47.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #424 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-47.html
expectedResult = 0.0025726611580261073;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-47.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #424 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-47.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #424 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-47.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #425 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-47.html
expectedResult = 0.01225553009989755;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-47.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #425 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-47.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #425 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-47.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #426 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-47.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-47.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #426 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-47.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #426 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-47.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #427 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-11.html
expectedResult = 0.024568939552449414;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-11.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #427 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-11.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #427 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-11.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #428 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-11.html
expectedResult = 0.01654088102298361;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-11.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #428 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-11.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #428 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-11.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #429 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-11.html
expectedResult = 0.004222855235043958;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-11.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #429 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-11.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #429 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-11.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #430 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-11.html
expectedResult = 0.0027860080566133524;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-11.html", "strawberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #430 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-11.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #430 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-11.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #431 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-11.html
expectedResult = 0.023117471758705398;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-11.html", "peach");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #431 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-11.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #431 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-11.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #432 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-11.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-11.html", "apricot");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #432 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-11.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #432 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-11.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #433 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-11.html
expectedResult = 0.01654088102298361;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-11.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #433 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-11.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #433 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-11.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #434 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-11.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-11.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #434 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-11.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #434 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-11.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #435 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-11.html
expectedResult = 0.0035006503992118685;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-11.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #435 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-11.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #435 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-11.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #436 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-11.html
expectedResult = 0.0267525259092945;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-11.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #436 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-11.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #436 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-11.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #437 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-11.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-11.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #437 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-11.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #437 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-11.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #438 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-9.html
expectedResult = 0.008354253251815486;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-9.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #438 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-9.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #438 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-9.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #439 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-9.html
expectedResult = 0.00738613147022325;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-9.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #439 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-9.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #439 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-9.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #440 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-9.html
expectedResult = 0.010738346032409012;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-9.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #440 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-9.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #440 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-9.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #441 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-9.html
expectedResult = 0.007084571195508225;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-9.html", "strawberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #441 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-9.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #441 checking TFIDF for strawberry in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-9.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #442 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-9.html
expectedResult = 0.010322828961269672;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-9.html", "peach");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #442 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-9.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #442 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-9.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #443 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-9.html
expectedResult = 0.04771205637441718;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-9.html", "apricot");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #443 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-9.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #443 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-9.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #444 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-9.html
expectedResult = 0.014470702665731456;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-9.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #444 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-9.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #444 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-9.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #445 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-9.html
expectedResult = 0.012594490938962961;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-9.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #445 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-9.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #445 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-9.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #446 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-9.html
expectedResult = 0.008901843239444245;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-9.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #446 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-9.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #446 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-9.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #447 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-9.html
expectedResult = 0.00738613147022325;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-9.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #447 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-9.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #447 checking TFIDF for pear in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-9.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #448 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-9.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-9.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #448 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-9.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #448 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruitsA/N-9.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #449 checking TFIDF for apple in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #449 checking TFIDF for apple in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #449 checking TFIDF for apple in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #450 checking TFIDF for coconut in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #450 checking TFIDF for coconut in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #450 checking TFIDF for coconut in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #451 checking TFIDF for fig in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #451 checking TFIDF for fig in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #451 checking TFIDF for fig in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #452 checking TFIDF for strawberry in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "strawberry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #452 checking TFIDF for strawberry in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #452 checking TFIDF for strawberry in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #453 checking TFIDF for peach in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "peach");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #453 checking TFIDF for peach in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #453 checking TFIDF for peach in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #454 checking TFIDF for apricot in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "apricot");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #454 checking TFIDF for apricot in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #454 checking TFIDF for apricot in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #455 checking TFIDF for cherry in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #455 checking TFIDF for cherry in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #455 checking TFIDF for cherry in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #456 checking TFIDF for banana in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #456 checking TFIDF for banana in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #456 checking TFIDF for banana in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #457 checking TFIDF for papaya in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #457 checking TFIDF for papaya in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #457 checking TFIDF for papaya in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #458 checking TFIDF for pear in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "pear");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #458 checking TFIDF for pear in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #458 checking TFIDF for pear in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
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
