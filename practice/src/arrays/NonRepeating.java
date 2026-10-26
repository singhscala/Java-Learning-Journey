package arrays;

import java.util.LinkedHashMap;
import java.util.Map;

public class NonRepeating {

    public static void main(String[] args) {
        int[] arr = {4, 5, 1, 2, 1, 4, 5};
        System.out.println(nonRepeat(arr));
    }

    public static int nonRepeat(int[] arr){
        int value = -1;
        Map<Integer, Integer> map = new LinkedHashMap<>();

        for(int i: arr){
            map.put(i, map.getOrDefault(i, 0)+1);
        }

        for(int i: map.keySet()){
            if(map.get(i)==1){
                value = i;
                break;
            }
        }
        return value;
    }
}
