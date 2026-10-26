package greedy;

import java.util.Arrays;

public class Coin {

    public static void main(String[] args) {
        int[] coins = {1, 2, 5, 10, 20, 50, 100};
        int amount = 93;
        System.out.println(coins(coins, amount));
    }

    public static int coins(int[] arr, int amount){
        Arrays.sort(arr);
        int count =0;

        for(int i=arr.length-1; i>=0; i--){
            if(amount/arr[i]>0){
                count=count+amount/arr[i];
                amount%=arr[i];
            }
        }

        return count;
    }
}
