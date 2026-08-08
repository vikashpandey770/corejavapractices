package CoreJavaPracticeMix;

import java.util.Scanner;

class  param{
int age;
    String name;
    param(int a,String n){
        age=a;
        name=n;

        System.out.println("this is a parametrize constructor");
    }

    param(param p){
        System.out.println("this is a copy constructor");
        age= p.age;
        name= p.name;

    }

    void done(){
        System.out.println("age :"+age);
        System.out.println("name : "+name);

    }

}


public class parametrizeConstructorexa {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("enter a age :");
        int age=sc.nextInt();
        System.out.println("Enter a name: ");
        String name=sc.next();
        param p=new param(age,name);
        p.done();

        param p1=new param(p);
        p1.done();
    }
}
