
public class UrlUtils {

    public static String joinUrl(String baseUrl, String relativeUrl) {
        if (relativeUrl.startsWith("http://") || relativeUrl.startsWith("https://")) {
            return relativeUrl;
        }

        if (relativeUrl.startsWith("./")) {
            relativeUrl = relativeUrl.substring(2);
        }

        int lastSlash = baseUrl.lastIndexOf('/');
        String basePath = baseUrl.substring(0, lastSlash + 1);

        return basePath + relativeUrl;
    }
}
