package regex.creditcard;

public class CreditCardValidator {
    private static final String CARD_REGEX = "^(4\\d{15}|5\\d{15})$";

    public static boolean isValidCreditCard(String cardNumber) {
        return cardNumber.matches(CARD_REGEX);
    }

    public static void main(String[] args) {
        System.out.println(isValidCreditCard("4123456789012345"));
        System.out.println(isValidCreditCard("5123456789012345"));
        System.out.println(isValidCreditCard("6123456789012345"));
        System.out.println(isValidCreditCard("41234567890123"));
        System.out.println(isValidCreditCard("51234567890123456"));
    }
}
