package throwvsthrows;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InterestCalculatorTest {
    @Test
    void testCalculateInterest_ValidInputs() {
        double amount = 1000.0;
        double rate = 5.0;
        int years = 3;
        try {
            double interest = InterestCalculator.calculateInterest(amount, rate, years);
            assertEquals(150.0, interest, 0.001);  // Allowing for floating point precision errors
        } catch (IllegalArgumentException e) {
            fail("Exception should not have been thrown for valid inputs");
        }
    }

    @Test
    void testCalculateInterest_InvalidAmount() {
        double amount = -1000.0;
        double rate = 5.0;
        int years = 3;

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            InterestCalculator.calculateInterest(amount, rate, years);
        });

        assertEquals("Amount and rate must be positive", exception.getMessage());
    }

    @Test
    void testCalculateInterest_InvalidRate() {
        double amount = 1000.0;
        double rate = -5.0;
        int years = 3;

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            InterestCalculator.calculateInterest(amount, rate, years);
        });

        assertEquals("Amount and rate must be positive", exception.getMessage());
    }

    @Test
    void testCalculateInterest_InvalidAmountAndRate() {
        double amount = -1000.0;
        double rate = -5.0;
        int years = 3;

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            InterestCalculator.calculateInterest(amount, rate, years);
        });
        assertEquals("Amount and rate must be positive", exception.getMessage());
    }

}