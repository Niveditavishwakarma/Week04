package dynamiconlinemarketplace;

public class Marketplace {
        public static void main(String[] args) {
            Product<BookCategory> book = new Product<>("Java Programming", 50.0, new BookCategory());
            Product<ClothingCategory> clothing = new Product<>("T-shirt", 20.0, new ClothingCategory());
            Product<GadgetCategory> gadget = new Product<>("Smartphone", 300.0, new GadgetCategory());

            System.out.println(book.getName() + ": $" + book.getPrice());
            System.out.println(clothing.getName() + ": $" + clothing.getPrice());
            System.out.println(gadget.getName() + ": $" + gadget.getPrice());

            Discount.applyDiscount(book, 10);
            Discount.applyDiscount(clothing, 15);
            Discount.applyDiscount(gadget, 5);

            System.out.println("After discount:");
            System.out.println(book.getName() + ": $" + book.getPrice());
            System.out.println(clothing.getName() + ": $" + clothing.getPrice());
            System.out.println(gadget.getName() + ": $" + gadget.getPrice());
        }
    }


