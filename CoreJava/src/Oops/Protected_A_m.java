package Oops;

class Twot{
    protected void age(){
        System.out.println("your age is 34 year");
    }

}

class Ne extends Twot{
    void dones(){
        age();
        System.out.println("hello extends");
    }
}

public class Protected_A_m {
    public static void main(String[] args) {
        System.out.println("this is a protected access modifire");

        Ne n=new Ne();
        n.dones();
    }
}
