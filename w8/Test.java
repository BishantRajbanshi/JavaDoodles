class Customer {
  private String firstName;
  private String lastName;

  Customer(String firstName, String lastName) {
      this.firstName = firstName;
      this.lastName = lastName;
  }

  public String getFirstName() {
      return firstName;
  }

  public String getLastName() {
      return lastName;
  }

  public void setFirstName(String firstName) {
      this.firstName = firstName;
  }

  public void setLastName(String lastName) {
      this.lastName = lastName;
  }
}

class Account extends Customer {
  private int accountNumber;
  private double balance;

  Account(String firstName, String lastName, int accountNumber, double balance) {
      super(firstName, lastName);
      this.accountNumber = accountNumber;
      this.balance = balance;
  }

  public void deposit(double amount) {
      balance += amount;
      System.out.println("Deposited amount: Rs " + amount);
      System.out.println("New Balance: Rs " + balance);
  }

  public void withdraw(double amount) {
      if (balance >= amount) {
          balance -= amount;
          System.out.println("Withdrawn amount: Rs " + amount);
          System.out.println("New Balance: Rs " + balance);
      } else {
          System.out.println("Insufficient Funds");
      }
  }

  public int getAccountNumber() {
      return accountNumber;
  }

  public double getBalance() {
      return balance;
  }

  public void setAccountNumber(int accountNumber) {
      this.accountNumber = accountNumber;
  }

  public void setBalance(double balance) {
      this.balance = balance;
  }
}

class Transaction {
  public static void transfer(Account fromAccount, Account toAccount, double amount) {
      if (fromAccount.getBalance() >= amount) {
          fromAccount.withdraw(amount);
          toAccount.deposit(amount);
          System.out.println("Transfer Completed.");
      } else {
          System.out.println("Transfer Failed: Insufficient Funds.");
      }
  }
}

public class Test {
  public static void main(String[] args) {
      Customer customer1 = new Customer("Bikash", "Shrestha");
      Account account1 = new Account(customer1.getFirstName(), customer1.getLastName(), 432156, 2000.0);

      Customer customer2 = new Customer("Bikram", "Shrestha");
      Account account2 = new Account(customer2.getFirstName(), customer2.getLastName(), 612321, 1000.0);

      account1.deposit(500.0);
      account1.withdraw(1000);

      account2.deposit(1000.0);
      account2.withdraw(250.0);

      Transaction.transfer(account1, account2, 300);
  }
}
