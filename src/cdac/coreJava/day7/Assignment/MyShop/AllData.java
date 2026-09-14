package cdac.coreJava.day7.Assignment.MyShop;

import java.util.Scanner;

public class AllData {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Flower f;
        Customer c;
        String input;

        String name;
        int petals;
        int price;
        int piece;
        int total_price;

        while (true){
            System.out.println("1. Flower \n2. Customer\n3. Enter 0 to exit");
            input = sc.next();
            if(input.equals("0")){
                break;
            }
            switch (input){
                case "Flower" ->{
                    System.out.println("Enter the flower name: ");
                    sc.nextLine();
                    name = sc.nextLine();
                    System.out.println("Enter the petals: ");
                    petals = sc.nextInt();
                    System.out.println("Enter the price: ");
                    price = sc.nextInt();
                    System.out.println("Enter the piece: ");
                    piece = sc.nextInt();
                    System.out.println("Enter the total price: ");
                    total_price = sc.nextInt();
                    f = new Flower(name, petals, price, piece, total_price);
                    int discount = f.calculateDiscount();
                    f.display(discount);
                }
                case "Customer" ->{
                    c= new Customer();
                    c.getData();
                    c.showData();
                }
            }
        }
    }
}
