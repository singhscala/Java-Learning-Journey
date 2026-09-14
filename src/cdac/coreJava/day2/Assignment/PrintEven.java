package cdac.coreJava.day2.Assignment;

public class PrintEven {

    public void printEven(){
        for(int i = 1; i<=20; i++){
            if(i%2 == 0){
                System.out.println(i+ " is Even Number");
                if(i==16){
                    break;
                }
            }
        }
    }

    public static void main(String[] args){
        PrintEven p = new PrintEven();
        p.printEven();
    }
}
