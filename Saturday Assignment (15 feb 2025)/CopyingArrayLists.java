package com.celcom.javalabAssignment2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CopyingArrayLists {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total no of elements: ");
		int n = sc.nextInt();
		List<Object> list = new ArrayList<>();
		System.out.println("Enter elements for the list");
		for(int i=0;i<n;i++) {
			list.add(sc.next());
		}
		//copying using constructor
		List<Object> firstCopy = new ArrayList<>(list);
		//using addAll() method
		List<Object> secondCopy = new ArrayList<>();
		secondCopy.addAll(list);
		//Manual copying
		List<Object> thirdCopy = new ArrayList<>();
		for (Object num : list) {
		    thirdCopy.add(num);
		}
		
		System.out.println("First copy (using constructor): "+firstCopy);
		System.out.println("Second copy (using addAll() method): "+secondCopy);
		System.out.println("Third copy (Manual copying): "+thirdCopy);
		



		

	}

}
