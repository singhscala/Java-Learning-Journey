package cdac.jdbc.StaffMangement;

import cdac.jdbc.Database.DbConfig;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Staff {
    Scanner sc = new Scanner(System.in);
    int staffId;
    String sname;
    String dept;
    String dsgn;
    int salary;
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    DbConfig db;

    Staff(){
        db = new DbConfig();
        con = db.getCon();
    }

    public void addStaff() throws Exception {
        System.out.println("Enter the staff id, staff name, department, designation, salary");
        staffId=sc.nextInt();
        sname=sc.next();
        dept=sc.next();
        dsgn=sc.next();
        salary=sc.nextInt();
        ps = con.prepareStatement("Insert into staff values(?,?,?,?,?)");
        ps.setInt(1, staffId);
        ps.setString(2, sname);
        ps.setString(3, dept);
        ps.setString(4, dsgn);
        ps.setInt(5, salary);
        ps.execute();
        System.out.println("Data is entered");
    }

    public void updateStaff() throws Exception {
        System.out.println("Enter the salary and the staff-id in which you want to update");
        salary=sc.nextInt();
        staffId=sc.nextInt();
        ps = con.prepareStatement("Update staff set salary = ? where staff_id = ?");
        ps.setInt(1, salary);
        ps.setInt(2, staffId);
        ps.execute();
        System.out.println("Data is updated");
    }

    public void deleteStaff() throws Exception {
        System.out.println("Enter the isbn you want to delete");
        staffId=sc.nextInt();
        ps = con.prepareStatement("Delete from staff where staff_id = ?");
        ps.setInt(1, staffId);
        ps.execute();
        System.out.println("Data is deleted");
    }

    public void displayStaff() throws Exception {
        ps = con.prepareStatement("Select * from staff ");
        rs = ps.executeQuery();

        while (rs.next()) {
            System.out.println(rs.getInt(1) + " " + rs.getString(2)+" "+rs.getString(3)+" "
                    +rs.getString(4)+" "+ rs.getInt(5));
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Staff s = new Staff();
        System.out.println("1. Add Staff"
                + "\n2. Update Staff"
                + "\n3. Delete Staff"
                + "\n4. View All Staff");

        int choice = sc.nextInt();
        switch (choice) {
            case 1 -> s.addStaff();
            case 2 -> s.updateStaff();
            case 3 -> s.deleteStaff();
            case 4 -> s.displayStaff();
            default -> System.out.println("Invalid Choice");
        }
    }
}
