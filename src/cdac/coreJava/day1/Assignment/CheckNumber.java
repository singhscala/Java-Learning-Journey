package cdac.coreJava.day1.Assignment;

import java.util.*;

public class CheckNumber {
	
	Scanner sc = new Scanner(System.in);
	int number;
	
	public void insertNumber() {
		System.out.println("Insert number: ");
		number = sc.nextInt();
	}
	
	public void check() {
		if(number%2==0) {
			System.out.println(number+ " is even");
		}else {
			System.out.println(number+ " is odd");
		}
	}
	
	public static void main(String[] args) {
		CheckNumber cn = new CheckNumber();
		cn.insertNumber();
		cn.check();
		CheckNumber cn1 = new CheckNumber();
		cn1.insertNumber();
		cn1.check();
	}
}
