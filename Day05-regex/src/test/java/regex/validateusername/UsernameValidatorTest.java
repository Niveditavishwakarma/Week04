package regex.validateusername;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UsernameValidatorTest {
    @Test
    public void testValidUsername() {
        assertEquals("Valid", UsernameValidator.validateUsername("user_123"));
        assertEquals("Valid", UsernameValidator.validateUsername("user123"));
        assertEquals("Valid", UsernameValidator.validateUsername("user_abc"));
    }

    @Test
    public void testInvalidUsernameStartsWithNumber() {
        assertEquals("Invalid", UsernameValidator.validateUsername("123user"));
    }

    @Test
    public void testInvalidUsernameTooShort() {
        assertEquals("Invalid", UsernameValidator.validateUsername("us"));
    }

    @Test
    public void testInvalidUsernameSpecialCharacter() {
        assertEquals("Invalid", UsernameValidator.validateUsername("user@123"));
        assertEquals("Invalid", UsernameValidator.validateUsername("user$123"));
    }

    @Test
    public void testInvalidUsernameTooLong() {
        assertEquals("Invalid", UsernameValidator.validateUsername("thisisaverylongusername"));
    }

    @Test
    public void testInvalidUsernameEmpty() {
        assertEquals("Invalid", UsernameValidator.validateUsername(""));
    }

}