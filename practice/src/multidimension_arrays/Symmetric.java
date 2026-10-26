package multidimension_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Symmetric {

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
        System.out.println(symmetric(arr));
    }

    public static String symmetric(int[][] arr){
        if(arr.length != arr[0].length) {
            return "Not a square";
        }

        boolean ans = true;

        int[][] result = new int[arr.length][arr.length];
        for(int i=0; i< arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                result[j][i] = arr[i][j];
            }
        }

        System.out.println(Arrays.deepToString(result));

        for(int i=0; i< arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if(result[i][j] != arr[i][j]){
                    ans = false;
                    break;
                };
            }
        }

        if(ans){
            return "Symmetric";
        }

        return "Not Symmetric";
    }
}
