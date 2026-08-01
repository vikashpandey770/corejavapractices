import java.io.IOException;

class One{
    void Ones(){
        System.out.println("this is a demo class");
    }

}
class Two extends One{
    void Ones() throws ArithmeticException,ArrayIndexOutOfBoundsException {
super.Ones();
        System.out.println("this is a child class");
        throw  new ArithmeticException();
    }
}

public class TryCatchOverrodes {

    public static void main(String[] args) {
        System.out.println("-------------this is a try catch override program------------");
        Two t= new Two();
       try {


           t.Ones();
       }catch (Exception e){
           System.out.println("this is a exception: "+e);
       }
    }

}
