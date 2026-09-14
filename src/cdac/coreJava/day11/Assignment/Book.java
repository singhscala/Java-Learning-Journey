package cdac.coreJava.day11.Assignment;

import java.io.*;
import java.util.Scanner;

public class Book implements Serializable{
    String bName;
    String aName;
    int price;

    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Book Name: ");
        bName = sc.nextLine();
        System.out.println("Enter the Author Name: ");
        aName = sc.nextLine();
        System.out.println("Enter the Price: ");
        price = sc.nextInt();
    }

    void display(){
        System.out.println("Book Name: "+bName+" \nAuthor Name: "+aName+"\nPrice: "+price);
    }

    void writeToFile(){
        Book b = new Book();
        try {
            b.input();
            File f = new File("Library.dat");
            int length = (int) f.length();
            if (length == 0) {
                ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("Library.dat"));
                o.writeObject(b);
            } else {
                Appendable a = new Appendable(new FileOutputStream("Library.dat", true));
                a.writeObject(b);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void readfromFile(){
        Book b = new Book();
        try {
            ObjectInputStream i = new ObjectInputStream(new FileInputStream("Library.dat"));
            do{
                b = (Book)i.readObject();
                b.display();
            }while (b!=null);
        }
        catch (Exception e){
            System.out.println("End of File");
        }
    }

    public static void main(String[] args) {
        Book b = new Book();
        Scanner sc = new Scanner(System.in);
        int choice;

        System.out.println("Enter your choice: \n"+
                " 1) store data to file\n" +
                " 2) read data fom file\n" +
                " 3) exit");
        choice = sc.nextInt();

        switch (choice) {
            case 1 -> {
                b.writeToFile();
            }
            case 2 -> {
                b.readfromFile();
            }
            default -> {
                System.out.println("Wrong choice");
            }
        }
    }
}
