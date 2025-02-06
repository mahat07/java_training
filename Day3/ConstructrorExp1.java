package com.celcom.day3;

public class ConstructrorExp1 {
	ConstructrorExp1(){
		this(10);
		System.out.println("Third line in execution");	
	}
	ConstructrorExp1(String name){
		System.out.println("First line in execution");
	}
	ConstructrorExp1(int a){
		this("John");
		System.out.println("Second line in execution");
	}

	public static void main(String[] args) {
		ConstructrorExp1 abc = new ConstructrorExp1();

	}

}
