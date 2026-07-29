package Oops;

class Oneo{
    int age=10;
    private int a=34;
    protected int b=25;
    public int c=53;

    void show(){
        System.out.println("age:"+age);
        System.out.println("this is a private:"+a);
        System.out.println("this is a protected:"+b);
        System.out.println("this is a public :"+c);
    }
}


public class Access_m_v {
    public static void main(String[] args) {
        System.out.println("this is a access modifeire with variables");
        Oneo o=new Oneo();
        o.show();
    }
}
