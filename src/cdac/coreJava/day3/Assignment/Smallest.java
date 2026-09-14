package cdac.coreJava.day3.Assignment;

import java.util.Scanner;

public class Smallest {

    Scanner sc = new Scanner(System.in);
    int size;
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

    public void findSmallest(){
        int smallest = arr[0];
        int index = 0;
        for (int i = 0; i<size; i++){
            if(arr[i] < smallest){
                smallest = arr[i];
                index = i+1;
            }
        }
        System.out.println("Smallest number in array is: "+smallest+" at index "+index);
    }

    public static void main(String[] args){
        Smallest s = new Smallest();
        s.lengthArray();
        s.input();
        s.findSmallest();
    }
}
