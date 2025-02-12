package smartwarehousemanagementsystem;
import java.util.ArrayList;
import java.util.List;

    class Storage<T extends WarehouseItem> {
        private List<T> items;

        public Storage() {
            items = new ArrayList<>();
        }

        public void addItem(T item) {
            items.add(item);
        }

        public T getItem(int index) {
            return items.get(index);
        }

        public List<T> getAllItems() {
            return items;
        }
    }


