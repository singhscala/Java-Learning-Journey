package cdac.coreJava.day12.Assignment;

import java.util.ArrayList;
import java.util.Scanner;

class Item {
    String name;
    int price;
    int qty;

    public Item(String name, int price, int qty) {
        this.name = name;
        this.price = price;
        this.qty = qty;
    }

    public String toString() {
        return "Item{" + name + ", " + price + ", " + qty + "}";
    }
}

public class ShoppingCart {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Item> list = new ArrayList<>();

        System.out.println("Enter number of items:");
        int n = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < n; i++){
            System.out.println("Enter item name:");
            String name = sc.nextLine();

            System.out.println("Enter price:");
            int price = sc.nextInt();

            System.out.println("Enter quantity:");
            int qty = sc.nextInt();
            sc.nextLine();

            list.add(new Item(name, price, qty));
        }

        System.out.println("Cart:");
        System.out.println(list);

        System.out.println("Enter item name to remove:");
        String rem = sc.nextLine();
        list.removeIf(i -> i.name.equalsIgnoreCase(rem));

        System.out.println("Updated Cart:");
        System.out.println(list);

        int total = 0;
        for(Item i : list){
            total += i.price * i.qty;
        }

        System.out.println("Total Price:");
        System.out.println(total);
    }
}