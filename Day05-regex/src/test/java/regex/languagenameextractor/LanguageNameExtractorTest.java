package regex.languagenameextractor;

import org.junit.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class LanguageNameExtractorTest {

        @Test
        public void testExtractProgrammingLanguages_withValidText() {
            String text = "I love Java, Python, and JavaScript, but I haven't tried Go yet.";
            List<String> expected = List.of("Java", "Python", "JavaScript", "Go");

            List<String> result = LanguageNameExtractor.extractProgrammingLanguages(text, List.of("Java", "Python", "JavaScript", "Go", "C", "C++", "Ruby", "Swift", "Kotlin", "PHP", "Rust", "TypeScript"));

            assertEquals(expected, result);
        }

        @Test
        public void testExtractProgrammingLanguages_withNoMatchingLanguages() {
            String text = "I love learning new things, but no programming languages mentioned.";
            List<String> expected = List.of();

            List<String> result = LanguageNameExtractor.extractProgrammingLanguages(text, List.of("Java", "Python", "JavaScript", "Go", "C", "C++", "Ruby", "Swift", "Kotlin", "PHP", "Rust", "TypeScript"));

            assertEquals(expected, result);
        }

        @Test
        public void testExtractProgrammingLanguages_withEmptyText() {
            String text = "";
            List<String> expected = List.of();

            List<String> result = LanguageNameExtractor.extractProgrammingLanguages(text, List.of("Java", "Python", "JavaScript", "Go", "C", "C++", "Ruby", "Swift", "Kotlin", "PHP", "Rust", "TypeScript"));

            assertEquals(expected, result);
        }

}