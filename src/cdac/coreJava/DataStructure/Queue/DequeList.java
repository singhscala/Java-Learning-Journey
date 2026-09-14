package cdac.coreJava.DataStructure.Queue;

import cdac.coreJava.DataStructure.LinkedList.Node;

import java.util.Scanner;

public class DequeList {
    Node front, rear;
    int count;

    DequeList(){
        front = rear = null;
        count = 0;
    }

    boolean isEmpty(){
        if(front==null)
            return true;
        return false;
    }

    void enqueueFront(int value){
        Node newNode = new Node(value);
        if(isEmpty())
            rear = newNode;
        else{
            newNode.next = front;
        }
        front = newNode;
        count++;
    }

    void enqueuePos(int pos, int value){
        if(pos<0 || pos>count){
            System.out.println("Invalid position");
        }
        Node newNode = new Node(value);
        if(pos==0){
            newNode.next = front;
            front = newNode;
            if(count==0)
                rear = newNode;
        }else if(pos==count){
            rear.next = newNode;
            rear = newNode;
        }else{
            Node temp = front;
            for(int i=0; i<pos-1; i++){
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
        count++;
    }

    void enqueueBack(int value){
        Node newNode = new Node(value);
        if(isEmpty())
            front = newNode;
        else{
            rear.next = newNode;
        }
        rear = newNode;
        count++;
    }

    int dequeueFront(){
        int value=0;
        if(isEmpty())
            System.out.println("Queue is empty");
        else{
            value = front.data;
            if(front == rear)
                front = rear = null;
            else{
                front = front.next;
            }
            count--;
        }
        return value;
    }

    int dequeueBack(){
        int value=0;
        if(isEmpty())
            System.out.println("Queue is empty");
        else{
            value = rear.data;
            if(front == rear)
                front = rear = null;
            else{
                Node temp = front;
                while (temp.next.next!=null)
                    temp = temp.next;
                rear = temp;
                rear.next = null;
            }
        }
        return value;
    }

    void display(){
        if(isEmpty())
            System.out.println("Queue is empty");
        else{
            Node temp = front;
            do{
                if(temp.next==null)
                    System.out.print(temp.data);
                else
                    System.out.print(temp.data+"->");
                temp = temp.next;
            }while (temp!=null);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DequeList a = new DequeList();

//        System.out.println("Enter the total element you want to add: ");
//        int n = sc.nextInt();
//
//        for (int i=0; i<n; i++){
//            System.out.println("Enter the "+(i+1)+" element:");
//            int value = sc.nextInt();
//            a.enqueueBack(value);
//        }

        a.enqueueFront(2);
        a.enqueueFront(3);
        a.enqueueBack(6);
        a.enqueueBack(8);
        a.enqueuePos(0,1);

//        System.out.println(a.dequeueBack());
//        System.out.println(a.dequeueFront());

        a.display();
    }
}
