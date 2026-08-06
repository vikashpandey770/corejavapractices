package THREAD;
class countdowns implements Runnable{

    Thread t;
    countdowns(){
        t=new Thread(this);
        t.start();

    }

    @Override
    public void run() {

        for(int i=5;i>=1;i--){
            System.out.println(i);
            try{
                Thread.sleep(1000);

            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("Go....");

    }
}


public class CountDownProgram {
    public static void main(String[] args) {
        System.out.println("********  COUNT-DOWN PROGRAM  *********");

        countdowns c=new countdowns();


    }
}
