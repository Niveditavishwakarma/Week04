package exceptionpropogation;

public class Main {
    public static void method1(){
        System.out.println("method1 called ");
        int a = 10/0;
    }
    public static void method2(){
        System.out.println("method2 called ");

        method1();
    }
    public static void main(String[] args) {
        try {
            method2();
        }catch (ArithmeticException e){
            System.out.println("Exception handled in main method " +e.getMessage());
        }
    }
}
