package com.celcom.day7;

interface Calci{
	int calc(int a, int b);
}

public class calculatorExample {

	public static void main(String[] args) {
		Calci c = (a,b) -> a+b;
		System.out.println(c.calc(10,20));
		
		c = (a,b) -> a-b;
		System.out.println(c.calc(4, 3));

	}

}
