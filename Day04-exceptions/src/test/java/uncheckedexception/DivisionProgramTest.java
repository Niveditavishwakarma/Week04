package uncheckedexception;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivisionProgramTest {
    @Test
    public void testDivideValidNumbers() {
        double result = DivisionProgram.divide(10, 2);
        assertEquals(5.0, result, "The division result should be 5.0");
    }

    @Test
    public void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> DivisionProgram.divide(10, 0),
                "Division by zero should throw ArithmeticException");
    }


}