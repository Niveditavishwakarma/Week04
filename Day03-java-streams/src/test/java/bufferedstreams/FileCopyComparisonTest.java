package bufferedstreams;
import java.io.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FileCopyComparisonTest {
    @Test
    void testFileCopyWithBufferedStreams() throws IOException {
        String source = "C:\\Users\\asus\\Downloads\\100mb-examplefile-com.txt";
        String destination = "test_dest_buffered.txt";

        try (FileWriter writer = new FileWriter(source)) {
            writer.write("This is a test file for buffered copy.");
        }

        FileCopyComparison.copyWithBufferedStreams(source, destination);

        File sourceFile = new File(source);
        File destFile = new File(destination);

        assertTrue(destFile.exists(), "Destination file should exist");
        assertEquals(sourceFile.length(), destFile.length(), "File sizes should be equal");

        sourceFile.delete();
        destFile.delete();
    }

    @Test
    void testFileCopyWithUnbufferedStreams() throws IOException {
        String source = "test_source.txt";
        String destination = "test_dest_unbuffered.txt";

        try (FileWriter writer = new FileWriter(source)) {
            writer.write("This is a test file for unbuffered copy.");
        }

        FileCopyComparison.copyWithUnbufferedStreams(source, destination);

        File sourceFile = new File(source);
        File destFile = new File(destination);

        assertTrue(destFile.exists(), "Destination file should exist");
        assertEquals(sourceFile.length(), destFile.length(), "File sizes should be equal");

        sourceFile.delete();
        destFile.delete();
    }
}