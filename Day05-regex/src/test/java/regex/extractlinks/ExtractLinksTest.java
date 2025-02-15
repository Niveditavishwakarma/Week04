package regex.extractlinks;
import org.junit.jupiter.api.Test;
import java.util.regex.*;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class ExtractLinksTest {
    private static final String URL_REGEX = "\\b(https?://|www\\.)[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}(/\\S*)?\\b";

    private static List<String> extractLinks(String text) {
        Pattern pattern = Pattern.compile(URL_REGEX);
        Matcher matcher = pattern.matcher(text);
        List<String> links = new ArrayList<>();

        while (matcher.find()) {
            links.add(matcher.group());
        }

        return links;
    }

    @Test
    void testExtractLinks() {
        String text = "Visit https://www.google.com, check http://example.org, and go to www.microsoft.com.";

        List<String> expectedLinks = Arrays.asList(
                "https://www.google.com",
                "http://example.org",
                "www.microsoft.com"
        );

        assertEquals(expectedLinks, extractLinks(text));
    }

    @Test
    void testExtractLinksWithPaths() {
        String text = "Find docs at https://docs.example.net/help and www.site.com/about.";

        List<String> expectedLinks = Arrays.asList(
                "https://docs.example.net/help",
                "www.site.com/about"
        );

        assertEquals(expectedLinks, extractLinks(text));
    }

    @Test
    void testNoLinks() {
        String text = "This text has no valid links.";
        assertTrue(extractLinks(text).isEmpty());
    }

    @Test
    void testInvalidUrls() {
        String text = "This should not match: google.com, http:/example.com, www..com";

        List<String> expectedLinks = new ArrayList<>();

        assertEquals(expectedLinks, extractLinks(text));
    }

}