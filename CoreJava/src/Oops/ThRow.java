package Oops;

import java.util.Scanner;

public class ThRow {
    public  static void jay() {
        int a;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your age :");
        a=sc.nextInt();
        if(a>18){
            System.out.println("you are college pass student");
        }
        else {
            throw  new ArithmeticException();
        }
    }
    public static void main(String[] args) {
        System.out.println("-------this is a first program of the throw---------");

try {
    jay();
}catch (Exception e){
    System.out.println("solve error:"+e);
    jay();
}
    }
}
