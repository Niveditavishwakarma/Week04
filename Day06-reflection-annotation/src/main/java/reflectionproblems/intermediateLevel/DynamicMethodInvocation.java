package reflectionproblems.intermediateLevel;
import java.lang.reflect.Method;
import java.util.Scanner;
public class DynamicMethodInvocation {

    public static class MathOperations {
        public int add(int a, int b) {
            return a + b;
        }

        public int subtract(int a, int b) {
            return a - b;
        }

        public int multiply(int a, int b) {
            return a * b;
        }
    }

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            MathOperations mathOperations = new MathOperations();
            System.out.println("Enter operation (add, subtract, multiply): ");
            String operation = scanner.nextLine().toLowerCase();
            System.out.println("Enter the first number: ");
            int num1 = scanner.nextInt();

            System.out.println("Enter the second number: ");
            int num2 = scanner.nextInt();
            Method method = MathOperations.class.getMethod(operation, int.class, int.class);
            Object result = method.invoke(mathOperations, num1, num2);
            System.out.println("Result of " + operation + ": " + result);
            scanner.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
