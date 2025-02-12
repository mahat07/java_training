package com.celcom.day7;

interface MyInterface{
	void display();
}

public class AnonymusInnerClassExample implements MyInterface{ //"Implements myInterface" is also not needed
	//we need a class to implement such type of things
	//this is not needed since anonymous inner class is present
	public void display() {
		System.out.println("Anonymus inner class");
	}

	public static void main(String[] args) {
		AnonymusInnerClassExample obj = new AnonymusInnerClassExample();
		obj.display();
		
		//creating reference for interface, not required of any class to instantiate
		MyInterface obj1 = new MyInterface() {
			public void display() {
				System.out.println("Display");
			}
		};
		
		obj1.display();
		
		//lambda expression 
		MyInterface obj2 = () -> System.out.println("Display from lambda class");
		obj2.display();
	}
	

}
