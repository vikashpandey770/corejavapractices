package Constructor;

import java.util.Scanner;

class Vsp{
    int id,roll,age;
    String name,schoolname,address;
    Vsp(int i,int r,int a,String n,String s, String ad) {
        id = i;
        roll = r;
        age = a;
        name = n;
        schoolname = s;
        address = ad;
    }
    void show(){
        System.out.println("id :"+id);
        System.out.println("roll :"+roll);
        System.out.println("age :"+age);
        System.out.println("name :"+name);
        System.out.println("School name :"+schoolname);
        System.out.println("address :"+address);
    }
}
public class Parametrize {
    public static void main(String[] args) {
        System.out.println("this is a parametrize constructor examples");

        Scanner sc=new Scanner(System.in);
        System.out.print("enter id: ");
        int id=sc.nextInt();
        System.out.print("Enter roll :");
        int roll=sc.nextInt();
        System.out.print("Enter age :");
        int age=sc.nextInt();
        System.out.print("Enter name :");
        String name=sc.next();
        System.out.print("Enter School name :");
        String schoolname=sc.next();
        System.out.print("Enter address :");
        String address=sc.next();

        Vsp v=new Vsp(id,roll,age,name,schoolname,address);
        v.show();

    }
}
