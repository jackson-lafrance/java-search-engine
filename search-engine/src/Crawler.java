
import java.io.*;
import java.nio.file.*;
import java.util.*;

// web crawler that traverses web pages starting from a seed URL
public class Crawler {

    private final HtmlContentParser htmlParser;
    private final PageRankCalculator pageRankCalculator;
    private final TfIdfCalculator tfIdfCalculator;
    private final DataStorage dataStorage;
    private final String resultsDirectory;

    public Crawler() {
        this("crawlResults");
    }

    public Crawler(String resultsDirectory) {
        this.resultsDirectory = resultsDirectory;
        this.htmlParser = new HtmlParser();
        this.pageRankCalculator = new PageRankCalculator();
        this.tfIdfCalculator = new TfIdfCalculator();
        this.dataStorage = new FileDataStorage(resultsDirectory);
    }

    // crawls the web starting from the seed URL
    public int crawl(String seed) {
        dataStorage.clearStorage();

        CrawlData crawlData = performCrawl(seed);
        Map<String, List<String>> filteredLinkGraph = filterLinkGraph(crawlData.getLinkGraph(), crawlData.getVisited());
        Map<String, Double> pageRanks = pageRankCalculator.computePageRank(filteredLinkGraph);

        TfIdfData tfIdfData = calculateTfIdf(crawlData.getWordLists());

        saveCrawlResults(crawlData, pageRanks, tfIdfData);

        return crawlData.getVisited().size();
    }

    // performs the actual web crawling using BFS algorithm
    private CrawlData performCrawl(String seed) {
        Set<String> visited = new LinkedHashSet<>(); // Preserve insertion order (like Python)
        Map<String, List<String>> linkGraph = new LinkedHashMap<>(); // Preserve insertion order (like Python dict)
        Map<String, List<String>> incomingLinks = new HashMap<>();
        Map<String, List<String>> wordLists = new HashMap<>();
        Map<String, String> titles = new HashMap<>();

        List<String> toVisit = new ArrayList<>();
        Set<String> toVisitSet = new HashSet<>();
        toVisit.add(seed);
        toVisitSet.add(seed);

        int queueIndex = 0;
        int fileCounter = 0;

        while (queueIndex < toVisit.size()) {
            String url = toVisit.get(queueIndex);
            queueIndex++;

            toVisitSet.remove(url);

            if (visited.contains(url)) {
                continue;
            }

            visited.add(url);

            try {
                String content = WebRequester.readURL(url);
                savePageContent(content, fileCounter++);

                titles.put(url, htmlParser.extractTitle(content));
                List<String> links = htmlParser.extractLinks(content, url);
                linkGraph.put(url, links);
                wordLists.put(url, htmlParser.extractWords(content));

                incomingLinks.putIfAbsent(url, new ArrayList<>());

                for (String link : links) {
                    incomingLinks.putIfAbsent(link, new ArrayList<>());
                    incomingLinks.get(link).add(url);

                    if (!visited.contains(link) && !toVisitSet.contains(link)) {
                        toVisit.add(link);
                        toVisitSet.add(link);
                    }
                }
            } catch (IOException e) {
                System.err.println("Error crawling " + url + ": " + e.getMessage());
            }
        }

        return new CrawlData(visited, linkGraph, incomingLinks, wordLists, titles);
    }

    // filters link graph to only include links to visited pages
    private Map<String, List<String>> filterLinkGraph(Map<String, List<String>> linkGraph, Set<String> visited) {
        Map<String, List<String>> filtered = new LinkedHashMap<>();
        for (String page : linkGraph.keySet()) {
            List<String> links = linkGraph.get(page);
            List<String> validLinks = new ArrayList<>();
            for (String link : links) {
                if (visited.contains(link)) {
                    validLinks.add(link);
                }
            }
            filtered.put(page, validLinks);
        }
        return filtered;
    }

    // saves the html content of a page to a file
    private void savePageContent(String content, int fileCounter) throws IOException {
        String fileName = resultsDirectory + File.separator + "page" + fileCounter + ".txt";
        Files.write(Paths.get(fileName), content.getBytes());
    }

    // calculates tfidf scores from word lists
    private TfIdfData calculateTfIdf(Map<String, List<String>> wordLists) {
        int totalDocuments = wordLists.size();
        Map<String, Map<String, Double>> tf = tfIdfCalculator.calculateTf(wordLists);
        Map<String, Double> idf = tfIdfCalculator.calculateIdf(tf, totalDocuments);
        Map<String, Map<String, Double>> tfidf = tfIdfCalculator.calculateTfIdf(tf, idf);

        return new TfIdfData(tf, idf, tfidf);
    }

    // saves all crawl results to serialized files
    private void saveCrawlResults(CrawlData crawlData, Map<String, Double> pageRanks, TfIdfData tfIdfData) {
        try {
            dataStorage.writeObject(tfIdfData.getTf(), "tf.ser");
            dataStorage.writeObject(tfIdfData.getIdf(), "idf.ser");
            dataStorage.writeObject(tfIdfData.getTfidf(), "tfidf.ser");
            dataStorage.writeObject(pageRanks, "pageRank.ser");
            dataStorage.writeObject(crawlData.getLinkGraph(), "links.ser");
            dataStorage.writeObject(crawlData.getIncomingLinks(), "linksi.ser");
            dataStorage.writeObject(crawlData.getTitles(), "titles.ser");
        } catch (IOException e) {
            System.err.println("Error writing serialized files: " + e.getMessage());
        }
    }

    // inner class to hold crawl data - demonstrates encapsulation and composition
    private static class CrawlData {

        private final Set<String> visited;
        private final Map<String, List<String>> linkGraph;
        private final Map<String, List<String>> incomingLinks;
        private final Map<String, List<String>> wordLists;
        private final Map<String, String> titles;

        public CrawlData(Set<String> visited,
                Map<String, List<String>> linkGraph,
                Map<String, List<String>> incomingLinks,
                Map<String, List<String>> wordLists,
                Map<String, String> titles) {
            this.visited = new LinkedHashSet<>(visited);
            this.linkGraph = new LinkedHashMap<>(linkGraph);
            this.incomingLinks = new HashMap<>(incomingLinks);
            this.wordLists = new HashMap<>(wordLists);
            this.titles = new HashMap<>(titles);
        }

        public Set<String> getVisited() {
            return new LinkedHashSet<>(visited);
        }

        public Map<String, List<String>> getLinkGraph() {
            Map<String, List<String>> copy = new LinkedHashMap<>();
            for (Map.Entry<String, List<String>> entry : linkGraph.entrySet()) {
                copy.put(entry.getKey(), new ArrayList<>(entry.getValue()));
            }
            return copy;
        }

        public Map<String, List<String>> getIncomingLinks() {
            Map<String, List<String>> copy = new HashMap<>();
            for (Map.Entry<String, List<String>> entry : incomingLinks.entrySet()) {
                copy.put(entry.getKey(), new ArrayList<>(entry.getValue()));
            }
            return copy;
        }

        public Map<String, List<String>> getWordLists() {
            Map<String, List<String>> copy = new HashMap<>();
            for (Map.Entry<String, List<String>> entry : wordLists.entrySet()) {
                copy.put(entry.getKey(), new ArrayList<>(entry.getValue()));
            }
            return copy;
        }

        public Map<String, String> getTitles() {
            return new HashMap<>(titles);
        }
    }

    // inner class to hold tfidf calculation results
    private static class TfIdfData {

        private final Map<String, Map<String, Double>> tf;
        private final Map<String, Double> idf;
        private final Map<String, Map<String, Double>> tfidf;

        public TfIdfData(Map<String, Map<String, Double>> tf,
                Map<String, Double> idf,
                Map<String, Map<String, Double>> tfidf) {
            this.tf = deepCopyTf(tf);
            this.idf = new HashMap<>(idf);
            this.tfidf = deepCopyTfidf(tfidf);
        }

        // deep copies the TF map to prevent external modification
        private Map<String, Map<String, Double>> deepCopyTf(Map<String, Map<String, Double>> original) {
            Map<String, Map<String, Double>> copy = new HashMap<>();
            for (Map.Entry<String, Map<String, Double>> entry : original.entrySet()) {
                copy.put(entry.getKey(), new HashMap<>(entry.getValue()));
            }
            return copy;
        }

        // deep copies the TF-IDF map to prevent external modification
        private Map<String, Map<String, Double>> deepCopyTfidf(Map<String, Map<String, Double>> original) {
            Map<String, Map<String, Double>> copy = new HashMap<>();
            for (Map.Entry<String, Map<String, Double>> entry : original.entrySet()) {
                copy.put(entry.getKey(), new HashMap<>(entry.getValue()));
            }
            return copy;
        }

        public Map<String, Map<String, Double>> getTf() {
            return deepCopyTf(tf);
        }

        public Map<String, Double> getIdf() {
            return new HashMap<>(idf);
        }

        public Map<String, Map<String, Double>> getTfidf() {
            return deepCopyTfidf(tfidf);
        }
    }

    public static void main(String[] args) {
        String seedUrl = "https://people.scs.carleton.ca/~avamckenney/tinyfruitsA/N-0.html";
        System.out.println("Crawling from " + seedUrl + "...");

        Crawler crawler = new Crawler();
        int pagesCrawled = crawler.crawl(seedUrl);
        System.out.println("Crawled " + pagesCrawled + " pages");
    }
}
