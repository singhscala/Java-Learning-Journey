package cdac.coreJava.DataStructure.LinkedList;

public class GenericNode<T> {
    T data;
    GenericNode<T> next;

    public GenericNode(T data) {
        this.data = data;
        this.next = null;
    }

    public GenericNode() {
        data = null;
        next = null;
    }
}
