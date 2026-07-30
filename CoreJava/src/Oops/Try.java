package Oops;

public class Try {
    public static void main(String[] args) {
        System.out.println("----------------this is a try block exception-----------");

        int a=3000;
        int b=0;

       try {


           int c = a / b;

           System.out.println("divide by: " + c);
       }
       catch (ArithmeticException e){
           System.out.println("This is a error for divide not complete");
       }
        System.out.println("end of the program");

    }
}
