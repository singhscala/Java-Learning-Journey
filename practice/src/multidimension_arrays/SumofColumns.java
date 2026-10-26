package multidimension_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SumofColumns {

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
        sumOfColumns(arr);
    }

    public static void sumOfColumns(int[][] arr){
        if(arr.length == 0 || arr[0].length == 0){
            return;
        }
        for(int i=0; i<arr[0].length; i++){
            int sum = 0;
            for(int j=0; j<arr.length; j++){
                sum += arr[j][i];
            }
            System.out.println("Sum of "+i+" column: "+sum);
        }
    }
}
