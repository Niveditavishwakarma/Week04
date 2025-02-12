package setinterface.findsymmetricdifference;
import java.util.*;
class SymmetricDifference {
    public static Set<Integer> findSymmetricDifference(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> result = new HashSet<>(set1);
        Set<Integer> intersection = new HashSet<>(set1);

        result.addAll(set2);
        intersection.retainAll(set2);
        result.removeAll(intersection);

        return result;
    }
}
