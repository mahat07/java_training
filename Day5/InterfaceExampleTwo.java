package com.celcom.day5;


interface VehiclePlanOne{
	void noOfEngine();
	void noOfWheels();
	void brandName();
}

interface VehiclePlanTwo{
	void noOfEngine();
	void noOfWheels();
	void brandName();
	}
	


abstract class Vehicle02 implements VehiclePlanOne, VehiclePlanTwo{
	public void noOfEngine() {
		System.out.println("ONE engine");
	}
	
}

class Car02 extends Vehicle02{
	public void noOfWheels() {
		System.out.println("Four wheels");
	}
	
	public void brandName() {
		System.out.println("Name of brand: Mercedes benz");
	}
}

public class InterfaceExampleTwo {
	public static void main(String args[]) {
		VehiclePlanOne vec = new Car02();
		vec.noOfWheels();
		vec.noOfEngine();
	}

}

