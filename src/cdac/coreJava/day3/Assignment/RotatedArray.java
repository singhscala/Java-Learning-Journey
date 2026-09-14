package cdac.coreJava.day3.Assignment;

import java.util.Scanner;

public class RotatedArray {
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

    public void leftRotate(){
        int temp = arr[0];
        for(int i = 0; i < arr.length - 1; i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = temp;
        System.out.println("Rotated array: ");
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }

    public static void main(String[] args) {
        RotatedArray ra = new RotatedArray();
        ra.lengthArray();
        ra.input();
        ra.leftRotate();
    }
}
