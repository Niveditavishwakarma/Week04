package dynamiconlinemarketplace;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MarketplaceTest {
    @Test
    public void testProductCreation() {
        Product<BookCategory> book = new Product<>("Java Programming", 50.0, new BookCategory());

        assertEquals("Java Programming", book.getName());
        assertEquals(50.0, book.getPrice());
        assertEquals("Book", book.getCategory().getName());
    }

    @Test
    public void testApplyDiscountOnBook() {
        Product<BookCategory> book = new Product<>("Java Programming", 50.0, new BookCategory());
        Discount.applyDiscount(book, 10);
        assertEquals(45.0, book.getPrice());
    }

    @Test
    public void testApplyDiscountOnClothing() {
        Product<ClothingCategory> clothing = new Product<>("T-shirt", 20.0, new ClothingCategory());
        Discount.applyDiscount(clothing, 15);
        assertEquals(17.0, clothing.getPrice());
    }

    @Test
    public void testApplyDiscountOnGadget() {
        Product<GadgetCategory> gadget = new Product<>("Smartphone", 300.0, new GadgetCategory());
        Discount.applyDiscount(gadget, 5);
        assertEquals(285.0, gadget.getPrice());
    }

    @Test
    public void testApplyDiscountWithNoDiscount() {
        Product<BookCategory> book = new Product<>("Java Programming", 50.0, new BookCategory());
        Discount.applyDiscount(book, 0);
        assertEquals(50.0, book.getPrice());
    }

    @Test
    public void testDiscountOnMultipleProducts() {
        Product<BookCategory> book = new Product<>("Java Programming", 50.0, new BookCategory());
        Product<ClothingCategory> clothing = new Product<>("T-shirt", 20.0, new ClothingCategory());
        Product<GadgetCategory> gadget = new Product<>("Smartphone", 300.0, new GadgetCategory());

        Discount.applyDiscount(book, 10);
        Discount.applyDiscount(clothing, 15);
        Discount.applyDiscount(gadget, 5);

        assertEquals(45.0, book.getPrice());
        assertEquals(17.0, clothing.getPrice());
        assertEquals(285.0, gadget.getPrice());
    }
}
