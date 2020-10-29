public class BankTest{
  public static void main(String[] args){
    BankAccount x = new BankAccount(1, "test");
    System.out.println(x.getAccountID());
    System.out.println(x.getBalance());
    x.setPassword("cheese");
  }
}
