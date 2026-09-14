package cdac.coreJava.day2.Assignment;

import java.util.Scanner;

public class MenuDriven {

    public void menu(){
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Add two number");
        System.out.println("2. Subtract two number");
        System.out.println("3. Multiple two number");
        System.out.println("4. Exit");

        int s = sc.nextInt();
        switch(s){
            case 1 -> {
                System.out.println(" Enter two number to add: ");
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();
                System.out.println(num1+num2);
            }
            case 2-> {
                System.out.println(" Enter two number to subtract ");
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();
                System.out.println(num1-num2);
            }
            case 3 -> {
                System.out.println(" Enter two number to multiple ");
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();
                System.out.println(num1*num2);
            }
            default -> System.out.println("Exit");
        }
    }

    public static void main(String[] args){
        MenuDriven m = new MenuDriven();
        m.menu();
    }
}
