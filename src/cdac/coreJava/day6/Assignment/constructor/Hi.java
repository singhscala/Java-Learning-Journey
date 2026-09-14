package cdac.coreJava.day6.Assignment.constructor;

public class Hi {
    int x =10;
    static void show(){
        int x =100;
    }

    public static void main(String args[]){
        show();
        System.out.println(new Hi().x);
    }
}
