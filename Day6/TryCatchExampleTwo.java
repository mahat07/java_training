package com.celcom.day6;

public class TryCatchExampleTwo {

	public static void main(String[] args) {
		System.out.println("Before exception");
		try {
			int arr[] = new int[-5];
		} catch (ArithmeticException e) {
			System.out.println("A");
		} catch (NumberFormatException e) {
			System.out.println("b");
		} catch (NegativeArraySizeException e) {
			System.out.println("c");
		}
		System.out.println("after exception");
	}

}
