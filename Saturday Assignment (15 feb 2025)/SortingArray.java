package com.celcom.javalabAssignment2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SortingArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total no of elements: ");
		int n = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		System.out.println("Enter elements for the list");
		for(int i=0;i<n;i++) {
			list.add(sc.nextInt());
		}
		//using collections
		Collections.sort(list);
		System.out.println("sorted list using collections: \n"+list);
		//using lambda expressions
		list.sort((a, b) -> b - a);
		System.out.println("Reverse order sorted list using lambda expressions: \n"+list);


	}

}
