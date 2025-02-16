package junit.exceptiondemo;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ExceptionDemoTest {
    @Test
    public void testDivide_throwsArithmeticException_whenDividingByZero() {
        ExceptionDemo calculate =  new ExceptionDemo();
        ArithmeticException thrown = assertThrows(ArithmeticException.class, () -> {
            calculate.divide(10, 0);
        });
        assertEquals("Cannot divide by zero", thrown.getMessage());
    }

    @Test
    public void testDivide_normalDivision() {

        ExceptionDemo calculate =  new ExceptionDemo();
        int result = calculate.divide(10, 2);

        assertEquals(5, result);
    }

}