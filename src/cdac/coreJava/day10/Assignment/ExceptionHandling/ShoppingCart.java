package cdac.coreJava.day10.Assignment.ExceptionHandling;

import java.util.Scanner;

class InvalidQuantityException extends Exception {
    String message;
    InvalidQuantityException(String msg) {
        message = msg;
    }
    public String getMessage() {
        return message;
    }
}

class InvalidPriceException extends Exception {
    String message;
    InvalidPriceException(String msg) {
        message = msg;
    }
    public String getMessage() {
        return message;
    }
}

public class ShoppingCart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double totalBill = 0;

        System.out.println("Enter number of products:");
        int n = sc.nextInt();

        try {
            for (int i = 1; i <= n; i++) {
                System.out.println("Enter price of product " + i + ":");
                double price = sc.nextDouble();
                if (price <= 0) {
                    throw new InvalidPriceException("Price must be greater than 0");
                }

                System.out.println("Enter quantity of product " + i + ":");
                int quantity = sc.nextInt();
                if (quantity <= 0) {
                    throw new InvalidQuantityException("Quantity must be greater than 0");
                }

                totalBill += price * quantity;
            }

            if (totalBill > 5000) {
                System.out.println("Discount applied: 10%");
                totalBill = totalBill * 90 / 100;
            }

            System.out.println("Total bill: " + totalBill);

        } catch (InvalidPriceException | InvalidQuantityException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}