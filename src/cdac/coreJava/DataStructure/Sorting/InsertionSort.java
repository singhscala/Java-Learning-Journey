package cdac.coreJava.DataStructure.Sorting;

public class InsertionSort {

    void insertionSort(int[] arr){
        int n = arr.length;
        int k, j;

        for(int i=0; i<n; i++){
            k = arr[i];
            j = i-1;
            while(j>=0 && arr[j]>k){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = k;
        }
    }
}
