package com.celcom.javalabassignment;
import java.util.HashMap;
import java.util.Map;

class Account{
	String accountHolder;
	long accountNumber;
	double balance;
	
	 public String getAccountHolder() {
	        return accountHolder;
	    }

	    public long getAccountNumber() {
	        return accountNumber;
	    }

	    public double getBalance() {
	        return balance;
	    }
	
	Account(String accountHolder, long accountNumber, double balance) {
		this.accountHolder = accountHolder;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	void deposit(double amount) {
		if(amount>0) {
			balance+=amount;
		}
		else {
			System.out.println("Invalid number");
		}
	}
	
	void withdraw(double amount) {
		if(amount>0) {
			if(balance>amount) {
			balance+=amount;
			}
			else {
				System.out.println("Insufficient funds");
			}
		}
		else {
			System.out.println("Invalid number");
		}
	}
	
	void displayAccountDetails() {
		System.out.println("Account holder: "+accountHolder);
		System.out.println("Account number: "+accountNumber);
		System.out.println("Available balance: "+balance);
		}
	
}


class Bank{
	private Map<Long,Account> accounts; //to store bank accounts
	Bank(){
		accounts = new HashMap<>();
	}
	void addAccount(Account account) {
		accounts.put(account.getAccountNumber(),account);
		System.out.println("Account added for " + account.getAccountHolder()+"\n");
	}
	
	void removeAccount(long accountNumber) {
		if (accounts.containsKey(accountNumber)) 
		{
		accounts.remove(accountNumber);
		System.out.println("Account removed: " + accountNumber+"\n");
		}
		else {
			System.out.println("Account not found");
		}	
	}
	Account getAccount(long accountNumber) {
		return accounts.get(accountNumber);		
	}
	
		public void displayAllAccounts() {
			if (accounts.isEmpty()) {
	            System.out.println("No accounts available.");
	        } else {
	            for (Account account : accounts.values()) {
	                account.displayAccountDetails();
	                System.out.println("----------------------------");
	            }			
		}
		
		
	}
	
	
	
}
class BankingSystem_7 {

	public static void main(String[] args) {
		Bank bank = new Bank();
		
		Account a1 = new Account("M",19283043403284L,5000);
		Account a2 = new Account("N",20284043403284L,6000);
		Account a3 = new Account("O",21285043403284L,10000);
		
		bank.addAccount(a1);
		bank.addAccount(a2);
		bank.addAccount(a3);
		
		bank.displayAllAccounts();	
		
		bank.removeAccount(21285043403284L);
		
		bank.displayAllAccounts();
		
	}

}
