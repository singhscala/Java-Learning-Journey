package arrays;

import java.util.HashSet;
import java.util.Set;

public class DistinctElements {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 3};
        int[] arr2 = {2, 2, 4};
        System.out.println(distinct(arr1, arr2));
    }

    public static Set<Integer> distinct(int[] arr1, int[] arr2){
        Set<Integer> set = new HashSet<>();

        for(int i: arr1){
            set.add(i);
        }

        Set<Integer> result = new HashSet<>();

        for(int i: arr2){
            if(set.contains(i))
                result.add(i);
        }

        return result;
    }
}
