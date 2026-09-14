package cdac.coreJava.DataStructure.Queue;

public class PriorityQueue {
    int max;
    Element[] arr;
    int front, rear;

    PriorityQueue(){
        max = 10;
        arr = new Element[max];
        front = rear = -1;
    }

    boolean isEmpty(){
        if(front==-1)
            return true;
        return false;
    }

    boolean isFull(){
        if(rear==max-1)
            return true;
        return false;
    }

    void enqueue(int value, int priority, int order){
        if(isFull()){
            System.out.println("Queue is full");
        }
        else {
            Element e = new Element(value, priority, order);
            if (isEmpty()) {
                front++;
                arr[++rear] = e;
            }
            else {
                int i;
                for (i = rear; i >= front; i--) {
                    if (arr[i].priority > e.priority) {
                        arr[i + 1] = arr[i];
                    } else if (arr[i].priority == e.priority
                            && arr[i].order > e.order) {
                        arr[i + 1] = arr[i];
                    } else {
                        break;
                    }
                }
                arr[i + 1] = e;
                rear++;
            }
        }
    }

    int dequeue(){
        int value = 0;
        if(isEmpty())
            System.out.println("Queue is empty");
        else{
            value = arr[front].data;
            if(front==rear)
                front = rear = -1;
            else{
                front++;
            }
        }
        return value;
    }

    void display(){
        if(isEmpty())
            System.out.println("Queue is empty");
        else{
            for (int i=front; i<=rear; i++){
                System.out.print(arr[i].data+" ");
            }
        }
    }
}
