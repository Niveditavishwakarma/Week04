package regex.replacemultiplespaces;

public class ReplaceMultipleSpaces {
    public static String replaceSpaces(String input) {
        return input.replaceAll("\\s+", " ");
    }

    public static void main(String[] args) {
        String text = "This  is   an  example    with   multiple     spaces.";
        System.out.println(replaceSpaces(text));
    }
}
