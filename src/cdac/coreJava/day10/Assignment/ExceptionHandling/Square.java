package cdac.coreJava.day10.Assignment.ExceptionHandling;

import java.util.*;

public class Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an integer:");

        try {
            int num = sc.nextInt();
            if (num < 0) {
                System.out.println("Negative number");
            } else {
                double sqrt = Math.sqrt(num);
                System.out.println("Square root: " + sqrt);
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input");
        }
    }
}