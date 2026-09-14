package cdac.coreJava.day12.Assignment;

import java.util.TreeSet;

class Employee implements Comparable<Employee>{
    int id;
    String name;

    public Employee(int id, String name){
        this.id = id;
        this.name = name;
    }

    public String toString(){
        return id+" "+name;
    }

    @Override
    public int compareTo(Employee o) {
        if(this.id>o.id){
            return 1;
        } else if (this.id<o.id) {
            return -1;
        }
        return 0;
    }
}

public class EmpData{
    public static void main(String[] args) {
        TreeSet<Employee> e = new TreeSet<Employee>();
        e.add(new Employee(1, "Prachi"));
        e.add(new Employee(4, "Shristi"));
        e.add(new Employee(3, "Akansha"));

        System.out.println(e);
    }
}
