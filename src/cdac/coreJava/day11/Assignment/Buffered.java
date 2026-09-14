package cdac.coreJava.day11.Assignment;

import java.io.*;

public class Buffered {
    public static void main(String[] args) throws IOException {

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Name: ");
        String name = r.readLine();
        System.out.println("Age: ");
        int age = Integer.parseInt((r.readLine()));

        FileWriter w = new FileWriter("new.txt", true);
        w.write(name);
        w.write(String.valueOf(age));
        w.close();
    }
}
