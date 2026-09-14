package cdac.coreJava.DataStructure.Sorting;

import java.util.Scanner;

public class MainSorting {

    void display(int[] arr){
        for(int i=0 ;i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        MainSorting m = new MainSorting();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size=sc.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<size; i++){
            System.out.println("Enter the "+(i+1)+" value");
            arr[i] = sc.nextInt();
        }

        System.out.println("1. Insertion Sort " +
                "\n2. Bubble Sort " +
                "\n3. Selection Sort " +
                "\n4. Heap Sort " +
                "\n5. Quick Sort");
        int choice = sc.nextInt();

        switch (choice){
            case 1 -> {
                InsertionSort i = new InsertionSort();
                i.insertionSort(arr);
                m.display(arr);
            }
            case 2 -> {
                BubbleSort b = new BubbleSort();
                b.bubbleSort(arr);
                m.display(arr);
            }
            case 3 -> {
                SelectionSort s = new SelectionSort();
                s.selectionSort(arr);
                m.display(arr);
            }
            case 4 -> {
                HeapSort h = new HeapSort();
                h.heapSort(arr);
                m.display(arr);
            }
            case 5 -> {
                QuickSort q = new QuickSort();
                q.quickSort(arr, 0, arr.length-1);
                m.display(arr);
            }
        }
    }
}
