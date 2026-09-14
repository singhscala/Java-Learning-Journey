package cdac.jdbc.StudentManagement;

import cdac.jdbc.Database.DbConfig;

import java.sql.*;
import java.util.Scanner;

public class StudentRecord {

    int rollNo;
    String name;
    String address;
    String courseName;
    Connection con;
    Statement stmt;
    ResultSet rs;
    DbConfig db;
    Scanner sc = new Scanner(System.in);

    StudentRecord(){
        try{
            db = new DbConfig();
            con = db.getCon();
            stmt = con.createStatement();
        }
        catch (SQLException c){
            System.out.println(c);
        }
    }

    void addStudent(){
        try{
            System.out.println("Enter the rollNo");
            rollNo = sc.nextInt();
            System.out.println("Enter the name");
            name = sc.next();
            System.out.println("Enter the address");
            address = sc.next();
            System.out.println("Enter the courseName");
            courseName = sc.next();
            stmt.execute("Insert into Students values"
                    +"('"+rollNo+"', '"+name+"', '"+address+"', '"+courseName+"')");
            System.out.println("Data is inserted");
        }
        catch (SQLException e){
            System.out.println(e);
        }
    }

    void deleteStudent(){
        try{
            System.out.println("Enter the rollNo you want to delete");
            rollNo = sc.nextInt();
            stmt.execute("Delete from students where rollNo = '"+rollNo+"'");
            System.out.println("Data is deleted");
        }
        catch (SQLException e){
            System.out.println(e);
        }
    }


    void updateStudent(){
        try{
            System.out.println("Enter the rollNo you want to update");
            rollNo = sc.nextInt();
            System.out.println("Enter the updated courseName");
            courseName = sc.next();
            stmt.execute("Update students set courseName = '"+courseName+"' where rollNo = '"+rollNo+"'");
            System.out.println("Data is updated");
        }
        catch (SQLException e){
            System.out.println(e);
        }
    }

    void viewStudent(){
        try{
            rs = stmt.executeQuery("Select * from students");
            while(rs.next()){
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "
                        +rs.getString(3)+" "+rs.getString(4));
            }
        }
        catch (SQLException e){
            System.out.println(e);
        }
    }

    void searchStudent(){
        try{
            System.out.println("Enter the rollNo you want to search");
            rollNo = sc.nextInt();
            rs = stmt.executeQuery("Select * from students where rollNo = '"+rollNo+"'");
            rs.next();
            System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "
                    +rs.getString(3)+" "+rs.getString(4));
        }
        catch (SQLException e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentRecord sr = new StudentRecord();
        System.out.println("1. Add Student"
                +"\n2. Delete Student"
                +"\n3. Update Student"
                +"\n4. View All Students"
                +"\n5. Search Student");

        int choice = sc.nextInt();
        switch (choice){
            case 1 -> sr.addStudent();
            case 2 -> sr.deleteStudent();
            case 3 -> sr.updateStudent();
            case 4 -> sr.viewStudent();
            case 5 -> sr.searchStudent();
            default -> System.out.println("Invalid Choice");
        }
    }
}