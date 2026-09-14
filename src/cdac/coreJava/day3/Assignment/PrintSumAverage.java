package cdac.coreJava.day3.Assignment;

import java.util.Scanner;

public class PrintSumAverage {

    Scanner sc = new Scanner(System.in);
    int size, sum = 0;
    int[] arr;
    float average;

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

    public void average(){
        for(int i = 0; i< size; i++){
            sum += arr[i];
        }
        average = (float) sum /size;
        System.out.println("Sum of elements in array: "+sum);
        System.out.println("Average of all elements in array: "+average);
    }

    public static void main(String[] args){
        PrintSumAverage p = new PrintSumAverage();
        p.lengthArray();
        p.input();
        p.display();
        p.average();
    }
}
