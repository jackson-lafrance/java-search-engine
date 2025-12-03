
import java.util.*;

public class SearchEngine {

    private final SearchData searchData;

    public SearchEngine(SearchData searchData) {
        this.searchData = searchData;
    }

// performs a search using the query you input
    public List<SearchResult> search(String query, boolean boost) {
        return search(query, boost, 10);
    }

// performs a search using the query you input, returns top X results
    public List<SearchResult> search(String query, boolean boost, int X) {
// parses the query into words (only alphabetic characters)
        List<String> words = parseQuery(query);
        if (words.isEmpty()) {
            return new ArrayList<>();
        }

// gets all urls
        List<String> allUrls = searchData.getAllUrls();
        if (allUrls.isEmpty()) {
            return new ArrayList<>();
        }

// gets all required data
        Map<String, Double> allIdf = searchData.getAllIDF();
        Map<String, String> urlToTitle = searchData.getAllTitles();
        Map<String, Map<String, Double>> allTfidf = searchData.getAllTFIDF();
        Map<String, Double> allPageRanks = boost ? searchData.getAllPageRanks() : null;

// calculates the query tf
        Map<String, Double> queryTf = new HashMap<>();
        for (String word : words) {
            queryTf.put(word, queryTf.getOrDefault(word, 0.0) + 1.0);
        }

// normalizes the query tf
        int totalQueryWords = words.size();
        for (String word : queryTf.keySet()) {
            queryTf.put(word, queryTf.get(word) / totalQueryWords);
        }

// calculates the query tfidf
        Map<String, Double> queryTfidf = new HashMap<>();
        for (String word : queryTf.keySet()) {
            double wordTf = queryTf.get(word);
            double wordIdf = allIdf.getOrDefault(word, 0.0);
            queryTfidf.put(word, (Math.log(1 + wordTf) / Math.log(2)) * wordIdf);
        }

// calculates the query magnitude
        double queryMagnitudeSquared = 0.0;
        for (double value : queryTfidf.values()) {
            queryMagnitudeSquared += value * value;
        }
        double queryMagnitude = Math.sqrt(queryMagnitudeSquared);

        if (queryMagnitude == 0.0) {
            return new ArrayList<>();
        }

// calculates the scores for each url
        List<SearchResult> results = new ArrayList<>();
        for (String url : allUrls) {
            double dotProduct = 0.0;
            double docMagnitudeSquared = 0.0;

// calculates the cosine similarity
            for (String word : queryTfidf.keySet()) {
                Map<String, Double> wordTfidf = allTfidf.get(word);
                if (wordTfidf != null && wordTfidf.containsKey(url)) {
                    double docTfidf = wordTfidf.get(url);
                    double queryTfidfValue = queryTfidf.get(word);
                    dotProduct += queryTfidfValue * docTfidf;
                    docMagnitudeSquared += docTfidf * docTfidf;
                }
            }

            double cosineSimilarity = 0.0;
            if (docMagnitudeSquared > 0.0) {
                double docMagnitude = Math.sqrt(docMagnitudeSquared);
                cosineSimilarity = dotProduct / (queryMagnitude * docMagnitude);
            }

// calculates the final score
            double score = cosineSimilarity;
            if (boost && allPageRanks != null) {
                double pageRank = allPageRanks.getOrDefault(url, 1.0);
                score = cosineSimilarity * pageRank;
            }

            String title = urlToTitle.getOrDefault(url, "");
            results.add(new SearchResultImpl(title, score));
        }

// sorts the results by score then by title
        results.sort((r1, r2) -> {
            double score1 = Math.round(r1.getScore() * 1000.0) / 1000.0;
            double score2 = Math.round(r2.getScore() * 1000.0) / 1000.0;

            if (Math.abs(score1 - score2) < 0.0001) {
// scores are equal so use lexicgraphical ordering
                return r1.getTitle().compareTo(r2.getTitle());
            }
            return Double.compare(score2, score1);
        });

// returns the top X results
        int numResults = Math.min(X, results.size());
        if (numResults == 0) {
            return new ArrayList<>();
        }
        return new ArrayList<>(results.subList(0, numResults));
    }

// parses the query into a list of words (only alphabetic characters)
    private List<String> parseQuery(String query) {
        List<String> words = new ArrayList<>();
        String queryLower = query.toLowerCase();
        StringBuilder currentWord = new StringBuilder();

        for (char c : queryLower.toCharArray()) {
            if (Character.isLetter(c)) {
                currentWord.append(c);
            } else {
                if (currentWord.length() > 0) {
                    words.add(currentWord.toString());
                    currentWord.setLength(0);
                }
            }
        }

        if (currentWord.length() > 0) {
            words.add(currentWord.toString());
        }

        return words;
    }
}
