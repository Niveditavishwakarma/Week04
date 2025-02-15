package regex.validateusername;
import java.util.regex.*;
public class UsernameValidator {
    public static String validateUsername(String username)
    {
        String regex = "^[A-Za-z][A-Za-z0-9_]{4,14}";
        if(username.matches(regex))
            return "Valid";
        else
            return "Invalid";
    }
    public static void main(String[] args)
    {
        System.out.println(validateUsername("user_123"));
        System.out.println(validateUsername("123user"));
        System.out.println(validateUsername("us"));
    }
}
