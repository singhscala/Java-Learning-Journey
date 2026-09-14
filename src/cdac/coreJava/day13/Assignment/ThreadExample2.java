package cdac.coreJava.day13.Assignment;

class Message1 extends Thread {
    public void run() {
        System.out.println("Message 1 is running");
    }
}

class Message2 extends Thread {
    public void run() {
        System.out.println("Message 2 is running");
    }
}

class Message3 extends Thread {
    public void run() {
        System.out.println("Message 3 is running");
    }
}

class Message4 extends Thread {
    public void run() {
        System.out.println("Message 4 is running AFTER all");
    }
}

public class ThreadExample2 {
    public static void main(String[] args) throws InterruptedException {

        Message1 t1 = new Message1();
        Message2 t2 = new Message2();
        Message3 t3 = new Message3();
        Message4 t4 = new Message4();

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();

        t4.start();
    }
}
