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

  public BankAccount(String accountNumber, double balance, String accountHolderName) {
      this.accountNumber = accountNumber;
      this.balance = balance;
      this.accountHolderName = accountHolderName;
      this.accountHolderAddress = "";
  }

  public BankAccount(String accountNumber, String accountHolderName) {
      this.accountNumber = accountNumber;
      this.balance = 0.0;
      this.accountHolderName = accountHolderName;
      this.accountHolderAddress = "";
  }

  public String getAccountNumber() {
      return accountNumber;
  }

  public double getBalance() {
      return balance;
  }

  public String getAccountHolderName() {
      return accountHolderName;
  }

  public String getAccountHolderAddress() {
      return accountHolderAddress;
  }

  public void setAccountNumber(String accountNumber) {
      this.accountNumber = accountNumber;
  }

  public void setBalance(double balance) {
      this.balance = balance;
  }

  public void setAccountHolderName(String accountHolderName) {
      this.accountHolderName = accountHolderName;
  }

  public void setAccountHolderAddress(String accountHolderAddress) {
      this.accountHolderAddress = accountHolderAddress;
  }

  public static void main(String[] args) {
      // Creating objects using different constructors
      BankAccount account1 = new BankAccount("123456789", 5000.0, "John Doe", "123 Main St");
      BankAccount account2 = new BankAccount("987654321", 3000.0, "Jane Smith");
      BankAccount account3 = new BankAccount("111111111", "Alice Wonderland");

      // Displaying account information
      System.out.println("Account 1:");
      System.out.println("Account Number: " + account1.getAccountNumber());
      System.out.println("Balance: $" + account1.getBalance());
      System.out.println("Account Holder Name: " + account1.getAccountHolderName());
      System.out.println("Account Holder Address: " + account1.getAccountHolderAddress());

      System.out.println("\nAccount 2:");
      System.out.println("Account Number: " + account2.getAccountNumber());
      System.out.println("Balance: $" + account2.getBalance());
      System.out.println("Account Holder Name: " + account2.getAccountHolderName());
      System.out.println("Account Holder Address: " + account2.getAccountHolderAddress());

      System.out.println("\nAccount 3:");
      System.out.println("Account Number: " + account3.getAccountNumber());
      System.out.println("Balance: $" + account3.getBalance());
      System.out.println("Account Holder Name: " + account3.getAccountHolderName());
      System.out.println("Account Holder Address: " + account3.getAccountHolderAddress());
  }
}
