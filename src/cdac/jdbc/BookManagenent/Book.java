package cdac.jdbc.BookManagenent;

import cdac.jdbc.Database.DbConfig;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Book {
    Scanner sc = new Scanner(System.in);
    int isbn;
    String bname;
    String aname;
    int price;
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    DbConfig db;

    Book() {
        db = new DbConfig();
        con = db.getCon();
    }

    public void addBook() throws SQLException {
        System.out.println("Enter the isbn, Book name, Author name, price");
        isbn=sc.nextInt();
        bname=sc.next();
        aname=sc.next();
        price=sc.nextInt();
        ps = con.prepareStatement("Insert into book values(?,?,?,?)");
        ps.setInt(1, isbn);
        ps.setString(2, bname);
        ps.setString(3, aname);
        ps.setInt(4, price);
        ps.execute();
        System.out.println("Data is entered");
    }

    public void updateBook() throws Exception {
        System.out.println("Enter the price and the isbn in which you want to update");
        price=sc.nextInt();
        isbn=sc.nextInt();
        ps = con.prepareStatement("Update book set price = ? where isbn = ?");
        ps.setInt(1, price);
        ps.setInt(2, isbn);
        ps.execute();
        System.out.println("Data is updated");
    }

    public void deleteBook() throws Exception {
        System.out.println("Enter the isbn you want to delete");
        isbn=sc.nextInt();
        ps = con.prepareStatement("Delete from book where isbn = ?");
        ps.setInt(1, isbn);
        ps.execute();
        System.out.println("Data is deleted");
    }

    public void displayBook() throws Exception {
        ps = con.prepareStatement("Select * from book ");
        rs = ps.executeQuery();

        while (rs.next()) {
            System.out.println(rs.getInt(1) + " " + rs.getString(2));
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Book b = new Book();
        System.out.println("1. Add Book"
                + "\n2. Update Book"
                + "\n3. Delete Book"
                + "\n4. View All Books");

        int choice = sc.nextInt();
        switch (choice) {
            case 1 -> b.addBook();
            case 2 -> b.updateBook();
            case 3 -> b.deleteBook();
            case 4 -> b.displayBook();
            default -> System.out.println("Invalid Choice");
        }
    }
}