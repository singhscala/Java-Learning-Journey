package cdac.coreJava.day5.Assignment;

import java.util.Scanner;

public class ReplaceVowels {
    Scanner sc = new Scanner(System.in);
    String x;

    public void input(){
        System.out.println("Enter the String");
        x = sc.nextLine();
    }

    public void replace(){
        x = x.replaceAll("[AEIOUaeiou]", "*");
        System.out.println("After replacing all vowels: "+x);
    }

    public static void main(String[] args){
        ReplaceVowels r = new ReplaceVowels();
        r.input();
        r.replace();
    }
}
