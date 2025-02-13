package mapinterface.bankingsystem;

public class Main {
    public static void main(String[] args) {
        BankingSystem bank = new BankingSystem();
        bank.createAccount(101, 1000);
        bank.createAccount(102, 2000);
        bank.createAccount(103, 1500);

        bank.deposit(101, 500);
        bank.requestWithdrawal(102);
        bank.requestWithdrawal(103);

        bank.displayAccounts();
        bank.processWithdrawals(1000);
        System.out.println("Sorted Accounts by Balance: " + bank.getSortedAccountsByBalance());
    }
}
