package queueinterface.reversequeue;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>(Arrays.asList(10, 20, 30));
        System.out.println("Original Queue: " + queue);

        QueueReversal.reverseQueue(queue);
        System.out.println("Reversed Queue: " + queue);
    }
}
