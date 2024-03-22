package t4;
public class BankAccount {
  private String accountNumber;
  private double balance;
  private String accountHolderName;
  private String accountHolderAddress;

  public BankAccount(String accountNumber, double balance, String accountHolderName, String accountHolderAddress) {
      this.accountNumber = accountNumber;
      this.balance = balance;
      this.accountHolderName = accountHolderName;
      this.accountHolderAddress = accountHolderAddress;
  }

  public String getAccountNumber() {
      return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
      this.accountNumber = accountNumber;
  }

  public double getBalance() {
      return balance;
  }

  public void setBalance(double balance) {
      this.balance = balance;
  }

  public String getAccountHolderName() {
      return accountHolderName;
  }

  public void setAccountHolderName(String accountHolderName) {
      this.accountHolderName = accountHolderName;
  }

  public String getAccountHolderAddress() {
      return accountHolderAddress;
  }

  public void setAccountHolderAddress(String accountHolderAddress) {
      this.accountHolderAddress = accountHolderAddress;
  }

  public static void main(String[] args) {
      BankAccount myAccount = new BankAccount("1234567890", 1000.0, "Kylian Murfy", "blablabla, bla");

      System.out.println("Account Number: " + myAccount.getAccountNumber());
      System.out.println("Account Holder Name: " + myAccount.getAccountHolderName());
      System.out.println("Account Holder Address: " + myAccount.getAccountHolderAddress());
      System.out.println("Current Balance: $" + myAccount.getBalance());
  }
}
