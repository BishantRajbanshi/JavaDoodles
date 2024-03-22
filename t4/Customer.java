package t4;
public class Customer {
  private String customerId;
  private String name;
  private BankAccount bankAccount;

  public Customer(String customerId, String name, BankAccount bankAccount) {
      this.customerId = customerId;
      this.name = name;
      this.bankAccount = bankAccount;
  }

  public String getCustomerId() {
      return customerId;
  }

  public String getName() {
      return name;
  }

  public BankAccount getBankAccount() {
      return bankAccount;
  }

  public void setCustomerId(String customerId) {
      this.customerId = customerId;
  }

  public void setName(String name) {
      this.name = name;
  }

  public void setBankAccount(BankAccount bankAccount) {
      this.bankAccount = bankAccount;
  }

  public static void main(String[] args) {
      // Creating BankAccount instances
      BankAccount account1 = new BankAccount("5613216", 1000.0, "liam", "lalallaalla");
      BankAccount account2 = new BankAccount("4544545", 3000.0, "Suman", "tititt");

      // Creating Customer instances
      Customer customer1 = new Customer("CUST001", "liam", account1);
      Customer customer2 = new Customer("CUST002", "Suman", account2);

      // Displaying customer information using getters
      System.out.println("Customer 1:");
      System.out.println("Customer ID: " + customer1.getCustomerId());
      System.out.println("Name: " + customer1.getName());
      System.out.println("Bank Account Details:");
      System.out.println("   Account Number: " + customer1.getBankAccount().getAccountNumber());
      System.out.println("   Balance: $" + customer1.getBankAccount().getBalance());
      System.out.println("   Holder Name: " + customer1.getBankAccount().getAccountHolderName());
      System.out.println("   Holder Address: " + customer1.getBankAccount().getAccountHolderAddress());

      System.out.println("\nCustomer 2:");
      System.out.println("Customer ID: " + customer2.getCustomerId());
      System.out.println("Name: " + customer2.getName());
      System.out.println("Bank Account Details:");
      System.out.println("   Account Number: " + customer2.getBankAccount().getAccountNumber());
      System.out.println("   Balance: $" + customer2.getBankAccount().getBalance());
      System.out.println("   Holder Name: " + customer2.getBankAccount().getAccountHolderName());
      System.out.println("   Holder Address: " + customer2.getBankAccount().getAccountHolderAddress());
  }
}
