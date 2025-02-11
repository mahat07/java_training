package com.celcom.day6;
import java.util.Scanner;

class InvalidAgeExceptionTwo extends Exception{
	int a;
	InvalidAgeExceptionTwo(int a){
		this.a = a;
	}
	@Override
	public String toString() {
		return "Invalid age to vote";
	}
}

public class UserDefinedExceptionTwo {
	public static void main(String[] args) {
		System.out.println("Enter age: ");
		int age = new Scanner(System.in).nextInt();
		
		if (age>17) {
			System.out.println("Welcome to vote!");
		}
		else {
			try {
				throw new InvalidAgeExceptionTwo(age);
			}
			catch(InvalidAgeExceptionTwo e) {
				System.out.println(e);
			}
		}
	}

}
