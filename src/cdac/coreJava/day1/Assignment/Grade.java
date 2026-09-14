package cdac.coreJava.day1.Assignment;

import java.util.*;

public class Grade {

	Scanner sc = new Scanner(System.in);
	int marks;
	
	public void inputMark() {
		System.out.println("Enter the mark: ");
		marks = sc.nextInt();
	}
	
	public void checkGrade() {
		if(marks>=90) {
			System.out.println("Grade A");
		}else if(marks>=75) {
			System.out.println("Grade B");
		}else if(marks>=50) {
			System.out.println("Grade C");
		}else {
			System.out.println("fail");
		}
	}
	
	public static void main(String[] args) {
		Grade g = new Grade();
		g.inputMark();
		g.checkGrade();
	}
}
