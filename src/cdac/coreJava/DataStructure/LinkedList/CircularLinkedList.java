package cdac.coreJava.DataStructure.LinkedList;

import java.util.Scanner;

public class CircularLinkedList {
    Node head;
    Node last;
    int count;

    public CircularLinkedList() {
        head = null;
        last = null;
        count = 0;
    }

    public void createList(int n){
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<n; i++){
            System.out.println("Enter the "+(i+1)+" value");
            Node newNode = new Node(sc.nextInt());
            if(head == null){
                head = newNode;
            }else{
                last.next = newNode;
            }
            last = newNode;
            last.next = head;
            count++;
        }
    }

    public void display(){
        Node r = head;
        do{
            System.out.print(r.data+" ");
            r = r.next;
        }while (r!=head);
        System.out.println();
    }

    public void addbeg(int value){
        Node newNode = new Node(value);
        if(head == null){
            last = newNode;
        }else{
            newNode.next = head;
        }
        head = newNode;
        last.next = head;
        count++;
    }

    public void addlast(int value){
        Node newNode = new Node(value);
        if(head == null){
            head = newNode;
        }else{
            last.next = newNode;
        }
        last = newNode;
        last.next = head;
        count++;
    }

    public void addBetween(int pos, int value){
        if(pos>=count || count<2){
            System.out.println("Invalid Position");
        }else{
            Node newNode = new Node(value);
            Node r = head;
            for (int i=1; i<pos; i++){
                r = r.next;
            }
            newNode.next = r.next;
            r.next = newNode;
            count++;
        }
    }

    public void removebeg(){
        if(head == null){
            System.out.println("List is Empty");
        }else if(head == last){
            head = last = null;
        }else{
            head = head.next;
            last.next = head;
        }
        count--;
    }

    public void removelast(){
        if(head == null){
            System.out.println("List is Empty");
        }else if(head == last){
            head = last = null;
        }else{
            Node r = head;
            while(r.next!=last){
                r = r.next;
            }
            r.next = head;
            last = r;
        }
    }

    public void removeBetween(int pos){
        if(pos>count){
            System.out.println("Invalid Position");
        }else{
            Node r = head;
            for (int i=1; i<pos-1; i++){
                r = r.next;
            }
            r.next = r.next.next;
            count--;
        }
    }

    public void search(int value){
        Node r =head;
        boolean flag = false;
        do{
            if(r.data == value){
                flag = true;
                System.out.println("Found");
                break;
            }
            r = r.next;
        }while (r!=head);
        if(!flag){
            System.out.println("Not found");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CircularLinkedList cl = new CircularLinkedList();
        System.out.println("Enter the length of List: ");
        int n = sc.nextInt();
        cl.createList(n);
        cl.display();

        System.out.println("Enter the value you want to add in beginning: ");
        int b = sc.nextInt();
        cl.addbeg(b);
        cl.display();

        System.out.println("Enter the value you want to add in last: ");
        int l = sc.nextInt();
        cl.addlast(l);
        cl.display();

        System.out.println("Enter the position: ");
        int p = sc.nextInt();
        System.out.println("Enter the value: ");
        int a = sc.nextInt();
        cl.addBetween(p, a);
        cl.display();

        cl.removebeg();
        cl.display();

        cl.removelast();
        cl.display();

        System.out.println("Enter the position you want to remove: ");
        int p1 = sc.nextInt();
        cl.removeBetween(p1);

        System.out.println("Enter the value you want to search: ");
        int s = sc.nextInt();
        cl.search(s);
    }
}
