package annotationproblems.beginnerlevel.importantmethods;
import java.lang.reflect.Method;
public class AnnotationProcessor {

        public static void main(String[] args) {
            try {
                Class<?> clazz = TaskManager.class;

                Method[] methods = clazz.getDeclaredMethods();

                for (Method method : methods) {
                    if (method.isAnnotationPresent(ImportantMethod.class)) {
                        ImportantMethod importantMethod = method.getAnnotation(ImportantMethod.class);
                        System.out.println("Method: " + method.getName() + ", Importance Level: " + importantMethod.level());
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }


