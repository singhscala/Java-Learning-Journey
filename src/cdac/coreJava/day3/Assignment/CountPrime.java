package cdac.coreJava.day3.Assignment;

import java.util.Scanner;

public class CountPrime {

    Scanner sc = new Scanner(System.in);
    int size, count;
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

    public void display(){
        System.out.print("Elements in array: ");
        for(int i = 0; i<size; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public void countPrime(){
        boolean flag = true;
        for (int i = 0; i<size; i++){
            for (int j = 2; j<arr[i]/2; j++){
                if(arr[i] % j == 0){
                    flag = false;
                    break;
                }
            }
            if(!flag){
                count++;
            }
        }
        System.out.println("Total count of prime in array: "+count);
    }

    public static void main(String[] args){
        CountPrime c = new CountPrime();
        c.lengthArray();
        c.input();
        c.display();
        c.countPrime();
    }
}
