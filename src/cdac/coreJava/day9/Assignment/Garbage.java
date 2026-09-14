package cdac.coreJava.day9.Assignment;

class Test {

    @Override
    protected void finalize() {

        System.out.println("The object is deleted from the memory");
    }
}

public class Garbage {

    public static void main(String[] args) {

        Test t = new Test();
        t = null;
        System.gc();
    }
}