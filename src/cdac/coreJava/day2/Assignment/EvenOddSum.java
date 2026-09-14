package cdac.coreJava.day2.Assignment;

import java.util.Scanner;

public class EvenOddSum {
    Scanner sc = new Scanner(System.in);
    int num = 0;

    public void input(){
        System.out.println("Hi, Enter number: ");
        num = sc.nextInt();
    }

    public void evenOddSum(){
        int sumEven = 0, sumOdd = 0;
        while(num != 0){
            int rem = num % 10;
            if(rem % 2 == 0){
                sumEven = sumEven + rem;
            } else {
                sumOdd = sumOdd + rem;
            }
            num = num / 10;
        }

        System.out.println("Sum of even digits: " + sumEven + "\nSum of odd digits: " + sumOdd);
    }

    public static void main(String[] args) {
        EvenOddSum ev = new EvenOddSum();
        ev.input();
        ev.evenOddSum();
    }
}
