package com.celcom.day4;

class SuperClass{
	void myMethod() {
		System.out.println("Super class executed");
	}
}

class SubClass extends SuperClass{
	void myMethod() {
		System.out.println("Sub class executed");
	}
}

public class MethodOverridingExp {

	public static void main(String[] args) {
		SubClass obj = new SubClass();
		obj.myMethod();
		SuperClass obj2 = new SubClass();//DMD  
		obj.myMethod();

	}

}
