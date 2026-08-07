package Constructor;

import java.util.Scanner;
class Stuu{
int age;
String name;
    public Stuu(int a, String n) {
        age=a;
        name=n;
    }
    void display(){
        System.out.println("age :"+age);
        System.out.println("name :"+name);
    }
}
public class ParametrizeConstructor {
    public static void main(String[] args) {
        System.out.println("---------This is a Parameterize Constructors---------");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter age: ");
        int age=sc.nextInt();
sc.nextLine();
        System.out.println("enter name: ");
        String name=sc.nextLine();
        Stuu s=new Stuu(age,name);
        s.display();

    }
}