public class BankTest{
  public static void main(String[] args){
    BankAccount x = new BankAccount(1, "test");
    System.out.println(x.getAccountID());
    System.out.println(x.getBalance());
    x.setPassword("cheese");
    System.out.println(x.deposit(1000));
    System.out.println(x.getBalance());
    x.withdraw(500);
    System.out.println(x.getBalance());
    x.withdraw(1000);
    System.out.println(x.toString());
  }
}
