public class Prime {

    public static void main(String[] args) {
        Prime prime = new Prime();
        int num = 10;
        boolean result= prime.prime(num);
        if(result){
            System.out.println("Prime");
        }else{
            System.out.println("Not a prime");
        }
    }

    public boolean prime(int num){
        boolean flag = true;
        if(num<=2){
            return flag;
        }
        for(int i=2; i<=num/2; i++){
            if(num%i==0){
                flag=false;
                break;
            }
        }
        return flag;
    }
}
