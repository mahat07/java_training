package com.celcom.day3;

class A{
	A(){
		System.out.println("A");
	}
	A(int t){
		System.out.println("A a");
	}
}
class B extends A{
	B(){
		this(10);
		System.out.println("B");
	}
	B(int t){
		super(10);
		System.out.println("b b");
	}                 
}

public class SuperKeywordExp2 {
	public static void main(String args[]) {
		B b = new B( );
	}

}
