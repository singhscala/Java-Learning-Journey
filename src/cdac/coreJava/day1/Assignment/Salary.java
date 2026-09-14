package cdac.coreJava.day1.Assignment;

import java.util.*;

public class Salary {
 
	Scanner sc = new Scanner(System.in);
	int year, salary, discount;
	
	public void input() {
		System.out.println("Enter the year of experience: ");
		year = sc.nextInt();
		System.out.println("Enter your salary: ");
		salary = sc.nextInt();
	}
	
	public void calculateSalary() {
		if(year<2) {
			System.out.println("No bonus");
		}else if(year<6) {
			discount = (10*salary)/100;
			salary = salary + discount;
			System.out.println(salary+ " after 10% bonus");
		}else {
			discount = (20*salary)/100;
			salary = salary + discount;
			System.out.println(salary+ " after 20% bonus");
		}
	}
	
	public static void main(String[] args) {
		Salary s = new Salary();
		s.input();
		s.calculateSalary();
	}
}
