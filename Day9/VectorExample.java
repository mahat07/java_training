package com.celcom.day9;

import java.util.Enumeration;
import java.util.LinkedList;
import java.util.Vector;

public class VectorExample {
	public static void main(String args[]) {
		Vector<Integer> vec = new Vector<>(3,2);
		System.out.println("Size "+vec.size()); 
		System.out.println("Capacity "+vec.capacity()); //"3" spaces
		vec.add(10);
		vec.add(20);
		vec.add(30);
		System.out.println("Size "+vec.size()); 
		System.out.println("Capacity "+vec.capacity());
		vec.add(45);
		vec.add(67);
		vec.add(89);
		System.out.println("Size "+vec.size()); 
		System.out.println("Capacity "+vec.capacity());
		
		
		//way 1:
		System.out.println("regular Traversal");
		for(int i=0;i<vec.size();i++) {
			System.out.print(vec.get(i)+" ");
		}
		System.out.println();
		
		//way 2:
		System.out.println("Objects traversal");
		for (Integer i: vec) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		//way 3: enumeration
		System.out.println("Traversal using enumeration");
		Enumeration <Integer> e = vec.elements();
		while(e.hasMoreElements()) {
			System.out.print(e.nextElement()+" ");
		}
		
	}

}
