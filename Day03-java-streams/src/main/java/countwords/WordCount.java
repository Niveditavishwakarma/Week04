package countwords;
import java.util.*;
import java.io.*;
public class WordCount {
    public static Map<String, Integer> countWords(String filePath) throws IOException {
        Map<String, Integer> wordCount = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.toLowerCase().split("\\W+");
                for (String word : words) {
                    if (!word.isEmpty()) {
                        wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                    }
                }
            }
        }
        return wordCount;
    }
    public static void displayTopWords(Map<String, Integer> wordCount, int topN) {
        wordCount.entrySet().stream()
                .sorted((a, b) -> b.getValue().compareTo(a.getValue()))
                .limit(topN)
                .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
    }
}
