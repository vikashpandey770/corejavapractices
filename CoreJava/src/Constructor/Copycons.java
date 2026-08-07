package Constructor;

import java.util.Scanner;

class dog{
    int age;
    String name;

    dog(int age,String name){
        this.age=age;
        this.name=name;

        System.out.println("age : "+age);
        System.out.println("name : "+name);
    }
    dog(dog d){
        age=d.age;
        name=d.name;
    }
     void display(){
        System.out.println("age :"+age+ "name :"+name);
    }
}

public class Copycons {
    public static void main(String[] args) {
        System.out.println("this is a copy constructor programs");

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a age :");
        int age=sc.nextInt();
        System.out.println("Enter a name :");
        String name=sc.next();

        dog ds=new dog(age,name);
        dog d1=new dog(ds);

        ds.display();
        d1.display();

    }
}
