package cdac.coreJava.day10.Assignment.ExceptionHandling;

import java.util.Scanner;

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

public class Transactions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of transactions: ");
        int N = sc.nextInt();
        sc.nextLine();
        int balance = 0;

        try {
            for (int i = 1; i <= N; i++) {
                System.out.println("Enter transaction type (DEPOSIT / WITHDRAW): ");
                String type = sc.next();
                System.out.println("Enter amount: ");
                int amount = sc.nextInt();

                if (type.equalsIgnoreCase("DEPOSIT")) {
                    balance += amount;
                } else if (type.equalsIgnoreCase("WITHDRAW")) {
                    if (balance - amount < 0) {
                        throw new InsufficientBalanceException("Insufficient balance");
                    }
                    balance -= amount;
                }
            }
            System.out.println("Final balance: " + balance);
        } catch (InsufficientBalanceException e) {
            System.out.println("Transaction Failed");
        }
    }
}