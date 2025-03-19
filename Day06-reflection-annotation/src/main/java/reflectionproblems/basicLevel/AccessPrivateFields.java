package reflectionproblems.basicLevel;
import java.lang.reflect.Field;

public class AccessPrivateFields {
    public static void main(String[] args) {
        try {
            Person person = new Person(25);

            System.out.println("Before modification:");
            person.displayAge();

            Field ageField = Person.class.getDeclaredField("age");
            ageField.setAccessible(true);
            ageField.set(person, 30);

            System.out.println("After modification:");
            person.displayAge();
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
