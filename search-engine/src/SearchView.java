
import javafx.scene.layout.Pane;
import java.util.List;

// interface for the view component in MVC pattern
public interface SearchView {

    Pane getRootPane();

    void displayResults(List<SearchResult> results);

    void setController(SearchController controller);
}
