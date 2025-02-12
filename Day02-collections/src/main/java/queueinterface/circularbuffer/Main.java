package queueinterface.circularbuffer;
import java.util.*;
public class Main {
    public static void main(String[] args){
    CircularBuffer buffer = new CircularBuffer(3);

        System.out.println("Adding 1, 2, 3...");
        buffer.add(1);
        buffer.add(2);
        buffer.add(3);
        System.out.println("Buffer: " + Arrays.toString(buffer.getBufferContents()));

        System.out.println("Adding 4 (should overwrite 1)...");
        buffer.add(4);
        System.out.println("Buffer: " + Arrays.toString(buffer.getBufferContents()));

        System.out.println("Adding 5, 6 (should overwrite 2 and 3)...");
        buffer.add(5);
        buffer.add(6);
        System.out.println("Buffer: " + Arrays.toString(buffer.getBufferContents()));
    }
}
