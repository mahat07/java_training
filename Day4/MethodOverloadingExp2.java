package com.celcom.day4;

public class MethodOverloadingExp2 {
	
	void addition(int a, int b) {
		System.out.println("Addition of "+a+" and "+b+" is: "+(a+b));
	}
	void addition(double a, double b) {
		System.out.println("Addition of "+a+" and "+b+" is: "+(a+b));
	}
	void addition(long a, long b) {
		System.out.println("Addition of "+a+" and "+b+" is: "+(a+b));
	}

	public static void main(String[] args) {
		MethodOverloadingExp2 obj = new MethodOverloadingExp2();
		obj.addition(10.24, 24.10);
		obj.addition(10, 20);
		obj.addition(20L, 24L);
		
	}

}
