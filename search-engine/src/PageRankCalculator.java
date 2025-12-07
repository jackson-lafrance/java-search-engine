
import java.util.*;

// calculates PageRank values
public class PageRankCalculator {

    // computes page rank for all pages in the link graph
    public Map<String, Double> computePageRank(Map<String, List<String>> linkGraph) {
        List<String> pages = new ArrayList<>(linkGraph.keySet());
        int numPages = pages.size();

        if (numPages == 0) {
            return new HashMap<>();
        }

        Map<String, Double> ranks = initializeRanks(pages, numPages);
        double euclideanDistance = 1.0;

        while (euclideanDistance >= 0.0001) {
            Map<String, Double> newRanks = computeNewRanks(pages, linkGraph, ranks, numPages);
            euclideanDistance = calculateEuclideanDistance(ranks, newRanks, pages);
            ranks = newRanks;
        }

        Map<String, Double> result = new LinkedHashMap<>();
        for (String page : pages) {
            result.put(page, ranks.get(page));
        }
        return result;
    }

    // computes page rank using visited set (overloaded method)
    public Map<String, Double> computePageRank(Map<String, List<String>> linkGraph, Set<String> visited) {
        List<String> pages = new ArrayList<>(linkGraph.keySet());
        int numPages = pages.size();

        if (numPages == 0) {
            return new HashMap<>();
        }

        Map<String, Double> ranks = initializeRanks(pages, numPages);
        double euclideanDistance = 1.0;

        while (euclideanDistance >= 0.0001) {
            Map<String, Double> newRanks = computeNewRanks(pages, linkGraph, ranks, numPages);
            euclideanDistance = calculateEuclideanDistance(ranks, newRanks, pages);
            ranks = newRanks;
        }

// returns ranks in pages order
        Map<String, Double> result = new LinkedHashMap<>();
        for (String page : pages) {
            result.put(page, ranks.get(page));
        }
        return result;
    }

    // initializes the ranks uniformly
    private Map<String, Double> initializeRanks(List<String> pages, int numPages) {
        Map<String, Double> ranks = new LinkedHashMap<>();
        for (String page : pages) {
            ranks.put(page, 1.0 / numPages);
        }
        return ranks;
    }

    // computes the new ranks based on current ranks
    private Map<String, Double> computeNewRanks(List<String> pages,
            Map<String, List<String>> linkGraph,
            Map<String, Double> ranks,
            int numPages) {
        Map<String, Double> newRanks = new LinkedHashMap<>();
        Set<String> pagesSet = new HashSet<>(pages);

// initializes with damping factor
        double dampingValue = (1.0 - 0.9) / numPages;
        for (String page : pages) {
            newRanks.put(page, dampingValue);
        }

// distributes page rank
        for (String page : pages) {
            List<String> outLinks = linkGraph.getOrDefault(page, new ArrayList<>());

            int numValidLinks = 0;
            for (String link : outLinks) {
                if (pagesSet.contains(link)) {
                    numValidLinks++;
                }
            }

            if (numValidLinks > 0) {
                double contribution = 0.9 * ranks.get(page) / numValidLinks;
                for (String link : outLinks) {
                    if (pagesSet.contains(link)) {
                        newRanks.put(link, newRanks.get(link) + contribution);
                    }
                }
            } else {
                List<String> sortedPages = new ArrayList<>(pages);
                Collections.sort(sortedPages);
                double contribution = 0.9 * ranks.get(page) / numPages;
                for (String p : sortedPages) {
                    newRanks.put(p, newRanks.get(p) + contribution);
                }
            }
        }

        return newRanks;
    }

    // calculates the euclidean distance between old and new ranks
    private double calculateEuclideanDistance(Map<String, Double> oldRanks,
            Map<String, Double> newRanks,
            List<String> pages) {
        double sumSquaredDifferences = 0;
        for (String page : pages) {
            double change = newRanks.get(page) - oldRanks.get(page);
            sumSquaredDifferences += change * change;
        }
        return Math.sqrt(sumSquaredDifferences);
    }
}
