
public class SearchResultImpl implements SearchResult {

    private final String title;
    private final double score;

// constructor
    public SearchResultImpl(String title, double score) {
        this.title = title;
        this.score = score;
    }

// returns the title
    public String getTitle() {
        return title;
    }

// returns the score
    public double getScore() {
        return score;
    }
}
