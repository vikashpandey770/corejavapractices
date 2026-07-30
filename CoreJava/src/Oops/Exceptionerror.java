package Oops;

import java.util.Scanner;

public class Exceptionerror {
    public static void main(String[] args) {
        System.out.println("-------------------------this is  a error provide-------------------");

        int a;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a:");
        a= sc.nextInt();

        System.out.println("a is divide by 1000 in a:"+1000/a);

    }
}
