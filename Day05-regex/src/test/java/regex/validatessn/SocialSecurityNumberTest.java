package regex.validatessn;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SocialSecurityNumberTest {
    @Test
    public void testValidateSSN_Valid() {
        String input = "123-45-6789";
        String expected = "\"123-45-6789\" is valid";
        String actual = SocialSecurityNumber.validateSSN(input);
        assertEquals(expected, actual, "The SSN should be valid.");
    }

    @Test
    public void testValidateSSN_InvalidNoHyphens() {
        String input = "123456789";
        String expected = "\"123456789\" is invalid";
        String actual = SocialSecurityNumber.validateSSN(input);
        assertEquals(expected, actual, "The SSN should be invalid without hyphens.");
    }

    @Test
    public void testValidateSSN_InvalidWithLetters() {
        String input = "123-45-ABCD";
        String expected = "\"123-45-ABCD\" is invalid";
        String actual = SocialSecurityNumber.validateSSN(input);
        assertEquals(expected, actual, "The SSN with letters should be invalid.");
    }

    @Test
    public void testValidateSSN_InvalidExtraDigits() {
        String input = "123-45-67890";
        String expected = "\"123-45-67890\" is invalid";
        String actual = SocialSecurityNumber.validateSSN(input);
        assertEquals(expected, actual, "The SSN with extra digits should be invalid.");
    }

    @Test
    public void testValidateSSN_InvalidMissingDigits() {
        String input = "123-45-67";
        String expected = "\"123-45-67\" is invalid";
        String actual = SocialSecurityNumber.validateSSN(input);
        assertEquals(expected, actual, "The SSN with fewer digits should be invalid.");
    }

    @Test
    public void testValidateSSN_InvalidWithSpaces() {
        String input = "123 - 45 - 6789";
        String expected = "\"123 - 45 - 6789\" is invalid";
        String actual = SocialSecurityNumber.validateSSN(input);
        assertEquals(expected, actual, "The SSN with spaces should be invalid.");
    }

}