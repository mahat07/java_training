package com.celcom.day2;

import java.util.Arrays;

public class ArrraySortingExample {

	public static void main(String[] args) {
		int arr[] = {8,2,5,3,9,4};
		Arrays.sort(arr);
		System.out.println("Sorted Array: ");
		for(int j=0;j<arr.length;j++) {
			System.out.print(arr[j]+" ");
		}
		System.out.println("\nMinimum Value: "+arr[0]);
		System.out.println("Second Minimum Value: "+arr[1]);
		System.out.println("Maxmimum Value: "+arr[arr.length-1]);
		System.out.println("Second Maxmimum Value: "+arr[arr.length-2]);
		System.out.println("Descending Order: ");
		for(int j=arr.length-1;j>0;j--) {
			System.out.print(arr[j]+" ");
		}

	}

}
