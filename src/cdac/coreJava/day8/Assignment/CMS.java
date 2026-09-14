package cdac.coreJava.day8.Assignment;

import java.util.Scanner;

interface College {

    String COLLEGE_NAME = "ABC College";
    void getDetails();
    void showDetails();
    default void generalMessage() {
        System.out.println("General Message");
    }
    static void displayNotice() {
        System.out.println("General Message");
    }
}

class Teacher {
    String name;
    String qualification;
}

class Department extends Teacher implements College {

    int deptNo;
    String deptName;
    Scanner sc = new Scanner(System.in);

    @Override
    public void getDetails() {

        System.out.print("Enter Teacher Name: ");
        name = sc.nextLine();

        System.out.print("Enter Qualification: ");
        qualification = sc.nextLine();

        System.out.print("Enter Department Name: ");
        deptName = sc.nextLine();

        if(deptName.equalsIgnoreCase("IT")) {
            deptNo = 10;
        }
        else if(deptName.equalsIgnoreCase("Management")) {
            deptNo = 20;
        }
        else {
            System.out.println("Not a valid Record");
            System.exit(0);
        }
    }

    @Override
    public void showDetails() {

        System.out.println("College Name: " + College.COLLEGE_NAME);
        System.out.println("Teacher Name: " + name);
        System.out.println("Qualification: " + qualification);
        System.out.println("Department Name: " + deptName);
        System.out.println("Department Number: " + deptNo);
    }
}

public class CMS {

    public static void main(String[] args) {

        Department d = new Department();
        d.generalMessage();
        College.displayNotice();
        d.getDetails();
        d.showDetails();
    }
}