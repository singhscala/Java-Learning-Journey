package multidimension_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RowMaxSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows and columns: ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.println("Enter the value position: "+"["+i+" "+j+"]");
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println(Arrays.deepToString(arr));
        System.out.println("Row with maximum sum: "+rowWithMaximumSum(arr));
    }

    public static int rowWithMaximumSum(int[][] arr){
        if(arr.length == 0){
            return 0;
        }
        int maxRow = 0;

        for(int i=0; i<arr.length; i++){
            int sum = 0;
            for(int j=0; j<arr[i].length; j++){
                sum += arr[i][j];
            }
            if(maxRow<sum){
                maxRow = i+1;
            }
        }

        return maxRow;
    }
}
