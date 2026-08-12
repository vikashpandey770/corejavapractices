package JavaPrograms;

import java.util.Scanner;

public class FibonaQuestions {

    public static void main(String[] args) {
        System.out.println("************This is a fibona series program*************");

        int a=0;
        int b=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        for(int i=0;i<=n;i++){
            int c=a+b;
            System.out.print(c+ " ");
            a=b;
            b=c;
        }

    }
}
