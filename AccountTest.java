public class AccountTest {
  static void check(boolean x,String m){if(!x)throw new AssertionError(m);}
  public static void main(String[] a){
    Account x=new Account("Alice",1,1000);
    x.deposit(250);
    check(x.getBalance()==1250,"deposit");
    x.withdraw(200);
    check(x.getBalance()==1050,"withdraw");
    x.withdraw(2000);
    check(x.getBalance()==1050,"overdraft blocked");
    SavingsAccount s=new SavingsAccount("Bob",2,1000,5);
    s.addInterest();
    check(s.getBalance()==1050,"interest");
    System.out.println("Bank tests passed");
  }
}