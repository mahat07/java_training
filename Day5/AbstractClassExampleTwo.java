package com.celcom.day5;

class V1{
	void a(){
		System.out.println("a");
	}
}

abstract class VehicleTwo extends V1{
	void noOfEngine() {
		System.out.println("I have Engine");
	}	
	abstract void noOfWheels();
	abstract void brandName();	
}

class CarTwo extends VehicleTwo{
	void noOfWheels() {
		System.out.println("Four wheels");
	}
	
	void brandName() {
		System.out.println("Name of brand: Mercedes benz");
	}
}

public class AbstractClassExampleTwo {
	
	public static void main(String args[]) {
		VehicleTwo c = new CarTwo();
		c.brandName();
		c.noOfEngine();
		c.a();

	}

}
