package JavaPrograms;

import java.util.Scanner;

public class ifprogram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int age=sc.nextInt();
        if(age>0){
            System.out.println("positive");
        }
        else{
            System.out.println("negative");
        }
    }
}
