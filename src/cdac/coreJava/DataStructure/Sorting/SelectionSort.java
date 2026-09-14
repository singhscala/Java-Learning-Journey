package cdac.coreJava.DataStructure.Sorting;

public class SelectionSort {

    void selectionSort(int[] arr){
        int n = arr.length;
        int index, smallest;
        for(int i=0; i<n-1; i++){
            index = i;
            smallest = arr[i];
            for(int j=i+1; j<n; j++){
                if(smallest>arr[j]){
                    smallest=arr[j];
                    index=j;
                }
            }
            swap(arr, i, index);
        }
    }

    void swap(int[] arr,int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
