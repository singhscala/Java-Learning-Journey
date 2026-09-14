package cdac.coreJava.day12.Assignment;

import java.util.ArrayList;
import java.util.Scanner;

class Catalog {
    String author;
    String title;
    String ISBN;

    public Catalog(String author, String title, String ISBN){
        this.author = author;
        this.title = title;
        this.ISBN = ISBN;
    }

    public String toString() {
        return "Catalog{" + author + ", " + title + ", " + ISBN + "}";
    }
}

public class LibraryCatalog {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Catalog> list = new ArrayList<>();

        System.out.println("Enter the total data you want to store: ");
        int n = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < n; i++){
            System.out.println("Enter the author: ");
            String author = sc.nextLine();
            System.out.println("Enter the title: ");
            String title = sc.nextLine();
            System.out.println("Enter ISBN: ");
            String isbn = sc.nextLine();
            list.add(new Catalog(author, title, isbn));
        }

        System.out.println(list);

        String rem = sc.nextLine();
        list.removeIf(c -> c.ISBN.equals(rem));

        String search = sc.nextLine();
        for(Catalog c : list){
            if(c.title.equalsIgnoreCase(search)){
                System.out.println(c);
            }
        }

        System.out.println(list);
    }
}