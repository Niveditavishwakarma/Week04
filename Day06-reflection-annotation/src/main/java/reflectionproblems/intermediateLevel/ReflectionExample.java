package reflectionproblems.intermediateLevel;
import java.lang.reflect.Field;

public class ReflectionExample {
    public static class Configuration {
        private static String API_KEY = "OldAPIKey123";
    }

    public static void main(String[] args) {
        try {
            Class<?> configClass = Configuration.class;
            Field apiKeyField = configClass.getDeclaredField("API_KEY");
            apiKeyField.setAccessible(true);
            System.out.println("Before modification: " + apiKeyField.get(null));
            apiKeyField.set(null, "NewAPIKey456");
            System.out.println("After modification: " + apiKeyField.get(null));

        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
