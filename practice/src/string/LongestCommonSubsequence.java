package string;

public class LongestCommonSubsequence {

    public static void main(String[] args) {
        String str1 = "ABC", str2 = "BCA";
        System.out.println(lcs(str1, str2));
    }

    public static int lcs(String s1, String s2){
        int total = 0, k = 0;
        int count = 0;
        for (int i=0; i<s2.length(); i++){
            for (int j=k; j<s1.length(); j++){
                if(s2.charAt(i)==s1.charAt(j)){
                    count++;
                    k=j+1;
                    break;
                }

            }
        }
        return count;
    }
}
