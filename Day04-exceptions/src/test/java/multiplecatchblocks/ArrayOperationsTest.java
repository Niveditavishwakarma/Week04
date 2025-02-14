package multiplecatchblocks;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;

class ArrayOperationsTest {
    @Test
    void testGetValueAtIndex_ValidIndex() {
        int[] array = {10, 20, 30, 40, 50};
        int index = 2;

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        ArrayOperations.getValueAtIndex(array, index);

        assertTrue(outContent.toString().contains("Value at index 2: 30"));
    }

    @Test
    void testGetValueAtIndex_InvalidIndex() {
        // Setup
        int[] array = {10, 20, 30};
        int index = 5;

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        ArrayOperations.getValueAtIndex(array, index);

        assertTrue(outContent.toString().contains("Invalid index!"));
    }

    @Test
    void testGetValueAtIndex_NullArray() {
        int[] array = null;
        int index = 0;

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        ArrayOperations.getValueAtIndex(array, index);

        assertTrue(outContent.toString().contains("Array is not initialized!"));
    }

}