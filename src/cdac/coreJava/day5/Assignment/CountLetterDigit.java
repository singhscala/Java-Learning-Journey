package cdac.coreJava.day5.Assignment;

import java.util.Scanner;

public class CountLetterDigit {
    Scanner sc = new Scanner(System.in);
    String x;
    int letter = 0, digit = 0, special = 0;

    public void input(){
        System.out.println("Enter the String");
        x = sc.nextLine();
    }

    public void count(){
        for (int i = 0; i<x.length(); i++){
            char ch = x.charAt(i);
            if(Character.isLetter(ch)){
                letter++;
            }else if (Character.isDigit(ch)) {
                digit++;
            }else{
                special++;
            }
        }
        System.out.println("Letters are: "+letter+"\nDigits are: "+digit+"\nSpecials are: "+special);
    }

    public static void main(String[] args){
        CountLetterDigit c = new CountLetterDigit();
        c.input();
        c.count();
    }
}
