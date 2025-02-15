package regex.extractdates;
import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.regex.*;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

class ExtractDatesTest {
    public List<String> extractDates(String text) {
        String regex = "\\b(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/\\d{4}\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        List<String> dates = new ArrayList<>();
        while (matcher.find()) {
            dates.add(matcher.group());
        }
        return dates;
    }

    @Test
    void testValidDates() {
        String text = "The events are scheduled for 12/05/2023, 15/08/2024, and 29/02/2020.";
        List<String> expected = List.of("12/05/2023", "15/08/2024", "29/02/2020");
        List<String> actual = extractDates(text);

        assertEquals(expected, actual, "Valid dates extraction failed!");
    }

    @Test
    void testNoDates() {
        String text = "There are no dates in this text.";
        List<String> expected = List.of();
        List<String> actual = extractDates(text);

        assertEquals(expected, actual, "Should return an empty list when no dates are present.");
    }

    @Test
    void testInvalidDates() {
        String text = "32/01/2023 is not valid, nor is 15/13/2024 or 99/99/9999.";
        List<String> expected = List.of();
        List<String> actual = extractDates(text);

        assertEquals(expected, actual, "Invalid dates should not be extracted.");
    }

    @Test
    void testDifferentFormats() {
        String text = "Valid: 01/01/2022, Invalid: 2022/01/01, 01-01-2022, 1/1/2022";
        List<String> expected = List.of("01/01/2022");
        List<String> actual = extractDates(text);

        assertEquals(expected, actual, "Only valid dd/mm/yyyy format should be extracted.");
    }

}