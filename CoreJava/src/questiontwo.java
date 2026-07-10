import java.util.Scanner;
import java.util.*;
public class questiontwo {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("math:");
        float m=sc.nextInt();
        if(m<0 || m>100){
            System.out.println("error");
            return;
        }
        System.out.println("english:");
        float e=sc.nextInt();
        if(e<0 || e>100){
            System.out.println("error");
            return;
        }
        System.out.println("Science:");
        float s=sc.nextInt();
        if(s<0||s>100){
            System.out.println("error");
            return;
        }
        float sum=m+e+s;
        System.out.print("Total Mark is:");
        System.out.println(sum);

        float cgpa=(sum/3)/10;
        System.out.print("your cgpa is:");
        System.out.println(cgpa);

    }
}
