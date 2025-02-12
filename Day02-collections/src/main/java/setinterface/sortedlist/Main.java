package setinterface.sortedlist;
import java.util.*;
public class Main {
    public static void main(String[] args)
    {
        Set<Integer> hashSet = new HashSet<>(Arrays.asList(5, 3, 9, 1));

        List<Integer> sortedList = SetToSortedList.convertSetToSortedList(hashSet);
        System.out.println("Sorted List: " + sortedList);
    }
}
