package com.celcom.day7;

class MyThread1 implements Runnable{
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("My thread is running..");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}
}


public class MultiThreadExampleThree {
	public static void main(String args[]) throws InterruptedException {

		Thread t = new Thread(new MyThread1());
		System.out.println("Current thead state: " + t.getState());
		t.setName("T");
		System.out.println("Current thead name: " + t.getName());
		System.out.println("Current thead priority: " + t.getPriority());
		// two threads - current one and main one
		t.start(); //starting or running thread T
		Thread.sleep(3000);
		System.out.println("Main End");
		
		t.suspend();
		System.out.println(t.getState());
		t.resume();
	}
}
