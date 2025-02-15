package regex.validatelicenseplate;

public class ValidateLicensePlate {
    public static String validateLicensePlate(String plate){
        String regex = "^[A-Z]{2}[0-9]{4}";
        if(plate.matches(regex))
            return "valid";
        else
            return "invalid";
    }
    public static void main(String[] args)
    {
        System.out.println(validateLicensePlate("AB1234"));
        System.out.println(validateLicensePlate("A12345"));
        System.out.println(validateLicensePlate("BA12"));
        System.out.println(validateLicensePlate("xyz123456"));
    }
}
