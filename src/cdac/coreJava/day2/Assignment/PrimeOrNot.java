package cdac.coreJava.day2.Assignment;

import java.util.Scanner;

public class PrimeOrNot {
    Scanner sc = new Scanner(System.in);
    int num = 0;

    public void input(){
        System.out.println("Hi, Enter number: ");
        num = sc.nextInt();
    }

    public void isPrime(){
        if(num < 3 && num > 0){
            System.out.println(num + " is Prime");
            return;
        }
        int i = 2;
        while(i < num / 2){
            if(num % i == 0){
                System.out.println(num + " is NOT Prime");
                return;
            }
            i++;
        }

        System.out.println(num + " is Prime");
    }

    public static void main(String[] args) {
        PrimeOrNot p = new PrimeOrNot();
        p.input();
        p.isPrime();
    }
}
