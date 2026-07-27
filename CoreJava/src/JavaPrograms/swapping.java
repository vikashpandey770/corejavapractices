package JavaPrograms;

import java.util.Scanner;

public class swapping {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number A:");
        int a=sc.nextInt();

        System.out.println("enter number B:");
        int b=sc.nextInt();

        int sum=a;
        a=b;
        b=sum;

        System.out.println( "A :"+a+" " +"B : "+b);
    }
}