package com.celcom.day4;

class Animal{
	int a=10;
	void move() {
		System.out.println("Cannot define");
	}
}

class Cat extends Animal{
	int a=15;
	int b=10;
	void move() {
		System.out.println("Cat walks");
	}
}

public class DynamicMethodDispatchExp {
	

	public static void main(String[] args) {
		Animal ani = new Cat();
		ani.move();
		System.out.println(ani.a);
		
		

	}

}
