package cdac.coreJava.day11.Assignment;

import java.io.*;

public class IOExample2 {

    public static void main(String[] args) {
        try{
            FileReader f = new FileReader("hello.txt");
            File r = new File("hello.txt");
            int len = (int)r.length();
            char[] arr = new char[len];

            f.read(arr);
            System.out.println(arr);

            FileWriter w = new FileWriter("newFile.txt");
            w.write(arr);
            w.close();
            f.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
