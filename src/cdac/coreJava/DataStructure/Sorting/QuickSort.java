package cdac.coreJava.DataStructure.Sorting;

public class QuickSort {

    void quickSort(int arr[], int low, int high) {
        if (low < high) {

            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    int partition(int arr[], int low, int high) {

        int pivot = arr[low];
        int p = low + 1;
        int q = high;

        while (p <= q) {

            while (p <= high && arr[p] <= pivot) {
                p++;
            }

            while (arr[q] > pivot) {
                q--;
            }

            if (p < q) {
                swap(arr, p, q);
            }
        }

        swap(arr, low, q);
        return q;
    }

    void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}