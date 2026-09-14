package cdac.coreJava.day6.Assignment.constructor;

import java.util.Scanner;

public class Students {
    String name;
    int id;
    double grade;

    public Students(String name, int id, double grade) {
        this.name = name;
        this.id = id;
        this .grade = grade;
    }

    public void display(){
        System.out.println("Name: "+this.name+"\nId: "+this.id+"\nGrade: "+this.grade);
    }

    public static void main(String[] args){
        Students[] s = new Students[3];
        Scanner sc = new Scanner(System.in);
        String n;
        int d;
        double g;
        for(int i = 0; i<s.length; i++){
            System.out.println("Enter the name, id and grade of "+(i+1)+" Student:");
            n=sc.nextLine();
            d=sc.nextInt();
            g=sc.nextDouble();
            sc.nextLine();

            s[i] = new Students(n, d, g);
        }
        for (int i = 0; i<s.length; i++){
            System.out.println("Detail of "+(i+1)+" Student:");
            s[i].display();
        }

        SortStudent s1 = new SortStudent();
        s1.sort(s);
    }
}
