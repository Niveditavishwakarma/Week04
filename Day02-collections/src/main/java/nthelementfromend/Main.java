package nthelementfromend;
import java.util.*;
public class Main {
    public static void main(String[] args)
    {
        String[] elements = {"A", "B", "C", "D", "E"};
        List<String> list = FindNthFromEnd.createList(elements);

        System.out.println("Original List:");
        System.out.println(list);

        int N = 5;
        String result = FindNthFromEnd.findNthFromEnd(list, N);
        System.out.println("The " + N + "th element from the end is: " + result);
    }
}
