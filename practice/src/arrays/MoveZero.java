package arrays;

import java.util.Arrays;

public class MoveZero {

    public static void main(String[] args) {
        MoveZero moveZero = new MoveZero();
        int[] arr = {1, 0, 6, 0, 8};
        moveZero.moveZero(arr);
    }

    public void moveZero(int[] arr){
        int index = 0;
        for(int num: arr){
            if(num!=0){
                arr[index] = num;
                index++;
            }
        }
        while(index<arr.length){
            arr[index] = 0;
            index++;
        }

        System.out.println(Arrays.toString(arr));
    }
}
