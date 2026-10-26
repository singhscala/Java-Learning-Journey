package string;

import java.util.HashSet;
import java.util.Set;

public class FirstRepeated {
    public static void main(String[] args) {
        String str = "abcdef";
        System.out.println(firstRepeated(str));
    }

    public static char firstRepeated(String str){
        Set<Character> set = new HashSet<>();

        for(char ch: str.toCharArray()){
            if(set.contains(ch)) {
                return ch;
            }
            set.add(ch);
        }

        return '\0';
    }
}
