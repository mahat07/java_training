package com.celcom.day8;

public class StringBufferExample {
	public static void main(String[] args) {
		String s1 = "Java";
		s1.concat("world");
		System.out.println(s1); // prints java
		
		StringBuffer sb = new StringBuffer("Java");
		sb.append(" world");
		System.out.println(sb); // prints java world
		System.out.println(sb.capacity());
		
		StringBuilder sb1 = new StringBuilder("Java");
		sb.append(" world");
		System.out.println(sb1); // prints java world
	}
}
