package cdac.coreJava.day2.Assignment;

import java.util.*;

public class LargestThree {

    Scanner sc = new Scanner(System.in);
    int number1, number2, number3;

    public void inputNumber() {
        System.out.println("Enter the first number: ");
        number1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        number2 = sc.nextInt();
        System.out.println("Enter the third number: ");
        number3 = sc.nextInt();
    }

    public void checkLargest() {
        if(number1 > number2 && number1 > number3) {
            System.out.println(number1+ " is greater than "+number2+" & "+number3);
        }else if(number2 > number3){
            System.out.println(number2+ " is greater than "+number3+" & "+number1);
        }else{
            System.out.println(number3+ " is greater than "+number2+ " & "+number1);
        }
    }

    public static void main(String[] args) {
        LargestThree ln = new LargestThree();
        ln.inputNumber();
        ln.checkLargest();
    }

}
