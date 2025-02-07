package com.celcom.day4;
public class MethodOverloading {
	void myMethod(int a) {
		int f=1;
		for(int i=1;i<a;i++) {
			f=f*i;
		}
		System.out.println("Factorial of "+a+" is: "+f);	
	}
	void myMethod(int a, int b) {
		int sum= a+b;
		System.out.println("Addition: "+sum);
	}
	void myMethod(String name) {
		System.out.println("Welcome "+name);
	}
	public static void main(String[] args) {
		MethodOverloading o= new MethodOverloading();
		o.myMethod("Mahathi");
		o.myMethod(10);
		o.myMethod(6, 7);
	}

}
