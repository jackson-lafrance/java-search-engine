
import java.util.List;

// interface for parsing HTML content - allows different parser implementations
public interface HtmlContentParser {

    String extractTitle(String htmlContent);

    List<String> extractLinks(String htmlContent, String baseUrl);

    List<String> extractWords(String htmlContent);
}
