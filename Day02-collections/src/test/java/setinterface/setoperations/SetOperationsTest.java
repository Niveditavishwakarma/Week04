package setinterface.setoperations;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.BeforeEach;



class SetOperationsTest {

    private Set<Integer> set1;
    private Set<Integer> set2;

    @BeforeEach
    void setup() {
        set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        set2 = new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);
    }

    @Test
    void testUnion() {
        Set<Integer> expectedUnion = new HashSet<>();
        expectedUnion.add(1);
        expectedUnion.add(2);
        expectedUnion.add(3);
        expectedUnion.add(4);
        expectedUnion.add(5);

        Set<Integer> actualUnion = new HashSet<>(set1);
        actualUnion.addAll(set2);

        assertEquals(expectedUnion, actualUnion, "Union should be {1, 2, 3, 4, 5}");
    }

    @Test
    void testIntersection() {
        Set<Integer> expectedIntersection = new HashSet<>();
        expectedIntersection.add(3);

        Set<Integer> actualIntersection = new HashSet<>(set1);
        actualIntersection.retainAll(set2);

        assertEquals(expectedIntersection, actualIntersection, "Intersection should be {3}");
    }
}