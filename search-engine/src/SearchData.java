
import java.io.IOException;
import java.util.*;

public class SearchData {

    private final DataSerializer dataSerializer;

// cached data loaded from serialized files
    private Map<String, List<String>> linkGraph;
    private Map<String, List<String>> incomingLinks;
    private Map<String, Double> pageRanks;
    private Map<String, Double> idf;
    private Map<String, Map<String, Double>> tf;
    private Map<String, Map<String, Double>> tfidf;
    private Map<String, String> titles;

    private boolean dataLoaded;

    public SearchData(String resultsDirectory) {
        this.dataSerializer = new DataSerializer(resultsDirectory);
        this.linkGraph = new LinkedHashMap<>();
        this.incomingLinks = new HashMap<>();
        this.pageRanks = new LinkedHashMap<>();
        this.idf = new HashMap<>();
        this.tf = new HashMap<>();
        this.tfidf = new HashMap<>();
        this.titles = new HashMap<>();
        this.dataLoaded = false;
    }

// loads all data from serialized files into memory
    private void loadData() {
        if (dataLoaded) {
            return;
        }

        try {
            Map<String, List<String>> loadedLinkGraph = dataSerializer.readObject("links.ser");
            this.linkGraph = (loadedLinkGraph instanceof LinkedHashMap) ? loadedLinkGraph : new LinkedHashMap<>(loadedLinkGraph);
            this.incomingLinks = dataSerializer.readObject("linksi.ser");
            Map<String, Double> loadedPageRanks = dataSerializer.readObject("pageRank.ser");
            this.pageRanks = (loadedPageRanks instanceof LinkedHashMap) ? loadedPageRanks : new LinkedHashMap<>(loadedPageRanks);
            this.idf = dataSerializer.readObject("idf.ser");
            this.tf = dataSerializer.readObject("tf.ser");
            this.tfidf = dataSerializer.readObject("tfidf.ser");
            this.titles = dataSerializer.readObject("titles.ser");
            this.dataLoaded = true;
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error loading data: " + e.getMessage());
        }
    }

// forces a reload of data from files
    public void reloadData() {
        this.dataLoaded = false;
        loadData();
    }

// returns a list of outgoing links for the given url
    public List<String> getOutgoingLinks(String url) {
        loadData();
        return linkGraph.get(url);
    }

// returns a list of incomng links for the url you put in
    public List<String> getIncomingLinks(String url) {
        loadData();
        return incomingLinks.get(url);
    }

// returns the page rank for the url you put in
    public double getPageRank(String url) {
        loadData();
        Double rank = pageRanks.get(url);
        return rank == null ? -1.0 : rank;
    }

// returns the idf for the word you input
    public double getIDF(String word) {
        loadData();
        return idf.getOrDefault(word, 0.0);
    }

// returns the tf for the word in the url you input
    public double getTF(String url, String word) {
        loadData();
        Map<String, Double> urlTf = tf.get(word);
        if (urlTf == null) {
            return 0.0;
        }
        return urlTf.getOrDefault(url, 0.0);
    }

// returns the tfidf for the word in the url you input
    public double getTFIDF(String url, String word) {
        loadData();
        Map<String, Double> urlTfidf = tfidf.get(word);
        if (urlTfidf == null) {
            return 0.0;
        }
        return urlTfidf.getOrDefault(url, 0.0);
    }

// returns the title for the url you input
    public String getTitle(String url) {
        loadData();
        return titles.getOrDefault(url, "");
    }

// returns all urls that were crawled
    public List<String> getAllUrls() {
        loadData();
        return new ArrayList<>(linkGraph.keySet());
    }

// returns all idf values
    public Map<String, Double> getAllIDF() {
        loadData();
        return new HashMap<>(idf);
    }

// returns all tfidf values
    public Map<String, Map<String, Double>> getAllTFIDF() {
        loadData();
        return new HashMap<>(tfidf);
    }

// returns all page rank values
    public Map<String, Double> getAllPageRanks() {
        loadData();
        return new LinkedHashMap<>(pageRanks);
    }

// returns all titles
    public Map<String, String> getAllTitles() {
        loadData();
        return new HashMap<>(titles);
    }
}
