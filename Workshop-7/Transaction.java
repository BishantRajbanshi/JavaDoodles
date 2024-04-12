public class Transaction {
  public static void transfer(Account from, Account to, double amount) {
      from.withdraw(amount);
      to.deposit(amount);
  }
}
