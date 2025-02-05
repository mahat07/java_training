package com.celcom.day2;

public class InstanceVsStatic {
	static int a=10;
	int b=10;

	public static void main(String[] args) {
		InstanceVsStatic obj1= new InstanceVsStatic();
		InstanceVsStatic obj2= new InstanceVsStatic();
		//static variable
		System.out.println(obj1.a);//10
		System.out.println(obj2.a);//10
		obj1.a=24;
		System.out.println(obj1.a);//24
		System.out.println(obj2.a);//24
		
		System.out.println(obj1.b);//10
		System.out.println(obj2.b);//10
		obj1.b=24;
		System.out.println(obj1.b);//24
		System.out.println(obj2.b);//10
		

	}

}
