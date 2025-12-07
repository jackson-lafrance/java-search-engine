import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.*;
public class Fruits50TFIDFTester {public static void main(String[] args) throws Exception{
ProjectTester tester = new ProjectTesterImp(); //Instantiate your own ProjectTester instance here
tester.initialize();
tester.crawl("https://people.scs.carleton.ca/~avamckenney/fruits50/N-0.html");
runTest(tester);}public static void runTest(ProjectTester tester) throws Exception{
PrintWriter failOut = new PrintWriter(new FileWriter("Fruits50-TFIDF-failed.txt"));
PrintWriter passOut = new PrintWriter(new FileWriter("Fruits50-TFIDF-passed.txt"));
double expectedResult;
double yourResult;
//Test #289 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits50/N-20.html
expectedResult = 0.014063290436998988;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-20.html", "apricot");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #289 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits50/N-20.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #289 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits50/N-20.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #290 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits50/N-20.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-20.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #290 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits50/N-20.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #290 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits50/N-20.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #291 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruits50/N-20.html
expectedResult = 0.023263832651276357;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-20.html", "lime");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #291 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruits50/N-20.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #291 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruits50/N-20.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #292 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits50/N-20.html
expectedResult = 0.014063290436998988;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-20.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #292 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits50/N-20.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #292 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits50/N-20.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #293 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruits50/N-20.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-20.html", "peach");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #293 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruits50/N-20.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #293 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruits50/N-20.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #294 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruits50/N-20.html
expectedResult = 0.018951307193998384;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-20.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #294 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruits50/N-20.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #294 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruits50/N-20.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #295 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruits50/N-20.html
expectedResult = 0.01004150921771007;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-20.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #295 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruits50/N-20.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #295 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruits50/N-20.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #296 checking TFIDF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits50/N-20.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-20.html", "kiwi");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #296 checking TFIDF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits50/N-20.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #296 checking TFIDF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits50/N-20.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #297 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-20.html
expectedResult = 0.0062966307745579335;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-20.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #297 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-20.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #297 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-20.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #298 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits50/N-20.html
expectedResult = 0.006017288636376094;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-20.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #298 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits50/N-20.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #298 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits50/N-20.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #299 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits50/N-20.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-20.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #299 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits50/N-20.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #299 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits50/N-20.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #300 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits50/N-9.html
expectedResult = 0.006605834923122666;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-9.html", "apricot");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #300 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits50/N-9.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #300 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits50/N-9.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #301 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits50/N-9.html
expectedResult = 0.013187194162530317;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-9.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #301 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits50/N-9.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #301 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits50/N-9.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #302 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruits50/N-9.html
expectedResult = 0.01610189271256019;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-9.html", "lime");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #302 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruits50/N-9.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #302 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruits50/N-9.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #303 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits50/N-9.html
expectedResult = 0.015919690810725452;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-9.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #303 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits50/N-9.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #303 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits50/N-9.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #304 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruits50/N-9.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-9.html", "peach");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #304 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruits50/N-9.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #304 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruits50/N-9.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #305 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruits50/N-9.html
expectedResult = 0.008901843239444245;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-9.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #305 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruits50/N-9.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #305 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruits50/N-9.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #306 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruits50/N-9.html
expectedResult = 0.02021744977101555;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-9.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #306 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruits50/N-9.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #306 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruits50/N-9.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #307 checking TFIDF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits50/N-9.html
expectedResult = 0.00420843820722925;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-9.html", "kiwi");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #307 checking TFIDF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits50/N-9.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #307 checking TFIDF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits50/N-9.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #308 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-9.html
expectedResult = 0.0043581672333330695;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-9.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #308 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-9.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #308 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-9.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #309 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits50/N-9.html
expectedResult = 0.00420843820722925;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-9.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #309 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits50/N-9.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #309 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits50/N-9.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #310 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits50/N-9.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-9.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #310 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits50/N-9.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #310 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits50/N-9.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #311 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits50/N-34.html
expectedResult = 0.009785886517395096;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-34.html", "apricot");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #311 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits50/N-34.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #311 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits50/N-34.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #312 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits50/N-34.html
expectedResult = 0.013187194162530317;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-34.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #312 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits50/N-34.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #312 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits50/N-34.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #313 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruits50/N-34.html
expectedResult = 0.023853350353765585;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-34.html", "lime");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #313 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruits50/N-34.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #313 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruits50/N-34.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #314 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits50/N-34.html
expectedResult = 0.012889302854430816;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-34.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #314 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits50/N-34.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #314 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits50/N-34.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #315 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruits50/N-34.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-34.html", "peach");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #315 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruits50/N-34.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #315 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruits50/N-34.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #316 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruits50/N-34.html
expectedResult = 0.021452941780523437;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-34.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #316 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruits50/N-34.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #316 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruits50/N-34.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #317 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruits50/N-34.html
expectedResult = 0.013647525496688812;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-34.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #317 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruits50/N-34.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #317 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruits50/N-34.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #318 checking TFIDF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits50/N-34.html
expectedResult = 0.0031951533125205425;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-34.html", "kiwi");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #318 checking TFIDF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits50/N-34.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #318 checking TFIDF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits50/N-34.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #319 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-34.html
expectedResult = 0.0043581672333330695;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-34.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #319 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-34.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #319 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-34.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #320 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits50/N-34.html
expectedResult = 0.001092250717620907;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-34.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #320 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits50/N-34.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #320 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits50/N-34.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #321 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits50/N-34.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-34.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #321 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits50/N-34.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #321 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits50/N-34.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #322 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits50/N-37.html
expectedResult = 0.017408557635695522;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-37.html", "apricot");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #322 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits50/N-37.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #322 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits50/N-37.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #323 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits50/N-37.html
expectedResult = 0.004507990972135041;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-37.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #323 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits50/N-37.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #323 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits50/N-37.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #324 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruits50/N-37.html
expectedResult = 0.023853350353765585;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-37.html", "lime");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #324 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruits50/N-37.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #324 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruits50/N-37.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #325 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits50/N-37.html
expectedResult = 0.011346942551646585;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-37.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #325 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits50/N-37.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #325 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits50/N-37.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #326 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruits50/N-37.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-37.html", "peach");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #326 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruits50/N-37.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #326 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruits50/N-37.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #327 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruits50/N-37.html
expectedResult = 0.013187194162530317;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-37.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #327 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruits50/N-37.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #327 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruits50/N-37.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #328 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruits50/N-37.html
expectedResult = 0.013647525496688812;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-37.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #328 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruits50/N-37.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #328 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruits50/N-37.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #329 checking TFIDF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits50/N-37.html
expectedResult = 0.00267920465113179;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-37.html", "kiwi");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #329 checking TFIDF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits50/N-37.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #329 checking TFIDF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits50/N-37.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #330 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-37.html
expectedResult = 0.005413654510170517;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-37.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #330 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-37.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #330 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-37.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #331 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits50/N-37.html
expectedResult = 0.0031951533125205425;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-37.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #331 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits50/N-37.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #331 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits50/N-37.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #332 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits50/N-37.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-37.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #332 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits50/N-37.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #332 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits50/N-37.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #333 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits50/N-0.html
expectedResult = 0.01171585012554421;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-0.html", "apricot");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #333 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits50/N-0.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #333 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits50/N-0.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #334 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits50/N-0.html
expectedResult = 0.023174092030569356;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-0.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #334 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits50/N-0.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #334 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits50/N-0.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #335 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruits50/N-0.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-0.html", "lime");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #335 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruits50/N-0.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #335 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruits50/N-0.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #336 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits50/N-0.html
expectedResult = 0.005991105612818163;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-0.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #336 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits50/N-0.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #336 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits50/N-0.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #337 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruits50/N-0.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-0.html", "peach");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #337 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruits50/N-0.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #337 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruits50/N-0.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #338 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruits50/N-0.html
expectedResult = 0.008073450762383137;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-0.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #338 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruits50/N-0.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #338 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruits50/N-0.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #339 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruits50/N-0.html
expectedResult = 0.012377506788444013;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-0.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #339 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruits50/N-0.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #339 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruits50/N-0.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #340 checking TFIDF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits50/N-0.html
expectedResult = 0.0038252985328498714;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-0.html", "kiwi");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #340 checking TFIDF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits50/N-0.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #340 checking TFIDF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits50/N-0.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #341 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-0.html
expectedResult = 0.003952602581972984;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-0.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #341 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-0.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #341 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-0.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #342 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits50/N-0.html
expectedResult = 0.0038252985328498714;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-0.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #342 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits50/N-0.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #342 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits50/N-0.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #343 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits50/N-0.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-0.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #343 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits50/N-0.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #343 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits50/N-0.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #344 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits50/N-15.html
expectedResult = 0.01646309054513505;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-15.html", "apricot");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #344 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits50/N-15.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #344 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits50/N-15.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #345 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits50/N-15.html
expectedResult = 0.007714509797962978;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-15.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #345 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits50/N-15.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #345 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits50/N-15.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #346 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruits50/N-15.html
expectedResult = 0.027314444778559543;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-15.html", "lime");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #346 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruits50/N-15.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #346 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruits50/N-15.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #347 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits50/N-15.html
expectedResult = 0.01646309054513505;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-15.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #347 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits50/N-15.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #347 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits50/N-15.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #348 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruits50/N-15.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-15.html", "peach");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #348 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruits50/N-15.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #348 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruits50/N-15.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #349 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruits50/N-15.html
expectedResult = 0.022185212463694433;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-15.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #349 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruits50/N-15.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #349 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruits50/N-15.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #350 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruits50/N-15.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-15.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #350 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruits50/N-15.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #350 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruits50/N-15.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #351 checking TFIDF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits50/N-15.html
expectedResult = 0.002773485606196916;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-15.html", "kiwi");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #351 checking TFIDF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits50/N-15.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #351 checking TFIDF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits50/N-15.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #352 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-15.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-15.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #352 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-15.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #352 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-15.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #353 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits50/N-15.html
expectedResult = 0.005375302298479549;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-15.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #353 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits50/N-15.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #353 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits50/N-15.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #354 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits50/N-15.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-15.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #354 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits50/N-15.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #354 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits50/N-15.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #355 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits50/N-42.html
expectedResult = 0.007467920636732617;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-42.html", "apricot");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #355 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits50/N-42.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #355 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits50/N-42.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #356 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits50/N-42.html
expectedResult = 0.01488465132813269;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-42.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #356 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits50/N-42.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #356 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits50/N-42.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #357 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruits50/N-42.html
expectedResult = 0.026923756384236452;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-42.html", "lime");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #357 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruits50/N-42.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #357 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruits50/N-42.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #358 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits50/N-42.html
expectedResult = 0.005641144674681008;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-42.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #358 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits50/N-42.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #358 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits50/N-42.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #359 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruits50/N-42.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-42.html", "peach");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #359 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruits50/N-42.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #359 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruits50/N-42.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #360 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruits50/N-42.html
expectedResult = 0.01724588359478859;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-42.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #360 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruits50/N-42.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #360 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruits50/N-42.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #361 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruits50/N-42.html
expectedResult = 0.030011318255936132;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-42.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #361 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruits50/N-42.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #361 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruits50/N-42.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #362 checking TFIDF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits50/N-42.html
expectedResult = 0.0036064338183423726;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-42.html", "kiwi");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #362 checking TFIDF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits50/N-42.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #362 checking TFIDF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits50/N-42.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #363 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-42.html
expectedResult = 0.00611527396474862;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-42.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #363 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-42.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #363 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-42.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #364 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits50/N-42.html
expectedResult = 0.0012368329403279227;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-42.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #364 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits50/N-42.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #364 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits50/N-42.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #365 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits50/N-42.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-42.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #365 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits50/N-42.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #365 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits50/N-42.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #366 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits50/N-7.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-7.html", "apricot");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #366 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits50/N-7.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #366 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits50/N-7.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #367 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits50/N-7.html
expectedResult = 0.015100641268186226;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-7.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #367 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits50/N-7.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #367 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits50/N-7.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #368 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruits50/N-7.html
expectedResult = 0.027314444778559543;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-7.html", "lime");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #368 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruits50/N-7.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #368 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruits50/N-7.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #369 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits50/N-7.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-7.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #369 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits50/N-7.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #369 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits50/N-7.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #370 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruits50/N-7.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-7.html", "peach");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #370 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruits50/N-7.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #370 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruits50/N-7.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #371 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruits50/N-7.html
expectedResult = 0.04185316717748072;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-7.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #371 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruits50/N-7.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #371 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruits50/N-7.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #372 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruits50/N-7.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-7.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #372 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruits50/N-7.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #372 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruits50/N-7.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #373 checking TFIDF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits50/N-7.html
expectedResult = 0.0036587664801601577;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-7.html", "kiwi");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #373 checking TFIDF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits50/N-7.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #373 checking TFIDF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits50/N-7.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #374 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-7.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-7.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #374 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-7.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #374 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-7.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #375 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits50/N-7.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-7.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #375 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits50/N-7.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #375 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits50/N-7.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #376 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits50/N-7.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-7.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #376 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits50/N-7.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #376 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits50/N-7.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #377 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits50/N-2.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-2.html", "apricot");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #377 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits50/N-2.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #377 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits50/N-2.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #378 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits50/N-2.html
expectedResult = 0.021277374851608032;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-2.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #378 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits50/N-2.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #378 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits50/N-2.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #379 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruits50/N-2.html
expectedResult = 0.013360232627711856;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-2.html", "lime");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #379 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruits50/N-2.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #379 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruits50/N-2.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #380 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits50/N-2.html
expectedResult = 0.020649815734778323;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-2.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #380 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits50/N-2.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #380 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits50/N-2.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #381 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruits50/N-2.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-2.html", "peach");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #381 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruits50/N-2.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #381 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruits50/N-2.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #382 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruits50/N-2.html
expectedResult = 0.00738613147022325;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-2.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #382 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruits50/N-2.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #382 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruits50/N-2.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #383 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruits50/N-2.html
expectedResult = 0.022185212463694468;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-2.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #383 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruits50/N-2.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #383 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruits50/N-2.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #384 checking TFIDF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits50/N-2.html
expectedResult = 0.001789601498463702;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-2.html", "kiwi");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #384 checking TFIDF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits50/N-2.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #384 checking TFIDF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits50/N-2.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #385 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-2.html
expectedResult = 0.007084571195508225;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-2.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #385 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-2.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #385 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-2.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #386 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits50/N-2.html
expectedResult = 0.001789601498463702;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-2.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #386 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits50/N-2.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #386 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits50/N-2.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #387 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits50/N-2.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-2.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #387 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits50/N-2.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #387 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits50/N-2.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #388 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits50/N-3.html
expectedResult = 0.00265546616024699;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-3.html", "apricot");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #388 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits50/N-3.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #388 checking TFIDF for apricot in https://people.scs.carleton.ca/~avamckenney/fruits50/N-3.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #389 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits50/N-3.html
expectedResult = 0.010521275466983447;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-3.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #389 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits50/N-3.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #389 checking TFIDF for papaya in https://people.scs.carleton.ca/~avamckenney/fruits50/N-3.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #390 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruits50/N-3.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-3.html", "lime");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #390 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruits50/N-3.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #390 checking TFIDF for lime in https://people.scs.carleton.ca/~avamckenney/fruits50/N-3.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #391 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits50/N-3.html
expectedResult = 0.012761475999285461;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-3.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #391 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits50/N-3.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #391 checking TFIDF for apple in https://people.scs.carleton.ca/~avamckenney/fruits50/N-3.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #392 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruits50/N-3.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-3.html", "peach");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #392 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruits50/N-3.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #392 checking TFIDF for peach in https://people.scs.carleton.ca/~avamckenney/fruits50/N-3.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #393 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruits50/N-3.html
expectedResult = 0.01389124338138478;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-3.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #393 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruits50/N-3.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #393 checking TFIDF for fig in https://people.scs.carleton.ca/~avamckenney/fruits50/N-3.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #394 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruits50/N-3.html
expectedResult = 0.021296836298815156;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-3.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #394 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruits50/N-3.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #394 checking TFIDF for banana in https://people.scs.carleton.ca/~avamckenney/fruits50/N-3.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #395 checking TFIDF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits50/N-3.html
expectedResult = 0.0025492222034458117;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-3.html", "kiwi");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #395 checking TFIDF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits50/N-3.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #395 checking TFIDF for kiwi in https://people.scs.carleton.ca/~avamckenney/fruits50/N-3.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #396 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-3.html
expectedResult = 0.005151009376339124;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-3.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #396 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-3.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #396 checking TFIDF for cherry in https://people.scs.carleton.ca/~avamckenney/fruits50/N-3.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #397 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits50/N-3.html
expectedResult = 0.005724261050936529;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-3.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #397 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits50/N-3.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #397 checking TFIDF for coconut in https://people.scs.carleton.ca/~avamckenney/fruits50/N-3.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #398 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits50/N-3.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("https://people.scs.carleton.ca/~avamckenney/fruits50/N-3.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #398 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits50/N-3.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #398 checking TFIDF for tomato in https://people.scs.carleton.ca/~avamckenney/fruits50/N-3.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #399 checking TFIDF for apricot in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "apricot");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #399 checking TFIDF for apricot in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #399 checking TFIDF for apricot in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #400 checking TFIDF for papaya in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "papaya");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #400 checking TFIDF for papaya in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #400 checking TFIDF for papaya in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #401 checking TFIDF for lime in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "lime");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #401 checking TFIDF for lime in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #401 checking TFIDF for lime in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #402 checking TFIDF for apple in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "apple");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #402 checking TFIDF for apple in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #402 checking TFIDF for apple in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #403 checking TFIDF for peach in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "peach");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #403 checking TFIDF for peach in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #403 checking TFIDF for peach in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #404 checking TFIDF for fig in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "fig");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #404 checking TFIDF for fig in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #404 checking TFIDF for fig in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #405 checking TFIDF for banana in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "banana");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #405 checking TFIDF for banana in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #405 checking TFIDF for banana in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #406 checking TFIDF for kiwi in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "kiwi");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #406 checking TFIDF for kiwi in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #406 checking TFIDF for kiwi in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #407 checking TFIDF for cherry in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "cherry");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #407 checking TFIDF for cherry in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #407 checking TFIDF for cherry in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #408 checking TFIDF for coconut in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "coconut");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #408 checking TFIDF for coconut in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #408 checking TFIDF for coconut in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

//Test #409 checking TFIDF for tomato in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html
expectedResult = 0.0;
yourResult = tester.getTFIDF("http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html", "tomato");
if(TestingTools.compareDoubles(yourResult, expectedResult)){
passOut.println("Passed Test #409 checking TFIDF for tomato in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
passOut.println("expected = " + expectedResult);
passOut.println("result = " + yourResult + "\n\n");
}else{failOut.println("Passed Test #409 checking TFIDF for tomato in http://people.scs.carleton.ca/~davidmckenney/tinyfruits/N.html");
failOut.println("expected = " + expectedResult);
failOut.println("result = " + yourResult + "\n\n");
}

failOut.close();
passOut.close();
}
}
