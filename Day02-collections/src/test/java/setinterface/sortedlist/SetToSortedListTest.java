package setinterface.sortedlist;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class SetToSortedListTest {

    public static List<Integer> convertSetToSortedList(Set<Integer> set) {
            return new ArrayList<>(new TreeSet<>(set));
    }

    @Test
    void testConvertSetToSortedList() {
        Set<Integer> inputSet = new HashSet<>(Arrays.asList(5, 3, 9, 1));
        List<Integer> expectedList = Arrays.asList(1, 3, 5, 9);

        List<Integer> actualList = convertSetToSortedList(inputSet);

        assertEquals(expectedList, actualList, "List should be sorted in ascending order");
    }
}
