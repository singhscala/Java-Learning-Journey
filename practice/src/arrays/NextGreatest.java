package arrays;

import java.util.Arrays;

public class NextGreatest {

    public static void main(String[] args) {
        int[] arr = {2, 3, 1};
        System.out.println(Arrays.toString(nextGreaterElement(arr)));
    }


    public static int[] nextGreaterElement(int[] arr) {
        int[] result = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            result[i] = -1;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    result[i] = arr[j];
                    break;
                }
            }
        }

        return result;
    }

}
