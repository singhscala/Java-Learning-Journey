package cdac.coreJava.DataStructure.ArrayList;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList arr = new ArrayList();

        arr.display();
        System.out.println("Size: "+arr.size());
        System.out.println("Capacity: "+arr.capacity());

        System.out.println("Enter the length of list: ");
        int l = sc.nextInt();
        arr.createList(l);
        arr.display();
        System.out.println("Size: "+arr.size());
        System.out.println("Capacity: "+arr.capacity());

        System.out.println("Enter the length of list: ");
        int l1 = sc.nextInt();
        arr.createList(l1);
        arr.display();
        System.out.println("Size: "+arr.size());
        System.out.println("Capacity: "+arr.capacity());

        System.out.println("Enter the value you want to insert at last: ");
        int a = sc.nextInt();
        arr.append(a);
        arr.display();
        System.out.println("Size: "+arr.size());
        System.out.println("Capacity: "+arr.capacity());

        System.out.println("Enter the position: ");
        int p = sc.nextInt();
        System.out.println("Enter the value: ");
        int v = sc.nextInt();
        arr.insertAtPos(p, v);
        arr.display();
        System.out.println("Size: "+arr.size());
        System.out.println("Capacity: "+arr.capacity());

        System.out.println("Enter the position you want to delete: ");
        int d = sc.nextInt();
        arr.deleteAtPos(d);
        arr.display();
        System.out.println("Size: "+arr.size());
        System.out.println("Capacity: "+arr.capacity());

        System.out.println("Enter the value you want to search: ");
        int s = sc.nextInt();
        arr.search(s);

        arr.sort();
        arr.display();
    }
}
