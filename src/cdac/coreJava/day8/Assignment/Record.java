package cdac.coreJava.day8.Assignment;

import java.util.Scanner;

class Course{
    Scanner sc = new Scanner(System.in);
    int cid;
    String cname;
    long fees;

    void getCourse(){
        System.out.println("Id: "+cid+"\nName: "+cname+"\nFees: "+fees);
    }

    void setCourse(){
        System.out.println("Enter the id: ");
        cid = sc.nextInt();
        System.out.println("Enter the name: ");
        cname = sc.next();
        System.out.println("Enter the fees: ");
        fees = sc.nextLong();
    }
}

class Student1{
    int rollNo;
    String name;

    Course course;

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class Record {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student1 s = new Student1();
        Course c = new Course();

        System.out.println("Enter the rollNo: ");
        s.setRollNo(sc.nextInt());

        System.out.println("Enter the Name: ");
        s.setName(sc.next());

        c.setCourse();

        s.setCourse(c);

        System.out.println("\nStudent Details");
        System.out.println("Roll No: " + s.getRollNo());
        System.out.println("Name: " + s.getName());

        System.out.println("\nCourse Details");
        s.getCourse().getCourse();
    }
}