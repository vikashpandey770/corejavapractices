package JavaPrograms;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class swapwithoutthird {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A:");
        int a = sc.nextInt();
        System.out.println("Enter B:");
        int b = sc.nextInt();

        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("a:"+ a + " " + "b: "+b);

    }
}
