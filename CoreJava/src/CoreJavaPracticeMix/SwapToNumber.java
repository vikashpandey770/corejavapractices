package CoreJavaPracticeMix;

import java.util.Scanner;

public class SwapToNumber {
    public static void main(String[] args) {
        System.out.println("******  swaping two numbers  *******");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A:");
        int a=sc.nextInt();
        System.out.println("A is: "+a);
        int b=0;

        int c=a;
        a=b;
        b=c;
        System.out.println("B is:"+b);

    }
}
