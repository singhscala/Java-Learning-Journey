package cdac.coreJava.day6.Assignment.constructor;

import java.util.Scanner;

public class Car {
    String make;
    String model;
    int year;
    String color;

    public Car(){
        this.make = "date";
        this.model = "";
        this.year = 1990;
        this.color = "black";
    }

    public Car(String make, String model, int year, String color){
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    public void display(){
        System.out.printf("Make: "+make+" Model: "+model+" year: "+year+" color: "+color);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the make:");
        String mk = sc.nextLine();
        System.out.println("Enter the model:");
        String m = sc.nextLine();
        System.out.println("Enter the year:");
        int y = sc.nextInt();
        System.out.println("Enter the color:");
        String cl = sc.next();
        Car c = new Car();
        Car c1 = new Car(mk, m, y, cl);
        c.display();
        System.out.println();
        c1.display();
    }

}
