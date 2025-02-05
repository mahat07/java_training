package com.celcom.day2;

class Fruits{
	String color;
	int size;
	int price;
	Fruits(String color,int size,int price){
		this.color=color;
		this.size=size;
		this.price=price;
	}
	void display() {
		System.out.println("Fruit color: "+color);
		System.out.println("Fruit price: "+price);
		System.out.println("Fruit size: "+size);
	}
	
	void setPrice(int price) {
		this.price=price;
	}
}


public class ClassAndObjectEx2 {
	public static void main(String args[]) {
		Fruits apple = new Fruits("Red",10,100);
		apple.display();
		apple.setPrice(250);
		apple.display();
	}

}
