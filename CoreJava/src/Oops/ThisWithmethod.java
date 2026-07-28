package Oops;
class Soft{

     void Soft(){
         System.out.println("hello this is a method");
    }
    void sr(){
         this.Soft();
        System.out.println("hyy this is sr");
    }

}
public class ThisWithmethod {
    public static void main(String[] args) {
        System.out.println("this is a this key word and method passing");

        Soft s=new Soft();
        s.sr();

    }
}