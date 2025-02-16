package junit.calculator;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
     Calculator calculator = new Calculator();

    @Test
    public void testAdd() {
        assertEquals(5, calculator.add(2, 3), "2 + 3 should be 5");
        assertEquals(-1, calculator.add(2, -3), "2 + (-3) should be -1");
        assertEquals(0, calculator.add(0, 0), "0 + 0 should be 0");
    }

    @Test
    public void testSubtract() {
        assertEquals(1, calculator.subtract(3, 2), "3 - 2 should be 1");
        assertEquals(5, calculator.subtract(2, -3), "2 - (-3) should be 5");
        assertEquals(0, calculator.subtract(0, 0), "0 - 0 should be 0");
    }

    @Test
    public void testMultiply() {
        assertEquals(6, calculator.multiply(2, 3), "2 * 3 should be 6");
        assertEquals(-6, calculator.multiply(-2, 3), "-2 * 3 should be -6");
        assertEquals(0, calculator.multiply(0, 5), "0 * 5 should be 0");
    }

    @Test
    public void testDivide() {
        assertEquals(2.0, calculator.divide(6, 3), "6 / 3 should be 2.0");
        assertEquals(-2.0, calculator.divide(-6, 3), "-6 / 3 should be -2.0");
        assertEquals(0.0, calculator.divide(0, 5), "0 / 5 should be 0.0");
    }

    @Test
    public void testDivideByZero() {
        ArithmeticException exception = assertThrows(ArithmeticException.class, () -> {
            calculator.divide(5, 0);
        }, "Division by zero should throw an ArithmeticException");

        assertEquals("Division by zero is not allowed", exception.getMessage());
    }

}