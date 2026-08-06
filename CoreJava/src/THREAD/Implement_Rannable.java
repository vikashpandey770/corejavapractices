package THREAD;

class  Demo implements Runnable{
    Thread t;
    Demo(){
        t=new Thread(this,"child thread");
    t.start();
    }
    public void run() {
        try{
            for(int i=0;i<5;i++){
                Thread.sleep(1000);
                System.out.println( i+":");
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
public class Implement_Rannable {
    public static void main(String[] args) {
        System.out.println("--------- this is a Runnable Implement --------");


        Demo d=new Demo();

    }
}
