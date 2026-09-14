package cdac.coreJava.DataStructure.Searching;

import java.util.Scanner;

public class MainSearching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size=sc.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<size; i++){
            System.out.println("Enter the "+(i+1)+" value");
            arr[i] = sc.nextInt();
        }

        System.out.println("1. Linear Search \n2. Binary Search");
        int choice = sc.nextInt();

        switch (choice){
            case 1->{
                LinearSearch ls = new LinearSearch();
                System.out.println("Enter the value you want to search: ");
                int value = sc.nextInt();;
                ls.linearSearch(value, arr);
            }
            case 2 ->{
                BinarySearch bs = new BinarySearch();
                System.out.println("Enter the value you want to search: ");
                int value = sc.nextInt();;
                bs.binarySearch(value, arr);
            }
        }
    }
}
