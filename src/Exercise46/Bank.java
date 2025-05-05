package Exercise46;

import java.util.ArrayList;

/**
 * The Bank class represents a bank that can have multiple branches. Each branch can have multiple customers.
 * The Bank class provides methods to add branches, add customers, add transactions, and list customers with their transactions.
 */
public class Bank {

  private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public boolean addBranch(String name) {
        if (findBranch(name) == null) {
            branches.add(new Branch(name));
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double initialTransaction) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            return branch.newCustomer(customerName, initialTransaction);
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double transaction) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            return branch.addCustomerTransaction(customerName, transaction);
        }
        return false;
    }

    public boolean listCustomers(String branchName, boolean printTransactions) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            System.out.println("Customer details for branch " + branch.getName());

            ArrayList<Customer> customers = branch.getCustomers();
            for (int i = 0; i < customers.size(); i++) {
                Customer customer = customers.get(i);
                System.out.println("Customer: " + customer.getName() + "[" + (i + 1) + "]");
                if (printTransactions) {
                    System.out.println("Transactions");
                    ArrayList<Double> transactions = customer.getTransactions();
                    for (int j = 0; j < transactions.size(); j++) {
                        System.out.println("[" + (j + 1) + "] Amount " + transactions.get(j));
                    }
                }
            }
            return true;
        }
        return false;
    }

    private Branch findBranch(String name) {
        for (Branch branch : branches) {
            if (branch.getName().equals(name)) {
                return branch;
            }
        }
        return null;
    }
}

