package multidimension_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class BoundarySum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows and columns: ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] arr = new int[rows][cols];

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.println("Enter the value position: "+"["+i+" "+j+"]");
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println(Arrays.deepToString(arr));
        System.out.println("Sum of the boundary elements " +boundarySum(arr));
    }

    public static int boundarySum(int[][] arr){
        if(arr.length==0){
            return 0;
        }

        int sum = 0;

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if(i==0 || i==arr.length-1) {
                    sum += arr[i][j];
                }else if (j==0 || j==arr[i].length-1) {
                    sum += arr[i][j];
                }
            }
        }

        return sum;
    }
}
