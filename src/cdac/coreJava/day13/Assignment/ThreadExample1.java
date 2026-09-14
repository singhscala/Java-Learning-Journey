package cdac.coreJava.day13.Assignment;

class Even extends Thread{
    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                if (i % 2 == 0) {
                    System.out.println("Even " +i);
                    Thread.sleep(1000);
                }
            }
        }catch (Exception e){
            e.getMessage();
        }
    }
}

class Odd implements Runnable{
    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                if (i % 2 != 0) {
                    System.out.println("Odd: "+i);
                    Thread.sleep(1000);
                }
            }
        }catch (Exception e){
            e.getMessage();
        }
    }
}

public class ThreadExample1 {
    public static void main(String[] args) {
        Even e = new Even();

        Odd o = new Odd();
        Thread t = new Thread(o);

        e.start();
        t.start();
    }
}
