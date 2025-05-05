package Exercise46;

public class Main {

 public static void main(String[] args) {
  Bank bank = new Bank("MyBank");

  // Add branches
  bank.addBranch("Manila");
  bank.addBranch("Cebu");

  // Add customers with initial transactions
  bank.addCustomer("Manila", "Alice", 100.0);
  bank.addCustomer("Manila", "Bob", 150.5);
  bank.addCustomer("Cebu", "Charlie", 200.0);

  // Add transactions to existing customers
  bank.addCustomerTransaction("Manila", "Alice", 50.0);
  bank.addCustomerTransaction("Manila", "Alice", 25.0);
  bank.addCustomerTransaction("Cebu", "Charlie", 300.0);

  // List customers with transactions
  bank.listCustomers("Manila", true);
  System.out.println();
  bank.listCustomers("Cebu", true);
}
}
