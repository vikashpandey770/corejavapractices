package Constructor;
import java.util.Scanner;
class overl{
    overl(){
        System.out.println("This is a constructor overloading program and this is a default constructor");
    }
    overl(String name){
        System.out.println("name :"+name);
    }
    overl(int age){
        System.out.println("age :"+age);
    }
    overl(String name,int age){
        System.out.print("name: "+name);
        System.out.print(" age :"+age);
    }
}
public class ConstructorOverloading {
    public static void main(String[] args) {
        System.out.println("************* Constructor Overloading **************");
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a name: ");
        String name=sc.next();
        System.out.println("enter a age: ");
        int age=sc.nextInt();
        overl o=new overl();
        overl oa=new overl(age);
        overl oaa=new overl(name);
        overl oaoa=new overl(name,age);

    }
}
