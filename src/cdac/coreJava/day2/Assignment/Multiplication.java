package cdac.coreJava.day2.Assignment;

import java.util.Scanner;

public class Multiplication {

    Scanner sc  = new Scanner(System.in);
    int x;

    public void input(){
        System.out.println("Enter the number: should be positive:");
        x = sc.nextInt();
    }

    public void table(){
        for(int i = 1; i<=10; i++){
            int y = x*i;
            System.out.println(x+ " * "+i+" = "+y);
        }
    }

    public static void main(String[] args){
        Multiplication m = new Multiplication();
        m.input();
        m.table();
    }
}
