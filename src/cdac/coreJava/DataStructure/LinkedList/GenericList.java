package cdac.coreJava.DataStructure.LinkedList;

public class GenericList<T> {
    GenericNode<T> head;
    int count;

    public GenericList() {
        head = null;
        count = 0;
    }

    public void addBeg(T value){
        GenericNode<T> newNode = new GenericNode<T>(value);
        if(head==null){
            head = newNode;
        }
        newNode.next = head.next;
        head = newNode;
        count++;
    }

    public void addBetween(int pos, T value){
        if(pos>=count || count<2){
            System.out.println("Invalid Position");
        }else{
            GenericNode<T> newNode = new GenericNode<T>(value);
            GenericNode<T> r = head;
            for (int i=1; i<pos; i++){
                r = r.next;
            }
            newNode.next = r.next;
            r.next = newNode;
            count++;
        }
    }

    public void addLast(T value){
        GenericNode<T> newNode = new GenericNode<T>(value);
        if(head==null){
            head = newNode;
        }
        GenericNode<T> r = head;
        while (r.next!=null){
            r=r.next;
        }
        r.next = newNode;
        count++;
    }

    public void traversal(){
        if(head == null){
            System.out.println("List is Empty");
        }else{
            System.out.println("Values of LinkedList: ");
            GenericNode<T> r = head;
            while (r.next!=null){
                System.out.print(r.data+"->");
                r= r.next;
            }
            System.out.print(r.data);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        GenericList<Integer> gi = new GenericList<>();
        gi.addBeg(23);
        gi.addLast(33);
        gi.addBeg(2);
        gi.addLast(3);
        gi.addBeg(230);
        gi.addLast(330);
        gi.addBetween(2, 45);
        gi.traversal();

        GenericList<String> gs = new GenericList<>();
        gs.addBeg("Hi");
        gs.addLast("Hello");
        gs.addBeg("Bonjour");
        gs.addLast("Namaste");
        gs.addBeg("230");
        gs.addLast("330");
        gs.addBetween(2, "45");
        gs.traversal();

    }
}
