package com.celcom.day7;

import java.util.Scanner;

class SavingsAccount {
	private float money;

	public void getBalance() {
		System.out.println("Total amount in account: " + money);
	}

	public void deposit(float m) {
		this.money += m;
	}

	public void withdraw(float m) {
		if (this.money >= m) {
			this.money -= m;
			System.out.println("Withdrawn successfully");
		} else {
			System.out.println("Insufficient balance");
		}
		getBalance();
	}

}

class Deposit extends Thread {
	SavingsAccount savingsAccount;

	Deposit(SavingsAccount savingsAccount) {
		this.savingsAccount = savingsAccount;
	}

	public void run() {
		synchronized (savingsAccount) {
			System.out.println("Enter money to deposit");
			float m = new Scanner(System.in).nextFloat();
			System.out.println("Depoisiting money into account");
			savingsAccount.deposit(m);
			savingsAccount.getBalance();
			savingsAccount.notifyAll();

		}
	}
}

class Withdraw extends Thread {
	SavingsAccount savingsAccount;

	Withdraw(SavingsAccount savingsAccount) {
		this.savingsAccount = savingsAccount;
	}

	public void run() {
		synchronized (savingsAccount) {
			System.out.println("Withdrawer is waiting for deposit to deposit the money..");
			try {
				savingsAccount.wait(); // waiting for writer
			} catch (InterruptedException e) {
			}
			System.out.println("enter amount to withdraw");
			float m = new Scanner(System.in).nextFloat();
			savingsAccount.withdraw(m);

		}
	}
}

public class BankSavingAccount {

	public static void main(String[] args) throws InterruptedException {
		SavingsAccount sa = new SavingsAccount();
		Withdraw withdraw = new Withdraw(sa);
		withdraw.start();
		Thread.sleep(2000);
		Deposit deposit = new Deposit(sa);
		deposit.start();

	}

}
