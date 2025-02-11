package com.celcom.day6;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ManuallyThrowingException {
	public static void main(String[] args) {
		try {
			int a = 10 / 0;
		} catch (ArithmeticException e) {
			// throw new ArithmeticException(); // throws exception
			System.out.println("Arithmetic Exception");
		}

	}

}
