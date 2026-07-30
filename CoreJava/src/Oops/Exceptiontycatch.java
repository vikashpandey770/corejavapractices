package Oops;

import java.util.Scanner;

public class Exceptiontycatch {

    public static void main(String[] args) {
        System.out.println("this is a try catch exceptions");
        int[] marks={16,89,74,21};


        try {
            System.out.println("This is a first try block");
try {
    System.out.println(marks[5]);
}
catch (ArrayIndexOutOfBoundsException e){
    System.out.println("ary index ki out of limit");
    System.out.println("exception level 2");
}

        }catch (Exception e){

            System.out.println("exception level 1");
        }

    }
}
