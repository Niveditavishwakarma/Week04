package reverselist;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

class ReverseListTest {

    @Test
    void testReverseArrayList() {
        List<Integer> inputList = new ArrayList<>(Arrays.asList(10,20,30,40,50));
        List<Integer>  expectedList = new ArrayList<>(Arrays.asList(50,40,30,20,10));

        ReverseList.reverse(inputList);
        assertEquals(expectedList,inputList);
    }

    @Test
    void testReverseLinkedList()
    {
        List<Integer> inputList = new LinkedList<>(Arrays.asList(23,43,56,32,73));
        List<Integer> expectedList = new LinkedList<>(Arrays.asList(73,32,56,43,23));

        ReverseList.reverse(inputList);
        assertEquals(expectedList,inputList);
    }
}