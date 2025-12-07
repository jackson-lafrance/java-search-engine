
import java.util.*;

public class TfIdfCalculator {

// calculates term frequency for all words across all documents
    public Map<String, Map<String, Double>> calculateTf(Map<String, List<String>> wordLists) {
        Map<String, Map<String, Double>> tf = new HashMap<>();

        for (Map.Entry<String, List<String>> entry : wordLists.entrySet()) {
            String url = entry.getKey();
            List<String> words = entry.getValue();
            int totalWords = words.size();

            if (totalWords == 0) {
                continue;
            }

            Map<String, Integer> wordCounts = countWords(words);

            for (Map.Entry<String, Integer> wordEntry : wordCounts.entrySet()) {
                String word = wordEntry.getKey();
                int count = wordEntry.getValue();
                tf.putIfAbsent(word, new HashMap<>());
                tf.get(word).put(url, (double) count / totalWords);
            }
        }

        return tf;
    }

// calculates inverse document frequency for all words
    public Map<String, Double> calculateIdf(Map<String, Map<String, Double>> tf, int totalDocuments) {
        Map<String, Double> idf = new HashMap<>();

        for (Map.Entry<String, Map<String, Double>> entry : tf.entrySet()) {
            String word = entry.getKey();
            Map<String, Double> urlDict = entry.getValue();
            int numDocsWithWord = urlDict.size();

            double idfValue = Math.log(totalDocuments / (double) (numDocsWithWord + 1)) / Math.log(2);
            // cap IDF at 0 (negative values become 0)
            idf.put(word, Math.max(0.0, idfValue));
        }

        return idf;
    }

// calculates tfidf scores for all words across all documents
    public Map<String, Map<String, Double>> calculateTfIdf(Map<String, Map<String, Double>> tf,
            Map<String, Double> idf) {
        Map<String, Map<String, Double>> tfidf = new HashMap<>();

        for (Map.Entry<String, Map<String, Double>> entry : tf.entrySet()) {
            String word = entry.getKey();
            Map<String, Double> urlDict = entry.getValue();
            tfidf.put(word, new HashMap<>());

            for (Map.Entry<String, Double> urlEntry : urlDict.entrySet()) {
                String url = urlEntry.getKey();
                double tfValue = urlEntry.getValue();
                double idfValue = idf.get(word);
                tfidf.get(word).put(url, (Math.log(1 + tfValue) / Math.log(2)) * idfValue);
            }
        }

        return tfidf;
    }

// counts the words
    private Map<String, Integer> countWords(List<String> words) {
        Map<String, Integer> wordCounts = new HashMap<>();
        for (String word : words) {
            wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
        }
        return wordCounts;
    }
}
