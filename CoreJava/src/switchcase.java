import java.util.Scanner;

public class switchcase {

    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        System.out.println("enter a input:");

        int num=sc.nextInt();
        String name=sc.nextLine();
        switch (num){
            case 1:
                System.out.println("enter your name:");

               break;
            case 2:
                System.out.println("enter your age:");
                break;
            case 3:
                System.out.println("enter your education:");
                break;
            case 4:
                System.out.println("exit");
               break;
            default:
                System.out.println("clear");
        }

    }
}
