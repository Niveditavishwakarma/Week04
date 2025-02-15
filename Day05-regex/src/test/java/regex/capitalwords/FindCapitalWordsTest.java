package regex.capitalwords;
import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.regex.*;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class FindCapitalWordsTest {
    public List<String> extractCapitalizedWords(String text) {
        String regex = "\\b[A-Z][a-z]*\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        List<String> capitalizedWords = new ArrayList<>();
        while (matcher.find()) {
            capitalizedWords.add(matcher.group());
        }
        return capitalizedWords;
    }

    @Test
    void testExtractCapitalizedWords() {
        String text = "The Eiffel Tower is in Paris and the Statue of Liberty is in New York.";
        List<String> expected = List.of("The", "Eiffel", "Tower", "Paris", "Statue", "Liberty", "New", "York");
        List<String> actual = extractCapitalizedWords(text);

        assertEquals(expected, actual, "Capitalized word extraction failed!");
    }

    @Test
    void testNoCapitalizedWords() {
        String text = "this sentence has no capitalized words.";
        List<String> expected = List.of();
        List<String> actual = extractCapitalizedWords(text);

        assertEquals(expected, actual, "Should return an empty list for no capitalized words.");
    }

    @Test
    void testOnlyCapitalizedWords() {
        String text = "Java Python C++ HTML CSS";
        List<String> expected = List.of("Java", "Python", "C");
        List<String> actual = extractCapitalizedWords(text);

        assertEquals(expected, actual, "Failed to handle capitalized words correctly.");
    }

}