package Oops;

public class Exc {
    public static void main(String[] args) {
        System.out.println("------------this is a exception class-------------");

        int a=24;
        int b=0;

        try {
            int c=a/b;
            System.out.println(c);
            System.out.println("ok your answer is:"+c);

        }
        catch (ArithmeticException e){
            System.out.println("not divide by zero");
        }
        System.out.println("program end");
    }
}
