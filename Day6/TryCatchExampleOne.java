package com.celcom.day6;

public class TryCatchExampleOne {
	public static void main(String[] args) {
		System.out.println("Before exception");
		try {
			int a = 10 / 0;
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
		System.out.println("After exception");

	}
}
