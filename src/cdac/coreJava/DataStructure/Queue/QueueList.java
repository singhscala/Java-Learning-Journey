package cdac.coreJava.DataStructure.Queue;

import cdac.coreJava.DataStructure.LinkedList.Node;

import java.util.Scanner;

public class QueueList {
    Node front;
    Node rear;
    int count;

    QueueList(){
        front = rear = null;
        count = 0;
    }

    boolean isEmpty(){
        if(front == null)
            return true;
        return false;
    }

    void enqueue(int value){
        Node newNode = null;
        newNode = new Node(value);
        if(newNode == null)
            System.out.println("Queue is full");
        else{
            if(isEmpty())
                front = rear = newNode;
            else{
                rear.next = newNode;
                rear = newNode;
            }
            count++;
        }
    }

    int dequeue(){
        int value = 0;
        if(isEmpty())
            System.out.println("Queue is empty");
        else{
            value = front.data;
            if(front.next == null)
                front = rear = null;
            else{
                front = front.next;
            }
            count--;
        }
        return value;
    }

    int peek(){
        int value = 0;
        if(isEmpty())
            System.out.println("Queue is empty");
        else
            value = front.data;
        return value;
    }

    void display(){
        if(isEmpty())
            System.out.println("Queue is empty");
        else{
            Node temp = front;
            while(temp.next!=null){
                System.out.print(temp.data+"->");
                temp = temp.next;
            }
            System.out.println(temp.data);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueueList a = new QueueList();

        System.out.println("Enter the total element you want to add: ");
        int n = sc.nextInt();

        for (int i=0; i<n; i++){
            System.out.println("Enter the "+(i+1)+" element:");
            int value = sc.nextInt();
            a.enqueue(value);
        }

        System.out.println(a.dequeue());
        System.out.println(a.dequeue());

        System.out.println(a.peek());

        a.display();
    }
}
