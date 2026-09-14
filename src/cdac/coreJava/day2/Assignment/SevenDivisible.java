package cdac.coreJava.day2.Assignment;

public class SevenDivisible {
    int sum = 0;

    public void sum(){
        for(int i = 100; i<=200; i++){
            if(i%7 == 0){
                sum += i;
            }
        }
        System.out.println(sum);
    }

    public static void main(String[] args){
        SevenDivisible s = new SevenDivisible();
        s.sum();
    }
}
