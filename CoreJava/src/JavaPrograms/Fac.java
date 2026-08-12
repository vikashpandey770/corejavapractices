package JavaPrograms;

import java.util.Scanner;

public class Fac {
    public static void main(String[] args) {
        System.out.println("factorial program");

        int fact=1;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){
            fact = fact*i;
        }
        System.out.println("factorial : "+fact);
    }
}
