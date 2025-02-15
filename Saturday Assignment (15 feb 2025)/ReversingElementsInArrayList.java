package com.celcom.javalabAssignment2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class ReversingElementsInArrayList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total no of elements: ");
		int n = sc.nextInt();
		List<Object> list = new ArrayList<>();
		System.out.println("Enter elements for the list");
		for(int i=0;i<n;i++) {
			list.add(sc.next());
		}
		
		//Manual reversal using for loop
		List<Object> reversedList1 = new ArrayList<>();
		for (int i = list.size() - 1; i >= 0; i--) {
		    reversedList1.add(list.get(i));
		}
		System.out.println("Reversed Manually"+reversedList1);
		//using stack
		Stack<Object> stack = new Stack<>();
		stack.addAll(list);
		List<Object> reversedList2 = new ArrayList<>();
		while (!stack.isEmpty()) {
		    reversedList2.add(stack.pop());
		}
		System.out.println("Reversed using stack (LIFO)"+reversedList2);
		
		//using collections 
		Collections.reverse(list);
		System.out.println("Reversed using collections: " + list);
		




	}

}
