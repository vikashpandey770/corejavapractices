package CoreJavaPracticeMix;

import java.util.Scanner;

public class Fac {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n=sc.nextInt();

        long f=1;
        for(int i=1;i<=n;i++){
            f *=i;
        }
        System.out.println("factorial is: "+f);
    }
}
