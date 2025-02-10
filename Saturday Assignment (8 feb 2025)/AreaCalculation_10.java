package com.celcom.javalabassignment;
import java.util.Scanner;

class Shape {
    void getArea() {
        System.out.println("Prints area of shape");
    }
}

class Rectangle extends Shape {
    int length;
    int breadth;

    Rectangle(int l, int b) {
        this.length = l;
        this.breadth = b;
    }

    void getArea() {
        System.out.println("Area of rectangle: " + (length * breadth));
    }
}

public class AreaCalculation_10 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter length of rectangle: ");
        int l = sc.nextInt();

        System.out.print("Enter breadth of rectangle: ");
        int b = sc.nextInt();

        Shape s = new Rectangle(l, b); // 
        s.getArea(); // 
        
        sc.close(); // 
    }
}
