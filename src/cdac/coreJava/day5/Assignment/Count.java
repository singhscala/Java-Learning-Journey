package cdac.coreJava.day5.Assignment;

import java.util.Scanner;

public class Count {
    Scanner sc = new Scanner(System.in);
    String x;
    int vowels=0, cons=0;

    public void input(){
        System.out.println("Enter the String");
        x = sc.nextLine();
    }

    public void count(){
        for(int i = 0; i<x.length(); i++){
            char c = x.charAt(i);

            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
                vowels++;
            }else {
                cons++;
            }
        }

        System.out.println("Vowels in String: "+vowels+"\nConsonants in String: "+cons);
    }

    public static void main(String[] args){
        Count c = new Count();
        c.input();
        c.count();
    }
}
