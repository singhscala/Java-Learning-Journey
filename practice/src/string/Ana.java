package string;

import java.util.HashMap;
import java.util.Map;

public class Ana {

    public static void main(String[] args) {
        String str1 = "aabb", str2 = "abab";
        System.out.println(anagram(str1, str2));
    }

    public static boolean anagram(String str1, String str2){
        if (str1.length() != str2.length()) {
            return false;
        }

        Map<Character, Integer> map = new HashMap<>();

        for(char s: str1.toCharArray()){
            map.put(s, map.getOrDefault(s, 0)+1);
        }

        for(char s: str2.toCharArray()){
            map.put(s, map.getOrDefault(s, 0)-1);
        }

        for(char c: map.keySet()){
            if(map.get(c)>0 || map.get(c)<0){
                return false;
            }
        }

        return true;
    }
}
