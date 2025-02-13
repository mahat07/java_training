package com.celcom.day8;

import java.util.Date;

public class CreatingDate {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println("Today's date: "+date); //Today date: Thu Feb 13 14:18:14 IST 2025
		System.out.println("Today's date: "+date.getDate());
		System.out.println("Today's day: "+date.getDay());
		System.out.println("Today's month: "+date.getMonth());
		System.out.println("Today's Year: "+date.getYear());
		System.out.println("Hour: "+date.getHours());
		System.out.println("Minutes: "+date.getMinutes());
		System.out.println("Seconds: "+date.getSeconds());

	}

}
