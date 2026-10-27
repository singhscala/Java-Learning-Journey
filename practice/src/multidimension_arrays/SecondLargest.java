package multidimension_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLargest {

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
        System.out.println("Second largest int array: "+secondLargest(arr));
    }

    public static int secondLargest(int[][] arr){
        if(arr.length==0){
            return -1;
        }

        int second = Integer.MIN_VALUE, max = arr[0][0];

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if(max<arr[i][j]){
                    second = max;
                    max = arr[i][j];
                }else if(second<arr[i][j] && arr[i][j]<max){
                    second = arr[i][j];
                }
            }
        }

        return second == Integer.MIN_VALUE ?-1 : second;
    }
}
