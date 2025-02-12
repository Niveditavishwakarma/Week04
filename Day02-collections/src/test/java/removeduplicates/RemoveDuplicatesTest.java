package removeduplicates;

import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesTest {

    @Test
    void testRemoveDuplicates()
    {
        List<Integer> inputList = new ArrayList<>(Arrays.asList(3,1,2,2,3,4));
        List<Integer> expectedList = new ArrayList<>(Arrays.asList(3,1,2,4));

        List<Integer> uniqueList = new ArrayList<>();
        uniqueList = RemoveDuplicates.removeDuplicates(inputList);
        assertEquals(expectedList,uniqueList);
    }

    @Test
    void testRemoveDuplicatesWithNoDuplicates()
    {
        List<Integer> inputList = new ArrayList<>(Arrays.asList(3,1,2,4));
        List<Integer> expectedList = new ArrayList<>(Arrays.asList(3,1,2,4));

        List<Integer> uniqueList = new ArrayList<>();
        uniqueList = RemoveDuplicates.removeDuplicates(inputList);
        assertEquals(expectedList,uniqueList);
    }

}