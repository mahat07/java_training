package com.celcom.day1;

import java.util.Scanner;

public class FactorialTable {
	public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter number: ");
		int num=sc.nextInt();
		int n=num;
		
		while(n>0) {
		num=n;
		int res=1;
		while(num>0) {
			res=res*(num);
			num-=1;
		}
		n-=1;
		System.out.println("Factorial of "+(n+1)+" is: "+res);
		}
		
	}


}
