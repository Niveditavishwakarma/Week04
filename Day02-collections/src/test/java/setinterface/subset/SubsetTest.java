package setinterface.subset;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

class SubsetTest {
    public static boolean checkSubset(Set<Integer> subset, Set<Integer> mainSet) {
        return mainSet.containsAll(subset);
    }

    @Test
    void testSubset() {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(1, 2, 3, 4));

        assertTrue(checkSubset(set1, set2), "Set1 should be a subset of Set2");
    }
}