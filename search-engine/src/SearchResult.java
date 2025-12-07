
public class SearchResult {

    private final String title;
    private final double score;

    // constructor
    public SearchResult(String title, double score) {
        this.title = title;
        this.score = score;
    }

    /*
    Returns the title of the page this search result is for.
     */
    public String getTitle() {
        return title;
    }

    /*
    Returns the search score for the page this search result is for.
     */
    public double getScore() {
        return score;
    }
}
