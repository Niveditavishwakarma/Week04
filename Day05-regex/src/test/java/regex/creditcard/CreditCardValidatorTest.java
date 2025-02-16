package regex.creditcard;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

 public class CreditCardValidatorTest {
    @Test
    public void testValidVisaCard() {
        assertTrue(CreditCardValidator.isValidCreditCard("4123456789012345"));
    }

    @Test
    public void testValidMasterCard() {
        assertTrue(CreditCardValidator.isValidCreditCard("5123456789012345"));
    }

    @Test
    public void testInvalidCardWithOtherStartingDigit() {
        assertFalse(CreditCardValidator.isValidCreditCard("6123456789012345"));
    }

    @Test
    public void testCardWithTooFewDigits() {
        assertFalse(CreditCardValidator.isValidCreditCard("41234567890123"));
    }

    @Test
    public void testCardWithTooManyDigits() {
        assertFalse(CreditCardValidator.isValidCreditCard("51234567890123456"));
    }

    @Test
    public void testEmptyCardNumber() {
        assertFalse(CreditCardValidator.isValidCreditCard(""));
    }

    @Test
    public void testCardWithNonNumericCharacters() {
        assertFalse(CreditCardValidator.isValidCreditCard("4123A56789012345"));
    }

}