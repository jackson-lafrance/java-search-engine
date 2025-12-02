
import java.io.IOException;
import java.net.URI;
import java.net.http.*;

public class WebFetcher {

    private final HttpClient httpClient;

    public WebFetcher() {
        this.httpClient = HttpClient.newHttpClient();
    }

// reads the content of a url
    public String fetchUrl(String urlString) throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(urlString))
                .build();

        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        return response.body();
    }
}
