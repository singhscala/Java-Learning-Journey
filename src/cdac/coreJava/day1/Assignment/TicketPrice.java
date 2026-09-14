1package cdac.coreJava.day1.Assignment;

import java.util.*;

public class TicketPrice {
	Scanner sc = new Scanner(System.in);
	int age;
	
	public void input() {
		System.out.println("Enter age: ");
		age = sc.nextInt();
	}
	
	public void calculatePrice() {
		if(age<5) {
			System.out.println("Free");
		}else if(age<19) {
			System.out.println("100 Rupees");
		}else if(age<61) {
			System.out.println("200 Rupees");
		}else {
			System.out.println("150 Rupees");
		}
	}
	
	public static void main(String[] args) {
		TicketPrice t = new TicketPrice();
		t.input();
		t.calculatePrice();
	}

}
