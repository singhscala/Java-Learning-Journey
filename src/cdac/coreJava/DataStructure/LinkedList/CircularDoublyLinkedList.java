package cdac.coreJava.DataStructure.LinkedList;

import java.util.Scanner;

public class CircularDoublyLinkedList {

    dNode head;
    dNode last;
    int count;

    public CircularDoublyLinkedList() {
        head = null;
        last = null;
        count = 0;
    }

    public void createList(int n) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < n; i++) {
            System.out.println("Enter value " + (i + 1) + ": ");
            dNode newNode = new dNode(sc.nextInt());

            if (head == null) {
                head = last = newNode;
                head.next = head;
                head.prev = head;
            } else {
                newNode.prev = last;
                newNode.next = head;

                last.next = newNode;
                head.prev = newNode;

                last = newNode;
            }
            count++;
        }
    }

    public void display() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }

        dNode r = head;
        do {
            System.out.print(r.data + " ");
            r = r.next;
        } while (r != head);

        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CircularDoublyLinkedList cd = new CircularDoublyLinkedList();

        System.out.println("Enter number of nodes:");
        int n = sc.nextInt();

        cd.createList(n);

        System.out.println("Circular Doubly Linked List:");
        cd.display();
    }
}