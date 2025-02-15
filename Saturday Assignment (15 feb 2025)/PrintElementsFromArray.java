package com.celcom.javalabAssignment2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintElementsFromArray {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total no of elements: ");
		int n = sc.nextInt();
		List<Object> list = new ArrayList<>();
		System.out.println("Enter elements for the list");
		for(int i=0;i<n;i++) {
			list.add(sc.next());
		}
		System.out.println("Enter starting position to print: ");
		int k = sc.nextInt();
		System.out.println("Enter Ending position to print: ");
		int l = sc.nextInt();
		
		if(k<=0 || l>list.size() || k>l) {
			System.out.println("Invalid indices..!");
		}
		else {
			System.out.println("Elements in array between "+k+" and "+l+" are:");
			for(int i=k-1;i<l;i++) {
				System.out.println(list.get(i));				
			}
		}
	}
}
