package dynamiconlinemarketplace;

public class Discount {
        public static <T extends ProductCategory> void applyDiscount(Product<T> product, double percentage) {
            double price = product.getPrice();
            double discountAmount = price * (percentage / 100);
            product.setPrice(price - discountAmount);
        }
    }

