package cdac.coreJava.day4.Assignment;

import java.util.Scanner;

public class Game {
    Scanner sc = new Scanner(System.in);
    int teamA, teamB;

    public void inputScore(){
        System.out.println("Enter the Score of Team A: ");
        teamA = sc.nextInt();
        System.out.println("Enter the Score of Team B: ");
        teamB = sc.nextInt();
    }

    public void checkScore(){
        if(teamA > teamB){
            int diff = teamA - teamB;
            if(diff > 50){
                System.out.println("Dominating win");
            }
            System.out.println("Player A wins");
        }else if(teamB > teamA){
            int diff = teamB - teamA;
            if(diff > 50){
                System.out.println("Dominating win");
            }
            System.out.println("Player B wins");
        }else {
            System.out.println("Draw");
        }
    }

    public static void main(String[] args){
        Game g = new Game();
        g.inputScore();
        g.checkScore();
    }
}
