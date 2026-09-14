package cdac.coreJava.day4.Assignment;

import java.util.Scanner;

public class SelectionSort {
    Scanner sc = new Scanner(System.in);
    int size;
    int[] arr;

    public void lengthArray(){
        System.out.println("Enter the array size: ");
        size = sc.nextInt();
        arr = new int[size];
    }

    public void input(){
        System.out.println("Enter Sorted Array value: ");
        for (int  i = 0; i< arr.length; i++){
            arr[i] = sc.nextInt();
        }
    }

    public void selectionSort(){
        for(int i =0; i <arr.length-1; i++){
            for(int j = i+1; j<arr.length; j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i:arr){
            System.out.print(i+" ");
        }
    }

    public static void main(String[] args){
        SelectionSort s = new SelectionSort();
        s.lengthArray();
        s.input();
        s.selectionSort();
    }
}
