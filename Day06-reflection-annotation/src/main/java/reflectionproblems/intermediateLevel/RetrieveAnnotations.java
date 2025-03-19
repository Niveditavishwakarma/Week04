package reflectionproblems.intermediateLevel;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class RetrieveAnnotations {
    @Target(ElementType.TYPE)
    @Retention(RetentionPolicy.RUNTIME) 
    public @interface Author {
        String name();
    }

    @Author(name = "John Doe")
    public static class MyClass {

    }

    public static void main(String[] args) {
        Class<?> myClass = MyClass.class;
        if (myClass.isAnnotationPresent(Author.class)) {
            Author authorAnnotation = myClass.getAnnotation(Author.class);

            System.out.println("Author: " + authorAnnotation.name());
        } else {
            System.out.println("No Author annotation present.");
        }
    }
}
