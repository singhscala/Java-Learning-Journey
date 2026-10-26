package string;

import java.util.HashSet;
import java.util.Set;

public class Substring {

    public static void main(String[] args) {
        String str = "dvdf";
        System.out.println(longestSubstring(str));
    }

    public static int longestSubstring(String str){
        Set<Character> set = new HashSet<>();
        int max = 0;
        int left = 0;

        for(int right=0; right<str.length(); right++){
            char ch = str.charAt(right);
            while(set.contains(ch)){
                set.remove(str.charAt(left));
                left++;
            }

            set.add(ch);
            int total = right-left+1;

            if(total>max){
                max = total;
            }
        }


        return max;
    }
}
