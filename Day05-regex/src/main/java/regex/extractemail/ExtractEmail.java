package regex.extractemail;
import java.util.regex.*;
import java.util.*;
public class ExtractEmail {
    public static void main(String[] args) {
        String text = "Contact us at support@example.com and info@company.org";

        String regex = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        List<String> emails = new ArrayList<>();

        while (matcher.find()) {
            emails.add(matcher.group());
        }

        for (String email : emails) {
            System.out.println(email);
        }
    }

}
