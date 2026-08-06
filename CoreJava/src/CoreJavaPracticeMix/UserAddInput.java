package CoreJavaPracticeMix;

import java.util.Scanner;

public class UserAddInput {
    public static void main(String[] args) {

        System.out.println("-------------print the input value--------------");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Integer value: ");
        int a=sc.nextInt();

        System.out.println("your value is: "+a);

    }
}
