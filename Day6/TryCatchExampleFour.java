package com.celcom.day6;

public class TryCatchExampleFour {

	public static void main(String[] args) {
		System.out.println("Before exception");
		try {
			int a = 10 / 0;
		} catch (ArithmeticException e) {
			System.out.println(e);
			try {
				int a = Integer.parseInt("L");
			} catch (NumberFormatException e1) {
				System.out.println(e1);
			}
		}
		System.out.println("After exception");
	}

}
