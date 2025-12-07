public class Fruits25AllTester {
    public static void main(String[] args) throws Exception {
        ProjectTester tester = new ProjectTesterImp(); //Instantiate your own ProjectTester instance here
        tester.initialize();
        tester.crawl("https://people.scs.carleton.ca/~avamckenney/fruits25/N-0.html");

        Fruits25OutgoingLinksTester.runTest(tester);
        Fruits25IncomingLinksTester.runTest(tester);
        Fruits25PageRanksTester.runTest(tester);
        Fruits25IDFTester.runTest(tester);
        Fruits25TFTester.runTest(tester);
        Fruits25TFIDFTester.runTest(tester);
        Fruits25SearchNoBoostTester.runTest(tester);
        Fruits25SearchBoostTester.runTest(tester);
        System.out.println("Finished running all tests.");
    }
}
