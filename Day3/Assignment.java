package com.celcom.day3;
import java.util.Scanner;
class Shape{
	float r,h;
	int b,l;
	Shape(float r){
		System.out.println("Area of circle: "+3.14*r*r);		
	}
	Shape(float h,int l){
		System.out.println("Area of triangle: "+0.5*l*h);		
	}
	Shape(int l,int b){
		System.out.println("Area of rectangle: "+l*b);
	}
}
class Circle extends Shape{
	Circle(float r){
		super(r);
	}	
}
class Triangle extends Shape{
	Triangle(float h, int l){
		super(h,l);
	}	
}
class Rectangle extends Shape{
	Rectangle(int l, int b){
		super(l,b);
	}	
}

public class Assignment {
	public static void main(String args[]) {
		System.out.println("Enter your choice: 1-circle, 2-triangle, 3-rectangle:");
		Scanner sc =  new Scanner(System.in);
		int input= sc.nextInt();
		if(input ==1 ) {
			System.out.println("Enter radius: ");
			float r = sc.nextFloat();
			Shape obj = new Circle(r);
		}
		else if (input == 2) {
			System.out.println("Enter height: ");
			float h = sc.nextFloat();
			System.out.println("Enter length: ");
			int l = sc.nextInt();
			Shape obj = new Triangle(h,l);
		}
		else if(input == 3) {
			System.out.println("Enter breadth: ");
			int b = sc.nextInt();
			System.out.println("Enter length: ");
			int l = sc.nextInt();
			Shape obj = new Rectangle(l,b);
		}
		
		sc.close();
	}
	

}
