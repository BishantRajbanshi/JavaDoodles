public class Test {
  public static void main(String[] args) {
      Customer customer1 = new Customer("Bill", "Gates");
      Account account1 = new Account("Bill", "Gates", "5646546", 1000.0);

      Customer customer2 = new Customer("Marry", "Jane");
      Account account2 = new Account("Marry", "Jane", "987654321", 500.0);

      Transaction.transfer(account1, account2, 200.0);

      System.out.println("Account of"+ Customer.account1.firstName();  "Balance: " + account1.getBalance());
      System.out.println("Account 2 Balance: " + account2.getBalance());
  }
}
