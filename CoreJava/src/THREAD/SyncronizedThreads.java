package THREAD;
class Onec{
    public void don(String msg){
        System.out.print("["+msg);
        try{
            Thread.sleep(2000);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("]");
    }
}
class Caller implements Runnable{
    String msg;
    Onec o;
    Thread t;

   public Caller(String msg,Onec o){

        this.msg=msg;
        this.o=o;

        t=new Thread(this);
        t.start();
    }


    @Override
    public void run() {
synchronized (o){
    o.don(msg);
}

    }
}

public class SyncronizedThreads {
    public static void main(String[] args) {
        System.out.println("---- this is a Synchronize Thread ------");

        Onec o=new Onec();
        Caller c=new Caller("vikash",o);
        Caller c1=new Caller("pandey",o);

    }
}
