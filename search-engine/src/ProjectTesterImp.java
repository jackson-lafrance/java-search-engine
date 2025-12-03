
import java.util.List;

public class ProjectTesterImp implements ProjectTester {

    private static final String RESULTS_DIRECTORY = "crawlResults";
    private Crawler crawler;
    private SearchData searchData;
    private SearchEngine searchEngine;

    public ProjectTesterImp() {
        this.crawler = new Crawler(RESULTS_DIRECTORY);
        this.searchData = new SearchData(RESULTS_DIRECTORY);
        this.searchEngine = new SearchEngine(searchData);
    }

    public void initialize() {
// clear any existing data from last crawl
        DataSerializer serializer = new DataSerializer(RESULTS_DIRECTORY);
        serializer.clearDirectory();

// reinitialize components
        this.crawler = new Crawler(RESULTS_DIRECTORY);
        this.searchData = new SearchData(RESULTS_DIRECTORY);
        this.searchEngine = new SearchEngine(searchData);
    }

    public void crawl(String seedURL) {
        crawler.crawl(seedURL);
// reload data after crawling
        searchData.reloadData();
    }

    public List<String> getOutgoingLinks(String url) {
        List<String> links = searchData.getOutgoingLinks(url);
        return links;
    }

    public List<String> getIncomingLinks(String url) {
        List<String> links = searchData.getIncomingLinks(url);
        return links;
    }

    public double getPageRank(String url) {
        return searchData.getPageRank(url);
    }

    public double getIDF(String word) {
        return searchData.getIDF(word);
    }

    public double getTF(String url, String word) {
        return searchData.getTF(url, word);
    }

    public double getTFIDF(String url, String word) {
        return searchData.getTFIDF(url, word);
    }

    public List<SearchResult> search(String query, boolean boost, int X) {
        return searchEngine.search(query, boost, X);
    }
}
