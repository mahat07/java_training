package com.celcom.day4;

public class MethodOverloadingExp3 {
	void concat(String a, String b) {
		System.out.println("Concatenated result: "+a+b);
	}
	void concat(int a, int b) {
		String s_a = Integer.toString(a);
		String s_b = Integer.toString(b);
		
		System.out.println("Concatenated result: "+s_a+s_b);
	}
	void concat(float a, float b) {
		String s_a = Float.toString(a);
		String s_b = Float.toString(b);
		
		System.out.println("Concatenated result: "+s_a+s_b);
	}

	public static void main(String[] args) {
		MethodOverloadingExp3 obj = new MethodOverloadingExp3();
		obj.concat(4.0f, 5.43f);
		obj.concat(4, 5);
		obj.concat("Hi", "Hi");

	}

}
