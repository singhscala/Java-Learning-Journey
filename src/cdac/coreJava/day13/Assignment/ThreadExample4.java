package cdac.coreJava.day13.Assignment;

class PlayMusic extends Thread{
    @Override
    public void run() {
        try {
            System.out.println("Music is Playing");
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.getMessage();
        }
    }
}

class MusicDownload extends Thread{
    @Override
    public void run() {
        try {
            System.out.println("Music is Downloading");
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.getMessage();
        }
    }
}

public class ThreadExample4 {
    public static void main(String[] args) {
        PlayMusic p = new PlayMusic();
        p.start();

        MusicDownload m = new MusicDownload();
        m.start();
    }
}
