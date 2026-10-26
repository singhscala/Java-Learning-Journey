package search;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 7, 8};
        int value = 3;
        System.out.println(binary(arr, value));
    }

    public static boolean binary(int[] arr, int value){
        boolean flag = false;
        int left=0, right=arr.length-1, mid;
        while(left<=right){
            mid = (right+left)/2;
            if(arr[mid] == value){
                flag = true;
                break;
            }else if(arr[mid]>value){
                right = mid-1;
            }else{
                left = mid+1;
            }
        }

        return flag;
    }
}
