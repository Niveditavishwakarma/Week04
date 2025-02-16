package junit.parameterizedtest;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class NumberUtilsTest {
    @ParameterizedTest
    @ValueSource(ints = {2,4,6})
    public void testIsEvenWithEvenNumbers(int number) {
        assertTrue(NumberUtils.isEven(number), "Number " + number + " should be even.");
    }

    @ParameterizedTest
    @ValueSource(ints = {1,3,5})
    public void testIsEvenWithOddNumbers(int number) {
        assertFalse(NumberUtils.isEven(number), "Number " + number + " should not be even.");
    }

}