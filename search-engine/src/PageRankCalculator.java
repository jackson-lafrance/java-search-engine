
import java.util.*;

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

        return ranks;
    }

// initializes the ranks
    private Map<String, Double> initializeRanks(List<String> pages, int numPages) {
        Map<String, Double> ranks = new HashMap<>();
        for (String page : pages) {
            ranks.put(page, 1.0 / numPages);
        }
        return ranks;
    }

// computes the new ranks
    private Map<String, Double> computeNewRanks(List<String> pages,
            Map<String, List<String>> linkGraph,
            Map<String, Double> ranks,
            int numPages) {
        Map<String, Double> newRanks = new HashMap<>();

// initializes with damping factor
        for (String page : pages) {
            newRanks.put(page, (1 - 0.9) / numPages);
        }

// distributes page rank
        for (String page : pages) {
            List<String> outLinks = linkGraph.getOrDefault(page, new ArrayList<>());
            int numOutLinks = outLinks.size();

            if (numOutLinks > 0) {
                double contribution = 0.9 * ranks.get(page) / numOutLinks;
                for (String link : outLinks) {
                    if (newRanks.containsKey(link)) {
                        newRanks.put(link, newRanks.get(link) + contribution);
                    }
                }
            } else {
// distributes page rank evenly when there are no outgoing links
                double contribution = 0.9 * ranks.get(page) / numPages;
                for (String p : pages) {
                    newRanks.put(p, newRanks.get(p) + contribution);
                }
            }
        }

        return newRanks;
    }

// calculates the euclidean distance
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
