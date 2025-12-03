public class Fruits50AllTester {
    public static void main(String[] args) throws Exception {
        ProjectTester tester = new ProjectTesterImp(); //Instantiate your own ProjectTester instance here
        tester.initialize();
        tester.crawl("https://people.scs.carleton.ca/~avamckenney/fruits50/N-0.html");

        Fruits50OutgoingLinksTester.runTest(tester);
        Fruits50IncomingLinksTester.runTest(tester);
        Fruits50PageRanksTester.runTest(tester);
        Fruits50IDFTester.runTest(tester);
        Fruits50TFTester.runTest(tester);
        Fruits50TFIDFTester.runTest(tester);
        Fruits50SearchNoBoostTester.runTest(tester);
        Fruits50SearchBoostTester.runTest(tester);
        System.out.println("Finished running all tests.");
    }
}
