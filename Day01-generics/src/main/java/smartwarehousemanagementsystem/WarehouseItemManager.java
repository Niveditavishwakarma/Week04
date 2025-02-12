package smartwarehousemanagementsystem;
import java.util.*;
public class WarehouseItemManager {

        public static void displayItems(List<? extends WarehouseItem> items) {
            for (WarehouseItem item : items) {
                System.out.println("Item Name: " + item.getItemName() + ", Category: " + item.getCategory());
            }
        }

        public static void main(String[] args) {
            Electronics laptop = new Electronics("Laptop");
            Groceries apple = new Groceries("Apple");
            Furniture chair = new Furniture("Chair");

            Storage<Electronics> electronicsStorage = new Storage<>();
            Storage<Groceries> groceriesStorage = new Storage<>();
            Storage<Furniture> furnitureStorage = new Storage<>();

            electronicsStorage.addItem(laptop);
            groceriesStorage.addItem(apple);
            furnitureStorage.addItem(chair);

            System.out.println("Electronics Storage:");
            displayItems(electronicsStorage.getAllItems());

            System.out.println("\nGroceries Storage:");
            displayItems(groceriesStorage.getAllItems());

            System.out.println("\nFurniture Storage:");
            displayItems(furnitureStorage.getAllItems());
        }
    }


