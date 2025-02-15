package com.celcom.day9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {
	public static void main(String args[]) {
		List<Integer> list = new ArrayList<Integer>(); // dmd
		// <Object> also can be used instead of Integer
		// adding generic for a single object
		list.add(10);
		list.add(15);
		list.add(118);
		list.add(56);
		list.add(10);
		System.out.println(list);
		System.out.println(list.get(0));
		list.add(1,23);
		System.out.println(list);
		list.set(1, 150); // modifying value at index = 1
		System.out.println(list);
		list.remove(3); // removes with index value
		System.out.println(list);
		list.remove(new Integer(10)); 
		// convert the integer to object, removes the object
		System.out.println(list);
		System.out.println("Size of list "+list.size());
		System.out.println("Does lsit contain 20 ? "+list.contains(20));
		System.out.println("IS the list empty ? "+list.isEmpty());
		System.out.println("Elements of list - extracting references");
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println("Elements of list - printing objects");
		for(Integer l:list) {
			System.out.println(l);
		}
		Iterator <Integer> ir = list.iterator();
		while(ir.hasNext()) {
			System.out.println(ir.next());
		}
	}
 
}
