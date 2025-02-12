package queueinterface.reversequeue;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class QueueReversalTest {


        public static void reverseQueue(Queue<Integer> queue) {
            Stack<Integer> stack = new Stack<>();

            while (!queue.isEmpty()) {
                stack.push(queue.poll());
            }

            while (!stack.isEmpty()) {
                queue.add(stack.pop());
            }
        }

        @Test
        void testReverseQueue() {
            Queue<Integer> queue = new LinkedList<>(Arrays.asList(10, 20, 30));
            Queue<Integer> expected = new LinkedList<>(Arrays.asList(30, 20, 10));

            QueueReversal.reverseQueue(queue);
            assertEquals(expected, queue, "Queue should be reversed");
        }


    }