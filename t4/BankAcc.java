package t4;
public class BankAcc {
  private double balance;

  public BankAcc(double balance) {
      this.balance = balance;
  }

  public void depositMoney(double amount) {
      if (amount > 0) {
          balance += amount;
          System.out.println("Deposit of " + amount + " successful.");
          System.out.println("Current Balance: " + balance);
      } else {
          System.out.println("Invalid amount for deposit.");
      }
  }

  public void withdrawMoney(double amount) {
      if (amount > 0 && balance >= amount) {
          balance -= amount;
          System.out.println("Withdrawal of " + amount + " successful.");
          System.out.println("Current Balance: " + balance);
      } else {
          System.out.println("Insufficient funds or invalid amount for withdrawal.");
      }
  }

  public static void main(String[] args) {
      BankAcc account = new BankAcc(1000.0);
      account.depositMoney(520.0);
      account.withdrawMoney(100.0);
      account.withdrawMoney(-150.0);
      account.withdrawMoney(1500.0);
  }
}
