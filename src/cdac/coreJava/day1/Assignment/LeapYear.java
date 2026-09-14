package cdac.coreJava.day1.Assignment;

import java.util.*;

public class LeapYear {
	Scanner sc = new Scanner(System.in);
	
	int year;
	
	public void insertYear() {
		System.out.println("Enter the year: ");
		year = sc.nextInt();
	}
	
	public void checkLeap() {
		if((year%4==0 && year%100!=0) || (year%400==0)) {
			System.out.println(year+ " is a Leap Year");
		}else {
			System.out.println(year+ " is not a Leap Year");
		}
	}
	
	public static void main(String[] args) {
		LeapYear ly = new LeapYear();
		ly.insertYear();
		ly.checkLeap();
	}

}
