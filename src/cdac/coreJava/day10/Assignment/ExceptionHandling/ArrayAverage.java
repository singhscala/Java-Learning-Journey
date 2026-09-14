package cdac.coreJava.day10.Assignment.ExceptionHandling;

import java.util.*;

public class ArrayAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter array size:");
            int n = sc.nextInt();

            if (n <= 0) {
                System.out.println("Invalid size");
                return;
            }

            int[] arr = new int[n];
            System.out.println("Enter " + n + " integers:");

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int sum = 0;
            for (int num : arr) {
                sum += num;
            }

            double avg = (double) sum / n;
            System.out.println("Average: " + avg);

        } catch (InputMismatchException e) {
            System.out.println("Invalid input");
        }
    }
}