package mapinterface.shoppingcart;

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addProduct("Laptop", 800.0);
        cart.addProduct("Phone", 500.0);
        cart.addProduct("Headphones", 100.0);

        cart.addToCart("Laptop", 1);
        cart.addToCart("Phone", 2);
        cart.addToCart("Headphones", 3);

        cart.displayCart();
        System.out.println("Total Price: $" + cart.getTotalPrice());
        System.out.println("Products Sorted by Price: " + cart.getProductsSortedByPrice());
    }
}
