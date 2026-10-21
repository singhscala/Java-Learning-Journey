package string;

import java.util.LinkedHashMap;
import java.util.Map;

public class NonRepeat {

    public static void main(String[] args) {
        String str = "Prachi";
        char ch = nonRepeat(str);
        System.out.println(ch);
    }

    public static char nonRepeat(String str){
        Map<Character, Integer> map = new LinkedHashMap<>();
        char[] ch = str.toCharArray();

        for(char c: ch){
            map.put(c, map.getOrDefault(c, 0)+1);
        }

        for (char c: map.keySet()){
            if(map.get(c)==1){
                return c;
            }
        }

        return ' ';
    }
}
