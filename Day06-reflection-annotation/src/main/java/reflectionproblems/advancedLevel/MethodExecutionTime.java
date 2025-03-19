package reflectionproblems.advancedLevel;
import java.lang.reflect.Method;
public class MethodExecutionTime {
    public static class SampleClass {
        public void methodOne() {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        public void methodTwo() {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void measureExecutionTime(Object object, String methodName) {
        try {

            Method method = object.getClass().getMethod(methodName);

            long startTime = System.nanoTime();

            method.invoke(object);

            long endTime = System.nanoTime();

            long duration = endTime - startTime;
            System.out.println("Method '" + methodName + "' executed in " + duration + " nanoseconds.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SampleClass sample = new SampleClass();
        measureExecutionTime(sample, "methodOne");
        measureExecutionTime(sample, "methodTwo");
    }

}
