package cdac.coreJava.DataStructure.Queue;

public class Element {
    int data;
    int priority;
    int order;

    Element(){
        data=0;
        priority=0;
        order=0;
    }

    Element(int data, int priority, int order){
        this.data=data;
        this.priority=priority;
        this.order=order;
    }
}
