package com.celcom.javalabassignment;

class Animal{
	void makeSound() {
		System.out.println("Animals make sounds..");
	}
}
class Cat extends Animal{
	void makeSound() {
		System.out.println("Cats Bark..");
	}
}
public class Overriding_8 {
	public static void main(String args[]) {
		 Animal c = new Cat();
		 c.makeSound();		
	}
	

}
