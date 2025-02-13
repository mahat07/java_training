package com.celcom.day8;
//ways to create string objects
public class CreatingStringObject {

	public static void main(String[] args) {
		String s1 = "Celcom"; //literal
		
		String s2 = new String("Java"); //object
				
		char ch[] = {'H', 'I', 'I', '!'};
		String s3 = new String(ch); //Character array
		
		System.out.println(s1);
		System.out.println(s3);
		System.out.println(s2);
		
		

	}

}
