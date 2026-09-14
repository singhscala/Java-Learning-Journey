package cdac.coreJava.day1.Assignment;

import java.util.Scanner;

public class ATM {

    Scanner sc = new Scanner(System.in);

    int enteredPin;
    int balance;
    int withdraw;

    static int actualPin = 1234;

    public void insert() {
        System.out.println("Enter PIN:");
        enteredPin = sc.nextInt();

        System.out.println("Enter Balance:");
        balance = sc.nextInt();

        System.out.println("Enter Withdrawal Amount:");
        withdraw = sc.nextInt();
    }

    public void check() {

        if (enteredPin != actualPin) {
            System.out.println("Invalid PIN");
        }
        else if (withdraw > balance) {
            System.out.println("Insufficient balance");
        }
        else if ((balance - withdraw) < 1000) {
            System.out.println("Minimum balance of ₹1000 must be maintained");
        }
        else {
            balance = balance - withdraw;
            System.out.println("Withdrawal successful");
            System.out.println("Remaining balance: ₹" + balance);
        }
    }

    public static void main(String[] args) {
        ATM a = new ATM();
        a.insert();
        a.check();
    }
}