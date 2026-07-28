package Oops;

class StaticMethod {

    static int a=20;
    static int b;
    {
        System.out.println("hello box 1");
    }

    static  void mixture(int x){
        System.out.println("x is:"+x);
        System.out.println("a is :"+a);
        System.out.println("b is :"+b);
    }
    static {
        b=a*4;
    }
    StaticMethod(){
        System.out.println("hello constructor");
    }


    public static void main(String[] args) {
        mixture(25);
        System.out.println("static methods");

StaticMethod s=new StaticMethod();


    }
}