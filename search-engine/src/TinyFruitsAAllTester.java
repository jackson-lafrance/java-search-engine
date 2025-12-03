public class TinyFruitsAAllTester {
    public static void main(String[] args) throws Exception {
        ProjectTester tester = new ProjectTesterImp(); //Instantiate your own ProjectTester instance here
        tester.initialize();
        tester.crawl("https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-0.html");

        TinyFruitsAOutgoingLinksTester.runTest(tester);
        TinyFruitsAIncomingLinksTester.runTest(tester);
        TinyFruitsAPageRanksTester.runTest(tester);
        TinyFruitsAIDFTester.runTest(tester);
        TinyFruitsATFTester.runTest(tester);
        TinyFruitsATFIDFTester.runTest(tester);
        TinyFruitsASearchNoBoostTester.runTest(tester);
        TinyFruitsASearchBoostTester.runTest(tester);
        System.out.println("Finished running all tests.");
    }
}
