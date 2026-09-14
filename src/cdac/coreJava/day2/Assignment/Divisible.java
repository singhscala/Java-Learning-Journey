package cdac.coreJava.day2.Assignment;

public class Divisible {

    public void divisible(){

        for(int i = 1; i<100; i++){
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println(i+ " is Divisible by both 3 & 5");
            }else if(i % 3 == 0 ){
                System.out.println(i+ " is Divisible by 3 ");
            }else if(i % 5 == 0){
                System.out.println(i+ " is Divisible by 5");
            }
        }
    }

    public static void main(String[] args){
        Divisible d = new Divisible();
        d.divisible();
    }
}
