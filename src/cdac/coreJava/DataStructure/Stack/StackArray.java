package cdac.coreJava.DataStructure.Stack;

import java.util.Scanner;

public class StackArray {
    int max;
    int[] arr;
    int top;

    StackArray(){
        max = 10;
        arr = new int[max];
        top = -1;
    }

    StackArray(int max){
        this.max = max;
        arr = new int[max];
        top = -1;
    }

    boolean isEmpty(){
        if(top == -1)
            return true;
        return false;
    }

    boolean isFull(){
        if(top == max-1)
            return true;
        return false;
    }

    void push(int value){
        if(isFull()){
            System.out.println("Stack is full");
        }else{
            arr[++top] = value;
        }
    }

    int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }else{
            return arr[top--];
        }
    }

    int peek(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }else{
            return arr[top];
        }
    }

    void display(){
        if(isEmpty()){
            System.out.println("Stack is empty");
        }else{
            for(int i=top; i>=0; i--){
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackArray sa = new StackArray();
        sa.isEmpty();
        sa.isFull();
        System.out.println("Enter the total element you want to enter: ");
        int t = sc.nextInt();
        for (int i =0; i<t; i++){
            System.out.println("Enter the "+(i+1)+" element");
            int value = sc.nextInt();
            sa.push(value);
        }
        sa.display();
        System.out.println(sa.pop());
        System.out.println(sa.peek());
        System.out.println(sa.pop());
        System.out.println(sa.pop());
    }
}
