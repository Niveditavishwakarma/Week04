package mapinterface.mergemap;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MergeMapTest {

        @Test
        public void testMergeMaps() {
            Map<String, Integer> map1 = new HashMap<>();
            map1.put("A", 1);
            map1.put("B", 2);

            Map<String, Integer> map2 = new HashMap<>();
            map2.put("B", 3);
            map2.put("C", 4);

            Map<String, Integer> expected = new HashMap<>();
            expected.put("A", 1);
            expected.put("B", 5);
            expected.put("C", 4);

            assertEquals(expected, mergeMaps(map1, map2));
        }

        public static Map<String, Integer> mergeMaps(Map<String, Integer> map1, Map<String, Integer> map2) {
            Map<String, Integer> result = new HashMap<>(map1);
            map2.forEach((key, value) -> result.merge(key, value, Integer::sum));
            return result;
        }
    }
