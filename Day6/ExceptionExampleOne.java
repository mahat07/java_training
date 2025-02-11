package com.celcom.day6;

public class ExceptionExampleOne {
	public static void main(String args[]) {
		System.out.println("Before exception");
		//int a= 10/0; //java.lang.ArithmeticException
		//int[] arr = new int[-5]; //java.lang.NegativeArraySizeException
		int[] arr2= {1,2,3};  
		// System.out.println(arr2[5]);  //  java.lang.ArrayIndexOutOfBoundsException
		// int b = Integer.parseInt("ABC"); //java.lang.NumberFormatException
		// ExceptionExampleOne j = (ExceptionExampleOne)new Object();  //java.lang.ClassCastException
		System.out.println("After exception");
	}

}
