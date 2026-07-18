package JavaPrograms;

import java.util.Scanner;

public class forloo {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("enter your number:");
int sum=0;
        int number=sc.nextInt();
        for(int i=1;i<=number;i++){
            System.out.println("I: "+i);
            sum+=i;
        }
        System.out.println("Sum of:"+sum);
    }
}