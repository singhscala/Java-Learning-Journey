package cdac.coreJava.day6.Assignment.constructor;

import java.util.Scanner;

public class Book {
    private String title;
    private String author;
    private String isbn;

    public Book(String title, String author, String isbn){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public void display(){

        System.out.println(this.title + " " + this.author + " " + this.isbn);

    }

    public static void searchBook(Book[] lib, String title){
        boolean flag = true;
        for (int i = 0; i<lib.length; i++){
            if(lib[i] != null){
                if(title.equals(lib[i].title)){
                    flag = false;
                    System.out.println("Found");
                    System.out.println(lib[i].title + " " + lib[i].author + " " + lib[i].isbn);
                }
            }
        }
        if(flag){
            System.out.println("Not Found");
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a,b,c,d;
        Book[] lib = new Book[5];
        for(int i = 0; i< lib.length; i++){
            System.out.println("Enter the title, author and ISBN: ");
            a=sc.nextLine();
            b=sc.nextLine();
            c=sc.nextLine();
            lib[i] = new Book(a, b, c);
        }

        for (Book book : lib) {
            book.display();
        }

        System.out.println("Enter the book name you want to search: ");
        d=sc.nextLine();
        searchBook(lib, d);
    }
}
