package JavaPrograms;

import java.util.Scanner;

public class elseif {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A:");
        int A=sc.nextInt();
        System.out.println("Enter B:");
        int B=sc.nextInt();
        System.out.println("Enter C:");
        int C=sc.nextInt();

        System.out.println("A:"+A);
        System.out.println("B:"+B);
        System.out.println("C:"+C);
     if(A>B){
         if(A>C){
         System.out.println("A is greter");
     }
         else {
             System.out.println("C is greter");
         }
    }else {
         if(B>C){
             System.out.println("B is greter");
         }
         else {
             System.out.println("C is greter");
         }
     }
    }
}