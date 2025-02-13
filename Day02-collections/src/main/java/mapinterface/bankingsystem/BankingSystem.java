package mapinterface.bankingsystem;
import java.util.*;
class BankingSystem {
    private Map<Long, Double> accounts = new HashMap<>(); // Stores account balances
    private Queue<Long> withdrawalQueue = new LinkedList<>(); // Withdrawal request queue

    public void createAccount(long accountNumber, double initialBalance) {
        accounts.put(accountNumber, initialBalance);
    }

    public void deposit(long accountNumber, double amount) {
        accounts.put(accountNumber, accounts.getOrDefault(accountNumber, 0.0) + amount);
    }

    public void requestWithdrawal(long accountNumber) {
        if (accounts.containsKey(accountNumber)) {
            withdrawalQueue.offer(accountNumber);
        } else {
            System.out.println("Account not found!");
        }
    }

    public void processWithdrawals(double amount) {
        while (!withdrawalQueue.isEmpty()) {
            long accountNumber = withdrawalQueue.poll();
            double balance = accounts.get(accountNumber);
            if (balance >= amount) {
                accounts.put(accountNumber, balance - amount);
                System.out.println("Withdrawal successful for Account: " + accountNumber);
            } else {
                System.out.println("Insufficient funds for Account: " + accountNumber);
            }
        }
    }

    public TreeMap<Double, List<Long>> getSortedAccountsByBalance() {
        TreeMap<Double, List<Long>> sortedAccounts = new TreeMap<>();
        for (Map.Entry<Long, Double> entry : accounts.entrySet()) {
            sortedAccounts.computeIfAbsent(entry.getValue(), k -> new ArrayList<>()).add(entry.getKey());
        }
        return sortedAccounts;
    }

    public void displayAccounts() {
        System.out.println("Accounts: " + accounts);
    }
}
