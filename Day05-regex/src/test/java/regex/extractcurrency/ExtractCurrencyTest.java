package regex.extractcurrency;

import org.junit.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ExtractCurrencyTest {
    @Test
    public void testExtractCurrencyValues_withValidText() {
        String text = "The price is $45.99, and the discount is 10.50.";
        List<String> expected = List.of("$45.99", "10.50");

        List<String> result = ExtractCurrency.extractCurrencyValues(text);

        assertEquals(expected, result);
    }

    @Test
    public void testExtractCurrencyValues_withNoCurrencyValues() {
        String text = "There are no currency values here.";
        List<String> expected = List.of();
        List<String> result = ExtractCurrency.extractCurrencyValues(text);
        assertEquals(expected, result);
    }

    @Test
    public void testExtractCurrencyValues_withMultipleCurrencies() {
        String text = "Items cost $19.99, $50.00, and $100.75.";
        List<String> expected = List.of("$19.99", "$50.00", "$100.75");
        List<String> result = ExtractCurrency.extractCurrencyValues(text);
        assertEquals(expected, result);
    }

    @Test
    public void testExtractCurrencyValues_withTextBeforeCurrency() {
        String text = "The total is $150 and the change is 15.75.";
        List<String> expected = List.of("$150", "15.75");
        List<String> result = ExtractCurrency.extractCurrencyValues(text);
        assertEquals(expected, result);
    }

    @Test
    public void testExtractCurrencyValues_withEmptyText() {
        String text = "";
        List<String> expected = List.of();
        List<String> result = ExtractCurrency.extractCurrencyValues(text);
        assertEquals(expected, result);
    }

}