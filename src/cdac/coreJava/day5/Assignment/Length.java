package cdac.coreJava.day5.Assignment;

import java.util.Scanner;

public class Length {
    Scanner sc = new Scanner(System.in);
    String x;
    int count;

    public void input(){
        System.out.println("Enter the String");
        x = sc.nextLine();
    }

    public void length(){
        for(char c: x.toCharArray()){
            count++;
        }

        System.out.println("Length of the String: "+count);
    }

    public static void main(String[] args){
        Length l = new Length();
        l.input();
        l.length();
    }

}
