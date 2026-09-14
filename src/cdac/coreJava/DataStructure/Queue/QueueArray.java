package cdac.coreJava.DataStructure.Queue;

import java.util.Scanner;

public class QueueArray {
    int max;
    int[] arr;
    int front, rear;

    QueueArray(){
        max = 10;
        arr = new int[max];
        front = rear = -1;
    }

    QueueArray(int max){
        this.max = max;
        arr = new int[max];
        front = rear = -1;
    }

    boolean isEmpty(){
        if(front==-1)
            return true;
        return false;
    }

    boolean isFull(){
        if(rear == max-1)
            return true;
        return false;
    }

    void enqueue(int value){
        if(isFull())
            System.out.println("Queue is full");
        else{
            if(isEmpty()){
                front++;
            }
            arr[++rear] = value;
        }
    }

    int dequeue(){
        int value = 0;
        if(isEmpty())
            System.out.println("Queue is empty");
        else{
            value = arr[front];
            arr[front] = 0;
            if(front==rear)
                front = rear = -1;
            else
                front++;
        }
        return value;
    }

    int peek(){
        int value = 0;
        if(isEmpty())
            System.out.println("Queue is empty");
        else
            value = arr[front];
        return value;
    }

    void display(){
        if(isEmpty())
            System.out.println("Queue is empty");
        else{
            for (int i=front; i<=rear; i++){
                System.out.print(arr[i]+" ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueueArray a = new QueueArray();

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
