package cdac.coreJava.DataStructure.LinkedList;

import java.util.Scanner;

public class LinkedList {
    Node head;
    int count;

    public LinkedList() {
        head = null;
        count = 0;
    }

    public void createList(int n){
        int value;
        Scanner sc = new Scanner(System.in);
        for (int i =0; i<n; i++){
            System.out.println("Enter the "+(i+1)+" value: ");
            value = sc.nextInt();
            Node newNode = new Node(value);

            if(head == null){
                head = newNode;
            }else{
                Node r = head;
                while (r.next!=null){
                    r = r.next;
                }
                r.next = newNode;
            }
            count++;
        }
    }

    public void traversal(){
        if(head == null){
            System.out.println("List is Empty");
        }else{
            System.out.println("Values of LinkedList: ");
            Node r = head;
            while (r.next!=null){
                System.out.print(r.data+"->");
                r= r.next;
            }
            System.out.print(r.data);
            System.out.println();
        }
    }

    public void addBeg(int value){
        Node newNode = new Node(value);
        newNode.next = head.next;
        head = newNode;
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

    public void addLast(int value){
        Node newNode = new Node(value);
        Node r = head;
        while (r.next!=null){
            r=r.next;
        }
        r.next = newNode;
        count++;
    }

    public void removeBeg(){
        if(head==null){
            System.out.println("List is Empty");
        }else if(head.next == null){
            head = null;
        }else{
            head = head.next;
            count--;
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

    public void removeLast(){
        if(head==null){
            System.out.println("List is Empty");
        }else if(head.next == null){
            head = null;
        }else{
            Node r = head;
            while(r.next.next!=null){
                r=r.next;
            }
            r.next = null;
            count--;
        }
    }

    public void removeValue(int value){
        if(head == null) {
            System.out.println("List is Empty");
            return;
        }else if(head.data == value){
            head = head.next;
            count--;
            return;
        }else{
            Node r = head;
            while(r.next != null){
                if(r.next.data == value){
                    r.next = r.next.next;
                    count--;
                    return;
                }else{
                    r = r.next;
                }
            }
            System.out.println("Not Found");
        }
    }

    public void removeValue1(int value){
        int temp=1;
        boolean found = false;
        if(head==null){
            System.out.println("List is Empty");
        }else{
            Node r = head;
            while (r!=null){
                if(r.data == value){
                    found = true;
                    break;
                }
                else{
                    r = r.next;
                    temp++;
                }
            }
            if(!found){
                System.out.println("Value is not found");
            }
            if(temp==1){
                removeBeg();
            }else if(temp == count){
                removeLast();
            }
            else{
                removeBetween(temp);
            }
        }
    }

    public void reverseByAddress(){
        if(head == null){
            System.out.println("List is Empty");
        }else{
            Node prev, curr, fwd;
            prev = null;
            curr = null;
            fwd = head;

            while(fwd!=null){
                prev = curr;
                curr = fwd;
                fwd = fwd.next;
                curr.next = prev;
            }
            head = curr;
        }
    }

    public Node recursiveReverse(Node temp){
        if(temp == null || temp.next == null){
            return temp;
        }else{
            Node newNode = recursiveReverse(temp.next);
            temp.next.next = temp;
            temp.next = null;
            return newNode;
        }
    }

    public void sortCreate(int n){
        int value;
        Scanner sc = new Scanner(System.in);
        for (int i=0; i<n; i++){
            System.out.println("Enter the "+(i+1)+" value");
            value = sc.nextInt();
            Node newNode = new Node(value);
            if(head == null || value < head.data){
                newNode.next = head;
                head = newNode;
            }else{
                Node r = head;
                while(r.next != null){
                    if(r.next.data >= value){
                        break;
                    }
                    r = r.next;
                }
                newNode.next = r.next;
                r.next = newNode;
            }
            count++;
        }
    }

    public void concatenate(LinkedList list2) {
        if (this.head == null) {
            this.head = list2.head;
        } else {
            Node r = this.head;
            while (r.next != null) {
                r = r.next;
            }
            r.next = list2.head;
        }
        this.count += list2.count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        LinkedList l = new LinkedList();
//        System.out.println("Enter the length of LinkedList: ");
//        int n = sc.nextInt();
//
//        l.sortCreate(n);
//        l.traversal();
//
//        l.createList(n);
//        l.traversal();
//
//        System.out.println("Enter the position: ");
//        int pos = sc.nextInt();
//        System.out.println("Enter the value: ");
//        int value = sc.nextInt();
//        l.addBetween(pos, value);
//        l.traversal();
//
//        System.out.println("Enter the value you want to add to the beginning");
//        int v = sc.nextInt();
//        l.addBeg(v);
//        l.traversal();
//
//        System.out.println("Enter the value you want to add to the last");
//        int s = sc.nextInt();
//        l.addLast(s);
//        l.traversal();
//
//        l.removeBeg();
//        System.out.println("After remove from beginning: ");
//        l.traversal();
//
//        System.out.println("Enter the position you want to delete: ");
//        int d = sc.nextInt();
//        l.removeBetween(d);
//        l.traversal();
//
//        l.removeLast();
//        System.out.println("After remove at last: ");
//        l.traversal();
//
//        System.out.println("Enter the value you want to remove: ");
//        int e = sc.nextInt();
//        l.removeValue(e);
//        l.traversal();
//
//        System.out.println("Enter the value you want to remove: ");
//        int e1 = sc.nextInt();
//        l.removeValue1(e1);
//        l.traversal();
//
//        l.reverseByAddress();
//        l.traversal();
//
//        l.head = l.recursiveReverse(l.head);
//        l.traversal();

        LinkedList l1 = new LinkedList();
        LinkedList l2 = new LinkedList();
        System.out.println("Enter number of elements for List 1:");
        int n1 = sc.nextInt();
        l1.createList(n1);

        System.out.println("Enter number of elements for List 2:");
        int n2 = sc.nextInt();
        l2.createList(n2);

        System.out.println("List 1:");
        l1.traversal();

        System.out.println("List 2:");
        l2.traversal();

        l1.concatenate(l2);

        System.out.println("After Concatenation:");
        l1.traversal();
    }
}
