package CoreJavaPracticeMix;

import javax.swing.plaf.synth.SynthButtonUI;
import java.util.Scanner;

public class UsingScannerclass {
    public static void main(String[] args) {
        System.out.println("******* this is a user scanner call use program *******");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a String value : ");
        String sr=sc.next();

        System.out.println("Enter a integer value: ");
        int a=sc.nextInt();
        System.out.println("Enter a float value: ");
        float f=sc.nextFloat();

        System.out.println("String is: "+sr);
        System.out.println("Integer is: "+a);
        System.out.println("Flaot is :"+f);

    }
}
