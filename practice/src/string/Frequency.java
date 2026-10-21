package string;

import java.util.HashMap;
import java.util.Map;

public class Frequency {

    public static void main(String[] args) {
        String str = "Hello My Name Is Prachi Singh";
        frequency(str);
    }

    public static void frequency(String str){
        Map<Character, Integer> map = new HashMap<>();
        char[] ch = str.toCharArray();

        for (char c:ch){
            map.put(c, map.getOrDefault(c, 0)+1);
        }

        System.out.println(map);
    }
}
