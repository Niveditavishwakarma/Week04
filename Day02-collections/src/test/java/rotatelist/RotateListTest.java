package rotatelist;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class RotateListTest {

    @Test
    void testRotateList() {
        List<Integer> inputList = new ArrayList<>(Arrays.asList(10,20,30,40,50));
        List<Integer> expectedList = new ArrayList<>(Arrays.asList(30,40,50,10,20));

        List<Integer> rotatedList = new ArrayList<>();
        rotatedList = RotateList.rotateList(inputList,2);
        assertEquals(expectedList,rotatedList);

    }

    @Test
    void testRotateListMoreThanSize()
    {
        List<Integer> inputList = new ArrayList<>(Arrays.asList(10,20,30,40,50));
        List<Integer> expectedList = new ArrayList<>(Arrays.asList(40,50,10,20,30));

        List<Integer> rotatedList = new ArrayList<>();
        rotatedList = RotateList.rotateList(inputList,8);
        assertEquals(expectedList,rotatedList);
    }

}