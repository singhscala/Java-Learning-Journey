package string;

public class IsDigit {

    public static void main(String[] args) {
        String str = "1234";
        System.out.println(onlyDigits(str));
    }

    public static boolean onlyDigits(String str){
        if(str.isBlank()){
            return false;
        }
        char[] c = str.toCharArray();

        for(char ch: c){
            if(!Character.isDigit(ch)){
                return false;
            }
        }

        return true;
    }
}
