package cdac.coreJava.day13.Assignment;

class Countdown extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 5; i >= 1; i--) {
                System.out.println("Countdown: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

class Message extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Message: Keep going...");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

public class ThreadExample5 {
    public static void main(String[] args) {
        Countdown t1 = new Countdown();
        Message t2 = new Message();

        t1.start();
        t2.start();
    }
}