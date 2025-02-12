package com.celcom.day7;

public class InnerClassExample {

	// 1.Non Static Inner Class
	class InnerClass1 {
		void myMethod1() {
			System.out.println("Non static inner class");
		}
	}

	// 2.Static Inner Class
	static class InnerClass2 {
		void myMethod2() {
			System.out.println("static inner class");
		}
	}

	void myLocalClassMethod() {
		// 3.Local Inner Class
		class InnerClass3 {
			void myMethod3() {
				System.out.println("Local inner class");
			}
		}
		InnerClass3 inner3 = new InnerClass3();
		inner3.myMethod3();
	}

	public static void main(String[] args) {
		InnerClassExample obj = new InnerClassExample();
		// creating non static inner class
		InnerClass1 inner1 = obj.new InnerClass1();
		// creating static inner class
		InnerClassExample.InnerClass2 inner2 = new InnerClassExample.InnerClass2();
		inner2.myMethod2();

	}

}
