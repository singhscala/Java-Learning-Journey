package cdac.coreJava.DataStructure.LinkedList;

import java.util.Scanner;

public class doublyLinkedList {
    dNode head;
    dNode last;
    int count;

    doublyLinkedList(){
        head = null;
        last = null;
        count = 0;
    }

    public void createList(int n){
        Scanner sc = new Scanner(System.in);
        for (int i=0; i<n; i++){
            System.out.println("Enter the "+(i+1)+" value: ");
            dNode newNode = new dNode(sc.nextInt());
            if(head == null){
                head = newNode;
            }else{
                last.next = newNode;
                newNode.prev = last;
            }
            last = newNode;
            count++;
        }
    }

    public void addLast(int value){
        dNode newNode = new dNode(value);
        if(head == null){
            head = newNode;
        }else{
            last.next = newNode;
            newNode.prev = last;
        }
        last = newNode;
        count++;
    }

    public void addBeg(int value){
        dNode newNode = new dNode(value);
        if(head == null){
            last = newNode;
        }else{
            newNode.next = head;
            head.prev = newNode;
        }
        head = newNode;
        count++;
    }

    public void addBetween(int pos, int value){
        if(pos>=count||count<2){
            System.out.println("Invalid position");
        }else{
            dNode newNode = new dNode(value);
            dNode r = head;
            for (int i=0; i<pos; i++){
                r = r.next;
            }
            r.next.prev = newNode;
            newNode.next = r.next;
            r.next = newNode;
            newNode.prev = r;
            count++;
        }
    }

    public void removeBeg(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }else if(head == last){
            head = last = null;
        }else{
            head = head.next;
            head.prev = null;
        }
        count--;
    }

    public void removeLast(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }else if(head==last){
            head = last = null;
        }else{
            last = last.prev;
            last.next = null;
        }
        count--;
    }

    public void removeBetween(int pos){
        if (pos>=count || count<2){
            System.out.println("Invalid position");
            return;
        }else if(head == last){
            head = last = null;
        }else{
            dNode r = head;
            for (int i=1; i<pos-1; i++){
                r=r.next;
            }
            r.next.next.prev = r;
            r.next = r.next.next;
        }
        count--;
    }

    public void displayForward(){
        dNode r = head;
        while (r.next!=null){
            System.out.print(r.data+"->");
            r = r.next;
        }
        System.out.print(r.data);
        System.out.println();
    }

    public void displayBackword(){
        dNode r = last;
        while (r.prev!=null){
            System.out.print(r.data+"->");
            r = r.prev;
        }
        System.out.print(r.data);
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        doublyLinkedList dl = new doublyLinkedList();

        System.out.println("Enter the length of list: ");
        int n = sc.nextInt();
        dl.createList(n);
        dl.displayForward();

        System.out.println("Enter the value you want to add at beginning: ");
        int b = sc.nextInt();
        dl.addBeg(b);
        dl.displayForward();

        System.out.println("Enter the value you want to add at last: ");
        int l = sc.nextInt();
        dl.addLast(l);
        dl.displayForward();

        System.out.println("Enter the position: ");
        int p = sc.nextInt();
        System.out.println("Enter the value: ");
        int m = sc.nextInt();
        dl.addBetween(p, m);
        dl.displayForward();

        dl.removeBeg();
        dl.displayForward();

        dl.removeLast();
        dl.displayForward();

        System.out.println("Enter the position you want to remove: ");
        int r = sc.nextInt();
        dl.removeBetween(r);
        dl.displayForward();

        dl.displayBackword();
    }
}
