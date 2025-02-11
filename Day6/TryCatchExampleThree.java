package com.celcom.day6;

public class TryCatchExampleThree {

	public static void main(String[] args) {
		System.out.println("Before exception");
		try {
			int arr[] = new int[-5];
//when exception occurs, try block is skipped, directly related catch block is accessed
			int a = Integer.parseInt("hji");
			System.out.println("Hi");
		} catch (ArithmeticException e) {
			System.out.println("A");
		} catch (NumberFormatException e) {
			System.out.println("b");
		} catch (NegativeArraySizeException e) {
			System.out.println("c");
		} catch (Exception e) {
			System.out.println("D");
		}
		System.out.println("after exception");

	}

}
