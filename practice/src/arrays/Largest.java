package arrays;

public class Largest {

    public static void main(String[] args) {
        Largest largest = new Largest();
        int[] arr = {1,3, 6, 2, 8};
        largest.largest(arr);
    }

    public void largest(int[] arr){
        int max = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("Largest element: "+max);
    }
}
