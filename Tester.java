public class Tester{
  public static void main(String[] args){
    BankAccount x = new BankAccount(1, "test");
    BankAccount y = new BankAccount(2, "test2");
    System.out.println(x.getAccountID());
    System.out.println(x.getBalance());
    x.setPassword("cheese");
    System.out.println(x.deposit(1000));
    System.out.println(x.getBalance());
    x.withdraw(500);
    System.out.println(x.getBalance());
    x.withdraw(1000);
    System.out.println(x.toString());
    System.out.println(x);
    System.out.println(x.transferTo(y, 100, "cheese"));
    System.out.println(x);
    System.out.println(y);
  }
}
