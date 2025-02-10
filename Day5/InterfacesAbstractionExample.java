package com.celcom.day5;

interface Animal01{
	void move();
	void eat();
}


abstract class Animals implements Animal01{
	abstract public void move();
	abstract public void eat();
}

class Cats extends Animals{
	public void move() {
		System.out.println("Cats walk");
	}
	public void eat() {
		System.out.println("Cats eat rats");
	}
}

class Sparrow extends Animals{
	public void move() {
		System.out.println("Sparrows fly");
	}
	public void eat() {
		System.out.println("Sparrows eat grains");
	}
}

class Fish extends Animals{
	public void move() {
		System.out.println("Fish swim");
	}
	public void eat() {
		System.out.println("Fish eat sea plants");
	}
}

public class InterfacesAbstractionExample {

	public static void main(String[] args) {
		Animals animals;
		animals = new Cats();
		animals.move();
		animals.eat();
		
		animals = new Fish();
		animals.move();
		animals.eat();
		
		animals = new Sparrow();
		animals.move();
		animals.eat();

	}

}
