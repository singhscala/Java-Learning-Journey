package arrays;

import java.util.Arrays;

public class MoveNegative {

    public static void main(String[] args) {
        int[] arr = {1, -2, 3, -4, 5};
        moveNegatives(arr);
    }

    public static void moveNegatives(int[] arr){
        int left = 0, right = arr.length-1;

        while(left<right){
            if (arr[left] < 0) {
                left++;
            } else if (arr[right] >= 0) {
                right--;
            } else {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
