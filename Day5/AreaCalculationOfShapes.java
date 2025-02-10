package com.celcom.day5;

import java.util.Scanner;

interface Area {
    void areaCal(); // Interface
}

interface Perimeter{
	void perimeterCal();
}

// Abstract class Shape implementing Area
abstract class Shape implements Area, Perimeter {

    float r, h;
    int b, l;

    Shape(float r) {
        this.r = r;
    }

    Shape(float h, int l) {
        this.h = h;
        this.l = l;
    }

    Shape(int l, int b) {
        this.l = l;
        this.b = b;
    }
}

class Circle extends Shape {
    Circle(float r) {
        super(r);
    }

    public void areaCal() {
        System.out.println("Area of circle: " + (3.14 * r * r));
    }
    
    public void perimeterCal() {
    	System.out.println("Circumference: "+(2*3.14*r));
    }
}

class Triangle extends Shape {
    Triangle(float h, int l) {
        super(h, l);
    }
    public void areaCal() {
        System.out.println("Area of triangle: " + (0.5 * l * h));
    }
    
    public void perimeterCal() {
    	System.out.println("Perimeter of triangle: "+(3*l));
    }
}

class Rectangle extends Shape {
    Rectangle(int l, int b) {
        super(l, b);
    }

    @Override
    public void areaCal() {
        System.out.println("Area of rectangle: " + (l * b));
    }
    
    public void perimeterCal() {
    	System.out.println("Perimeter of rectangle: "+(b+l));
    }
}


public class AreaCalculationOfShapes {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice: 1 - Circle, 2 - Triangle, 3 - Rectangle:");
        int input = sc.nextInt();
        Shape obj = null; 

        switch (input) {
            case 1:
                System.out.println("Enter radius: ");
                float r = sc.nextFloat();
                obj = new Circle(r);
                break;
            case 2:
                System.out.println("Enter height: ");
                float h = sc.nextFloat();
                System.out.println("Enter length: ");
                int l = sc.nextInt();
                obj = new Triangle(h, l);
                break;
            case 3:
                System.out.println("Enter breadth: ");
                int b = sc.nextInt();
                System.out.println("Enter length: ");
                l = sc.nextInt();
                obj = new Rectangle(l, b);
                break;
            default:
                System.out.println("Invalid choice!");
                sc.close();
                return;
        }

        obj.areaCal();
        obj.perimeterCal();
        sc.close();
    }
}
