package Oops;

abstract class Cons{
    public Cons(){
        System.out.println("i am a Cons class ka constructor huuu....");
    }

    public void Hello(){
        System.out.println("Hello");
    }
    abstract public  void greet();
abstract     void addData();
abstract  public int runn();
}

class Child extends Cons{
    public void greet(){
        System.out.println("Good morning");
    }
    public  void  greets(){
        System.out.println("good afternoon");
    }
     void addData() {
        System.out.println("add a data to override the methods");
    }

   public int runn(){
        System.out.println("sum of 2+5 is: "+(2+5));
        return 0;
    }
}

public class Abstract1 {
    public static void main(String[] args) {

            Child c=new Child();
            c.greet();
            c.Hello();
            c.greets();
            c.addData();
            c.runn();

        System.out.println();
    }
}