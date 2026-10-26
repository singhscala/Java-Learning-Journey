package arrays;

import java.util.*;

public class LongestConsecutive {

    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(longestConsecutive(arr));
    }

    public static int longestConsecutive(int[] arr){
        Set<Integer> set = new TreeSet<>();
        for(int i : arr){
            set.add(i);
        }

        int sum = 0, value = 1;

        for (int current : set) {
            if (set.contains(current + 1)) {
                value++;
            } else {
                if(sum<value) {
                    sum = value;
                }
                value = 1;
            }
        }
        return sum;
    }
}
