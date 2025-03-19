package reflectionproblems.advancedLevel;
import java.lang.reflect.Field;
public class ObjectToJson {
    public static String toJson(Object obj) {
        StringBuilder jsonBuilder = new StringBuilder();

        jsonBuilder.append("{");

        Field[] fields = obj.getClass().getDeclaredFields();

        boolean firstField = true;

        for (Field field : fields) {
            try {
                field.setAccessible(true);

                String fieldName = field.getName();
                Object fieldValue = field.get(obj);

                if (!firstField) {
                    jsonBuilder.append(", ");
                }
                firstField = false;

                jsonBuilder.append("\"").append(fieldName).append("\": ");

                if (fieldValue instanceof String) {
                    jsonBuilder.append("\"").append(fieldValue).append("\"");
                } else {
                    jsonBuilder.append(fieldValue);
                }

            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }

        jsonBuilder.append("}");

        return jsonBuilder.toString();
    }

    public static void main(String[] args) {
        // Create an example object
        Person person = new Person("John Doe", 30);

        String jsonString = toJson(person);

        System.out.println(jsonString);
    }

    public static class Person {
        private String name;
        private int age;

        // Constructor
        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }
}
