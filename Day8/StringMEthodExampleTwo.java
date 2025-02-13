package com.celcom.day8;

public class StringMEthodExampleTwo {

	public static void main(String[] args) {
		String s1 = "java world";
		for(int i=0;i<s1.length();i++) {
			System.out.println(s1.charAt(i));
		}
		
		// string to character array
		char ch[] = s1.toCharArray();
		for (char c: ch) {
			System.out.println(c);
		}
		
		//splitting string by whitespace
		String s2 = "Welcome to java training";
		String temp[] = s2.split(" ");
		for(String s: temp) {
			System.out.println(s);
		}
		

	}

}
