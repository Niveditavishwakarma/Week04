package annotationproblems.advancelevel.jsonfield;

public class Main {
        public static void main(String[] args) {
            User user = new User("john_doe", 25);
            String json = JsonSerializer.toJson(user);
            System.out.println(json);
        }
    }


