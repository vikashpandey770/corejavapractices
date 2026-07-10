import java.util.Scanner;

public class StringProgramfirst {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name:");
        String name=sc.nextLine();

        int value=name.length();
        String tl=name.toLowerCase();
        String up=name.toUpperCase();

        String trimes="   vikash     ";

        System.out.println("total length of string is:"+value);
        System.out.println("value is lower case:"+tl);
        System.out.println("value is upper case:"+up);
        System.out.println(trimes);
        System.out.println(trimes.trim());
        System.out.println(name.substring(10));
        System.out.println(name.substring(10,16));
        System.out.println(name.replace('a','z'));
        System.out.println(name.startsWith("v"));
        System.out.println(name.endsWith("y"));
        System.out.println(name.charAt(3));


    }
}
