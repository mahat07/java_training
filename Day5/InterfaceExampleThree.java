package com.celcom.day5;

interface VehiclePlanThree{
	void noOfEngine();
	void noOfWheels();
	void brandName();
	}


class Car03 implements VehiclePlanThree{
	public void noOfEngine() {
		System.out.println("I have one engine");
	}
	public void noOfWheels() {
		System.out.println("Four wheels");
	}
	
	public void brandName() {
		System.out.println("Name of brand: Mercedes benz");
	}
}

public class InterfaceExampleThree {
	public static void main(String args[]) {
		VehiclePlanThree vec = new Car03();
		vec.noOfWheels();
		vec.noOfEngine();
	}

}
