
import java.util.List;

// interface for parsing HTML content allows different parser implementations (I added this for better OOP principles)
public interface HtmlContentParser {

    String extractTitle(String htmlContent);

    List<String> extractLinks(String htmlContent, String baseUrl);

    List<String> extractWords(String htmlContent);
}
