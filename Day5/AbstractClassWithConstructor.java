package com.celcom.day5;

abstract class Shape01{
	int sides;
	Shape01(int sides){
		this.sides = sides;
		System.out.println("Shape constructor is called..");		
	}
	
	abstract void sides();
}

class Parallellogram extends Shape01{
	Parallellogram(){
		super(4);
	}
	void sides() {
	System.out.println("Parallellogram has four sides");
	}
	
}
public class AbstractClassWithConstructor {
    public static void main(String[] args) {
        Shape01 p = new Parallellogram();
        p.sides();
       
    }
}
