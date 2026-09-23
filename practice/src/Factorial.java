public class Factorial {

    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        int num = 5;
        factorial.factorial(num);
    }

    public void factorial(int num){
        int fact = 1;
        for(int i=num; i>0; i--){
            fact *= i;
        }

        System.out.println(fact);
    }
}
