package queueinterface.stackusingqueues;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StackUsingQueuesTest {

    @Test
    void testPushAndPop() {
        StackUsingQueues stack = new StackUsingQueues();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        assertEquals(3, stack.pop(), "Pop should return the last pushed element");
        assertEquals(2, stack.pop(), "Next pop should return 2");
        assertEquals(1, stack.pop(), "Final pop should return 1");
    }

    @Test
    void testTop() {
        StackUsingQueues stack = new StackUsingQueues();
        stack.push(5);
        stack.push(10);
        assertEquals(10, stack.top(), "Top should return the last pushed element without removing it");
        assertEquals(10, stack.pop(), "Pop should return the same element as top");
    }

    @Test
    void testIsEmpty() {
        StackUsingQueues stack = new StackUsingQueues();
        assertTrue(stack.isEmpty(), "New stack should be empty");

        stack.push(7);
        assertFalse(stack.isEmpty(), "Stack should not be empty after pushing an element");

        stack.pop();
        assertTrue(stack.isEmpty(), "Stack should be empty after popping all elements");
    }

}