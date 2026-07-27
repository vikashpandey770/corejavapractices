package Oops;

interface Printable{
    void prints();


   abstract class Prs{
       Prs(){
           System.out.println("hello abstract class in interfaces");
       }
   }

}

class  Print implements Printable{
    public void prints(){
        System.out.println("hello interface prints");
    }
}

class join extends Printable.Prs{

    void ads(){
        System.out.println("Hello method ads");
    }
}
public class Interfaceone {
    public static void main(String[] args) {

        Print pr=new Print();
        pr.prints();

        join j=new join();
        j.ads();

        Print ps=new Print();
        ps.prints();


    }
}