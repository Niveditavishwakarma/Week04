package countfrequency;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class CountFrequencyTest {

    @Test
    void testFrequencyCounter() {
        List<String> inputList = new ArrayList<>(Arrays.asList("lambo","jaguar","ferrari","bugati","fortuner","thar","thar","fortuner","lambo","jaguar","fortuner","jaguar"));
        Map<String,Integer> expectedMap = new HashMap<>();
        expectedMap.put("thar",2);
        expectedMap.put("ferrari",1);
        expectedMap.put("bugati",1);
        expectedMap.put("lambo",2);
        expectedMap.put("fortuner",3);
        expectedMap.put("jaguar",3);

        Map<String,Integer> frequencyMap = new HashMap<>();
        frequencyMap = CountFrequency.frequencyCounter(inputList);

        assertEquals(expectedMap,frequencyMap);
    }

    @Test
    public void testFrequencyIdenticalElements()
    {
        List<String> inputList = new ArrayList<>(Arrays.asList("ferrari","ferrari","ferrari"));
        Map<String,Integer> expectedMap = new HashMap<>();
        expectedMap.put("ferrari",3);

        Map<String,Integer> frequencyMap = new HashMap<>();
        frequencyMap = CountFrequency.frequencyCounter(inputList);

        assertEquals(expectedMap,frequencyMap);

    }
}
