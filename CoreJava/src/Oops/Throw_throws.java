package Oops;

import static Oops.harry.divide;

class harry{

    public static double area(int r){
        double result=Math.PI*r*r;
        return result;
    }




 public  static int divide(int a,int b)
 throws ArithmeticException
 {
        int result= a/b;
        return result;
    }

}

public class Throw_throws {
    public static void main(String[] args) {

        System.out.println("-------------this is a throw and throws programm---------------");



        try
        {
            int c= divide(10,0);
            System.out.println(c);

        }
        catch (Exception e){
            System.out.println("Exception error");
        }

    }
}

