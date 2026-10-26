package arrays;

public class SecondLargestInDistinct {

    public static void main(String[] args) {
        int[] arr = {7, 5, 7, 7};
        System.out.println(secondLargest(arr));
    }

    public static int secondLargest(int[] arr){
        if (arr == null || arr.length < 2) {
            return -1;
        }

        int max = arr[0], second = Integer.MIN_VALUE;

        for(int i=1; i<arr.length; i++){
            if(max<arr[i]){
                second = max;
                max = arr[i];
            } else if(second<arr[i] && max>arr[i]) {
                second = arr[i];
            }
        }

        return second == Integer.MIN_VALUE ? -1 : second;
    }
}
