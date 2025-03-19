package reflectionproblems.basicLevel;
import java.lang.reflect.Constructor;

class Student {
    private String name;

    public Student() {
        this.name = "Default Name";
    }

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class CreateObjectUsingReflection {
    public static void main(String[] args) {
        try {
            Class<?> studentClass = Class.forName("Student");
            Constructor<?> defaultConstructor = studentClass.getDeclaredConstructor();
            Object studentInstance = defaultConstructor.newInstance();

            Student student = (Student) studentInstance;
            System.out.println("Student name (default constructor): " + student.getName());

            Constructor<?> paramConstructor = studentClass.getDeclaredConstructor(String.class);
            Object paramStudent = paramConstructor.newInstance("John Doe");

            Student namedStudent = (Student) paramStudent;
            System.out.println("Student name (parameterized constructor): " + namedStudent.getName());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
