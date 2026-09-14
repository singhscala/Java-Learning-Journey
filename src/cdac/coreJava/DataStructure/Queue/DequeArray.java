package cdac.coreJava.DataStructure.Queue;

import java.util.Scanner;

public class DequeArray {
    int max;
    int[] arr;
    int front, rear;

    DequeArray(){
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
        if(front==0 && rear == max-1)
            return true;
        return false;
    }

    void enqueueFront(int value){
        if(isFull())
            System.out.println("Queue is full");
        else{
            if(isEmpty()){
                front++;
                rear++;
            }else if(front==0){
                for(int i=rear; i>=front; i++){
                    arr[i+1] = arr[i];
                    rear--;
                }
            }else{
                front--;
            }
            arr[front] = value;
        }
    }

    void enqueueBack(int value){
        if(isFull())
            System.out.println("Queue is full");
        else{
            if(rear==max-1){
                for(int i=front; i<=rear; i++){
                    arr[i-1] = arr[i];
                    front--;
                }
            }else{
                rear++;
            }
            arr[rear] = value;
            if(front==-1)
                front++;
        }
    }

    int dequeueFront(){
        int value = 0;
        if(isEmpty())
            System.out.println("Queue is empty");
        else{
            value = arr[front];
            arr[front] = 0;
            if(front == rear)
                front = rear = -1;
            else
                front++;
        }
        return value;
    }

    int dequeueBack(){
        int value = 0;
        if(isEmpty())
            System.out.println("Queue is empty");
        else{
            value = arr[rear];
            arr[rear] = 0;
            if(front == rear)
                front = rear = -1;
            else
                rear--;
        }
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
        DequeArray a = new DequeArray();

        System.out.println("Enter the total element you want to add: ");
        int n = sc.nextInt();

        for (int i=0; i<n; i++){
            System.out.println("Enter the "+(i+1)+" element:");
            int value = sc.nextInt();
            a.enqueueBack(value);
        }

        System.out.println(a.dequeueFront());
        System.out.println(a.dequeueBack());

//        System.out.println(a.peek());

        a.display();
    }
}
