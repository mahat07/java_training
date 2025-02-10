package com.celcom.javalabassignment;

public class Rectangle_3 {
	int width, height;
	Rectangle_3(int h, int w){
		this.height = h;
		this.width = w;
	}
	void calculateArea(){
		System.out.println("Area of Rectangle_3 is: "+height*width);		
	}
	void calculatePerimeter(){
		System.out.println("Perimeter of Rectangle_3 is: "+2*(height+width));		
	}

	public static void main(String[] args) {
		Rectangle_3 rect = new Rectangle_3(10,20);
		rect.calculateArea();
		rect.calculatePerimeter();

	}

}
