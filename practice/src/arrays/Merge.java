package arrays;

import java.util.Arrays;

public class Merge {

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5};
        int[] arr2 = {2, 4, 6};
        System.out.println(Arrays.toString(mergeArray(arr1, arr2)));
    }

    public static int[] mergeArray(int[] arr1, int[] arr2){
        int[] arr = new int[arr1.length + arr2.length];

        int length1 = 0, length2 = 0, k = 0;

        while (length1 < arr1.length && length2 < arr2.length) {
            if (arr1[length1] <= arr2[length2]) {
                arr[k++] = arr1[length1++];
            } else {
                arr[k++] = arr2[length2++];
            }
        }

        while (length1 < arr1.length) {
            arr[k++] = arr1[length1++];
        }

        while (length2 < arr2.length) {
            arr[k++] = arr2[length2++];
        }

        return arr;
    }
}
