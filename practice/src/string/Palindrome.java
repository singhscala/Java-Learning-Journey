package string;

public class Palindrome {

    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        String str = "kanak";
        palindrome.palindrome(str);
    }

    public void palindrome(String str){
        char[] sh = str.toCharArray();
        String s = "";

        for(int i=sh.length-1; i>=0; i--){
            s += sh[i];
        }

        if(str.equals(s)){
            System.out.println("Is palindrome");
        }else{
            System.out.println("Not a palindrome");
        }
    }
}
