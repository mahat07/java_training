package com.celcom.javalabassignment;
import java.util.*;

// Represents a bank account for a particular customer
class Account {
    private String accNum;
    private String nameOfHolder;
    private double balance;

    // Constructor to initialize an account
    public Account(String accNum, String nameOfHolder, double initialBalance) {
        this.accNum = accNum;
        this.nameOfHolder = nameOfHolder;
        this.balance = initialBalance;
    }

    // Method to deposit money
    public void deposit(double money) {
        if (money > 0) {
            balance += money;
            System.out.println("Deposited " + money + " successfully. New balance: " + balance);
        } else {
            System.out.println("Deposit money must be positive.");
        }
    }

    // Method to withdraw money
    public void withdraw(double money) {
        if (money > 0 && money <= balance) {
            balance -= money;
            System.out.println("Withdrawn " + money + " successfully. New balance: " + balance);
        } else {
            System.out.println("Invalid withdrawal money or insufficient balance.");
        }
    }

    // Method to get current balance
    public double getBalance() {
        return balance;
    }

    // Method to get account details
    public void displayInfo() {
        System.out.println("Account Number: " + accNum);
        System.out.println("Account Holder: " + nameOfHolder);
        System.out.println("Balance: " + balance);
    }
}

// Represents the Bank, which manages multiple accounts
class Bank {
    private Map<String, Account> accounts;

    // Constructor to initialize the bank's account collection
    public Bank() {
        accounts = new HashMap<>();
    }

    // Method to add a new account
    public void addAccount(String accNum, String nameOfHolder, double initialBalance) {
        if (!accounts.containsKey(accNum)) {
            accounts.put(accNum, new Account(accNum, nameOfHolder, initialBalance));
            System.out.println("Account successfully created for " + nameOfHolder);
        } else {
            System.out.println("Account with number " + accNum + " already exists.");
        }
    }

    // Method to remove an existing account
    public void removeAccount(String accNum) {
        if (accounts.containsKey(accNum)) {
            accounts.remove(accNum);
            System.out.println("Account " + accNum + " removed successfully.");
        } else {
            System.out.println("No such account exists.");
        }
    }

    // Method to deposit money into an account
    public void depositToAccount(String accNum, double money) {
        Account account = accounts.get(accNum);
        if (account != null) {
            account.deposit(money);
        } else {
            System.out.println("Account not found.");
        }
    }

    // Method to withdraw money from an account
    public void withdrawFromAccount(String accNum, double money) {
        Account account = accounts.get(accNum);
        if (account != null) {
            account.withdraw(money);
        } else {
            System.out.println("Account not found.");
        }
    }

    // Method to display all accounts in the bank
    public void displayAllAccounts() {
        if (accounts.isEmpty()) {
            System.out.println("No accounts found in the bank.");
        } else {
            for (Account account : accounts.values()) {
                account.displayInfo();
                System.out.println("-------------------------");
            }
        }
    }
}


public class BankingSystem_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bank myBank = new Bank();
        
        while (true) {
            System.out.println("\nBank Menu:");
            System.out.println("1. Add Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Display All Accounts");
            System.out.println("5. Remove Account");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine();
            
            switch (choice) {
                case 1:
                    System.out.print("Enter account number: ");
                    String accNum = scanner.nextLine();
                    System.out.print("Enter account holder name: ");
                    String accHolder = scanner.nextLine();
                    System.out.print("Enter initial balance: ");
                    double initBalance = scanner.nextDouble();
                    myBank.addAccount(accNum, accHolder, initBalance);
                    break;
                case 2:
                    System.out.print("Enter account number: ");
                    String depAccNum = scanner.nextLine();
                    System.out.print("Enter money to deposit: ");
                    double depmoney = scanner.nextDouble();
                    myBank.depositToAccount(depAccNum, depmoney);
                    break;
                case 3:
                    System.out.print("Enter account number: ");
                    String witAccNum = scanner.nextLine();
                    System.out.print("Enter money to withdraw: ");
                    double witmoney = scanner.nextDouble();
                    myBank.withdrawFromAccount(witAccNum, witmoney);
                    break;
                case 4:
                    myBank.displayAllAccounts();
                    break;
                case 5:
                    System.out.print("Enter account number to remove: ");
                    String remAccNum = scanner.nextLine();
                    myBank.removeAccount(remAccNum);
                    break;
                case 6:
                    System.out.println("Exiting... Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
