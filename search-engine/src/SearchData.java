
import java.io.IOException;
import java.util.*;

// manages search data loaded from serialized files
public class SearchData {

    private final DataStorage dataStorage;

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
        this(new FileDataStorage(resultsDirectory));
    }

    // constructor with dependency injection
    public SearchData(DataStorage dataStorage) {
        this.dataStorage = dataStorage;
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
            Map<String, List<String>> loadedLinkGraph = dataStorage.readObject("links.ser");
            this.linkGraph = (loadedLinkGraph instanceof LinkedHashMap) ? loadedLinkGraph : new LinkedHashMap<>(loadedLinkGraph);
            this.incomingLinks = dataStorage.readObject("linksi.ser");
            Map<String, Double> loadedPageRanks = dataStorage.readObject("pageRank.ser");
            this.pageRanks = (loadedPageRanks instanceof LinkedHashMap) ? loadedPageRanks : new LinkedHashMap<>(loadedPageRanks);
            this.idf = dataStorage.readObject("idf.ser");
            this.tf = dataStorage.readObject("tf.ser");
            this.tfidf = dataStorage.readObject("tfidf.ser");
            this.titles = dataStorage.readObject("titles.ser");
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

    public List<String> getOutgoingLinks(String url) {
        loadData();
        return linkGraph.get(url);
    }

    public List<String> getIncomingLinks(String url) {
        loadData();
        return incomingLinks.get(url);
    }

    public double getPageRank(String url) {
        loadData();
        Double rank = pageRanks.get(url);
        return rank == null ? -1.0 : rank;
    }

    public double getIDF(String word) {
        loadData();
        return idf.getOrDefault(word, 0.0);
    }

    public double getTF(String url, String word) {
        loadData();
        Map<String, Double> urlTf = tf.get(word);
        if (urlTf == null) {
            return 0.0;
        }
        return urlTf.getOrDefault(url, 0.0);
    }

    public double getTFIDF(String url, String word) {
        loadData();
        Map<String, Double> urlTfidf = tfidf.get(word);
        if (urlTfidf == null) {
            return 0.0;
        }
        return urlTfidf.getOrDefault(url, 0.0);
    }

    public String getTitle(String url) {
        loadData();
        return titles.getOrDefault(url, "");
    }

    public List<String> getAllUrls() {
        loadData();
        return new ArrayList<>(linkGraph.keySet());
    }

    public Map<String, Double> getAllIDF() {
        loadData();
        return new HashMap<>(idf);
    }

    public Map<String, Map<String, Double>> getAllTFIDF() {
        loadData();
        return new HashMap<>(tfidf);
    }

    public Map<String, Double> getAllPageRanks() {
        loadData();
        return new LinkedHashMap<>(pageRanks);
    }

    public Map<String, String> getAllTitles() {
        loadData();
        return new HashMap<>(titles);
    }
}
