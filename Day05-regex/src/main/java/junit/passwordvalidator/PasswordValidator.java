package junit.passwordvalidator;

public class PasswordValidator {

        public boolean isValidPassword(String password) {
            if (password == null) {
                throw new IllegalArgumentException("Password cannot be null");
            }

            if (password.length() < 8) {
                return false;
            }

            if (!password.matches(".*[A-Z].*")) {
                return false;
            }

            if (!password.matches(".*\\d.*")) {
                return false;
            }

            return true;
        }
    }

