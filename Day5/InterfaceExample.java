package com.celcom.day5;

interface VehiclePlan{
	void noOfEngine();
	void noOfWheels();
	void brandName();
	}
	
abstract class Vehicle01 implements VehiclePlan{
	public void noOfEngine() {
		System.out.println("ONE engine");
	}
	
}

class Car01 extends Vehicle01{
	public void noOfWheels() {
		System.out.println("Four wheels");
	}
	
	public void brandName() {
		System.out.println("Name of brand: Mercedes benz");
	}
}

public class InterfaceExample {
	public static void main(String args[]) {
		VehiclePlan vec = new Car01();
		vec.noOfWheels();
		vec.noOfEngine();
	}

}
