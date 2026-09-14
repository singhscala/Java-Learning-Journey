package cdac.coreJava.day3.Assignment;

import java.util.Scanner;

public class EvenSum {

    Scanner sc = new Scanner(System.in);
    int size, sum = 0;
    int[] arr;

    public void lengthArray(){
        System.out.println("Enter the array size: ");
        size = sc.nextInt();
        arr = new int[size];
    }

    public void input(){
        System.out.println("Enter value: ");
        for (int  i = 0; i< arr.length; i++){
            arr[i] = sc.nextInt();
        }
    }

    public void evenSum(){
        for (int i = 0; i<size; i++){
            if(arr[i]%2 == 0){
                sum += arr[i];
            }
        }
        System.out.println("Sum of all even numbers present in array: "+sum);
    }

    public static void main(String[] args){
        EvenSum e  = new EvenSum();
        e.lengthArray();
        e.input();
        e.evenSum();
    }
}
