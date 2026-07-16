package JavaPrograms;

import java.util.Scanner;

public class fibonacci2 {
    public static void main(String[] args) {
        int a=0,b=1,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        int number= sc.nextInt();

        for(int i=1;i<=number;i++){
            c=a+b;
            a=b;
            b=c;
            System.out.print(" "+c);
        }
    }
}
