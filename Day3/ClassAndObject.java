package com.celcom.day3;

class Aeroplane{
	static final String COLOR="white";
	int noOfPassengers;
	int noOfCrew;
	
	void displayDetails() {
		System.out.println("Color or the plane: "+COLOR);
		System.out.println("Total no of passengers: "+noOfPassengers);
		System.out.println("Total no of crew: "+noOfCrew);
	}
	void setPassengers(int a) {
		this.noOfPassengers=a;
		
	}
	void setCrew(int a) {
		this.noOfCrew=a;
	}
}
public class ClassAndObject {

	public static void main(String[] args) {
		Aeroplane indigo= new Aeroplane();
		indigo.setPassengers(200);
		indigo.setCrew(15);
		indigo.displayDetails();
	}

}
