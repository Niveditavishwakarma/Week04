package annotationproblems.beginnerlevel.todo;
import java.lang.reflect.Method;
public class TodoTaskPrinter {


    public static void main(String[] args) {
            try {
                Class<?> clazz = ProjectManager.class;

                Method[] methods = clazz.getDeclaredMethods();
                for (Method method : methods) {
                    if (method.isAnnotationPresent(Todo.class)) {
                        Todo todo = method.getAnnotation(Todo.class);
                        System.out.println("Task: " + todo.task());
                        System.out.println("Assigned to: " + todo.assignedTo());
                        System.out.println("Priority: " + todo.priority());
                        System.out.println("Method: " + method.getName());
                        System.out.println("-----------------------");
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }


