package string;

import java.util.HashMap;
import java.util.Map;

public class Anagram {

    public static void main(String[] args) {
        Anagram anagram = new Anagram();
        String str1 = "listen";
        String str2 = "silent";
        anagram.anagram(str1, str2);
    }

    public void anagram(String str1, String str2){
        boolean flag = true;
        Map<Character, Integer> map = new HashMap<>();

        for(char s: str1.toCharArray()){
            map.put(s, map.getOrDefault(s, 0)+1);
        }

        for(char s: str2.toCharArray()){
            map.put(s, map.getOrDefault(s, 0)-1);
        }

        for(char c: map.keySet()){
            if(map.get(c)>0 || map.get(c)<0){
                flag=false;
            }
        }

        if(flag){
            System.out.println("Is Anagram");
        }else{
            System.out.println("Not an Anagram");
        }
    }
}
