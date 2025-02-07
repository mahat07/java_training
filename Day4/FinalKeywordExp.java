package com.celcom.day4;

class Animal2{ //super class cannot be final
	String msg = getMsg();
	String getMsg() {  //overriding method cannot be final
		return "a";
	}
}

final class Cat2 extends Animal2{
	final String getMsg() {
		return "b";
	}
}

public class FinalKeywordExp {
	public static void main(String[] args) {
		Animal2 ani = new Cat2();
		System.out.println(ani.msg); //prints b
}

}
