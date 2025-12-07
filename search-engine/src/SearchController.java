import java.util.List;
import java.util.ArrayList;

// controller class for MVC pattern - handles user input and coordinates between model and view
public class SearchController {
    
    private final SearchEngine searchEngine;
    private SearchView view;
    
    public SearchController(SearchEngine searchEngine) {
        this.searchEngine = searchEngine;
    }
    
    public void setView(SearchView view) {
        this.view = view;
    }
    
    // handles search request from the view
    public void handleSearch(String query, boolean useBoost, int maxResults) {
        try {
            String searchQuery = (query == null) ? "" : query.trim();
            List<SearchResult> results = searchEngine.search(searchQuery, useBoost, maxResults);
            
            if (view != null) {
                view.displayResults(results);
            }
        } catch (Exception e) {
            System.err.println("Error performing search: " + e.getMessage());
            e.printStackTrace();
            if (view != null) {
                view.displayResults(new ArrayList<>());
            }
        }
    }
}

