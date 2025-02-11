package com.celcom.day6;
import java.util.Scanner;

class InvalidAgeException extends Exception{
	@Override
	public String toString() {
		return "Invalid age to vote";
	}
}

public class UserDefinedException {
	public static void main(String[] args) {
		System.out.println("Enter age: ");
		int age = new Scanner(System.in).nextInt();
		
		if (age>17) {
			System.out.println("Welcome to vote!");
		}
		else {
			try {
				throw new InvalidAgeException();
			}
			catch(InvalidAgeException e) {
				System.out.println(e);
			}
		}
	}

}
