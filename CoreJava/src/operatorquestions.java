import java.util.Scanner;

public class operatorquestions {
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age :");
        int age=sc.nextInt();
        if(age>150 || age<0){
            System.out.println("error");
            return;
        }


        System.out.println("your age is :"+age);

    }
}
