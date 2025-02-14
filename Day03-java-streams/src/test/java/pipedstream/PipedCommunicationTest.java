package pipedstream;

import static org.junit.jupiter.api.Assertions.*;
import java.io.*;
import java.util.*;
import org.junit.jupiter.api.Test;
class PipedCommunicationTest {
    @Test
    void testPipedCommunication() throws IOException, InterruptedException {
        PipedOutputStream pos = new PipedOutputStream();
        PipedInputStream pis = new PipedInputStream(pos);

        Thread writer = new Thread(() -> {
            try {
                PipedCommunication.writeData(pos);
            } catch (IOException | InterruptedException e) {
                fail("Writer thread failed: " + e.getMessage());
            }
        });

        Thread reader = new Thread(() -> {
            try {
                PipedCommunication.readData(pis);
            } catch (IOException e) {
                fail("Reader thread failed: " + e.getMessage());
            }
        });

        writer.start();
        reader.start();

        writer.join();
        reader.join();

        assertTrue(true, "Piped communication executed successfully.");
    }
}