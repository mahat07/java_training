package com.celcom.javalabAssignment2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ArrayListIterationWithStartingIndex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total no of elements: ");
		int n = sc.nextInt();
		List<Object> list = new ArrayList<>();
		System.out.println("Enter elements for the list");
		for (int i = 0; i < n; i++) {
			list.add(sc.next());
		}
		System.out.println("Enter starting position to iterate from: ");
		int k = sc.nextInt();

		// using iterator
		System.out.println("Using iterator for iteration");
		Iterator<Object> it = list.listIterator(k - 1);
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println();
		// Manual Iteration
		System.out.println("And the manual iteration goes like this");
		for (int i = k - 1; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();

		// Sublist method
		System.out.println("And the sublist goes like this");
		List<Object> subList = list.subList(k - 1, list.size()); // 0-based index
		System.out.println("Elements from position " + k + ": " + subList);
	}

}
