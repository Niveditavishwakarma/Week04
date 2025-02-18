package annotationproblems.intermediatelevel.maxlength;

public class User {

        @MaxLength(value = 10)
        private String username;

        public User(String username) {
            this.username = username;
            validateMaxLength();
        }

        private void validateMaxLength() {
            try {
                java.lang.reflect.Field field = this.getClass().getDeclaredField("username");

                if (field.isAnnotationPresent(MaxLength.class)) {
                    MaxLength maxLength = field.getAnnotation(MaxLength.class);
                    int maxLengthValue = maxLength.value();
                    if (username.length() > maxLengthValue) {
                        throw new IllegalArgumentException("Username exceeds the maximum allowed length of " + maxLengthValue + " characters.");
                    }
                }
            } catch (NoSuchFieldException e) {
                e.printStackTrace();
            }
        }

        public String getUsername() {
            return username;
        }
    }


