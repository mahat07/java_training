package com.celcom.javalabassignment;

public class Dog_2 {
	String name, breed;
	Dog_2(String name, String breed){
		this.name = name;
		this.breed = breed;
	}
	void displayDetails() {
		System.out.println("Name of the Dog_2: "+name);
		System.out.println("Breed of the Dog_2: "+breed);
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	public static void main(String args[]) {
		Dog_2 d1 = new Dog_2("Rocky","German sheperd");
		Dog_2 d2 = new Dog_2("Puppy","Pomerian");
		d1.displayDetails();
		d2.displayDetails();
		d1.setBreed("Husky");
		d2.setName("Cutie");
		d1.displayDetails();
		d2.displayDetails();
	}
	

}
