package com.celcom.day7;

public class PrintingTables {

	public static void main(String[] args) {
	
			Runnable r1 = () -> {
				for (int i = 1; i <= 10; i++) {
					System.out.println("2 * "+i+" = "+(i*2));
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

			};
			Thread t1 = new Thread(r1);
			t1.start();
			
			Runnable r2 = () -> {
				for (int i = 1; i <= 10; i++) {
					System.out.println("5 * "+i+" = "+(i*5));
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

			};
			Thread t2 = new Thread(r2);
			t2.start();

	}

}
