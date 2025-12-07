
import java.util.*;

// HTML parser that implements HtmlContentParser interface for polymorphism
public class HtmlParser implements HtmlContentParser {

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

    // extracts all links and converts them to absolute URLs
    public List<String> extractLinks(String htmlContent, String baseUrl) {
        List<String> links = new ArrayList<>();
        int searchStart = 0;

        while (true) {
            int tagStart = htmlContent.indexOf("<a", searchStart);
            if (tagStart == -1) {
                break;
            }

            String linkUrl = extractLinkUrl(htmlContent, tagStart);
            if (linkUrl != null) {
                String absoluteUrl = UrlUtils.joinUrl(baseUrl, linkUrl);
                links.add(absoluteUrl);
            }

            searchStart = tagStart + 2;
        }

        return links;
    }

    // extracts words from paragraph tags
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
            words.addAll(extractWordsFromText(pContent));

            searchStart = pEnd + 4;
        }

        return words;
    }

    // helper method to extract link URL from anchor tag
    private String extractLinkUrl(String htmlContent, int tagStart) {
        int hrefStart = htmlContent.indexOf("href=\"", tagStart);
        if (hrefStart == -1) {
            return null;
        }

        int urlStart = hrefStart + 6;
        int urlEnd = htmlContent.indexOf("\"", urlStart);

        if (urlEnd != -1) {
            return htmlContent.substring(urlStart, urlEnd);
        }

        return null;
    }

    // helper method to extract words from text content
    private List<String> extractWordsFromText(String text) {
        List<String> words = new ArrayList<>();
        StringBuilder currentWord = new StringBuilder();

        for (char c : text.toCharArray()) {
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

        return words;
    }
}
