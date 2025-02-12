package com.celcom.day7;

class FourTable extends Thread {
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("4 * " + i + " = " + (4 * i));
		}
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {

		}
	}
}

class FiveTable implements Runnable {
	public synchronized void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("5 * " + i + " = " + (5 * i));
		}
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {

		}
	}
}

public class MultiThreadingWithTwoThreadClasses {
	public static void main(String args[]) throws InterruptedException {
		FourTable four = new FourTable();
		Thread five = new Thread(new FiveTable());

		four.start();

		four.join(); // suspending main thread until completion of two
		System.out.println(five.getState());
		five.start();
	}

}
