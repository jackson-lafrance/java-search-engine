
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class WebRequester {

    public static String readURL(String url) throws MalformedURLException, IOException {
        URL page = new URL(url);
        StringBuilder response = new StringBuilder();
        BufferedReader reader = new BufferedReader(new InputStreamReader(page.openStream()));
        String currentLine = reader.readLine();
        while (currentLine != null) {
            response.append(currentLine + "\n");
            currentLine = reader.readLine();
        }
        return response.toString();
    }

}
