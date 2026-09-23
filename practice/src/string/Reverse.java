package string;

public class Reverse {

    public static void main(String[] args) {
        Reverse reverse = new Reverse();
        String name = "Prachi";
        reverse.reverse(name);
        reverse.reverse1(name);
    }

    public void reverse(String str){
        String rev ="";
        for (int i=str.length()-1; i>=0; i--){
            rev += str.charAt(i);
        }
        System.out.println("Original string: "+str+"\nReverse string: "+rev);
    }

    public void reverse1(String str){
        StringBuilder s = new StringBuilder(str);
        System.out.println(s.reverse());
    }
}
