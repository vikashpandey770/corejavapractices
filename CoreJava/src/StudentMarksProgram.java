import java.util.*;
import java.util.Scanner;
import java.io.*;
public class StudentMarksProgram {
    public static void main(String args[]){
        System.out.println("-----------Student Marks Percentage Converter-------------");
Scanner sc=new Scanner(System.in);
        System.out.println("English:");
        double e=sc.nextInt();
        if(e<0 || e>100){
            System.out.println("error");
            return;
        }


        System.out.println("Hindi:");
        double h=sc.nextInt();
if(h<0 || h>100){
    System.out.println("error");
    return;
}

        System.out.println("Math:");
        double m=sc.nextInt();
        if(m<0 || m>100){
            System.out.println("error");
            return;
        }

        System.out.println("Science");
        double s=sc.nextInt();
        if(s<0||s>100){
            System.out.println("error");
            return;
        }

        System.out.println("Gujarati:");
        double g=sc.nextInt();
        if(g<0||g>100){
            System.out.println("error");
            return;
        }

        double sum = e+h+m+s+g;
        System.out.println(sum);

        double percent= (sum*100)/500;
        System.out.print(percent);
        System.out.println("%");
        if(percent>80&&percent<=100){
            System.out.println("A+");
        }
        else if(percent>=60&& percent<=80){
            System.out.println("B+");
        } else if (percent>=50 && percent<=59){
            System.out.println("c+");
        } else if (percent>34) {
            System.out.println("pass");

        }else {
            System.out.println("fail");
        }

    }
}