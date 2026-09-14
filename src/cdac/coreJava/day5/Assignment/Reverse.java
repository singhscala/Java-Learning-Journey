package cdac.coreJava.day5.Assignment;

import java.util.Scanner;

public class Reverse {
    Scanner sc = new Scanner(System.in);
    String x, rev="";

    public void input(){
        System.out.println("Enter the String");
        x = sc.nextLine();
    }

    public void reverse(){
        for(int i=x.length()-1; i>=0; i--){
            rev += x.charAt(i);
        }

        System.out.println("Reverse String: "+rev);
    }

    public static void main(String[] args){
        Reverse r = new Reverse();
        r.input();
        r.reverse();
    }
}
