package arrays;

import java.util.LinkedHashMap;
import java.util.Map;

public class Majority {

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3};
        System.out.println(majorityElements(arr));
    }

    public static int majorityElements(int[] arr){
        int size = arr.length/2;
        int max = -1;
        Map<Integer, Integer> map = new LinkedHashMap<>();

        for(int i: arr){
            map.put(i, map.getOrDefault(i, 0)+1);
        }

        for(int i: map.keySet()){
            if(map.get(i)>size){
                max = i;
                break;
            }
        }

        return max;
    }
}
