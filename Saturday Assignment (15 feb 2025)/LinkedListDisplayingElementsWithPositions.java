package com.celcom.javalabAssignment2;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class LinkedListDisplayingElementsWithPositions {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total no of elements: ");
		int n = sc.nextInt();
		List<Object> list = new LinkedList<>();
		System.out.println("Enter elements for the list");
		for(int i=0;i<n;i++) {
			list.add(sc.next());
		}
		//way 1
		System.out.println("Printing linked list elements as values");
		for(int i=0;i<n;i++) {
			System.out.println("Position: " +(i+1)+"Element: "+list.get(i));
		}
		System.out.println();
		//way 2
		System.out.println("Printing linked list elements as objects");
		for(Object i : list) {
			System.out.println("Position: " +(list.indexOf(i)+1)+"Element: "+i);
		}

	}

}
