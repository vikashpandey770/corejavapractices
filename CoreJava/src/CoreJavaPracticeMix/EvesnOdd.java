package CoreJavaPracticeMix;

import java.util.Scanner;

public class EvesnOdd {
    public static void main(String[] args) {
        System.out.println("***** Even Odd Program *****");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a=sc.nextInt();
        System.out.println("your value is:"+a);

        if(a%2==0){
            System.out.println("This is EVEN");
        }
        else{
            System.out.println("This is ODD");
        }


    }
}
