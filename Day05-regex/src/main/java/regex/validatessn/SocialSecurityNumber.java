package regex.validatessn;

public class SocialSecurityNumber {
    public static String validateSSN(String ssn) {
        String ssnPattern = "^\\d{3}-\\d{2}-\\d{4}$";

        if (ssn.matches(ssnPattern)) {
            return "\"" + ssn + "\" is valid";
        } else {
            return "\"" + ssn + "\" is invalid";
        }
    }

    public static void main(String[] args) {
        String ssn1 = "123-45-6789";
        String ssn2 = "123456789";

        System.out.println(validateSSN(ssn1));
        System.out.println(validateSSN(ssn2));
    }
}
