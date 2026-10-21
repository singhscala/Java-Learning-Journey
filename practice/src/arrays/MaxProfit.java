package arrays;

public class MaxProfit {

    public static void main(String[] args) {
        int[] arr = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(arr));
    }

    public static int maxProfit(int[] arr){
        int maxProfit = 0;
        int minPrice = arr[0];

        for(int i=1; i<arr.length; i++){
            if(minPrice > arr[i]){
                minPrice = arr[i];
            }else if(maxProfit < arr[i]-minPrice){
                maxProfit = arr[i]-minPrice;
            }
        }

        return maxProfit;
    }
}
