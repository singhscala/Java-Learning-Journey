package string;

import java.util.HashMap;
import java.util.Map;

public class NonRepeating {

    public static void main(String[] args) {
        NonRepeating nonRepeating = new NonRepeating();
        String str = "swiss";
        nonRepeating.firstNonRepeating(str);
    }

    public void firstNonRepeating(String str){
        char ch = ' ';
        Map<Character, Integer> map = new HashMap<>();

        for(char c: str.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)+1);
        }

        for(char c: map.keySet()){
            if(map.get(c)==1){
                ch=c;
                break;
            }
        }

        System.out.println("First non-repeating character: "+ch);
    }
}
