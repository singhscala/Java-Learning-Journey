package arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        int[] arr = {4, 2, 6, 8, 1};
        int target = 10;
        System.out.println(Arrays.toString(twoSum.twoSum(arr, target)));
    }

    public int[] twoSum(int[] arr, int target){
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0 ;i<arr.length; i++){
            int value = target-arr[i];

            if(map.containsKey(value)){
                return new int[]{map.get(value), i};
            }

            map.put(arr[i], i);
        }
        return new int[]{};
    }
}
