package THREAD;

public class ThreadBasic {
    public static void main(String[] args) {
        Thread t= Thread.currentThread();
        System.out.println(t);
        t.setName("topsInfo");
        System.out.println(t);
        t.setPriority(4);
        System.out.println(t);

        try{

            for(int i=0;i<5;i++){
                Thread.sleep(3000);
                System.out.println(t+ ":" +i);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println("main tread exit");
    }
}
