package cdac.coreJava.day3.Assignment;

import java.util.Scanner;

public class ZeroesToEnd {
    Scanner sc = new Scanner(System.in);
    int size;
    int[] arr;

    public void lengthArray(){
        System.out.println("Enter the array size: ");
        size = sc.nextInt();
        arr = new int[size];
    }

    public void input(){
        for (int  i = 0; i< arr.length; i++){
            System.out.println("Enter value: ");
            arr[i] = sc.nextInt();
        }
    }

    public void moveZero(){
        int index = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0) {
                arr[index++] = arr[i];
            }
        }

        while(index < arr.length){
            arr[index++] = 0;

        }

        System.out.println("Result array: ");
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }

    public static void main(String[] args) {
        ZeroesToEnd z = new ZeroesToEnd();
        z.lengthArray();
        z.input();
        z.moveZero();
    }
}
