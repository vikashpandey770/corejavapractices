package THREAD;

class playmusic extends Thread{

    public void play(){
        for(int i=1;i<5;i++){
            System.out.println("play music...........");
        }

    }

    public void run(){
        play();
    }
}

class Downloadmusic extends Thread{
  public void Download(){
      for(int i=1;i<5;i++){
          System.out.println("Download the song...........");
      }
  }
  public void run(){
      Download();
  }

}

public class PlayMusic_DownloadMusic {
    public static void main(String[] args) {
        System.out.println("--------------crete multithreading play song and download the song------------");

        playmusic p=new playmusic();
        Downloadmusic d=new Downloadmusic();

        p.start();
        d.start();

    }
}
