package arrays;

public class MaximumProfit {

    public static void main(String[] args) {
        int[] arr = {7, 6, 4, 3, 1};
        System.out.println(maximumProfit(arr));
    }

    public static int maximumProfit(int[] arr){
        int maxProfit = 0;
        int minPrice = arr[0];

        for(int i=1; i<arr.length; i++){
            if(minPrice > arr[i]){
                minPrice = arr[i];
            }else if(maxProfit<arr[i]-minPrice)
                maxProfit = arr[i] - minPrice;
        }

        return maxProfit;
    }
}
