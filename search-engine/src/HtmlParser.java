
import java.util.*;

public class HtmlParser {

// extracts the title from html content
    public String extractTitle(String htmlContent) {
        int titleStart = htmlContent.indexOf("<title>");
        if (titleStart != -1) {
            int titleEnd = htmlContent.indexOf("</title>", titleStart + 7);
            if (titleEnd != -1) {
                return htmlContent.substring(titleStart + 7, titleEnd);
            }
        }
        return "";
    }

// extracts all links/converts them to absolute
    public List<String> extractLinks(String htmlContent, String baseUrl) {
        List<String> links = new ArrayList<>();
        int searchStart = 0;

        while (true) {
            int tagStart = htmlContent.indexOf("<a", searchStart);
            if (tagStart == -1) {
                break;
            }

            int hrefStart = htmlContent.indexOf("href=\"", tagStart);
            if (hrefStart == -1) {
                searchStart = tagStart + 2;
                continue;
            }

            int urlStart = hrefStart + 6;
            int urlEnd = htmlContent.indexOf("\"", urlStart);

            if (urlEnd != -1) {
                String relativeUrl = htmlContent.substring(urlStart, urlEnd);
                String absoluteUrl = UrlUtils.joinUrl(baseUrl, relativeUrl);
                links.add(absoluteUrl);
            }

            searchStart = tagStart + 2;
        }

        return links;
    }

// extracts words from <p> tags
    public List<String> extractWords(String htmlContent) {
        List<String> words = new ArrayList<>();
        int searchStart = 0;

        while (true) {
            int pStart = htmlContent.indexOf("<p>", searchStart);
            if (pStart == -1) {
                break;
            }

            int pEnd = htmlContent.indexOf("</p>", pStart);
            if (pEnd == -1) {
                break;
            }

            String pContent = htmlContent.substring(pStart + 3, pEnd).toLowerCase();

            StringBuilder currentWord = new StringBuilder();
            for (char c : pContent.toCharArray()) {
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

            searchStart = pEnd + 4;
        }

        return words;
    }
}
