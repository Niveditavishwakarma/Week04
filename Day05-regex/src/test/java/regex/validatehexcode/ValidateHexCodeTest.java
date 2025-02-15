package regex.validatehexcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidateHexCodeTest {
    @Test
    public void testValidHexCode()
    {
        assertEquals("valid",ValidateHexCode.validateHexColor("#FFA500"));
        assertEquals("valid",ValidateHexCode.validateHexColor("#463857"));
        assertEquals("valid",ValidateHexCode.validateHexColor("#ab345f"));
    }

    @Test
    public void testInvalidHexCodeTooShort()
    {
        assertEquals("invalid",ValidateHexCode.validateHexColor("#123"));
    }
    @Test
    public void testInvalidHexColorWithInvalidCharacters() {
        assertEquals("invalid", ValidateHexCode.validateHexColor("#ZZZZZZ"));
    }

    @Test
    public void testInvalidHexColorWithoutHash() {
        assertEquals("invalid", ValidateHexCode.validateHexColor("FFA500"));
    }

    @Test
    public void testInvalidHexColorTooLong() {
        assertEquals("invalid", ValidateHexCode.validateHexColor("#1234567"));
    }

}