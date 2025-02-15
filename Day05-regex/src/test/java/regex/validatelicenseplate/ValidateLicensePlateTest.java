package regex.validatelicenseplate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ValidateLicensePlateTest {
    @Test
    public void testValidLicensePlate()
    {
        assertEquals("valid",ValidateLicensePlate.validateLicensePlate("AB1234"));
        assertEquals("valid",ValidateLicensePlate.validateLicensePlate("XY9657"));

    }
    @Test
    public void testInvalidPlateTest()
    {

        assertEquals("invalid",ValidateLicensePlate.validateLicensePlate("ABC1234"));
    }
    @Test
    public void testWithInvalidLicenseTooLong()
    {
        assertEquals("invalid", ValidateLicensePlate.validateLicensePlate("ABC1234"));
    }
    @Test
    public void testInvalidLicensePlateWithLettersAndDigits() {
        assertEquals("invalid", ValidateLicensePlate.validateLicensePlate("A12345"));
    }

    @Test
    public void testInvalidLicensePlateWithLowercase() {
        assertEquals("invalid",ValidateLicensePlate.validateLicensePlate("ab1234"));
    }

    @Test
    public void testInvalidLicensePlateWithSpecialCharacters() {
        assertEquals("invalid", ValidateLicensePlate.validateLicensePlate("AB@1234"));
    }

    @Test
    public void testInvalidLicensePlateWithOnlyDigits() {
        assertEquals("invalid", ValidateLicensePlate.validateLicensePlate("123456"));
    }

    @Test
    public void testInvalidLicensePlateWithIncorrectFormat() {
        assertEquals("invalid", ValidateLicensePlate.validateLicensePlate("A1B2C3"));
    }
}