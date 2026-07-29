package Oops;

class  Em{
    private int age=20;
    private String nm="vikash pandey";

     private void Do(){
        System.out.println("age is:"+age);
        System.out.println("name is:"+nm);
    }

    void dis(){
        Do();
    }
}


public class P_acsmo {
    public static void main(String[] args) {
        System.out.println("this is a private access modifire");

        Em e=new Em();
        e.dis();
    }
}
