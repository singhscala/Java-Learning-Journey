package string;

public class Rotation {
    public static void main(String[] args) {
        String str1 = "abcd", str2 = "acbd";
        System.out.println(rotation(str1, str2));
    }

    public static boolean rotation(String str1, String str2){
        if (str1.length() != str2.length()) {
            return false;
        }
        StringBuilder s = new StringBuilder(str1);
        s.append(str1);

        if(s.toString().contains(str2)){
            return true;
        }

        return false;
    }
}
