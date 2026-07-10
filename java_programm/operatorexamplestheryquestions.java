import java.util.Scanner;

public class operatorexamplestheryquestions {
    public static void main(String args[]){
//1. Write a program to add, subtract, multiply, divide, and find the remainder of two numbers.
        System.out.println("this is a arithmetic operator questions and answers:");
        int a=10;
        int b=20;
        int s=a+b;
        int d=b-a;
        int e=a*b;
        int f=a/b;
        int g=a%b;
        System.out.println("A+B:"+s);
        System.out.println("B-A:"+d);
        System.out.println("a*b:"+e);
        System.out.println("A/B:"+f);
        System.out.println("a%b:"+g);
        //2. Input two numbers and check which one is greater using relational operators.

        System.out.println("-----------------2 QUESITON-----------------");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first number:");
        int first=sc.nextInt();
        System.out.println("enter second number:");
        int two=sc.nextInt();
if(first>two){
    System.out.println( "first number is large:"+first);

}
else {
    System.out.println("second is large:"+two);
}

        System.out.println("--------------------3Question-------------------");

int w=25;
int p=20;
        System.out.println("w:"+w);
        System.out.println("p:"+p);
        w=w+p;
        p=w-p;
        w=w-p;
        System.out.println("w:"+w);
        System.out.println("p:"+p);
        System.out.println("w:"+w);





    }
}
