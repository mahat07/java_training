package com.celcom.day2;

import java.util.Scanner;

public class ArrayExampleTwo {
	public static void main(String args[]) {
		int sum=0,evenCount=0,oddCount=0;

		int arr[]= new int[5];
		System.out.println("Initial value of array");
		for(int j=0;j<arr.length;j++) {
			System.out.println(arr[j]);
		}
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter five values: ");
		for(int j=0;j<arr.length;j++) {
			arr[j]= sc.nextInt();
		}
		for(int j=0;j<arr.length;j++) {
			sum+=arr[j];
			if(arr[j]%2==0) {
				evenCount++;
			}
			else {
				oddCount++;
			}
		}
		System.out.println("even count: "+evenCount+"\nOdd count: "+oddCount);
		
		System.out.println("Sum of numbers: "+sum);
		
	}
	
	

}
