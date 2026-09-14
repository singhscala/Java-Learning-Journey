package cdac.coreJava.day4.Assignment;

import java.util.Scanner;

public class BinarySearch {

    Scanner sc = new Scanner(System.in);
    int size, mid, value;
    int[] arr;
    boolean flag = false;

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
        System.out.println("Enter the value to search: ");
        value = sc.nextInt();
    }

    public void binarySearch(){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            mid = (start+end) / 2;
            if(arr[mid] == value){
                flag = true;
                System.out.println(value+ " is Found at index: "+(mid+1));
                break;
            }else if(value < arr[mid]){
                end = mid - 1;
            }else {
                start = mid + 1;
            }
        }
        if(!flag){
            System.out.println(value+" not found");
        }
    }

    public static void main(String[] args){
        BinarySearch b = new BinarySearch();
        b.lengthArray();
        b.input();
        b.binarySearch();
    }

}
