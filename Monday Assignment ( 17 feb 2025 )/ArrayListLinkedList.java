package com.celcom.MondayAssignment;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ArrayListLinkedList {
	public static void main(String args[]) {
		
		//copying from array list to linked list
		List<Object> alist = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total no of elements for array list: ");
		int n = sc.nextInt();
		System.out.println("Enter elements: ");
		for(int i=0;i<n;i++) {
			alist.add(sc.next());
		}
		List<Object> firstCopy = new LinkedList<>(alist);
		System.out.println("Copied Linked list elements are:"+firstCopy);
		
		//copying from linked list to array list
		List<Object> llist = new LinkedList<>();
		System.out.println("Enter total no of elements for linked list: ");
		int num = sc.nextInt();
		System.out.println("Enter elements: ");
		for(int i=0;i<num;i++) {
			llist.add(sc.next());
		}
		List<Object> secondCopy = new ArrayList<>(llist);
		System.out.println("Copied Array list elements are:"+secondCopy);
		
	}

}
