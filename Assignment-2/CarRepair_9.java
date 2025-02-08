package com.celcom.javalabassignment;
import java.util.Scanner;

class Vehicle{
	boolean engineCondition;
	void drive() {
		System.out.println("Driving vehicle..");
	}
}
class Car extends Vehicle{
	void drive() {
		if (engineCondition) {
			System.out.println("Car is ready for a drive!");
		}
		else {
			System.out.println("Car should be repaired..");
			System.out.println("Repairing the car..");
			engineCondition=true;
			drive();
		}
	}
}
public class CarRepair_9 {
	public static void main(String args[]) {
		Vehicle v = new Car();
		Scanner sc = new Scanner(System.in);
		System.out.println("Press One if car engine is good\nPress Zero it is not good: ");
		int n= sc.nextInt();
		if(n==1) {
			v.engineCondition=true;
		}
		v.drive();
	}

}
