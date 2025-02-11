package com.celcom.day6;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class UseOfThrowsKeyword {
	static void m1() throws FileNotFoundException {
		FileReader f = new FileReader("ABC.txt");
	}

	public static void main(String[] args) {
		try {
			m1();
		} catch (FileNotFoundException e) {
			//e.printStackTrace(); //prints the exception message...
		}
	}

}
