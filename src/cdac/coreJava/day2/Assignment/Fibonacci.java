package cdac.coreJava.day2.Assignment;

import java.util.Scanner;

public class Fibonacci {
    Scanner sc = new Scanner(System.in);
    int num = 0;

    public void input(){
        System.out.println("Hi, Enter number: ");
        num = sc.nextInt();
    }

    public void fibonacci(){
        int first = 0, second = 1, third, count = 0;
        System.out.print(first + " " + second + " ");
        while(count <= num){
            third = first + second;
            System.out.print(third + " ");
            first = second;
            second = third;
            count++;
        }
    }

    public static void main(String[] args) {
        Fibonacci f = new Fibonacci();
        f.input();
        f.fibonacci();
    }
}
