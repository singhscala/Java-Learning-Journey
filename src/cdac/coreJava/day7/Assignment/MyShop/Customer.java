package cdac.coreJava.day7.Assignment.MyShop;

import java.util.Scanner;

public class Customer {
    Scanner sc = new Scanner(System.in);
    String cname;
    String address;
    int pinCode;

    public void getData(){
        System.out.println("Enter the Customer name: ");
        cname = sc.nextLine();
        System.out.println("Enter the address: ");
        address = sc.nextLine();
        System.out.println("Enter the pinode: ");
        pinCode = sc.nextInt();
    }

    public void showData(){
        System.out.println("Customer Name: "+cname+"\nAddress: "+address+"\npincode: "+pinCode);
    }
}
