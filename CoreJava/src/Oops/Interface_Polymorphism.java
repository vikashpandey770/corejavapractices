package Oops;


interface Alphabates{
    void a();
    void b();
}
class Abcd implements Alphabates{
    public void a(){
        System.out.println("This is a: A");
    }
    public  void b(){
        System.out.println("This is a b: B");
    }
}
public class Interface_Polymorphism {
    public static void main(String[] args) {
        System.out.println("This is a example of interface or polymorphism");

        Alphabates a=new Abcd();
        a.a();
        a.b();
    }
}