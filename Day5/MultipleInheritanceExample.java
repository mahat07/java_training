package com.celcom.day5;

interface Interface01{
	int a=10;
}

interface Interface02{
	int b=20;
}

interface Interface03 extends Interface01, Interface02
{
	void addition();
}

class ConcreteClass implements Interface03{
	public void addition() {
		System.out.println(a);
	}
}

public class MultipleInheritanceExample {
	public static void main(String args[]) {
		ConcreteClass c = new ConcreteClass();
		c.addition();
	}

}
