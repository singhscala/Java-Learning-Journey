package cdac.coreJava.DataStructure.Queue;

import java.util.Scanner;

public class CircularQueueArray {
    int max;
    int[] arr;
    int front, rear;

    CircularQueueArray(){
        max = 10;
        arr = new int[max];
        front = rear = -1;
    }

    boolean isEmpty(){
        if(front==-1)
            return true;
        return false;
    }

    boolean isFull(){
        if(rear+1 % max == front )
            return true;
        return false;
    }

    void enqueue(int value){
        if(isFull()){
            System.out.println("Queue is full");
        }else{
            if(rear == max-1)
                rear = 0;
            else{
                if(isEmpty())
                    front++;
                rear++;
            }
            arr[rear] = value;
        }
    }

    int dequeue(){
        int value = 0;
        if(isEmpty())
            System.out.println("Queue is empty");
        else{
            value = arr[front];
            arr[front] = 0;
            if(front == rear)
                front = rear = -1;
            else if (front == max-1)
                front = 0;
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
            int i=front;
            do{
                System.out.print(arr[i]+" ");
                if(i==max-1)
                    i=0;
                else
                    i++;
            }while (i!=rear+1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CircularQueueArray a = new CircularQueueArray();

        System.out.println("Enter the total element you want to add: ");
        int n = sc.nextInt();

        for (int i=0; i<n; i++){
            System.out.println("Enter the "+(i+1)+" element:");
            int value = sc.nextInt();
            a.enqueue(value);
        }

        System.out.println(a.dequeue());
        System.out.println(a.dequeue());
        System.out.println(a.dequeue());
        System.out.println(a.dequeue());
        System.out.println(a.dequeue());

        a.display();
        System.out.println();

        System.out.println("Enter the total element you want to add: ");
        int n1 = sc.nextInt();

        for (int i=0; i<n1; i++){
            System.out.println("Enter the "+(i+1)+" element:");
            int value = sc.nextInt();
            a.enqueue(value);
        }

        System.out.println(a.peek());

        a.display();
    }
}
