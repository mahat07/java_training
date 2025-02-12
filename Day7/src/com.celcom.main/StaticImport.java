package com.celcom.main;

import com.celcom.package1.MyClass1;
import com.celcom.package2.MyClass2;

//normal import
import java.lang.Math;
//static import
import static java.lang.Math.PI;
import static java.lang.Integer.*;
import static java.lang.System.out;

public class StaticImport {

	public static void main(String[] args) {
		MyClass1 obj1 = new MyClass1();
		obj1.myMethod1();
		obj1.myMethod2();
		
		MyClass2 obj2 = new MyClass2();
		obj2.myMethod3();
		System.out.println(Math.PI);
		System.out.println(PI);
		System.out.println("hi");
	}

}
