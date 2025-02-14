package uncheckedexception;
import java.util.Scanner;
import java.util.InputMismatchException;

public class DivisionProgram {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        try
        {
            System.out.print("Enter two numerator: ");
            int numerator = sc.nextInt();

            System.out.print("Enter two denominator: ");
            int denominator = sc.nextInt();

            int result = divide(numerator,denominator);
            System.out.println("result: " + result);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Error: " + "Division by zero is not allowed");
        }
        catch(InputMismatchException e)
        {
            System.out.println("Error: " + "Please enter valid numeric values.");
        }
        finally{
            sc.close();
        }


    }
    public static int divide(int numerator,int denominator)
    {
        if(denominator==0)
            throw new ArithmeticException();
        return numerator/denominator;
    }

}
