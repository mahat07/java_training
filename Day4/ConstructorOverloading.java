package com.celcom.day4;

public class ConstructorOverloading {
	
	ConstructorOverloading(int a, int b) {
		System.out.println("Addition of "+a+" and "+b+" is: "+(a+b));
	}
	ConstructorOverloading(double a, double b) {
		this(5,2);
		System.out.println("Addition of "+a+" and "+b+" is: "+(a+b));
	}
	ConstructorOverloading(long a, long b) {
		this(19.23,20.24);
		System.out.println("Addition of "+a+" and "+b+" is: "+(a+b));
	}

	public static void main(String[] args) {
		ConstructorOverloading obj = new ConstructorOverloading(1,20);
		ConstructorOverloading obj2 = new ConstructorOverloading(10.20,20.30);
		ConstructorOverloading obj3 = new ConstructorOverloading(10L,20L);
		
	}

}
