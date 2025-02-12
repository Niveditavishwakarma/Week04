package setinterface.subset;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(1, 2, 3, 4));

        boolean isSubset = checkSubset(set1, set2);
        System.out.println("Is Set1 a subset of Set2? " + isSubset);
    }

    public static boolean checkSubset(Set<Integer> subset, Set<Integer> mainSet) {
        return mainSet.containsAll(subset);
    }
}
