package Oops;

import java.util.Scanner;

class  HotelTaj{
    void taj(){

        System.out.println("this is a taj hotel");
        int x;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a Total bill amount:");
        x=sc.nextInt();

        if(x>5000){
            System.out.println("two person bill");
        }
        else {
            throw new ArithmeticException();
        }
    }
}
class Itc extends HotelTaj{
     void taj() throws  ArrayIndexOutOfBoundsException,ArrayIndexOutOfBoundsException{
         super.taj();
     }
}
public class Throw_Throws_overrides {
    public static void main(String[] args) {
        System.out.println("------------this is a override using throw throws keyword-------------");

        Itc i=new Itc();

      try {

          i.taj();
      }catch (Exception e){
          System.out.println("exception e: "+e);
          System.out.println("you are a only eat a fast food so your bill is under 5000");
      }

    }
}
