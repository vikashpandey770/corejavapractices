import java.util.Scanner;

public class logicaloperator {


    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A:");
        int a=sc.nextInt();

        System.out.println("Enter B:");
        int b=sc.nextInt();

        if(a>=18 || b>=18){
            System.out.println("pass");
        }
        else{
            System.out.println("fails");
        }


    }

}
