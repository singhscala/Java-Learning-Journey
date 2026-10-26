package string;

import java.util.LinkedHashSet;
import java.util.Set;

public class Remove {

    public static void main(String[] args) {
        String str = "programming";
        System.out.println(removeDuplicate(str));
    }

    public static String removeDuplicate(String str){
        Set<Character> set = new LinkedHashSet<>();

        for(char c: str.toCharArray()){
            set.add(c);
        }

        StringBuilder s = new StringBuilder();
        for(char c: set){
            s.append(c);
        }

        return s.toString();
    }
}
