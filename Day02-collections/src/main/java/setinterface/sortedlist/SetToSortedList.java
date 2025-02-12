package setinterface.sortedlist;
import java.util.*;
public class SetToSortedList {
    public static List<Integer> convertSetToSortedList(Set<Integer> set) {
        return new ArrayList<>(new TreeSet<>(set));
    }
}
