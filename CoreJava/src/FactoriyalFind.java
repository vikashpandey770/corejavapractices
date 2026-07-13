import java.util.Scanner;

public class FactoriyalFind {

    public static void main(String[] args) {
        int factorial =1;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number for find factorial:");
        int fac=sc.nextInt();
        for(int i=1;i<=fac;i++){
             factorial *=i;
        }
        System.out.println("factorial is: "+factorial);


    }
}
