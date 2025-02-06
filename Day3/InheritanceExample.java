package com.celcom.day3;
class Vehicle{
	void engine() {
		System.out.println("I have one engine");
	}
	void breaks() {
		System.out.println("I have breaks");
	}
}

class Fourwheeler extends Vehicle{
	void wheels() {
		System.out.println("I have four wheels");
	}
}
class Truck extends Fourwheeler{
	void name() {
		System.out.println("My name is mahindra");
	}
}

class Car extends Fourwheeler{
	void name() {
		System.out.println("My name is Maruti suzuki");
	}
	
}

public class InheritanceExample {
	public static void main(String args[]) {
		Car b = new Car();
		b.name();
		b.wheels();
		b.breaks();
		b.engine();
	}
}
