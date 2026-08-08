package CoreJavaPracticeMix;

import java.util.Scanner;

class Vikash{
    String sub;
    int mark;
    void learn(String sub){
        System.out.println("learn a core java program");
    }
    void learn(String s, int m){
sub=s;
mark=m;
        System.out.println("learn java a get a marks");
    }
    void displays(){

        System.out.println("subject: "+sub);
        System.out.println("marks :"+mark);
    }
}
public class Methodoverloadingsprogram {
    public static void main(String[] args) {
        System.out.println("method overloading program");

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a subject :");
        String sub=sc.next();

        System.out.println("Enter a marks: ");
        int mark=sc.nextInt();

        Vikash v=new Vikash();
        v.learn(sub);
        v.learn(sub,mark);
        v.displays();

    }
}
