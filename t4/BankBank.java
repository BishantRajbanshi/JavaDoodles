package t4;
public class BankBank {
  private String accountNumber;
  private double balance;
  private String accountHolderName;
  private String accountHolderAddress;
  
  // No-argument constructor
  public BankBank() {
      System.out.println("User created!");
  }

  public BankBank(String accountNumber, double balance, String accountHolderName, String accountHolderAddress) {
      this.accountNumber = accountNumber;
      this.balance = balance;
      this.accountHolderName = accountHolderName;
      this.accountHolderAddress = accountHolderAddress;
  }

  public static void main(String[] args) {
      BankBank myAccount = new BankBank("5613216", 1000.0, "liam", "lalallaalla");
      
      System.out.println("Account Number: " + myAccount.accountNumber);
      System.out.println("Balance: $" + myAccount.balance);
      System.out.println("Account Holder Name: " + myAccount.accountHolderName);
      System.out.println("Account Holder Address: " + myAccount.accountHolderAddress);
  }
}


