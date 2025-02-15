package regex.replacemultiplespaces;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ReplaceMultipleSpacesTest {
    @Test
    public void testReplaceSpaces() {
        assertEquals("This is an example with multiple spaces.",
                ReplaceMultipleSpaces.replaceSpaces("This  is   an  example    with   multiple     spaces."));
    }

    @Test
    public void testNoExtraSpaces() {
        assertEquals("Hello World!", ReplaceMultipleSpaces.replaceSpaces("Hello World!"));
    }

    @Test
    public void testLeadingAndTrailingSpaces() {
        assertEquals("Trim spaces properly", ReplaceMultipleSpaces.replaceSpaces("   Trim   spaces    properly   ").trim());
    }
}