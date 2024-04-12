public class Test {
  public static void main(String[] args) {
      Customer customer1 = new Customer("John", "Doe");
      Account account1 = new Account("John", "Doe", "123456789", 1000.0);

      Customer customer2 = new Customer("Jane", "Smith");
      Account account2 = new Account("Jane", "Smith", "987654321", 500.0);

      Transaction.transfer(account1, account2, 200.0);

      System.out.println("Account 1 Balance: " + account1.getBalance());
      System.out.println("Account 2 Balance: " + account2.getBalance());
  }
}
