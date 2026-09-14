package cdac.coreJava.day4.Assignment;

public class Strings {
    public static void main(String[] args){
        String a = "welcome";
        String b = "welcome";

        String c = new String("welcome");

        if(a==b){
            System.out.println("Equals");
        }else{
            System.out.println("Not Equals");
        }

        if(a==c){
            System.out.println("Equals");
        }else{
            System.out.println("Not Equals");
        }

        if(a.equals(c)){
            System.out.println("Equals");
        }else{
            System.out.println("Not Equals");
        }

        System.out.println(a.equals(c));

        System.out.println("welcome".compareTo("welcome"));
    }
}
