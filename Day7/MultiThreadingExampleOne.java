package com.celcom.day7;

public class MultiThreadingExampleOne {

	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		System.out.println(t);
		System.out.println("Current thead name: "+t.getName());
		System.out.println("Current thead priority: "+t.getPriority());
	}

}
