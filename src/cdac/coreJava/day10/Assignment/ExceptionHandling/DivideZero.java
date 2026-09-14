package cdac.coreJava.day10.Assignment.ExceptionHandling;

import java.util.Scanner;

public class DivideZero {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the first number: ");
        int b = sc.nextInt();

        try{
            int c = a/b;
            System.out.println(c);
        }catch (ArithmeticException e){
            e.printStackTrace();
            System.out.println("Division by zero is not allowed");
        }
    }
}
