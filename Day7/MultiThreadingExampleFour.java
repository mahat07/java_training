package com.celcom.day7;

class MyThread2 implements Runnable{
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName()+" is running..");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}
}

public class MultiThreadingExampleFour {

	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(new MyThread2());
		System.out.println("t1 thead state: " + t1.getState());
		t1.setName("T1");
		
		Thread t2 = new Thread(new MyThread2());
		System.out.println("t2 thead state: " + t2.getState());
		t2.setName("T2");

		// two threads - current one and main one
		t1.start(); //starting or running thread T1
		t2.start();//starting or running thread T2
		

	}

}
