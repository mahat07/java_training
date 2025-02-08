package com.celcom.javalabassignment;

public class Circle_4 {
	double radius;
	
	Circle_4(double radius){
		this.radius = radius;		
	}
	
	void getRadius() {
		System.out.println("Radius of Circle_4: "+radius);
	}
	
	void setRadius(double radius) {
		this.radius = radius;
	}
	
	void printArea() {
		System.out.println("Area of Circle_4: "+3.14*radius*radius);
	}
	
	void printCircumference() {
		System.out.println("Circumference of Circle_4: "+2*3.14*radius);
	}
	
	public static void main(String args[]) {
		Circle_4 c = new Circle_4(5.78);
		c.getRadius();
		c.printArea();
		c.printCircumference();
		c.setRadius(6.75);
		c.getRadius();
		c.printArea();
		c.printCircumference();
		
	}

}
