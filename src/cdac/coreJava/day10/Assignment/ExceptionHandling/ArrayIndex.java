package cdac.coreJava.day10.Assignment.ExceptionHandling;

import java.util.Scanner;

public class ArrayIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length: ");
        int N = sc.nextInt();
        int[] arr = new int[N];
        System.out.println("Enter value");
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the index: ");
        int K = sc.nextInt();
        try {
            System.out.println(arr[K]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of bounds");
        }
    }
}