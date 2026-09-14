package cdac.coreJava.day2.Assignment;

public class NaturalNumber{

    int sum;

    public void sum(){
        for(int i=1; i<=10; i++){
            sum += i;
        }
        System.out.println(sum);
    }

    public static void main(String[] args){
        NaturalNumber n = new NaturalNumber();
        n.sum();
    }
}
