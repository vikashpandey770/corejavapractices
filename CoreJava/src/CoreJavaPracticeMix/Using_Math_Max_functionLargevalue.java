package CoreJavaPracticeMix;

import java.util.Scanner;

public class Using_Math_Max_functionLargevalue {
    public static void main(String[] args) {
        System.out.println("-----------find the max value using math function-----------");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A: ");
        int a=sc.nextInt();
        System.out.println("Enter B: ");
        int b=sc.nextInt();
        System.out.println("Enter C:");
        int c=sc.nextInt();

int largevalue=Math.max(Math.max( a,b),c);
        System.out.println("largest value is: "+largevalue);

    }
}
