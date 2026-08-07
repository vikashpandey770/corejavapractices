package Constructor;

import java.util.Scanner;

class Students{
    int id;
    String name;
    Students(int i,String n){
        id=i;
        name=n;
    }
    Students(Students s){
        id=s.id;
        name=s.name;
    }
    void  display(){
        System.out.println("id :"+id + " name: "+name);
    }
}
public class CopyConstructor {
    public static void main(String[] args) {
        System.out.println("-------->** This is a copy constructor **<---------");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a id: ");
        int id=sc.nextInt();
        System.out.println("Enter a name :");
        String name=sc.next();

        Students s=new Students(id,name);
        Students s1=new Students(s);
        s.display();
        s1.display();
    }

}
