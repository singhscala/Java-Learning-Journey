package cdac.coreJava.day3.Assignment;

import java.util.Scanner;

public class TransposeMatrix {

    Scanner sc = new Scanner(System.in);
    int row, column;
    int[][] arr, transpose;

    public void lengthArray(){
        System.out.println("Enter the row and column of matrix: ");
        row = sc.nextInt();
        column = sc.nextInt();
        arr = new int[row][column];
        transpose = new int[column][row];
    }

    public void input(){
        for (int  i = 0; i< row; i++){
            for (int j = 0; j< column; j++){
                System.out.println("Enter value: "+(i+1)+" row and "+ (j+1)+" column");
                arr[i][j] = sc.nextInt();
            }
        }
    }

    public void transpose(){
        for (int i = 0; i< row; i++){
            for (int j = 0; j< column; j++){
                transpose[j][i] = arr[i][j];
            }
        }
    }

    public void display(){
        System.out.println("Transpose matrix: ");
        for (int  i = 0; i< column; i++){
            for (int j = 0; j< row; j++){
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        TransposeMatrix t = new TransposeMatrix();
        t.lengthArray();
        t.input();
        t.transpose();
        t.display();
    }

}
