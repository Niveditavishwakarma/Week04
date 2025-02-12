package reverselist;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> arraylist = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
        System.out.println("Original arraylist: " + arraylist);
        ReverseList.reverse(arraylist);
        System.out.println("reversed arraylist: " + arraylist);
        List<Integer> linkedlist = new LinkedList<>(Arrays.asList(90,70,65,67,43));
        System.out.println("Original linkedlist: "+ linkedlist);
        ReverseList.reverse(linkedlist);
        System.out.println("reversed linkedlist: " + linkedlist);
    }
}
