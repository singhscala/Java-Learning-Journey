package cdac.coreJava.day13.Assignment;

public class ThreadExample {
    public static void main(String[] args) {
        Thread t1 = new Thread();
        Thread t = Thread.currentThread();
        System.out.println(t.getName());
        System.out.println(t.getId());
        System.out.println(t.getPriority());
        t.setName("coreJava");
        t.setPriority(2);
        System.out.println(t.getName());
        System.out.println(t.getPriority());
        System.out.println(t.isAlive());
        System.out.println(t1.getName());
        System.out.println(t1.getPriority());
        t1.start();
        System.out.println(t1.isAlive());
    }
}
