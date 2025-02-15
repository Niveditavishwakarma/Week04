package regex.censorbadwords;

import org.junit.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

 public class CensorBadWordsTest {
    @Test
    public void testCensorBadWords() {
        List<String> badWords = List.of("damn", "stupid");
        assertEquals("This is a **** bad example with some **** words.",
                CensorBadWords.censorText("This is a damn bad example with some stupid words.", badWords));
    }

    @Test
    public void testNoBadWords() {
        List<String> badWords = List.of("damn", "stupid");
        assertEquals("This is a clean sentence.",
                CensorBadWords.censorText("This is a clean sentence.", badWords));
    }

    @Test
    public void testPartialWordNotCensored() {
        List<String> badWords = List.of("bad");
        assertEquals("This is a badly written sentence.",
                CensorBadWords.censorText("This is a badly written sentence.", badWords));
    }

    @Test
    public void testEmptyString() {
        List<String> badWords = List.of("damn", "stupid");
        assertEquals("", CensorBadWords.censorText("", badWords));
    }
    @Test
    public void testOnlyBadWords() {
        List<String> badWords = List.of("bad", "words");
        assertEquals("**** ****", CensorBadWords.censorText("bad words", badWords));
    }

}