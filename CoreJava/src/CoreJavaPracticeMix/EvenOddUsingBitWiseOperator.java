package CoreJavaPracticeMix;

import java.util.Scanner;

public class EvenOddUsingBitWiseOperator {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("enter a n value: ");
        int  n=sc.nextInt();

        System.out.println("your n is: "+n);

        if((n|1)>n){
            System.out.println("This is even");
        }
        else{
            System.out.println("this is odd");
        }

    }
}
