public class FruitsAAllTester {
     public static void main(String[] args) throws Exception {
        ProjectTester tester = new ProjectTesterImp(); //Instantiate your own ProjectTester instance here
        tester.initialize();
        tester.crawl("https://people.scs.carleton.ca/~avamckenney/fruitsA/N-0.html");

        FruitsAOutgoingLinksTester.runTest(tester);
        FruitsAIncomingLinksTester.runTest(tester);
        FruitsAPageRanksTester.runTest(tester);
        FruitsAIDFTester.runTest(tester);
        FruitsATFTester.runTest(tester);
        FruitsATFIDFTester.runTest(tester);
        FruitsASearchNoBoostTester.runTest(tester);
        FruitsASearchBoostTester.runTest(tester);
        System.out.println("Finished running all tests.");
    }
}