package JavaPrograms;

import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
 /*       int i;
        int m=0;
       int flag=0;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a Number");
        int n=s.nextInt();
        m=n/2;

        if(n==0||n==1){
            System.out.println(n+"is not prime number");
        }
        else {

            for(i=2;i<=m;i++){

                if(n%i==0){
                    System.out.println(n +" is not prime number");
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                System.out.println(n+" is prime number");
            }
        }

    }

  */
        int i;
        int m=0;
        int flag=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        int nm=sc.nextInt();
        m=nm/2;
        if(nm==0||nm==1){
            System.out.println(nm+ " is not prime number");
        }
        else{
            for(i=2;i<=m;i++){
                if(nm%i==0){
                    System.out.println(nm+" is not prime number");
                    flag =1;
                    break;
                }
            }
            if(flag==0){
                System.out.println(nm +" is prime number");
            }
        }
    }
}
