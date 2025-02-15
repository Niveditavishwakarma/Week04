package regex.validatehexcode;

public class ValidateHexCode {
    public static String validateHexColor(String colorcode)
    {
        String pattern = "#[A-Fa-f0-9]{6}";
        if(colorcode.matches(pattern))
            return "valid";
        else
            return "invalid";
    }
    public static void main(String[] args)
    {
        System.out.println(validateHexColor("#FFA450"));
        System.out.println(validateHexColor("#ff4500"));
        System.out.println(validateHexColor("#124"));
        System.out.println(validateHexColor("#ZZZZZZZ"));
        System.out.println(validateHexColor("#475493"));
    }
}
