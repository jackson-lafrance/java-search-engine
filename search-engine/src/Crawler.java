
import java.io.*;
import java.nio.file.*;
import java.util.*;

/**
 * Main crawler class that orchestrates web crawling, indexing, and data
 * persistence.
 */
public class Crawler {

    private final HtmlParser htmlParser;
    private final PageRankCalculator pageRankCalculator;
    private final TfIdfCalculator tfIdfCalculator;
    private final DataSerializer dataSerializer;
    private final String resultsDirectory;

    public Crawler() {
        this("crawlResults");
    }

    public Crawler(String resultsDirectory) {
        this.resultsDirectory = resultsDirectory;
        this.htmlParser = new HtmlParser();
        this.pageRankCalculator = new PageRankCalculator();
        this.tfIdfCalculator = new TfIdfCalculator();
        this.dataSerializer = new DataSerializer(resultsDirectory);
    }

// crawls the web starting from the seed url
    public int crawl(String seed) {
        dataSerializer.clearDirectory();

        CrawlData crawlData = performCrawl(seed);
        Map<String, Double> pageRanks = pageRankCalculator.computePageRank(crawlData.getLinkGraph());

        TfIdfData tfIdfData = calculateTfIdf(crawlData.getWordLists());

        saveCrawlResults(crawlData, pageRanks, tfIdfData);

        return crawlData.getVisited().size();
    }

// performs the actual web crawling using bfs
    private CrawlData performCrawl(String seed) {
        Set<String> visited = new HashSet<>();
        Map<String, List<String>> linkGraph = new HashMap<>();
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

// saves all crawl results to serialized file guys
    private void saveCrawlResults(CrawlData crawlData, Map<String, Double> pageRanks, TfIdfData tfIdfData) {
        try {
            dataSerializer.writeObject(tfIdfData.getTf(), "tf.ser");
            dataSerializer.writeObject(tfIdfData.getIdf(), "idf.ser");
            dataSerializer.writeObject(tfIdfData.getTfidf(), "tfidf.ser");
            dataSerializer.writeObject(pageRanks, "pageRank.ser");
            dataSerializer.writeObject(crawlData.getLinkGraph(), "links.ser");
            dataSerializer.writeObject(crawlData.getIncomingLinks(), "linksi.ser");
            dataSerializer.writeObject(crawlData.getTitles(), "titles.ser");
        } catch (IOException e) {
            System.err.println("Error writing serialized files: " + e.getMessage());
        }
    }

// inner class to hold crawl data
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
            this.visited = visited;
            this.linkGraph = linkGraph;
            this.incomingLinks = incomingLinks;
            this.wordLists = wordLists;
            this.titles = titles;
        }

        public Set<String> getVisited() {
            return visited;
        }

        public Map<String, List<String>> getLinkGraph() {
            return linkGraph;
        }

        public Map<String, List<String>> getIncomingLinks() {
            return incomingLinks;
        }

        public Map<String, List<String>> getWordLists() {
            return wordLists;
        }

        public Map<String, String> getTitles() {
            return titles;
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
            this.tf = tf;
            this.idf = idf;
            this.tfidf = tfidf;
        }

        public Map<String, Map<String, Double>> getTf() {
            return tf;
        }

        public Map<String, Double> getIdf() {
            return idf;
        }

        public Map<String, Map<String, Double>> getTfidf() {
            return tfidf;
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
