package banktransactionsystem;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(500.0);

        try {
            account.withdraw(100.0);
            account.withdraw(600.0);
            account.withdraw(-50.0);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
