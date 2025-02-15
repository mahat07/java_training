package com.celcom.javalabAssignment2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SearchingElementInArrayList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total no of elements: ");
		int n = sc.nextInt();
		List<Object> list = new ArrayList<>();
		System.out.println("Enter elements for the list");
		for(int i=0;i<n;i++) {
			list.add(sc.next());
		}
		System.out.println("Enter an element to search:");
		String k = sc.next();
		int flag =1;
		for(Object i : list) {
			if(k.equals(i)) {
				System.out.println("Found the element");
				System.out.println("index of the element: "+list.indexOf(i));
				flag=0;
			}
		}
		if(flag == 1) {
			System.out.println("Element not found try again!");
		}
		

	}

}
