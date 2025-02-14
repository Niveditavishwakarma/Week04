package readlargefile;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\asus\\OneDrive\\Desktop\\Daily Learning notes\\destination_unbuffered.txt";
        try {
            ReadLargeFile.readErrorLines(filePath);
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}
