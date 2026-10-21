package arrays;

import java.util.Arrays;

public class Position {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 3, 4};
        int target = 2;
        System.out.println(Arrays.toString(position(arr, target)));
    }

    public static int[] position(int[] arr, int target){
        int first = -1, last = -1;

        for(int i=0 ;i<arr.length; i++){
            if(arr[i]==target){
                first= i;
                last = i;
                break;
            }
        }
        for(int i=first ;i<arr.length; i++){
            if(arr[i]==target){
                last = i;
            }
        }

        return new int[]{first, last};
    }
}
