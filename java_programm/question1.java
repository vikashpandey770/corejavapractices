import java.util.*;
import java.util.Scanner;

public class question1 {
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        System.out.println("enter A number:");
        int a=sc.nextInt();
        System.out.println("enter B number:");
        int b=sc.nextInt();
        System.out.println("enter C number:");
        int c=sc.nextInt();

        int sum=a+b+c;
        System.out.print("your total mark is:");
        System.out.println(sum);
    }
}
