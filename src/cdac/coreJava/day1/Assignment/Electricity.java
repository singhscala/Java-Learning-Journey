package cdac.coreJava.day1.Assignment;

import java.util.*;

public class Electricity {
	
	Scanner sc = new Scanner(System.in);
	int units;
	int bill;

	public void insertUnit() {
		System.out.println("Enter the unit(s): ");
		units = sc.nextInt();
	}
	
	public void calculateUnit() {
		if(units<=100) {
			bill = units*5;
			System.out.println("Total bill: "+ bill);
		}else if(units<=200) {
			bill = units*7;
			System.out.println("Total bill: "+ bill);
		}else {
			bill = units*10;
			System.out.println("Total bill: "+ bill);
		}
	}
	
	public static void main(String[] args) {
		Electricity e = new Electricity();
		e.insertUnit();
		e.calculateUnit();
	}
}
