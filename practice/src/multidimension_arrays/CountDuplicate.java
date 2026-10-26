package multidimension_arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountDuplicate {

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
        System.out.println("Total Duplicates: "+countDuplicate(arr));

    }

    public static int countDuplicate(int[][] arr){
        if(arr.length == 0){
            return 0;
        }
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                map.put(arr[i][j], map.getOrDefault(arr[i][j], 0)+1);
            }
        }

        for(int i: map.keySet()){
            if(map.get(i) > 1){
                count++;
            }
        }

        return count;
    }
}
