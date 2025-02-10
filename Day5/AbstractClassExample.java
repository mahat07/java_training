package com.celcom.day5;

abstract class Vehicle{
	void noOfEngine() {
		System.out.println("I have Engine");
	}	
	abstract void noOfWheels();
	abstract void brandName();	
}

class Car extends Vehicle{
	void noOfWheels() {
		System.out.println("Four wheels");
	}
	
	void brandName() {
		System.out.println("Name of brand: Mercedes benz");
	}
}

public class AbstractClassExample {
	
	public static void main(String args[]) {
		Vehicle c = new Car();
		c.brandName();
		c.noOfEngine();
	}

}
