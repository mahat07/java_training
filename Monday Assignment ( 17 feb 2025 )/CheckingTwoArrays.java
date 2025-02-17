package com.celcom.MondayAssignment;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class CheckingTwoArrays {

	public static void main(String[] args) {
		List<Object> alist1 = new ArrayList<>();
		List<Object> alist2 = new ArrayList<>();
		Set<Object> set1 = new HashSet<>();
		int c = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total no of elements for first array list: ");
		int n = sc.nextInt();
		System.out.println("Enter elements: ");
		for (int i = 0; i < n; i++) {
			alist1.add(sc.next());
		}
		System.out.println("Enter total no of elements for second array list: ");
		int m = sc.nextInt();
		System.out.println("Enter elements: ");
		for (int i = 0; i < m; i++) {
			String k = sc.next();
			alist2.add(k);
			for (Object l : alist1) {
				if (l.equals(k)) {
					set1.add(k);
					c++;
				}
			}

		}
		System.out.println("Total no of elements repeated: "+set1.size());
		System.out.println("Repeated elements are: "+set1);
		System.out.println("No of times repetetion happened: "+c);

	}

}
