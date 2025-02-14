package filterstreams;
import java.io.*;

import static filterstreams.UpperToLowerCaseConverter.convertToLowercase;

public class Main {
    public static void main(String[] args) {
        String inputFile = "C:\\Users\\asus\\OneDrive\\Desktop\\Daily Learning notes\\git commands.txt";
        String outputFile = "C:\\Users\\asus\\OneDrive\\Desktop\\Daily Learning notes\\copiedTo.txt";

        try {
            convertToLowercase(inputFile, outputFile);
            System.out.println("File converted to lowercase successfully.");
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}
