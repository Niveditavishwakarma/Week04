package setinterface.findsymmetricdifference;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class SymmetricDifferenceTest {

    private Set<Integer> set1;
    private Set<Integer> set2;

    @BeforeEach
    void setUp() {
        set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        set2 = new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);
    }
    public static Set<Integer> findSymmetricDifference(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> result = new HashSet<>(set1);
        Set<Integer> intersection = new HashSet<>(set1);

        result.addAll(set2);
        intersection.retainAll(set2);
        result.removeAll(intersection);

        return result;
    }

    @Test
    void testFindSymmetricDifference() {
        Set<Integer> expectedSymmetricDifference = new HashSet<>();
        expectedSymmetricDifference.add(1);
        expectedSymmetricDifference.add(2);
        expectedSymmetricDifference.add(4);
        expectedSymmetricDifference.add(5);

        Set<Integer> actualSymmetricDifference = findSymmetricDifference(set1, set2);

        assertEquals(expectedSymmetricDifference, actualSymmetricDifference);
    }
}