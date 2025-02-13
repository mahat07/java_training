package com.celcom.day7;

public class ThreadCreationUsingLambdaExpression {

	public static void main(String[] args) {
		Runnable r1 = () -> {
			for (int i = 1; i <= 8; i++) {
				System.out.println("Thread t1 is running");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

		};
		Thread t1 = new Thread(r1);
		t1.start();

	}
}
