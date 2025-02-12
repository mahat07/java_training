package com.celcom.day7;

class MyThread extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("My thread is running");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}
}

public class MultiThreadingExampleTwo {

	public static void main(String[] args) {
		MyThread t = new MyThread();
		System.out.println(t);
		System.out.println("Current thead state: " + t.getState());
		t.setName("T1");
		System.out.println("Current thead name: " + t.getName());
		System.out.println("Current thead priority: " + t.getPriority());
		// two threads - current one and main one
		t.start();
		try {
			MyThread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Main End");
	}

}
