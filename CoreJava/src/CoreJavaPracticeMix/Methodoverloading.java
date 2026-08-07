package CoreJavaPracticeMix;

import java.lang.classfile.instruction.SwitchCase;
import java.util.Scanner;

class methodover{
    int age;
    String name;

    void done(){
        System.out.println("this is a simple");
    }
    void done(int age,String name){

        this.age=age;
        this.name=name;
        System.out.println("age :"+age);
        System.out.println("name :"+name);
    }

}
class Fin extends methodover{
    void done(){
        System.out.println("this is child class");
    }
}


public class Methodoverloading {
    public static void main(String[] args) {
        System.out.println("This is a method overloading");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a age: ");
        int age=sc.nextInt();
        System.out.println("Enter a name :");
        String name=sc.next();
        Fin f=new Fin();
        f.done();
        f.done(age,name);
    }

}
