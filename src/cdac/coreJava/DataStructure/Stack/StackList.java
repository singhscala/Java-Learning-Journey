package cdac.coreJava.DataStructure.Stack;

import cdac.coreJava.DataStructure.LinkedList.Node;

import java.util.Scanner;

public class StackList {
    Node top;
    int count;

    StackList(){
        top = null;
        count = 0;
    }

    boolean isEmpty(){
        if(top==null)
            return true;
        return false;
    }

    void push(int value){
        Node newNode = new Node(value);
        if(isEmpty()){
            top = newNode;
        }else{
            newNode.next = top;
            top = newNode;
        }
        count++;
    }

    int pop(){
        int value = 0;
        if(isEmpty()){
            System.out.println("List is Empty");
        }else{
            value = top.data;
            top = top.next;
            count--;
        }
        return value;
    }

    int peek(){
        int value = 0;
        if(isEmpty()){
            System.out.println("List is Empty");
        }else{
            value = top.data;
        }
        return value;
    }

    void display(){
        if(isEmpty()){
            System.out.println("List is Empty");
        }else{
            Node temp = top;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackList sl = new StackList();
        sl.isEmpty();
        System.out.println("Enter the total element you want to enter: ");
        int t = sc.nextInt();
        for (int i =0; i<t; i++){
            System.out.println("Enter the "+(i+1)+" element");
            int value = sc.nextInt();
            sl.push(value);
        }
        sl.display();
        System.out.println(sl.pop());
        System.out.println(sl.peek());
        System.out.println(sl.pop());
        System.out.println(sl.pop());
    }
}
