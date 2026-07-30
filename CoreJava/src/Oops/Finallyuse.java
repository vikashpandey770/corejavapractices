package Oops;
public class Finallyuse {
    public static void main(String[] args) {
        System.out.println("--------------this is a use of finally keyword use--------------");
        try {
            int x=10/2;
            System.out.println("ok divide for the 10 : "+x);
        }
        catch (ArithmeticException e){
            System.out.println("this is not divide by zero");
        }
        finally {
            System.out.println("ok complete the program");
        }
    }
}