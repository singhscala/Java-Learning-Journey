package cdac.coreJava.day2.Assignment;

import java.util.Scanner;

public class StrictCheck {
    Scanner sc = new Scanner(System.in);

    public void check(){
        System.out.println("Enter the first number");
        float num1 = sc.nextFloat();
        System.out.println("Enter the second number");
        float num2 = sc.nextFloat();

        if(num1 > 0 && num1 < 1 && num2 > 0 && num2 < 1){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }

    public static void main(String[] args){
        StrictCheck s = new StrictCheck();
        s.check();
    }
}
