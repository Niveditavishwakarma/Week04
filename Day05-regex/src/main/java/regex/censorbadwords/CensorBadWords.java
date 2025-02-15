package regex.censorbadwords;

import java.util.List;
import java.util.regex.Pattern;

public class CensorBadWords {
    public static String censorText(String input, List<String> badWords) {
        for (String word : badWords) {
            String regex = "\\b" + Pattern.quote(word) + "\\b";
            input = input.replaceAll(regex, "****");
        }
        return input;
    }

    public static void main(String[] args) {
        List<String> badWords = List.of("damn", "stupid");
        String text = "This is a damn bad example with some stupid words.";
        System.out.println(censorText(text, badWords));
    }
}
