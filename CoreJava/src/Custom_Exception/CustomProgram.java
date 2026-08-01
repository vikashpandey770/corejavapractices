package Custom_Exception;

import java.util.Scanner;


public class CustomProgram  extends Exception {


    public void age(int age) throws CustomProgram{

    }
    public static void main(String[] args)throws CustomProgram {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your age: ");
        int age=sc.nextInt();

        CustomProgram cs=new CustomProgram();

        if(age>60){
            System.out.println("you are old person");
        }
        else {
            throw new CustomProgram();
        }


        try{
            cs.age(age);
        }
        catch (CustomProgram c){
            System.out.println("this is a under age");
        }

        finally {
            System.out.println("close the program");
            System.out.println("****************");
        }

    }
}