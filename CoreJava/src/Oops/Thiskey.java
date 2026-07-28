package Oops;

class Up{
    int age;
    String name;
    double salary;
    void state(){
        System.out.println();
    }

    Up(int age,String name,double salary){
        this.age=age;
        this.name=name;
        this.salary=salary;

    }
    void display(){
        System.out.println("age:"+age);
        System.out.println("name:"+name);
        System.out.println("salary:"+salary);
    }

}
public class Thiskey {
    public static void main(String[] args) {
        System.out.println("this is a use of this keyword");
        Up u=new Up(25,"vikash",25500);
        u.display();

    }
}