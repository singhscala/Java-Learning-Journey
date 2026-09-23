package arrays;

public class Reverse {

    public static void main(String[] args) {
        Reverse reverse = new Reverse();
        int[] arr = {1, 3, 6, 2, 8};
        reverse.reverse(arr);
    }

    public void reverse(int[] arr){
        System.out.print("[ ");
        for(int i=arr.length-1; i>=0; i--){
            System.out.print(arr[i]+" ");
        }
        System.out.print("]");
    }
}
