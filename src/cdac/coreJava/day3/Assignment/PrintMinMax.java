package cdac.coreJava.day3.Assignment;

import java.util.Scanner;

public class PrintMinMax {

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
        System.out.print("Elements in array: ");
        for(int i = 0; i<size; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
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
        System.out.println("Minimum number in array is: "+smallest+" at index "+index);
    }

    public void findLargest(){
        int largest = arr[0];
        int index = 0;
        for (int i = 0; i<size; i++){
            if(arr[i] > largest){
                largest = arr[i];
                index = i+1;
            }
        }
        System.out.println("Maximum number in array is: "+largest+" at index "+index);
    }

    public static void main(String[] args){
        PrintMinMax p = new PrintMinMax();
        p.lengthArray();
        p.input();
        p.display();
        p.findSmallest();
        p.findLargest();
    }
}
