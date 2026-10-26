package multidimension_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Even {

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
        System.out.println("Total even in matrix: "+countEven(arr));
    }

    public static int countEven(int[][] arr){
        if(arr.length == 0){
            return 0;
        }

        int count = 0;

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if(arr[i][j]%2==0){
                    count++;
                }
            }
        }

        return count;
    }
}
