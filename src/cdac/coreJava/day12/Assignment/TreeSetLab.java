package cdac.coreJava.day12.Assignment;

import java.util.TreeSet;

class Student implements Comparable<Student> {
    int studentId;
    String name;
    double marks;

    public Student(int studentId, String name, double marks){
        this.studentId = studentId;
        this.name = name;
        this.marks = marks;
    }

    public String toString(){
        return studentId + " " + name + " " + marks;
    }

    public int compareTo(Student s){
        if(this.studentId > s.studentId)
            return 1;
        else if(this.studentId < s.studentId)
            return -1;
        else
            return 0;
    }
}

public class TreeSetLab {
    public static void main(String[] args) {

        TreeSet<Student> s = new TreeSet<>();

        s.add(new Student(101, "Prachi", 3.8));
        s.add(new Student(105, "Shristi", 3.2));
        s.add(new Student(101, "Akansha", 3.5));
        s.add(new Student(103, "Neha", 4.0));
        s.add(new Student(101, "Saumya", 3.8));

        System.out.println(s);
    }
}