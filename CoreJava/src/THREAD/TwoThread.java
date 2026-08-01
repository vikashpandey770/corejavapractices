package THREAD;

class One extends Thread{
    public void run(){
        for(int i=1;i<5;i++){
            System.out.println("A:"+i);
        }

    }
}
class Two extends Thread{
    public void run(){
        for(int j=1;j<5;j++){
            System.out.println("B: "+j);
        }
    }
}

class  Three extends Thread{
    public void run(){
        System.out.println("vikash");
        System.out.println("ajay");
        System.out.println("nimesh");
        System.out.println("karan");
    }
}
public class TwoThread {
    public static void main(String[] args) {
        System.out.println("*************start the program 2 Thread in this program***********");

        One o=new One();
        Two t=new Two();
        Three th=new Three();

        o.start();
        t.start();
        th.start();


    }
}
