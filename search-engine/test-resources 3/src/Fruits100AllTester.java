public class Fruits100AllTester {
    public static void main(String[] args) throws Exception {
        ProjectTester tester = new ProjectTesterImp(); //Instantiate your own ProjectTester instance here
        tester.initialize();
        tester.crawl("https://people.scs.carleton.ca/~avamckenney/fruits100/N-0.html");

        Fruits100OutgoingLinksTester.runTest(tester);
        Fruits100IncomingLinksTester.runTest(tester);
        Fruits100PageRanksTester.runTest(tester);
        Fruits100IDFTester.runTest(tester);
        Fruits100TFTester.runTest(tester);
        Fruits100TFIDFTester.runTest(tester);
        Fruits100SearchNoBoostTester.runTest(tester);
        Fruits100SearchBoostTester.runTest(tester);
        System.out.println("Finished running all tests.");
    }
}
