package cdac.coreJava.day3.Assignment;

import java.util.Scanner;

public class ArrayAverage {

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

    public void average(){
        for(int i = 0; i< size; i++){
            sum += arr[i];
        }
        System.out.println("Sum: "+sum);
        average = (float) sum /size;
        System.out.println("Average: "+average);
    }

    public static void main(String[] args){
        ArrayAverage a = new ArrayAverage();
        a.lengthArray();
        a.input();
        a.average();
    }
}
