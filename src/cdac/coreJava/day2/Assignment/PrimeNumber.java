package cdac.coreJava.day2.Assignment;

import java.util.*;

public class PrimeNumber {
    Scanner sc = new Scanner(System.in);
    int x;

    public void input(){
        System.out.println("Enter the number to check if it's prime or not: ");
        x = sc.nextInt();
    }

    public void checkPrime(){
        boolean flag = true;
        for(int i = 2; i<=x/2;i++){
            if(x%i == 0){
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println(x+" is a Prime number");
        }else{
            System.out.println(x+" is not a Prime number");
        }
    }

    public static void main(String[] args){
        PrimeNumber p = new PrimeNumber();
        p.input();
        p.checkPrime();
    }
}
