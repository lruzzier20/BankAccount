public class BankAccount{
  private double balance;
  private int accountID;
  private String password;

  public BankAccount(int a, String p){
    balance=0;
    accountID=a;
    password=p;
  }

  public double getBalance(){
    return balance;
  }

  public int getAccountID(){
    return accountID;
  }

  public void setPassword(String p){
    password=p;
  }

  public boolean deposit(double amount){
    if(amount>=0){balance+=amount; return true;}else{return false;}
  }

  public boolean withdraw(double amount){
    if(amount>balance||amount<0){return false;}else{balance-=amount; return true;}
  }

  public String toString(){
    return accountID + "\t" + balance;
  }
}
