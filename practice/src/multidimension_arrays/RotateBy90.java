package multidimension_arrays;

import java.util.Arrays;

public class RotateBy90 {

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}};
        System.out.println(Arrays.deepToString(arr));
        System.out.println(Arrays.deepToString(rotate(arr)));
    }

    public static int[][] rotate(int[][] arr){
        if(arr.length == 0 || arr[0].length == 0){
            return new int[][]{};
        }
        int[][] result = new int[arr[0].length][arr.length];
        int row = arr.length-1;

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                result[j][i] = arr[row][j];
            }
            row--;
        }

        return result;
    }
}
