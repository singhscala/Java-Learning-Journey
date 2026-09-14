package cdac.coreJava.day12.Assignment;

import java.util.Comparator;
import java.util.PriorityQueue;

class Person{
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class PersonCompare implements Comparator<Person>{

    @Override
    public int compare(Person o1, Person o2) {
        return o1.name.compareTo(o2.name);
    }
}

class PersonCompare2 implements Comparator<Person>{

    @Override
    public int compare(Person o1, Person o2) {
        if(o1.age>o2.age){
            return 1;
        } else if (o1.age<o2.age) {
            return -1;
        }
        return 0;
    }
}

public class PersonData {
    public static void main(String[] args) {
        PriorityQueue<Person> p = new PriorityQueue<Person>(new PersonCompare());
        p.add(new Person("Prachi", 22));
        p.add(new Person("Shristi", 24));
        p.add(new Person("Akansha", 23));

        System.out.println(p.poll());
        System.out.println(p.poll());
        System.out.println(p.poll());

        PriorityQueue<Person> p1 = new PriorityQueue<Person>(new PersonCompare2());
        p1.add(new Person("Prachi", 22));
        p1.add(new Person("Shristi", 24));
        p1.add(new Person("Akansha", 23));

        System.out.println(p1);
    }

}
