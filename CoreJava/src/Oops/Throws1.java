package Oops;

import java.io.IOException;
import java.util.Scanner;

public class Throws1 {
    public static void rama() throws ArithmeticException, IOException,ArrayIndexOutOfBoundsException {
        int xs;
        Scanner sc = new Scanner(System.in);
            System.out.println("enter a age:");
        xs=sc.nextInt();
        if (xs> 18) {
                System.out.println("you are younger");
            }
            else {
                throw new ArithmeticException();
            }
    }
    public static void main(String[] args) {
        System.out.println("----------this is a throws program------------");
        try {
        rama();
        }
        catch (Exception e){
            System.out.println("error provide :"+e);
            System.out.println("under age");
        }
    }
}