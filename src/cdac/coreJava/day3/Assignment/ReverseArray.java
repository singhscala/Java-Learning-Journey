package cdac.coreJava.day3.Assignment;

import java.util.Scanner;

public class ReverseArray {

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

    public void display(){
        for(int i = 0; i<size; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public void reverse(){
        int start = 0, end = size-1;
        while (start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public void reverseDisplay(){
        System.out.print("Reversed array: ");
        for(int i = 0; i<size; i++){
            System.out.print(arr[i]+ " ");
        }
    }

    public static void main(String[] args){
        ReverseArray r = new ReverseArray();
        r.lengthArray();
        r.input();
        r.display();
        r.reverse();
        r.reverseDisplay();
    }
}
