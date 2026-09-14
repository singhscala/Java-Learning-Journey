package cdac.coreJava.day5.Assignment;

import java.util.Scanner;

public class PrintString {
    Scanner sc = new Scanner(System.in);
    String x;

    public void input(){
        System.out.println("Enter the String");
        x = sc.nextLine();
    }

    public void display(){
        System.out.println("The String is: "+x);
    }

    public static void main(String[] args){
        PrintString p = new PrintString();
        p.input();
        p.display();
    }
}
