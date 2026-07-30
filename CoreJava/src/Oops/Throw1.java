package Oops;

public class Throw1 {
    public static void main(String[] args) {
        System.out.println("--------------------this is a use of throw keyword--------------------");
      try {


          int age = 23;
          if (age < 18) {

              throw new ArithmeticException("under age");
          }

          System.out.println("eligible");
      }
      catch (ArithmeticException e){

          System.out.println("error provide");
      }
      finally {
          System.out.println("ok your program is finish now");
      }

    }
}
