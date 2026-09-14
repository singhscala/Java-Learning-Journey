package cdac.coreJava.DataStructure.Stack;

import java.util.Scanner;

public class InfixToPostfix {

    public static int priority(char op){
        if(op == '+' || op == '-') return 1;
        if(op == '*' || op == '/') return 2;
        return 0;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StackArrayString stack = new StackArrayString();

        System.out.println("Enter Infix Expression:");
        String exp = sc.nextLine();

        StringBuilder postfix = new StringBuilder();

        for(int i = 0; i < exp.length(); i++){
            char ch = exp.charAt(i);

            if(Character.isLetterOrDigit(ch)){
                postfix.append(ch);
            }

            else if(ch == '('){
                stack.push(ch);
            }

            else if(ch == ')'){
                while(!stack.isEmpty() && stack.peek() != '('){
                    postfix.append(stack.pop());
                }
                stack.pop();
            }

            else {
                while(!stack.isEmpty() && priority(stack.peek()) >= priority(ch)){
                    postfix.append(stack.pop());
                }
                stack.push(ch);
            }
        }

        while(!stack.isEmpty()){
            postfix.append(stack.pop());
        }

        System.out.println("Postfix Expression: " + postfix);
    }
}