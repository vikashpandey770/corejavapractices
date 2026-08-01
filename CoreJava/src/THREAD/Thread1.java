package THREAD;

class demos extends Thread{
  public void  dance(){
     System.out.println("karan is dancer");

 }
 public  void run(){
      dance();
 }
}
public class Thread1 {

    public static void main(String[] args) {
  demos dd=new demos();
  dd.start();
        System.out.println("*****************");
        dd.dance();

    }
}
