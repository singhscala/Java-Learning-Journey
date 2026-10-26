package arrays;

import java.util.Arrays;

public class Rotate {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        System.out.println(Arrays.toString(rotate(arr, k)));
    }

    public static int[] rotate(int[] arr, int k){
        int n = arr.length;
        k = k%n;

        reverse(arr, 0, n-1);
        reverse(arr, 0, k-1);
        reverse(arr, k, n-1);

        return arr;
    }

    public static void reverse(int[] arr, int n, int m){
        int left = n, right = m;

        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

    }
}
