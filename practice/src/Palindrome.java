public class Palindrome {
    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        int i = 101;
        palindrome.palindrome(i);
    }

    public void palindrome(int i){
        int original = i;
        int sum=0;
        while(i>0){
            int temp = i%10;
            sum= (sum*10)+temp;
            i /= 10;
        }

        if(original==sum){
            System.out.println("Is palindrome");
        }else{
            System.out.println("is not Palindrome");
        }
    }
}
