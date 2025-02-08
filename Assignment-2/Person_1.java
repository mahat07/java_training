package com.celcom.javalabassignment;

public class Person_1 {
	
	int age;
	String name;
	
	Person_1(String name, int age){
		this.name = name;
		this.age = age;
	}
	void display() {
		System.out.println("Name: "+name+" Age: "+age);
	}

	public static void main(String[] args) {
		Person_1 p = new Person_1("Mahathi",20);
		Person_1 q = new Person_1("Satvik",16);
		p.display();
		q.display();

	}

}
