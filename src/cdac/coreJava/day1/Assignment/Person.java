package cdac.coreJava.day1.Assignment;

import java.util.*;

public class Person {
	
	Scanner sc = new Scanner(System.in);
	int age;
	
	public void inputAge() {
		System.out.println("Enter the age: ");
		age = sc.nextInt();
	}
	
	public void checkVote() {
		if(age>=18) {
			System.out.println("Eligible to Vote");
		}else {
			System.out.println("Not Eligible to Vote");
		}
	}
	
	public static void main(String[] args) {
		Person p = new Person();
		p.inputAge();
		p.checkVote();
	}
}
