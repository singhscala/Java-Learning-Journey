package cdac.coreJava.day8.Assignment;

class TestCase {

    TestCase(){
        System.out.println("Parent no argument");
    }
    TestCase(int x){
        System.out.println("Parent with argument");
    }
}

public class NewTestCase extends TestCase{
    NewTestCase(){
        this(6);
        System.out.println("123");
    }

    NewTestCase(int x){
        super(12);
        System.out.println("welcome");
    }

    public static void main(String[] args){
        NewTestCase r = new NewTestCase();

    }
}
