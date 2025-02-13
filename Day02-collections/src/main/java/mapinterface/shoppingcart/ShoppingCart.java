package mapinterface.shoppingcart;
import java.util.*;
class ShoppingCart {
    private Map<String, Double> productPrices = new HashMap<>();
    private LinkedHashMap<String, Integer> cart = new LinkedHashMap<>();

    public void addProduct(String name, double price) {
        productPrices.put(name, price);
    }

    public void addToCart(String product, int quantity) {
        if (productPrices.containsKey(product)) {
            cart.put(product, cart.getOrDefault(product, 0) + quantity);
        } else {
            System.out.println("Product not found: " + product);
        }
    }

    public double getTotalPrice() {
        double total = 0;
        for (Map.Entry<String, Integer> entry : cart.entrySet()) {
            total += productPrices.get(entry.getKey()) * entry.getValue();
        }
        return total;
    }

    public TreeMap<Double, List<String>> getProductsSortedByPrice() {
        TreeMap<Double, List<String>> sortedByPrice = new TreeMap<>();
        for (String product : productPrices.keySet()) {
            double price = productPrices.get(product);
            sortedByPrice.computeIfAbsent(price, k -> new ArrayList<>()).add(product);
        }
        return sortedByPrice;
    }

    public void displayCart() {
        System.out.println("Cart Items (Order Added): " + cart);
    }
}
