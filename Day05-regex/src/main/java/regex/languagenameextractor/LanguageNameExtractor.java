package regex.languagenameextractor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LanguageNameExtractor {
    public static void main(String[] args) {
        String text = "I love Java, Python, and JavaScript, but I haven't tried Go yet.";
        List<String> languages = Arrays.asList("Java", "Python", "JavaScript", "Go", "C", "C++", "Ruby", "Swift", "Kotlin", "PHP", "Rust", "TypeScript");

        List<String> extractedLanguages = extractProgrammingLanguages(text, languages);

        System.out.println(String.join(", ", extractedLanguages));
    }

    public static List<String> extractProgrammingLanguages(String text, List<String> languages) {
        List<String> foundLanguages = new ArrayList<>();

        for (String language : languages) {
            if (text.contains(language)) {
                foundLanguages.add(language);
            }
        }

        return foundLanguages;
    }
}
