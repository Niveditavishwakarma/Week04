package regex.repeatingwords;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindRepeatingWords {
    public static String findRepeatingWords(String sentence) {
        String[] words = sentence.split("\\s+");

        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            word = word.toLowerCase();
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        List<String> repeatingWords = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if (entry.getValue() > 1) {
                repeatingWords.add(entry.getKey());
            }
        }
        return String.join(", ", repeatingWords);
    }

    public static void main(String[] args) {
        String input = "This is is a repeated repeated word test.";
        System.out.println("Repeating words: " + findRepeatingWords(input));
    }
}
