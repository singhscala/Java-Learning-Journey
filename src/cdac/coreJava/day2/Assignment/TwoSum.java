package cdac.coreJava.day2.Assignment;

import java.util.Scanner;

public class TwoSum {
    Scanner sc = new Scanner(System.in);
    int num1, num2;
    int sum = 0;

    public void input(){
        System.out.println("Enter the first number:");
        num1 = sc.nextInt();
        System.out.println("Enter the second number:");
        num2 = sc.nextInt();
    }

    public void sum(){
        sum = num1 + num2;
        System.out.println(num1 + " + "+ num2+ " = "+sum);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String operation = "";
        do{
            System.out.println("Do you want to perform sum operation:");
            System.out.println("1. yes");
            System.out.println("2. no");
            operation = sc.next();
            if(operation.equals("yes")){
                TwoSum t = new TwoSum();
                t.input();
                t.sum();
            }
        }while(operation.equals("yes"));
    }
}
