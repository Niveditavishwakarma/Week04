package junit.userregistration;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;


    public class UserRegistrationTest {

        private UserRegistration userRegistration;

        @BeforeEach
        public void setUp() {
            userRegistration = new UserRegistration();
        }

        @Test
        void testValidUserRegistration() {
            String username = "john_doe";
            String email = "john.doe@example.com";
            String password = "password123";
            assertDoesNotThrow(() -> userRegistration.registerUser(username, email, password),
                    "Valid user registration should not throw an exception.");
        }

        @Test
        void testInvalidUsername() {
            String username = "";
            String email = "john.doe@example.com";
            String password = "password123";
            assertThrows(IllegalArgumentException.class,
                    () -> userRegistration.registerUser(username, email, password),
                    "Username cannot be empty");
        }

        @Test
        void testInvalidEmailFormat() {
            String username = "john_doe";
            String email = "john.doe@com";
            String password = "password123";
            assertThrows(IllegalArgumentException.class,
                    () -> userRegistration.registerUser(username, email, password),
                    "Invalid email format");
        }

        @Test
        void testInvalidPassword() {
            String username = "john_doe";
            String email = "john.doe@example.com";
            String password = "pass";

        }
    }