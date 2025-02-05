package com.celcom.day2;

public class TypesOfVariable {
	int b=20; //Instance or object variable
	static int c=30; //Static variable

	public static void main(String[] args) {
		int a=10; //local variable
		System.out.println(a);
		
		TypesOfVariable obj = new TypesOfVariable();
		System.out.println(obj.b);
		System.out.println(TypesOfVariable.c);
		

	}

}
