package annotationproblems.intermediatelevel.logexecutiontime;
import java.lang.reflect.Method;
public class MethodExecutionTimer {

    public static void logExecutionTime(Object obj, String methodName, Object... params) {
            try {

                Class<?> clazz = obj.getClass();
                Method method = clazz.getMethod(methodName, toClassArray(params));

                if (method.isAnnotationPresent(LogExecutionTime.class)) {
                    long startTime = System.nanoTime();
                    method.invoke(obj, params);
                    long endTime = System.nanoTime();

                    long executionTime = endTime - startTime;
                    System.out.println("Execution time of " + methodName + ": " + executionTime + " ns");
                } else {
                    method.invoke(obj, params);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        private static Class<?>[] toClassArray(Object... params) {
            if (params == null) return new Class<?>[0];
            Class<?>[] classes = new Class[params.length];
            for (int i = 0; i < params.length; i++) {
                classes[i] = params[i].getClass();
            }
            return classes;
        }
    }


