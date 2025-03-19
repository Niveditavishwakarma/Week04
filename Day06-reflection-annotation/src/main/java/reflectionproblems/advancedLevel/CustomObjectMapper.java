package reflectionproblems.advancedLevel;
import java.lang.reflect.Field;
import java.util.Map;
public class CustomObjectMapper {
    public static <T> T toObject(Class<T> clazz, Map<String, Object> properties) {
        try {
            T instance = clazz.getDeclaredConstructor().newInstance();

            for (Map.Entry<String, Object> entry : properties.entrySet()) {
                String fieldName = entry.getKey();
                Object fieldValue = entry.getValue();

                try {
                    Field field = clazz.getDeclaredField(fieldName);
                    field.setAccessible(true);

                    field.set(instance, fieldValue);
                } catch (NoSuchFieldException e) {
                    System.out.println("No such field: " + fieldName);
                }
            }

            return instance;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        Map<String, Object> properties = Map.of(
                "name", "John Doe",
                "age", 30
        );

        Person person = toObject(Person.class, properties);

        if (person != null) {
            System.out.println(person);
        }
    }
}

class Person {
    private String name;
    private int age;

    public Person() {}

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}
