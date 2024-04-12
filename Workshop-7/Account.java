public class Account extends Customer {
  private String accountNumber;
  private double balance;

  public Account(String firstName, String lastName, String accountNumber, double balance) {
      super(firstName, lastName);
      this.accountNumber = accountNumber;
      this.balance = balance;
  }

  public void deposit(double amount) {
      this.balance += amount;
  }

  public void withdraw(double amount) {
      if (amount <= this.balance) {
          this.balance -= amount;
      } else {
          throw new IllegalArgumentException("Insufficient balance");
      }
  }

  public String getAccountNumber() {
      return accountNumber;
  }

  public double getBalance() {
      return balance;
  }
}
