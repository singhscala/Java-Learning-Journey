package cdac.coreJava.day2.Assignment;

public class Pattern {

    public void matrixPattern(){
        for(int i = 0; i < 4; i++ ){
            for(int j = 0; j < 10; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void starPattern(){
        for(int i = 1; i<=5; i++){
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public  void pyramid1() {
        int rows = 4;

        for (int i = 1; i <= rows; i++) {
            for (int s = rows; s > i; s--) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i * 2 - 1; j++) {
                if (j == 1 || j == i * 2 - 1 || i == rows) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public void triangle() {
        int rows = 5;

        for (int i = 1; i <= rows; i++) {
            for (int s = rows; s > i; s--) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void pyramid() {
        int rows = 5;

        for (int i = 1; i <= rows; i++) {
            for (int s = rows; s > i; s--) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public void abcdPattern(){
        for(int i = 5-1; i >= 0; i--){
            char c = 'A';
            for(int j = 0; j < 5; j++){
                if(j > i){
                    System.out.print(" ");
                    continue;
                }
                System.out.print(c++);
            }
            for(--c; c >= 'A'; c--){
                System.out.print(c);
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        Pattern s = new Pattern();
        s.matrixPattern();
        System.out.println();
        s.starPattern();
        System.out.println();
        s.pyramid1();
        System.out.println();
        s.triangle();
        System.out.println();
        s.pyramid();
        System.out.println();
        s.abcdPattern();
        System.out.println();
    }
}
