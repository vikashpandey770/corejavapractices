package THREAD;

public class StarPatern {
    public static void main(String[] args) {
        System.out.println("--------------STAR PATTERN-------------");
Thread r;
        for(int i=1;i<6;i++){
            for(int j=1;j<i+1;j++){
                System.out.print("*");
                try{
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println();

        }
    }
}
