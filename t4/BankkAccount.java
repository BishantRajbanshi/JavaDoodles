package t4;
public class BankkAccount {
  private String accountNumber;
  private double balance;
  private String accountHolderName;
  private String accountHolderAddress;

  public BankkAccount(String accountNumber, double balance, String accountHolderName, String accountHolderAddress) {
      this.accountNumber = accountNumber;
      this.balance = balance;
      this.accountHolderName = accountHolderName;
      this.accountHolderAddress = accountHolderAddress;
  }

  public double getBalance() {
      return balance;
  }

  public static void main(String[] args) {
      BankkAccount myAccount = new BankkAccount("4545464", 1000.0, "hehe", "asaada");
      System.out.println("Current Balance: $" + myAccount.getBalance());
  }
}


