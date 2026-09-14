package cdac.coreJava.day3.Assignment;

import java.util.Scanner;

public class SearchElement {

    Scanner sc = new Scanner(System.in);
    int size, value;
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

    public void search(){
        System.out.println("Enter the number you want to search ");
        value = sc.nextInt();
        for (int i = 0; i<size; i++){
            if(arr[i] == value){
                System.out.println("Found: "+ arr[i]+" at index "+(i+1));
                break;
            }
            if(i== arr.length-1){
                System.out.println("Not found");
            }
        }
    }

    public static void main(String[] args){
        SearchElement s = new SearchElement();
        s.lengthArray();
        s.input();
        s.search();
    }
}
