package com.celcom.day9;

public class WrapperClassExample {
	public static void main(String[] args) {
		int a = 1;
		Integer obj = new Integer(a);//boxing
		int b = obj.intValue();// unboxing
		
		Integer obj2 = a; //autoboxing
		int c = obj2; //auto unboxing
	}

}
