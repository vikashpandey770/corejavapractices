import java.util.Scanner;
import java.util.*;
public class Questionfour {
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Kilometer:");
        double d=sc.nextDouble();

        double mile=d*0.621371;

        System.out.println("your Miles:"+mile);
    }
}
