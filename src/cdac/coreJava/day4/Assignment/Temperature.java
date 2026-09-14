package cdac.coreJava.day4.Assignment;

import java.util.Scanner;

public class Temperature {
    Scanner sc = new Scanner(System.in);
    int temp;

    public void input(){
        System.out.println("Enter the temperature: ");
        temp = sc.nextInt();
    }

    public void checkTemperature(){
        if(temp < 0){
            System.out.println("Freezing");
        }else if(temp < 30){
            System.out.println("Normal");
        }else{
            System.out.println("Hot");
        }
    }

    public static void main(String[] args){
        Temperature t = new Temperature();
        t.input();
        t.checkTemperature();
    }
}
