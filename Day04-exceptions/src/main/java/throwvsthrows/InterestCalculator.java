package throwvsthrows;

public class InterestCalculator {
    public static double calculateInterest(double amount, double rate, int years) throws IllegalArgumentException {
        if (amount < 0 || rate < 0) {
            throw new IllegalArgumentException("Amount and rate must be positive");
        }

        double interest = (amount * rate * years) / 100;
        return interest;
    }

    public static void main(String[] args) {
        double amount = -1000.0;
        double rate = 5.0;
        int years = 3;

        try {
            double interest = calculateInterest(amount, rate, years);
            System.out.println("Calculated interest: " + interest);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid input: " + e.getMessage());
        }
    }
}
