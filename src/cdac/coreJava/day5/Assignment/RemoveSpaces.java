package cdac.coreJava.day5.Assignment;

import java.util.Scanner;

public class RemoveSpaces {
    Scanner sc = new Scanner(System.in);
    String x;

    public void input(){
        System.out.println("Enter the String");
        x = sc.nextLine();
    }

    public void remove(){
        x = x.replace(" ", "");
        System.out.println("After the spaces removed: "+x);
    }

    public static void main(String[] args){
        RemoveSpaces r = new RemoveSpaces();
        r.input();
        r.remove();
    }
}
