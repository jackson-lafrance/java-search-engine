public class TinyFruitsAllTester {
    public static void main(String[] args) throws Exception {
        ProjectTester tester = new ProjectTesterImp(); //Instantiate your own ProjectTester instance here
        tester.initialize();
        tester.crawl("https://people.scs.carleton.ca/~avamckenney/tinyfruits/N-0.html");

        TinyFruitsOutgoingLinksTester.runTest(tester);
        TinyFruitsIncomingLinksTester.runTest(tester);
        TinyFruitsPageRanksTester.runTest(tester);
        TinyFruitsIDFTester.runTest(tester);
        TinyFruitsTFTester.runTest(tester);
        TinyFruitsTFIDFTester.runTest(tester);
        TinyFruitsSearchNoBoostTester.runTest(tester);
        TinyFruitsSearchBoostTester.runTest(tester);
        System.out.println("Finished running all tests.");
    }
}
