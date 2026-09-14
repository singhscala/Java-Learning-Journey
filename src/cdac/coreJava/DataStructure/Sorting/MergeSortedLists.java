package cdac.coreJava.DataStructure.Sorting;

import cdac.coreJava.DataStructure.LinkedList.Node;

public class MergeSortedLists {

    Node merge(Node l1, Node l2) {
        Node temp = new Node(0);
        Node current = temp;

        while (l1 != null && l2 != null) {
            if (l1.data <= l2.data) {
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }

        if (l1 != null) current.next = l1;
        if (l2 != null) current.next = l2;

        return temp.next;
    }
}