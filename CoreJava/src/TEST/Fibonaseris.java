package TEST;

import java.util.Scanner;

public class Fibonaseris {
    public static void main(String[] args) {
        System.out.println("fibonaserise");

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        int a=0;
        int b=1;

        for(int i=0;i<=n;i++){
            System.out.print(a+ ",");
            int c=a+b;
            a=b;
            b=c;

        }
    }
}
