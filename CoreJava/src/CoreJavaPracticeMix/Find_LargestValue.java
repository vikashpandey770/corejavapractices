package CoreJavaPracticeMix;

import java.util.Scanner;

public class Find_LargestValue {
    public static void main(String[] args) {
        System.out.println("------------- find  the largest value ----------");
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter A:");
        int a=sc.nextInt();
        System.out.print("Enter B:");
        int b=sc.nextInt();
        System.out.print("Enter C:");
        int c=sc.nextInt();

        System.out.println("A is: "+a);
        System.out.println("B is: "+b);
        System.out.println("C is: "+c);


        if(a>b && a>c){
            System.out.println("A is Large");
        }
        else if(b>a && b>c){
            System.out.println("B is :Large");
        }
        else {
            System.out.println("C is large");
        }
    }
}
