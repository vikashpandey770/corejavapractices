package Oops;

public class CatchBlocks {
    public static void main(String[] args) {
        System.out.println("-----------------this is a example of try catch block use---------------");

        try{
            int a=23;
            int b=0;

            int c=a/b;
            System.out.println(c);
        }
        catch (ArithmeticException e){
            System.out.println("cannot divide by zero");
        }
        System.out.println("program ends");


    }
}
