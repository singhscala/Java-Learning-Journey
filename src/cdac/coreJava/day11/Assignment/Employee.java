package cdac.coreJava.day11.Assignment;

import java.io.*;
import java.util.*;

public class Employee implements Serializable{

    int empNo;
    String name;
    String address;

    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Employee Number: ");
        empNo = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the Name: ");
        name = sc.nextLine();
        System.out.println("Enter the Address: ");
        address = sc.nextLine();
    }

    void display(){
        System.out.println("Employee Number: "+empNo+" \nName: "+name+"\nAddress: "+address);
    }

    public static void main(String[] args) {
        Employee e = new Employee();
        e.input();

        try {
            File f = new File("Employee1.dat");
            int length = (int)f.length();
            if(length == 0){
                ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("Employee1.dat"));
                o.writeObject(e);
            }else{
                Appendable a = new Appendable(new FileOutputStream("Employee1.dat", true));
                a.writeObject(e);
            }

            ObjectInputStream i = new ObjectInputStream(new FileInputStream("Employee1.dat"));
            do{
                e = (Employee)i.readObject();
                e.display();
            }while (e!=null);

        }
        catch (Exception e1){
            e1.printStackTrace();
        }

    }
}
