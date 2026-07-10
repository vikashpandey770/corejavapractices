import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.*;
public class Takinginput {
    public static void main(String args[]){

        System.out.println("ente a your age here:");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a>18){
            System.out.println("your are yonger");
        }
        else {
            System.out.println("under age");
        }
        System.out.println("enter your name:");
        String names=sc.next();
        System.out.print("your age is:");
        System.out.println(a);
        System.out.print("your name is:");
        System.out.println(names);

        boolean b1=sc.hasNextInt();
        System.out.println(b1);
    }
}