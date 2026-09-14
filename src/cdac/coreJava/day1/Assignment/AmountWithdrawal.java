package cdac.coreJava.day1.Assignment;

import java.util.*;

public class AmountWithdrawal {
	
	Scanner sc = new Scanner(System.in);
	int amount, withdrawal;
	
	public void insertAmount() {
		System.out.println("Enter the amount to deposite: ");
		amount = sc.nextInt();
		System.out.println("Enter the withdrawal amount: ");
		withdrawal = sc.nextInt();
	}
	
	public void checkWithdrawal() {
		if(withdrawal<=amount) {
			System.out.println("Withdrawal is possible");
		}else {
			System.out.println("Unavaiable balance");
		}
	}
	
	public static void main(String[] args) {
		AmountWithdrawal aw = new AmountWithdrawal();
		aw.insertAmount();
		aw.checkWithdrawal();
	}
	
}
