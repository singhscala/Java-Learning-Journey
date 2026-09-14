package cdac.coreJava.DataStructure.Stack;

import java.util.Scanner;

public class Palindrome {
    StackArray stack;

    public static void main(String[] args) {
        Palindrome p = new Palindrome();
        p.stack = new StackArray();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int value = sc.nextInt();
        p.add(value);
        p.checkPalindrome(value);
    }

    void add(int value){
        String str = String.valueOf(value);
        for(int i = 0; i < str.length(); i++){
            stack.push(str.charAt(i) - '0');
        }
    }

    void checkPalindrome(int value){
        int original = value;
        int v = 0;

        while(!stack.isEmpty()){
            int s = stack.pop();
            v = (v*10)+s;
        }

        if(original == v){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }
    }
}
