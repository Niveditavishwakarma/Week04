package regex.extractemail;
import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.regex.*;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

class ExtractEmailTest {
    public List<String> extractEmails(String text) {
        String regex = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        List<String> emails = new ArrayList<>();
        while (matcher.find()) {
            emails.add(matcher.group());
        }
        return emails;
    }

    @Test
    void testExtractEmails() {
        String text = "Contact us at support@example.com and info@company.org";
        List<String> expected = List.of("support@example.com", "info@company.org");
        List<String> actual = extractEmails(text);

        assertEquals(expected, actual, "Email extraction failed!");
    }

    @Test
    void testNoEmails() {
        String text = "There is no email here!";
        List<String> expected = List.of();
        List<String> actual = extractEmails(text);

        assertEquals(expected, actual, "Should return an empty list for no emails.");
    }

    @Test
    void testMultipleEmails() {
        String text = "Emails: test1@mail.com, test2@domain.org, test3@example.net";
        List<String> expected = List.of("test1@mail.com", "test2@domain.org", "test3@example.net");
        List<String> actual = extractEmails(text);

        assertEquals(expected, actual, "Multiple email extraction failed!");
    }

}