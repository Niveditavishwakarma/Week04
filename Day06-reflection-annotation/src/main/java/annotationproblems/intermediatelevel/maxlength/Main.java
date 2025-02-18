package annotationproblems.intermediatelevel.maxlength;

public class Main {
        public static void main(String[] args) {
            try {
                User user = new User("ShortUser");
                System.out.println("User created with username: " + user.getUsername());

                User invalidUser = new User("ThisUsernameIsWayTooLong");
                System.out.println("User created with username: " + invalidUser.getUsername());
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }


