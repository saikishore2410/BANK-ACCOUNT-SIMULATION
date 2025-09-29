public class Main {
    public static void main(String[] args) {
        // Create a normal account
        Account acc1 = new Account("Saikishore", "ACC1001", 5000);
        acc1.deposit(2000);
        acc1.withdraw(1500);
        acc1.printTransactionHistory();

        // Create a savings account
        SavingsAccount acc2 = new SavingsAccount("Hemalatha", "SAV2001", 8000, 5);
        acc2.deposit(3000);
        acc2.withdraw(2000);
        acc2.addInterest();
        acc2.printTransactionHistory();
    }
}
