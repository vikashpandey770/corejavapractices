package CoreJavaPracticeMix;

import java.util.Scanner;

class Jee{
    int a,b,c;
    void add(){
        System.out.println("This is a jee exam");
    }
    void add(int a,int b){
        System.out.println(a+b);
    }
    void add(int a,int b,int c){
        System.out.println(a*b*c);
    }
}

public class CompileTimePolymorphism {
    public static void main(String[] args) {
        System.out.println("compile time polymorphism");

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a: ");
        int a=sc.nextInt();
        System.out.println("Enter B:" );
        int b=sc.nextInt();
        System.out.println("Enter c :");
        int c=sc.nextInt();

        Jee j=new Jee();
        j.add();
        j.add(a,b);
        j.add(a,b,c);

    }
}
