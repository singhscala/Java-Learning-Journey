package cdac.coreJava.day12.Assignment;

import java.util.ArrayList;
import java.util.Scanner;

class Students {
    String name;
    int id;

    public Students(String name, int id){
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}

public class StudentDetails {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Students> list = new ArrayList<>();

        System.out.println("Enter total students: ");
        int size = sc.nextInt();

        for (int i = 0; i < size; i++) {
            System.out.println("Enter name: ");
            String name = sc.next();

            System.out.println("Enter id: ");
            int id = sc.nextInt();

            list.add(new Students(name, id));
        }

        System.out.println("Student List: ");
        System.out.println(list);

        System.out.println("Enter ID to remove: ");
        int removeId = sc.nextInt();

        list.removeIf(s -> s.id == removeId);
        System.out.println("Updated List: ");
        System.out.println(list);
    }
}