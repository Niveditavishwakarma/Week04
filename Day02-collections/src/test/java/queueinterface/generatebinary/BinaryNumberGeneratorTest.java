package queueinterface.generatebinary;
import java.util.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryNumberGeneratorTest {

    @Test
    void testGenerateBinaryNumbers() {
        List<String> expected = Arrays.asList("1", "10", "11", "100", "101");
        assertEquals(expected, BinaryNumberGenerator.generateBinaryNumbers(5),
                "First 5 binary numbers should match expected output");
    }

    @Test
    void testGenerateBinaryNumbersOneElement() {
        List<String> expected = Collections.singletonList("1");
        assertEquals(expected, BinaryNumberGenerator.generateBinaryNumbers(1),
                "First binary number should be '1'");
    }
}