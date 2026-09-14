package cdac.coreJava.day2.Assignment;

import java.util.Scanner;

public class ArmstrongNumber {
    Scanner sc = new Scanner(System.in);
    int num = 0;

    public void input(){
        System.out.println("Hi, Enter number: ");
        num = sc.nextInt();
    }

    public void armstrongNumber(){
        int temp = num,sum = 0, rem = 0, digits = 0;
        while(num != 0){
            digits++;
            num = num / 10;

        }
        System.out.println(digits);

        num = temp;

        while(num != 0){
            rem = num % 10;
            sum = sum + ((int) Math.pow(rem, digits));
            num = num / 10;
        }

        if(temp == sum){
            System.out.println(temp + " is armstrong");
        } else {
            System.out.println(temp + " is not");
        }
    }

    public static void main(String[] args) {
        ArmstrongNumber arms = new ArmstrongNumber();
        arms.input();
        arms.armstrongNumber();
    }
}
