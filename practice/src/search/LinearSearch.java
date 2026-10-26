package search;

public class LinearSearch {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int target = 7;
        binarySearch(arr, target);
    }

    public static void binarySearch(int[] arr, int target){
        int pos = 0;
        boolean flag = false;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==target){
                pos = i;
                flag = true;
            }
        }

        if(flag){
            System.out.println(target+" found at: "+pos);
        }else
            System.out.println("Not found");
    }
}
