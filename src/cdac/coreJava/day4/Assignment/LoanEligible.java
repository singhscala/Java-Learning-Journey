package cdac.coreJava.day4.Assignment;

import java.util.Scanner;

public class LoanEligible {
    Scanner sc = new Scanner(System.in);
    int salary, creditScore;

    public void input(){
        System.out.println("Enter the salary: ");
        salary = sc.nextInt();
        System.out.println("Enter the Credit Score: ");
        creditScore = sc.nextInt();
    }

    public void checkEligibility(){
        if(salary>=50000 && creditScore>=750){
            System.out.println("Premium Eligible");
        }else if(salary>=30000 && creditScore>=700){
            System.out.println("Eligible");
        }else {
            System.out.println("Not Eligible");
        }
    }

    public static void main(String[] args){
        LoanEligible l = new LoanEligible();
        l.input();
        l.checkEligibility();
    }
}
