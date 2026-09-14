package cdac.coreJava.day2.Assignment;

import java.util.Scanner;

public class ReverseNumber {
    Scanner sc = new Scanner(System.in);
    int x;
    int temp;
    int rev = 0;

    public void input(){
        System.out.println("Enter the number you want to reverse: ");
        x = sc.nextInt();
    }

    public void reverse(){
        while(x>0){
            temp = x%10;
            rev = (rev*10)+temp;
            x = x/10;
        }
        System.out.println(rev);
    }

    public static void main(String[] args){
        ReverseNumber r = new ReverseNumber();
        r.input();
        r.reverse();
    }
}
