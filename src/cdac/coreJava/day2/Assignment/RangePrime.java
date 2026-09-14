package cdac.coreJava.day2.Assignment;

import java.util.*;

public class RangePrime {
    Scanner sc = new Scanner(System.in);
    int start, end;

    public void rangeInput(){
        System.out.println("Enter the range: ");
        start = sc.nextInt();
        end = sc.nextInt();
    }

    public void primeInRange(){
        for(int i = start; i<=end; i++){
            boolean flag = true;
            for(int j = 2; j<=i/2; j++){
                if(i%j == 0){
                    flag = false;
                    break;
                }
            }
            if(flag){
                System.out.print(i+" ");
            }
        }
    }

    public static void main(String[] args){
        RangePrime r = new RangePrime();
        r.rangeInput();
        r.primeInRange();
    }
}
