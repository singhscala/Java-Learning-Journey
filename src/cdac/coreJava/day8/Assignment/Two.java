package cdac.coreJava.day8.Assignment;

class One{
    int x = 10;
    static int a = 20;

    void show(){
        System.out.println("Parent");
    }

    One(int x){
        System.out.println("testing");
    }
}

public class Two extends One{
    int x = 20;

    @Override
    void show(){
        super.show();
        System.out.println(x+ " " + super.x+ " " +One.a);
    }

    Two(int x){
        super(4);
        System.out.println("testing 2");
    }

    public static void main(String[] args) {
        Two t = new Two(10);
        t.show();
    }
}
