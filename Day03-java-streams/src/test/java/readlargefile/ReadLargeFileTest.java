package readlargefile;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.io.*;
import java.util.*;
class ReadLargeFileTest {
    @Test
    void testReadErrorLines() throws IOException {
        String testFile = "C:\\Users\\asus\\OneDrive\\Desktop\\Daily Learning notes\\destination_unbuffered.txt";
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(testFile))) {
            bw.write("This is a test line.\n");
            bw.write("Error occurred here.\n");
            bw.write("Another line without issues.\n");
            bw.write("Critical ERROR detected.\n");
        }

        List<String> result = ReadLargeFile.readErrorLines(testFile);

        assertEquals(2, result.size());
        assertTrue(result.get(0).toLowerCase().contains("error"));
        assertTrue(result.get(1).toLowerCase().contains("error"));

        new File(testFile).delete();
    }
}