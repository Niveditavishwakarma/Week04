package customexception;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class mainTest {
    @Test
    void testValidateAgewithValidAge() {
        try {
            main.validateAge(20);
        } catch (InvalidAgeException e) {
            fail("Exception should not have been thrown for age >= 18");
        }
    }

    @Test
    void testValidateAge_withInvalidAge() {
        InvalidAgeException exception = assertThrows(InvalidAgeException.class, () -> {
            main.validateAge(15);
        });

        assertEquals("Age must be 18 or greater", exception.getMessage());
    }

}