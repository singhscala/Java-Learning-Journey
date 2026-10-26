package string;

public class ReverseWords {

    public static void main(String[] args) {
        String words = "Java is fun";
        System.out.println(reverseWord(words));
    }

    public static String reverseWord(String str) {
        String[] s = str.split(" ");
        StringBuilder st = new StringBuilder();

        for (int i = s.length - 1; i >= 0; i--) {
            st.append(s[i]);
            if (i > 0) {
                st.append(" ");
            }
        }

        return st.toString();
    }
}
