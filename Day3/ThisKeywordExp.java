package com.celcom.day3;

public class ThisKeyWordExp {
String name;
ThisKeyWordExp(){
	this("ABC");
}
ThisKeyWordExp(String name){
	this.name=name;
	this.greet();
}
void greet() {
	System.out.println("Welcome "+name);
}

static public void main(String args[]) {
	ThisKeyWordExp obj = new ThisKeyWordExp();
}

}
