package cdac.coreJava.day1.Assignment;

import java.util.*;

public class LargestNumber {
	
	Scanner sc = new Scanner(System.in);
	int number1, number2;
	
	public void inputNumber() {
		System.out.println("Enter the first number: ");
		number1 = sc.nextInt();
		System.out.println("Enter the second number: ");
		number2 = sc.nextInt();
	}
	
	public void checkLargest() {
		if(number1 > number2) {
			System.out.println(number1+ " is greater than "+number2);
		}else {
			System.out.println(number2+ " is greater than "+number1);
		}
	}
	
	public static void main(String[] args) {
		LargestNumber ln = new LargestNumber();
		ln.inputNumber();
		ln.checkLargest();
	}

}
