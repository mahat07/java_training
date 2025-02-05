package com.celcom.day2;

public class ArrayExampleOne {
	public static void main(String args[]) {

		int arr[]= {50,60,70,80};
		int sum=0;
		System.out.println("Array length: "+arr.length);
		System.out.println("Array elements: ");
		for(int j=0;j<arr.length;j++) {
			sum+=arr[j];
			System.out.println(arr[j]);
		}
		System.out.println("Sum of elements "+sum);
		
		for(int value:arr) {
			System.out.println(value);
		}
	}
	

}
