package junit.passwordvalidator;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

    public class PasswordValidatorTest {

        private PasswordValidator passwordValidator;
        @BeforeEach
        public void setUp() {
            passwordValidator = new PasswordValidator();
        }

        @Test
        void testValidPassword() {
            assertTrue(passwordValidator.isValidPassword("Valid1Password"), "Password should be valid.");
        }

        @Test
        void testShortPassword() {
            assertFalse(passwordValidator.isValidPassword("Short1"), "Password should be invalid as it's too short.");
        }

        @Test
        void testPasswordWithoutUppercase() {
            assertFalse(passwordValidator.isValidPassword("lowercase1"), "Password should be invalid as it lacks an uppercase letter.");
        }

        @Test
        void testPasswordWithoutDigit() {
            assertFalse(passwordValidator.isValidPassword("NoDigitHere"), "Password should be invalid as it lacks a digit.");
        }

        @Test
        void testInvalidPassword() {
            assertFalse(passwordValidator.isValidPassword("short"), "Password should be invalid as it doesn't meet any of the criteria.");
        }

        @Test
        void testNullPassword() {
            assertThrows(IllegalArgumentException.class, () -> passwordValidator.isValidPassword(null),
                    "Password cannot be null");
        }

        @Test
        void testValidExactPasswordLength() {
            assertTrue(passwordValidator.isValidPassword("A1b2C3d4"), "Password should be valid.");
        }
    }


