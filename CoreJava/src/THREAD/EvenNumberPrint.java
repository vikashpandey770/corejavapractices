package THREAD;

class Even implements Runnable{

Thread t;
 Even(){
        t=new Thread(this);
        t.start();
}
    @Override
    public void run() {
     for(int i=2;i<=10;i+=2){
         System.out.println(i);
         try{
             Thread.sleep(2000);

         }catch (InterruptedException e){
             e.printStackTrace();
         }
     }
    }
}
public class EvenNumberPrint {
    public static void main(String[] args) {
        System.out.println("-------Print the even numbers-------");
        Even e=new Even();
    }
}
