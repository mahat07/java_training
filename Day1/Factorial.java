package com.celcom.day1;
import java.util.Scanner;

public class Factorial {
	public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter number: ");
		int num=sc.nextInt();
		int n=num;
		int res=1;
		while(num>0) {
			res=res*(num);
			num-=1;
		}
		System.out.println("Factorial of "+n+" is: "+res);
		
	}

}
