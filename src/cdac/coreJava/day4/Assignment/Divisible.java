package cdac.coreJava.day4.Assignment;

import java.util.Scanner;

public class Divisible {
    Scanner sc = new Scanner(System.in);
    int i;

    public void input(){
        System.out.println("Enter the number: ");
        i = sc.nextInt();
    }

    public void divisible(){
        if(i % 3 == 0 && i % 5 == 0){
            System.out.println("FizzBuzz");
        }else if(i % 3 == 0 ){
            System.out.println("Fizz");
        }else if(i % 5 == 0){
            System.out.println("Buzz");
        }else{
            System.out.println("None");
        }
    }

    public static void main(String[] args){
        Divisible i = new Divisible();
        i.input();
        i.divisible();
    }
}
