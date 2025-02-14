package pipedstream;
import java.io.*;
import java.util.*;
public class PipedCommunication {
    public static void writeData(PipedOutputStream pos) throws IOException, InterruptedException {
        try (DataOutputStream dos = new DataOutputStream(pos)) {
            for (int i = 1; i <= 5; i++) {
                dos.writeUTF("Message " + i);
                System.out.println("Written: Message " + i);
                Thread.sleep(500);
            }
        }
    }

    public static void readData(PipedInputStream pis) throws IOException {
        try (DataInputStream dis = new DataInputStream(pis)) {
            for (int i = 1; i <= 5; i++) {
                String message = dis.readUTF();
                System.out.println("Read: " + message);
            }
        }
    }
}
