package cdac.coreJava.day5.Assignment;

import java.util.Scanner;

public class WordsCount {
    Scanner sc = new Scanner(System.in);
    String x;

    public void input(){
        System.out.println("Enter the String");
        x = sc.nextLine();
    }

    public void words(){
        String[] s = x.split(" ");

        System.out.println("Count of the words are: "+s.length);
    }

    public static void main(String[] args){
        WordsCount w = new WordsCount();
        w.input();
        w.words();
    }
}
