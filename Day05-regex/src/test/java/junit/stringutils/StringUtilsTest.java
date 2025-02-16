package junit.stringutils;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {
    StringUtils stringUtils = new StringUtils();

    @Test
    public void testReverse() {
        assertEquals("gnitset", stringUtils.reverse("testing"), "The string should be reversed");
        assertEquals("aba", stringUtils.reverse("aba"), "The string 'aba' should be reversed to 'aba'");  // palindrome
        assertEquals("!dlroW ,olleH", stringUtils.reverse("Hello, World!"), "The string should be reversed correctly");
        assertNull(stringUtils.reverse(null), "The reversed string of null should be null");
    }

    @Test
    public void testIsPalindrome() {
        assertTrue(stringUtils.isPalindrome("aba"), "'aba' should be identified as a palindrome");
        assertFalse(stringUtils.isPalindrome("hello"), "'hello' should not be identified as a palindrome");
        assertTrue(stringUtils.isPalindrome("racecar"), "'racecar' should be identified as a palindrome");
        assertFalse(stringUtils.isPalindrome("world"), "'world' should not be identified as a palindrome");
        assertFalse(stringUtils.isPalindrome(null), "null should not be considered a palindrome");
    }

    @Test
    public void testToUpperCase() {
        assertEquals("HELLO", stringUtils.toUpperCase("hello"), "The string should be converted to uppercase");
        assertEquals("WORLD", stringUtils.toUpperCase("world"), "The string should be converted to uppercase");
        assertEquals("JAVA", stringUtils.toUpperCase("java"), "The string should be converted to uppercase");
        assertNull(stringUtils.toUpperCase(null), "The uppercase of null should be null");
    }

}