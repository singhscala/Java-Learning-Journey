package cdac.coreJava.day5.Assignment;

import java.util.Scanner;

public class Palindrome {
    Scanner sc = new Scanner(System.in);
    String x, rev="";

    public void input(){
        System.out.println("Enter the String");
        x = sc.nextLine();
    }

    public void palindrome(){
        for(int i=x.length()-1; i>=0; i--){
            rev += x.charAt(i);
        }

        if(rev.equals(x)){
            System.out.println("String is palindrome");
        }else {
            System.out.println("String is not palindrome");
        }
    }

    public static void main(String[] args){
        Palindrome p = new Palindrome();
        p.input();
        p.palindrome();
    }
}
