package arrays;

public class MissingNumber {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6};
        System.out.println("Missing number is: "+MissingNumber.missingNumber(arr));
    }

    public static int missingNumber(int[] arr){
        int num, sum =0;
        int size = arr.length+1;

        for (int i:arr){
            sum += i;
        }

        int total = size*(size+1)/2;
        num = total-sum;
        return num;
    }
}
