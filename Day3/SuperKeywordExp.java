package com.celcom.day3;

class VehicleOne{
	String name= "I am a super class variable";
	VehicleOne(){
		System.out.println("Super class constructor..");
	}
	void noOfEngine() {
		System.out.println("One engine");
	}
}

class TwoWheelerOne extends VehicleOne{
	TwoWheelerOne(){
		super();
	}
	
	void wheels() {
		super.noOfEngine();
		System.out.println("I have two wheels");
		System.out.println(super.name);
	}
}

public class SuperKeywordExp {
	public static void main(String args[]) {
		TwoWheelerOne v = new TwoWheelerOne();
		v.wheels();
	}

}
