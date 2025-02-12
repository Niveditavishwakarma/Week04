package smartwarehousemanagementsystem;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class SmartWarehouseTest {

    private Storage<Electronics> electronicsStorage;
    private Storage<Groceries> groceriesStorage;
    private Storage<Furniture> furnitureStorage;

    private Electronics laptop;
    private Groceries apple;
    private Furniture chair;

    @BeforeEach
    void setUp() {
        laptop = new Electronics("Laptop");
        apple = new Groceries("Apple");
        chair = new Furniture("Chair");

        electronicsStorage = new Storage<>();
        groceriesStorage = new Storage<>();
        furnitureStorage = new Storage<>();
    }

    @Test
    void testAddItemToStorage() {
        electronicsStorage.addItem(laptop);
        groceriesStorage.addItem(apple);
        furnitureStorage.addItem(chair);

        assertEquals(1, electronicsStorage.getAllItems().size(), "Electronics storage should have 1 item.");
        assertEquals(1, groceriesStorage.getAllItems().size(), "Groceries storage should have 1 item.");
        assertEquals(1, furnitureStorage.getAllItems().size(), "Furniture storage should have 1 item.");
    }

    @Test
    void testGetItemFromStorage() {
        electronicsStorage.addItem(laptop);
        Electronics retrievedItem = electronicsStorage.getItem(0);
        assertNotNull(retrievedItem, "Retrieved item should not be null.");
        assertEquals("Laptop", retrievedItem.getItemName(), "The retrieved item's name should be 'Laptop'.");
    }
}
