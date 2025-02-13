package com.celcom.day8;

public class StringMethodExampleOne {
	public static void main(String args[]) {
		String s1 = "Java";
		System.out.println(s1.length()); //4
		System.out.println(s1.charAt(0)); //a
		
		System.out.println(s1.toLowerCase()); //java
		System.out.println(s1.toUpperCase()); //JAVA
		
		System.out.println(s1.concat(" Programming")); //Java Programming
		System.out.println(s1.replace('a','e'));  //jeve
		
		System.out.println(s1.equals("java")); //false
		System.out.println(s1.equalsIgnoreCase("java")); //true
		
		System.out.println(s1.contains("av")); //true
		System.out.println(s1.startsWith("Ja")); //true
		System.out.println(s1.endsWith("va")); //true
		
		String s2 = "Java world";
		System.out.println(s2.substring(1, 8)); //ava wor
		System.out.println(s2.substring(5)); //world
		
		
	}

}
