package com.celcom.day6;

public class ObjectAssignmentExample {

	public static void main(String[] args) {

		ObjectAssignmentExample obj1 = new ObjectAssignmentExample();
		System.out.println(obj1.hashCode());

		ObjectAssignmentExample obj2 = obj1; // pointing same object (object assignment)

		System.out.println(obj2.hashCode());

	}

}
