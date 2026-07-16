package JavaPrograms;

import java.util.Scanner;
public class Factorial {

    public static void main(String[] args) {
int sum=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a Factorial:");
        int fact=sc.nextInt();

        for(int i=1;i<=fact;i++){
             sum*=i;
        }
        System.out.println(fact+" factorial: "+sum);
    }
}