package cdac.coreJava.day8.Assignment;

class Student {

    int studentId;
    String name;

    void setStudent(int id, String n) {
        studentId = id;
        name = n;
    }

    void displayStudent() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + name);
    }
}

class Marks extends Student {

    int marks1, marks2, marks3;
    void setMarks(int m1, int m2, int m3) {
        marks1 = m1;
        marks2 = m2;
        marks3 = m3;
    }

    void displayMarks() {
        System.out.println("Marks 1: " + marks1);
        System.out.println("Marks 2: " + marks2);
        System.out.println("Marks 3: " + marks3);
    }
}

class Result extends Marks {

    int total;
    double average;

    void calculateResult() {
        total = marks1 + marks2 + marks3;
        average = total / 3.0;
    }

    void displayResult()
    {
        displayStudent();

        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);
    }
}

public class StudentManagement {

    public static void main(String[] args) {

        Result r = new Result();

        r.setStudent(101, "Prachi");

        r.setMarks(85, 90, 80);

        r.calculateResult();

        r.displayMarks();

        r.displayResult();
    }
}