package com.celcom.day8;

public class StringMethodExampleThree {

	public static void main(String[] args) {
		String s1 = "Java";
		s1.concat("world");
		System.out.println(s1); //prints java
		s1=s1.concat(" world");
		System.out.println(s1); //prints java world
	}

}
