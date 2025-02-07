package com.celcom.day4;

class Animal1{
	String msg = getMsg();
	String getMsg() {
		return "a";
	}
}

class Cat1 extends Animal1{
	String getMsg() {
		return "b";
	}
}

public class DynamicMethodDispatchExp2 {
	

	public static void main(String[] args) {
		Animal1 ani = new Cat1();
		System.out.println(ani.msg); //prints b
		
		

	}

}
