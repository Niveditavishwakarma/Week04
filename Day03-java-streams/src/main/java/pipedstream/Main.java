package pipedstream;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        PipedOutputStream pos = new PipedOutputStream();
        PipedInputStream pis = new PipedInputStream(pos);

        Thread writer = new Thread(() -> {
            try {
                PipedCommunication.writeData(pos);
            } catch (IOException | InterruptedException e) {
                System.err.println("Writer error: " + e.getMessage());
            }
        });

        Thread reader = new Thread(() -> {
            try {
                PipedCommunication.readData(pis);
            } catch (IOException e) {
                System.err.println("Reader error: " + e.getMessage());
            }
        });

        writer.start();
        reader.start();

        writer.join();
        reader.join();
    }
}
