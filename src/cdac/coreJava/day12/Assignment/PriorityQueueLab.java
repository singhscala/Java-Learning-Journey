package cdac.coreJava.day12.Assignment;

import java.util.Comparator;
import java.util.PriorityQueue;

class Item1 {
    String name;
    int priority;

    public Item1(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    public String toString() {
        return "Item1{" + name + ", " + priority + "}";
    }
}

class Item1Compare implements Comparator<Item1> {
    public int compare(Item1 i1, Item1 i2) {
        return i1.name.compareTo(i2.name);
    }
}

class Item1Compare2 implements Comparator<Item1> {
    public int compare(Item1 i1, Item1 i2) {
        if(i1.priority > i2.priority)
            return 1;
        else if(i1.priority < i2.priority)
            return -1;
        else
            return 0;
    }
}

public class PriorityQueueLab {
    public static void main(String[] args) {

        PriorityQueue<Item1> p = new PriorityQueue<>(new Item1Compare());
        p.add(new Item1("Pen", 2));
        p.add(new Item1("Book", 1));
        p.add(new Item1("Bag", 3));

        System.out.println(p.poll());
        System.out.println(p.poll());
        System.out.println(p.poll());

        PriorityQueue<Item1> p1 = new PriorityQueue<>(new Item1Compare2());
        p1.add(new Item1("Pen", 2));
        p1.add(new Item1("Book", 1));
        p1.add(new Item1("Bag", 3));

        System.out.println(p1.poll());
        System.out.println(p1.poll());
        System.out.println(p1.poll());
    }
}