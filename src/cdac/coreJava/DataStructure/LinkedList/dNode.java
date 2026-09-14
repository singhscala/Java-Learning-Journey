package cdac.coreJava.DataStructure.LinkedList;

public class dNode {
    int data;
    dNode prev;
    dNode next;

    dNode(){
        data = 0;
        prev = null;
        next = null;
    }

    dNode(int data){
        this.data = data;
        prev = null;
        next = null;
    }
}
