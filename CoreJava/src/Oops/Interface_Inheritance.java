package Oops;

interface Printables{
    void boy();
}
interface   Primes extends Printables{
    void girl();
}
class Joints implements Primes{
    public void boy(){
        System.out.println("it is a boy");
    }
    public void girl(){
        System.out.println("it is a girl");
    }
}
public class Interface_Inheritance {

    public static void main(String[] args) {
        System.out.println("Interface or Inheritance mix");

        Joints m=new Joints();
        m.boy();
        m.girl();
    }
}