package CoreJavaPracticeMix;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("------- Program Of Factorial -------");

        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number: ");
        int n=sc.nextInt();

        long factorial =1;

        for(int i=1;i<=n;i++){
            factorial *=i;
        }
        System.out.println("Factorial is : "+ factorial);
    }
}

