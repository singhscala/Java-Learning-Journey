package multidimension_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SaddlePoint {

    public static void main(String[] args) {

        int[][] arr = {{8, 9, 7}, {3, 5, 6}, {1, 2, 4}};

        System.out.println(Arrays.deepToString(arr));
        System.out.println("Saddle point: "+saddlePoint(arr));
    }

    public static int saddlePoint(int[][] arr){
        if (arr.length == 0 || arr[0].length == 0) {
            return -1;
        }

        int num = -1;

        for(int i=0; i<arr.length; i++){
            boolean flag = true;
            int k = 0;
            int value = arr[i][0];
            for(int j=1; j<arr[i].length; j++){
                if(value>arr[i][j]){
                    value = arr[i][j];
                    k = j;
                }
            }
            
            for(int j=0; j<arr.length; j++){
                if(value<arr[j][k]){
                    flag = false;
                    break;
                }
            }

            if(flag){
                num = value;
            }
        }

        return num;
    }
}
