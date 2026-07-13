import java.util.Scanner;

public class prac {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter your name:");
        String name=sc.nextLine();
        System.out.println("Enter your education:");
        String edu=sc.nextLine();
        System.out.println("Enter your job Title:");
        String job=sc.nextLine();


        if(name==edu && edu==job && name==job){
            System.out.println("not satisfy answer");
        }
        else {
            System.out.println("error");
            System.out.println("both are match");
        }
    }
}