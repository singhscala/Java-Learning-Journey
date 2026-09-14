package cdac.coreJava.day11.Assignment;

import java.io.*;

public class IOExample1 {

    public static void main(String[] args) {
        try{
            int count = 0;
            FileReader f = new FileReader("hello.txt");
            File len = new File("hello.txt");
            int length = (int)len.length();
            char[] arr = new char[length];
            f.read(arr);

            for (char a : arr){
                if(a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u'){
                    count++;
                }
            }

            System.out.println("Number of Vowels present in file: "+count);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
