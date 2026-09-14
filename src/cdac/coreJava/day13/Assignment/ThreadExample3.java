package cdac.coreJava.day13.Assignment;

class Check extends Thread{
    synchronized public void even() {
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
    synchronized public void odd() {
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
public class ThreadExample3 {
    public static void main(String[] args) {
        Check c = new Check();
        c.even();
        c.odd();
    }
}
