package cdac.coreJava.day1.Assignment;

import java.util.*;

public class Payable {

	Scanner sc = new Scanner(System.in);
	int amount;
	int discount;
	
	public void input() {
		System.out.println("Enter amount: ");
		amount = sc.nextInt();
	}
	
	public void checkDiscount() {
		if(amount>5000) {
			discount = (20*amount)/100;
			amount = amount - discount;
			System.out.println(amount+ " after 20% discount");
		}else if(amount>2000) {
			discount = (10*amount)/100;
			amount = amount - discount;
			System.out.println(amount+ " after 10% discount");
		}else {
			System.out.println(amount+ " after no discount");
		}
	}
	
	public static void main(String[] args) {
		Payable p =new Payable();
		p.input();
		p.checkDiscount();
	}
}
