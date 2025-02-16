package regex.validateipaddress;

public class IPAddress {
        public static boolean isValidIP(String ip) {
            String regex =
                    "^((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}" +
                            "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";

            return ip.matches(regex);
        }

        public static void main(String[] args) {
            System.out.println(isValidIP("192.168.0.1"));
            System.out.println(isValidIP("256.256.256.256"));
            System.out.println(isValidIP("192.168.01.1"));
        }
    }

