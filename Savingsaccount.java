public class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(String accountHolder, String accountNumber, double initialBalance, double interestRate) {
        super(accountHolder, accountNumber, initialBalance);
        this.interestRate = interestRate;
    }

    // Overriding withdraw to prevent overdraft
    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            super.withdraw(amount);
        } else {
            System.out.println("Withdrawal not allowed! Insufficient balance.");
        }
    }

    // Method to add interest
    public void addInterest() {
        double interest = balance * interestRate / 100;
        balance += interest;
        transactionHistory.add("Interest added: " + interest + " | Balance: " + balance);
        System.out.println("Interest of " + interest + " added. New Balance: " + balance);
    }
}
