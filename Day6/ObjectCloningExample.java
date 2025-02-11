package com.celcom.day6;

public class ObjectCloningExample implements Cloneable {

	public static void main(String[] args) throws CloneNotSupportedException {

		ObjectCloningExample obj1 = new ObjectCloningExample();
		System.out.println(obj1.hashCode());

		ObjectCloningExample obj2 = (ObjectCloningExample) obj1.clone(); // pointing same object (object assignment)

		System.out.println(obj2.hashCode());

	}
}
