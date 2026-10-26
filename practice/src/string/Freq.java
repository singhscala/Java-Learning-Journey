package string;

import java.util.HashMap;
import java.util.Map;

public class Freq {

    public static void main(String[] args) {
        String str = "programming";
        frequency(str);
    }

    public static void frequency(String str){
        Map<Character, Integer> map = new HashMap<>();

        for(char c: str.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)+1);
        }

        System.out.println(map);
    }
}
