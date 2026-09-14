package cdac.coreJava.day10.Assignment.ExceptionHandling;

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");

        String input = sc.nextLine();

        try {
            int num = 0;
            for (int i = 0; i < input.length(); i++) {
                char ch = input.charAt(i);
                if (ch < '0' || ch > '9') {
                    throw new NumberFormatException();
                }
                num = num * 10 + (ch - '0');
            }
            System.out.println("Integer: " + num);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number");
        }
    }
}