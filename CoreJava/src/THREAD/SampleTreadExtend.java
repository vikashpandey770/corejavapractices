package THREAD;

class samplee extends Thread{
    public void run(){
        for(int i=1;i<10;i++){
            try{
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(i);
        }

    }
}

public class SampleTreadExtend {
    public static void main(String[] args) {

        System.out.println("Simple thread program");
        samplee sr=new samplee();
sr.start();
    }
}
