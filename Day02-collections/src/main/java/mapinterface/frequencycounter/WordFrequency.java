package mapinterface.frequencycounter;
import java.util.*;
import java.io.*;
class WordFrequency {
    public static void main(String[] args) {
        String filePath = "C:/Users/asus/OneDrive/Desktop/Daily Learning notes/git commands.txt";
        Map<String, Integer> wordCount = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                line = line.replaceAll("[^a-zA-Z ]", "").toLowerCase();
                String[] words = line.split("\\s+");

                for (String word : words) {
                    if (!word.isEmpty()) {
                        wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        System.out.println(wordCount);
    }
}


