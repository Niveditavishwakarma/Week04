package junit.fileprocessor;
import java.io.*;
import java.nio.file.*;
public class FileProcessor {

        public void writeToFile(String filename, String content) throws IOException {
            try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(filename))) {
                writer.write(content);
            }
        }

        public String readFromFile(String filename) throws IOException {
            return new String(Files.readAllBytes(Paths.get(filename)));
        }
    }

