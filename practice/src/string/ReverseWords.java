package string;

public class ReverseWords {

    public static void main(String[] args) {
        String words = "Java is fun";
        reverseWords(words);
    }

    public static void reverseWords(String words){
        String[] wr = words.split(" ");

        for(int i=wr.length-1; i>=0; i--){
            System.out.print(wr[i]+" ");
        }
    }
}
