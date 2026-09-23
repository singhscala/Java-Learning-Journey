package arrays;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate {

    public static void main(String[] args) {
        RemoveDuplicate removeDuplicate = new RemoveDuplicate();
        int[] arr = {1, 1, 2, 3, 6, 6};
        removeDuplicate.removeDuplicate(arr);
        removeDuplicate.removeDuplicate1(arr);
    }

    public void removeDuplicate(int[] arr){
        Set<Integer> set = new LinkedHashSet<>();

        for(int nums: arr){
            set.add(nums);
        }

        System.out.println(set);
    }

    public void removeDuplicate1(int[] arr){
        int index = 1;
        for(int i=1; i<arr.length; i++){
            if(arr[i]!=arr[i-1]){
                arr[index]=arr[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
