package Oops;

import java.util.Scanner;

class Onlyone{

    void fix(){
        System.out.println("hello world");
    }

    void fix(int a){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter age: ");
         a=sc.nextInt();

         if(a>18){
             System.out.println("elegible for vote");
         }
         else{
             System.out.println("under age/over age");
         }
    }
}


public class MethodOverLoading {
    public static void main(String[] args) {
        System.out.println("method overloading example");
        Onlyone o=new Onlyone();
        o.fix();
        o.fix(1);
    }
}
