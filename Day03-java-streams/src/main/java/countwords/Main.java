package countwords;
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\asus\\OneDrive\\Desktop\\Daily Learning notes\\destination_unbuffered.txt";
        try {
            Map<String, Integer> wordCount = WordCount.countWords(filePath);
            WordCount.displayTopWords(wordCount, 5);
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}
