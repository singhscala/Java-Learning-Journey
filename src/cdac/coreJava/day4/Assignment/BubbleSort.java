package cdac.coreJava.day4.Assignment;

import java.util.Scanner;

public class BubbleSort {
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

    public void bubbleSort() {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for (int i:arr){
            System.out.print(i+" ");
        }
    }

    public static void main(String[] args){
        BubbleSort b = new BubbleSort();
        b.lengthArray();
        b.input();
        b.bubbleSort();
    }
}
