package cdac.coreJava.day5.Assignment;

import java.util.Scanner;

public class Convert {
    Scanner sc = new Scanner(System.in);
    String x;

    public void input(){
        System.out.println("Enter the String");
        x = sc.nextLine();
    }

    public void convert(){
        x = x.toUpperCase();
        System.out.println("UpperCase: "+x);
        x = x.toLowerCase();
        System.out.println("LowerCase: "+x);
    }

    public static void main(String[] args){
        Convert c = new Convert();
        c.input();
        c.convert();
    }
}
