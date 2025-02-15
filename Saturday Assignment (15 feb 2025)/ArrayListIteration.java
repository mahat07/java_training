package com.celcom.javalabAssignment2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ArrayListIteration {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total no of elements: ");
		int n = sc.nextInt();
		List<Object> list = new ArrayList<>();
		System.out.println("Enter elements for the list");
		for(int i=0;i<n;i++) {
			list.add(sc.next());
		}
		// using iterator
				System.out.println("Using iterator for iteration");
				Iterator<Object> it = list.listIterator(0);
				while (it.hasNext()) {
					System.out.print(it.next() + " ");
				}
				System.out.println();
		//Manual iteration - iterating references
		System.out.println("Iterating through references");
		for(int i=0;i<n;i++) {
			System.out.println(list.get(i));
		}
		//Manual iteration - iterating through objects
		System.out.println("Iterating through objects");
		for(Object i : list) {
			System.out.println(i);
		}
	}

}
