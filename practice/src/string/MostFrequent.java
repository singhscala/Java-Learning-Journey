package string;

import java.util.HashMap;
import java.util.Map;

public class MostFrequent {

    public static void main(String[] args) {
        String str = "banana";
        System.out.println(mostFrequent(str));
    }

    public static char mostFrequent(String str){
        Map<Character, Integer> map = new HashMap<>();

        for(char c: str.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)+1);
        }

        char ch = ' ';
        int max = 0;
        for(char c: map.keySet()){
            if(max<map.get(c)){
                max = map.get(c);
                ch = c;
            }
        }

        return ch;
    }
}
