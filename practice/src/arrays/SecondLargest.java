package arrays;

public class SecondLargest {

    public static void main(String[] args) {
        SecondLargest largest = new SecondLargest();
        int[] arr = {1,3, 6, 2, 8};
        largest.secondLargest(arr);
    }

    public void secondLargest(int[] arr){
        int max = arr[0];
        int next = 0;
        for(int i=1; i<arr.length; i++){
            if(arr[i]>max){
                next = max;
                max = arr[i];
            }else if(arr[i]>next && arr[i]!=max){
                next = arr[i];
            }
        }
        System.out.println("Second Largest: "+next);
    }
}
