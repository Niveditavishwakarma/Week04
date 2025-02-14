package multiplecatchblocks;
import java.util.Scanner;
public class ArrayOperations {

        public static void getValueAtIndex(int[] array, int index) {
            try {
                System.out.println("Value at index " + index + ": " + array[index]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid index!");
            } catch (NullPointerException e) {
                System.out.println("Array is not initialized!");
            }
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the length of the array: ");
            int length = scanner.nextInt();

            int[] array = new int[length];

            System.out.println("Enter " + length + " elements:");
            for (int i = 0; i < length; i++) {
                array[i] = scanner.nextInt();
            }

            System.out.print("Enter the index to retrieve value: ");
            int index = scanner.nextInt();

            getValueAtIndex(array, index);

            scanner.close();
        }
    }

