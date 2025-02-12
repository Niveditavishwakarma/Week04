package nthelementfromend;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class FindNthFromEndTest {

    public static String findNthFromEnd(List<String> list, int N) {
        if (list == null || N <= 0) {
            return null;
        }

        Iterator<String> first = list.iterator();
        Iterator<String> second = list.iterator();

        for (int i = 0; i < N; i++) {
            if (!first.hasNext()) {
                return null;
            }
            first.next();
        }

        while (first.hasNext()) {
            first.next();
            second.next();
        }

        return second.next();
    }
    @Test
    void findNthFromEnd() {
        List<String> list1 = Arrays.asList("A", "B", "C", "D", "E");
        assertEquals("E", findNthFromEnd(list1, 1));

        assertEquals("D", findNthFromEnd(list1, 2));
    }
}