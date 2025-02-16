package junit.listmanager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;

public class ListManagerTest {

    private ListManager listManager;
    private List<Integer> list;

    @BeforeEach
    public void setUp() {
        listManager = new ListManager();
        list = new ArrayList<>();
    }

    @Test
    public void testAddElement() {
        listManager.addElement(list, 5);
        assertEquals(1, listManager.getSize(list), "Size should be 1 after adding an element");
        assertTrue(list.contains(5), "List should contain the added element");

        listManager.addElement(list, 10);
        assertEquals(2, listManager.getSize(list), "Size should be 2 after adding another element");
        assertTrue(list.contains(10), "List should contain the second added element");
    }

    @Test
    public void testRemoveElement() {
        listManager.addElement(list, 5);
        listManager.addElement(list, 10);
        listManager.addElement(list, 15);

        assertEquals(3, listManager.getSize(list), "Size should be 3 before removal");

        listManager.removeElement(list, 10);
        assertEquals(2, listManager.getSize(list), "Size should be 2 after removing an element");
        assertFalse(list.contains(10), "List should not contain the removed element");

        listManager.removeElement(list, 5);
        assertEquals(1, listManager.getSize(list), "Size should be 1 after another removal");
        assertFalse(list.contains(5), "List should not contain the removed element");
    }

    @Test
    public void testGetSize() {
        assertEquals(0, listManager.getSize(list), "Size of an empty list should be 0");

        listManager.addElement(list, 1);
        assertEquals(1, listManager.getSize(list), "Size should be 1 after adding an element");

        listManager.addElement(list, 2);
        listManager.addElement(list, 3);
        assertEquals(3, listManager.getSize(list), "Size should be 3 after adding three elements");

        listManager.removeElement(list, 2);
        assertEquals(2, listManager.getSize(list), "Size should be 2 after removing an element");

        listManager.removeElement(list, 1);
        listManager.removeElement(list, 3);
        assertEquals(0, listManager.getSize(list), "Size should be 0 after removing all elements");
    }
}
