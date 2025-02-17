package junit.userregistration;
import java.util.regex.*;
public class UserRegistration {

        public void registerUser(String username, String email, String password) {
            if (username == null || username.isEmpty()) {
                throw new IllegalArgumentException("Username cannot be empty");
            }

            String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
            Pattern emailPattern = Pattern.compile(emailRegex);
            if (email == null || !emailPattern.matcher(email).matches()) {
                throw new IllegalArgumentException("Invalid email format");
            }

            if (password == null || password.length() < 8) {
                throw new IllegalArgumentException("Password must be at least 8 characters long");
            }
        }
    }


