package regex.repeatingwords;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FindRepeatingWordsTest {
        @Test
        public void testFindRepeatingWords_Standard() {
            String input = "This is is a repeated repeated word test.";
            String expected = "is, repeated";
            String actual = FindRepeatingWords.findRepeatingWords(input);
            assertEquals(expected, actual, "The repeating words should be 'is, repeated'");
        }

        @Test
        public void testFindRepeatingWords_NoRepeats() {
            String input = "This is a simple test.";
            String expected = "";
            String actual = FindRepeatingWords.findRepeatingWords(input);
            assertEquals(expected, actual, "There should be no repeating words.");
        }

        @Test
        public void testFindRepeatingWords_WithExtraSpaces() {
            String input = "This   is is   a  repeated repeated word  test.";
            String expected = "is, repeated";
            String actual = FindRepeatingWords.findRepeatingWords(input);
            assertEquals(expected, actual, "The repeating words should be 'is, repeated'");
        }

}