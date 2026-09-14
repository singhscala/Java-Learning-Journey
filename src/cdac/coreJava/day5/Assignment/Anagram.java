package cdac.coreJava.day5.Assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    Scanner sc = new Scanner(System.in);
    String x, y;

    public void input(){
        System.out.println("Enter the first String");
        x = sc.nextLine();
        System.out.println("Enter the second String");
        y = sc.nextLine();
    }

    public void anagram(){
        char[] c1 = x.toCharArray();
        char[] c2 = y.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        for(int i = 0; i<c1.length; i++){
            if(c1[i] != c2[i]){
                System.out.println("Both String is not Anagram");
                break;
            }
            if(i==c1.length-1){
                System.out.println("Both String is Anagram");
            }
        }
    }

    public static void main(String[] args){
        Anagram a = new Anagram();
        a.input();
        a.anagram();
    }
}
