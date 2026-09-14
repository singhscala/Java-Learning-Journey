package cdac.coreJava.day1.Assignment;

import java.util.*;

public class CheckResult {

	Scanner sc = new Scanner(System.in);
	int sub1, sub2, sub3;
	
	public void input() {
		System.out.println("Enter the marks: ");
		sub1 = sc.nextInt();
		sub2 = sc.nextInt();
		sub3 = sc.nextInt();
	}
	
	public void checkResult() {
		if(sub1>=35 && sub2>=35 && sub3>=35) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}
	}
	
	public static void main(String[] args) {
		CheckResult c = new CheckResult();
		c.input();
		c.checkResult();
	}
}
