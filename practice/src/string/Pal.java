package string;

public class Pal {

    public static void main(String[] args) {
        String str = "hello";
        System.out.println(isPalindrome(str));
    }

    public static boolean isPalindrome(String str){
        StringBuilder s = new StringBuilder(str).reverse();

        return str.equalsIgnoreCase(s.toString());
    }
}
